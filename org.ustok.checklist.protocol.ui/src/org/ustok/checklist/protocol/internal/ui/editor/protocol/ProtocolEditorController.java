/******************************************************
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.checklist.protocol.internal.ui.editor.protocol;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;
import org.ustok.checklist.cfg.checklist.Model;
import org.ustok.checklist.cfg.checklist.Step;
import org.ustok.checklist.cfg.checklist.StepType;
import org.ustok.checklist.core.model.protocol.Protocol;
import org.ustok.checklist.core.model.protocol.ProtocolNode;
import org.ustok.checklist.core.model.protocol.Status;
import org.ustok.checklist.protocol.core.export.DefaultProtocolExporter;
import org.ustok.checklist.protocol.internal.ui.ImageConstants;
import org.ustok.checklist.protocol.internal.ui.control.ProtocolControl;
import org.ustok.checklist.protocol.internal.ui.control.ProtocolNavigatorControl;
import org.ustok.checklist.protocol.internal.ui.edit.ProtocolEditingDomainProvider;
import org.ustok.checklist.protocol.internal.ui.util.ImageProvider;
import org.ustok.checklist.protocol.internal.ui.util.StringUtil;

/**
 * Controller for the {@link ProtocolEditor}'s controls.
 * 
 * @author Ingo Mohr
 * @created Sep 7, 2013
 */
public class ProtocolEditorController {

	private final ProtocolEditor fEditor;

	private Protocol fModel;

	private ProtocolNode fSelectedNode;

	private final DefaultProtocolExporter fProtocolExporter = new DefaultProtocolExporter();

	/**
	 * Constructor.
	 * 
	 * @param pEditor
	 *        the editor to create the controller for. Cannot be <code>null</code>.
	 */
	public ProtocolEditorController(ProtocolEditor pEditor) {
		Assert.isNotNull(pEditor, "Editor cannot be null.");
		fEditor = pEditor;

		init();
	}

	private void init() {
		initListeners();
	}

	private void initListeners() {
		initListenersNavigatorControl();
		initListenersExportControl();
	}

	private void initListenersExportControl() {
		getControl().getExportControl().getButtonCopyToClipboard().addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent pE) {
				String text = getControl().getExportControl().getTextContent().getText();

				Clipboard clipboard = new Clipboard(Display.getDefault());
				TextTransfer textTransfer = TextTransfer.getInstance();
				clipboard.setContents(new Object[]{text}, new Transfer[]{textTransfer});
				clipboard.dispose();
			}
		});
	}

	private void initListenersNavigatorControl() {
		getControl().getNavigatorControl().getButtonPrev().addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent pE) {
				switchToPrevNode();
				updateUISelectedNode();
				updateOutlineSelection();
			}
		});

		getControl().getNavigatorControl().getButtonNext().addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent pE) {
				switchToNextNode(false);
				updateUISelectedNode();
				updateOutlineSelection();
			}
		});

		getControl().getNavigatorControl().getButtonCurrentFailed().addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent pE) {
				internalChangeNodeStatusAndSwitchToNextNode(fSelectedNode, Status.FAILED);
			}
		});

		getControl().getNavigatorControl().getButtonCurrentNone().addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent pE) {
				internalChangeNodeStatusAndSwitchToNextNode(fSelectedNode, Status.SKIPPED);
			}
		});

		getControl().getNavigatorControl().getButtonCurrentPassed().addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent pE) {
				internalChangeNodeStatusAndSwitchToNextNode(fSelectedNode, Status.OK);
			}
		});

		final Text textNotes = getControl().getNavigatorControl().getTextCurrentNotesValue();
		textNotes.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent pE) {
				if (fSelectedNode != null) {
					final String notesUI = textNotes.getText();
					String notesModel = StringUtil.createNonNull(fSelectedNode.getInfo());
					if (!notesUI.equals(notesModel)) {
						ProtocolEditingDomainProvider.getDomain().getCommandStack().execute(new ChangeCommand(fSelectedNode) {

							@Override
							protected void doExecute() {
								fSelectedNode.setInfo(notesUI);
							}
						});
					}
				}
			}
		});
	}

	private void internalChangeNodeStatusAndSwitchToNextNode(final ProtocolNode pSelectedNode, final Status pStatus) {
		if (pSelectedNode != null) {
			if (pSelectedNode.getStatus() != pStatus) {
				TransactionalEditingDomain domain = ProtocolEditingDomainProvider.getDomain();
				domain.getCommandStack().execute(new ChangeCommand(pSelectedNode) {

					@Override
					protected void doExecute() {
						pSelectedNode.setStatus(pStatus);
					}
				});
			}

			boolean processChildren = false;
			if (pSelectedNode.getStep().getType() == StepType.CONTAINER && pStatus == Status.OK) {
				processChildren = true;
			}
			switchToNextNode(processChildren);

			updateOutlineSelection();
			updateUISelectedNode();
		}
	}

	private void switchToPrevNode() {
		ProtocolNode newNode = findPrevNode(fModel, fSelectedNode);
		if (newNode != null) {
			fSelectedNode = newNode;
		}
	}

	private void switchToNextNode(boolean pProcessChildren) {
		ProtocolNode newNode = findNextNode(fModel, fSelectedNode, pProcessChildren);
		if (newNode != null) {
			fSelectedNode = newNode;
		}
	}

	private static ProtocolNode findPrevNode(Protocol pProtocol, ProtocolNode pNode) {
		if (pProtocol != null && pNode != null) {
			int topIndex = pProtocol.getNodes().indexOf(pNode);
			boolean isTopNode = topIndex != -1;

			boolean isSubNode = pNode.getParent() != null && pProtocol.getNodes().contains(pNode.getParent());

			if (isTopNode) {
				int index = topIndex - 1;
				if (index >= 0) {
					return pProtocol.getNodes().get(index);
				}
			}

			if (isSubNode) {
				int index = pNode.getParent().getChildren().indexOf(pNode) - 1;
				if (index >= 0) {
					return pNode.getParent().getChildren().get(index);
				} else {
					return null; // findPrevNode(pProtocol, pNode);
				}
			}
		}
		return null;
	}

	private static ProtocolNode findNextNode(Protocol pProtocol, ProtocolNode pNode, boolean pProcessChildren) {
		if (pProtocol != null && pNode != null) {
			int topIndex = pProtocol.getNodes().indexOf(pNode);
			boolean isTopNode = topIndex != -1;

			boolean isSubNode = pNode.getParent() != null && pProtocol.getNodes().contains(pNode.getParent());

			if (isTopNode && pNode.getStep().getType() == StepType.CONTAINER && pProcessChildren) {
				if (pNode.getChildren().size() > 0) {
					return pNode.getChildren().get(0);
				}
			}

			if (isTopNode) {
				int index = topIndex + 1;
				if (pProtocol.getNodes().size() > index) {
					return pProtocol.getNodes().get(index);
				}
			}

			if (isSubNode) {
				int index = pNode.getParent().getChildren().indexOf(pNode) + 1;
				if (index < pNode.getParent().getChildren().size()) {
					return pNode.getParent().getChildren().get(index);
				} else {
					return findNextNode(pProtocol, pNode.getParent(), false);
				}
			}
		}
		return null;
	}

	private void updateOutlineSelection() {
		if (fSelectedNode != null && getOutlinePage() != null) {
			getOutlinePage().setSelection(new StructuredSelection(fSelectedNode));
		}
	}

	private ProtocolControl getControl() {
		return fEditor.getProtocolControl();
	}

	private ProtocolOutlinePage getOutlinePage() {
		return fEditor.getOutlinePage();
	}

	public Protocol getModel() {
		return fModel;
	}

	public void setModel(Protocol pModel) {
		fModel = pModel;

		if (pModel != null && pModel.getNodes().size() > 0) {
			fSelectedNode = pModel.getNodes().get(0);
		} else {
			fSelectedNode = null;
		}
	}

	public void updateUI() {
		updateTitle();
		updateUISelectedNode();
		updateExportContent();
	}

	private void updateTitle() {
		String title = null;
		if (fModel != null && fModel.getChecklistModel() != null) {
			Model checklistModel = fModel.getChecklistModel();
			if (checklistModel.getTitle() != null) {
				title = checklistModel.getTitle().getTitle();
			}
		}
		getControl().getLabelTitle().setText(StringUtil.createNonNull(title));
	}

	private void updateUISelectedNode() {
		ProtocolNavigatorControl navControl = getControl().getNavigatorControl();

		ProtocolNode node = fSelectedNode;
		boolean hasNodeAndStep = node != null && node.getStep() != null;
		boolean hasPrevNode = hasNodeAndStep && findPrevNode(fModel, fSelectedNode) != null;
		boolean hasNextNode = hasNodeAndStep && findNextNode(fModel, fSelectedNode, false) != null;
		if (hasNodeAndStep) {
			Step step = node.getStep();
			navControl.getLabelCurrentTitleValue().setText(StringUtil.createNonNull(step.getTitle()));
			navControl.getLabelCurrentDescriptionValue().setText(StringUtil.createNonNull(step.getDescription()));

			switch (node.getStatus()) {
			case OK:
				navControl.getLabelCurrentStatusValue().setImage(ImageProvider.getImage(ImageConstants.PROTOCOL_NODE_OK));
				break;
			case SKIPPED:
				navControl.getLabelCurrentStatusValue().setImage(ImageProvider.getImage(ImageConstants.PROTOCOL_NODE_NONE));
				break;
			case FAILED:
				navControl.getLabelCurrentStatusValue().setImage(ImageProvider.getImage(ImageConstants.PROTOCOL_NODE_ERROR));
				break;
			default:
				navControl.getLabelCurrentStatusValue().setImage(ImageProvider.getImage(null));
				break;
			}

			navControl.getTextCurrentNotesValue().setText(StringUtil.createNonNull(node.getInfo()));
		} else {
			navControl.getLabelCurrentTitleValue().setText("?");
			navControl.getLabelCurrentDescriptionValue().setText("?");
			navControl.getLabelCurrentStatusValue().setImage(null);
			navControl.getTextCurrentNotesValue().setText("");
		}

		navControl.getTextCurrentNotesValue().setEnabled(hasNodeAndStep);
		navControl.getButtonCurrentFailed().setEnabled(hasNodeAndStep && fSelectedNode.getStep().getType() != StepType.CONTAINER);
		navControl.getButtonCurrentNone().setEnabled(hasNodeAndStep);
		navControl.getButtonCurrentPassed().setEnabled(hasNodeAndStep);
		navControl.getButtonNext().setEnabled(hasNextNode);
		navControl.getButtonPrev().setEnabled(hasPrevNode);
	}

	public void selectProtocolNode(ISelection pSelection) {
		Protocol model = fModel;
		if (model != null && pSelection != null && !pSelection.isEmpty()) {
			if (pSelection instanceof IStructuredSelection) {
				IStructuredSelection sel = (IStructuredSelection) pSelection;
				Object firstElement = sel.getFirstElement();
				if (firstElement instanceof ProtocolNode) {
					ProtocolNode node = (ProtocolNode) firstElement;
					fSelectedNode = node;
					updateUISelectedNode();
				}
			}

		}
	}

	/**
	 * Updates the export content and shows it on the control.
	 */
	public void updateExportContent() {
		String text = StringUtil.createNonNull(fProtocolExporter.export(fModel));
		Text textControl = getControl().getExportControl().getTextContent();
		String textUI = textControl.getText();
		if (!text.equals(textUI)) {
			textControl.setText(text);
		}
	}
}
