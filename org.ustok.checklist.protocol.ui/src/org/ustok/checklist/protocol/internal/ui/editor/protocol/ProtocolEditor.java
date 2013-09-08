/******************************************************
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.checklist.protocol.internal.ui.editor.protocol;

import java.util.EventObject;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.ustok.checklist.cfg.checklist.Model;
import org.ustok.checklist.core.model.protocol.Protocol;
import org.ustok.checklist.protocol.core.model.ProtocolModelFactory;
import org.ustok.checklist.protocol.internal.ui.control.ProtocolControl;
import org.ustok.checklist.protocol.internal.ui.edit.ProtocolEditingDomainProvider;
import org.ustok.checklist.protocol.internal.ui.editor.general.AbstractFileEditor;
import org.ustok.checklist.protocol.internal.ui.model.SampleChecklistFactory;
import org.ustok.checklist.protocol.ui.ChecklistProtocolUIActivator;

/**
 * Editor for protocols.
 * 
 * @author Ingo Mohr
 * @created Feb 9, 2013
 */
public class ProtocolEditor extends AbstractFileEditor {

	private boolean fDirty;

	private ScrolledComposite fControl;

	private ProtocolControl fControlProtocol;

	private ProtocolEditorController fController;

	private Protocol fModel;

	private ProtocolOutlinePage fOutlinePage;

	private Resource fResource;

	private CommandStackListener fCommandStackListener;

	public ProtocolEditor() {
	}

	@Override
	public void doSave(IProgressMonitor pMonitor) {
		Assert.isNotNull(fResource, "Whoops! Something went wrong. There's no resource to save to.");

		try {
			fResource.save(null);
			clearDirty();
		} catch (Exception ex) {
			String msg = "Error saving protocol.";
			String bundleId = ChecklistProtocolUIActivator.bundleID();
			IStatus status = new Status(IStatus.ERROR, bundleId, ex.getMessage(), ex);
			ChecklistProtocolUIActivator.getDefault().getLog().log(status);
			ErrorDialog.openError(null, "Save", msg, status);
		}
	}

	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}

	@Override
	public void doSaveAs() {
		// not supported
	}

	@Override
	public void init(IEditorSite pSite, IEditorInput pInput) throws PartInitException {
		setSite(pSite);
		setInput(pInput);

		IFileEditorInput input = (IFileEditorInput) pInput;
		sourceChanged(input);
		
		fCommandStackListener = new CommandStackListener() {

			@Override
			public void commandStackChanged(EventObject pEvent) {
				setDirty();
				if (fOutlinePage != null) {
					fOutlinePage.updateUI();
				}
				fController.updateExportContent();
			}
		};
		ProtocolEditingDomainProvider.getDomain().getCommandStack().addCommandStackListener(fCommandStackListener);
	}

	@Override
	public boolean isDirty() {
		return fDirty;
	}

	@Override
	public void createPartControl(Composite pParent) {
		ScrolledComposite sc = new ScrolledComposite(pParent, SWT.V_SCROLL | SWT.H_SCROLL);
		sc.setExpandHorizontal(true);
		sc.setExpandVertical(true);
		sc.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());

		fControlProtocol = new ProtocolControl(sc, SWT.NONE);
		sc.setContent(fControlProtocol);
		sc.setMinSize(800, fControlProtocol.computeSize(SWT.DEFAULT, SWT.DEFAULT).y);
		sc.layout();

		fControl = sc;
		fController = new ProtocolEditorController(this);
		setModel(fModel);
	}

	@Override
	public void setFocus() {
		getControl().setFocus();
	}

	private Composite getControl() {
		return fControl;
	}

	private void clearDirty() {
		if (isDirty()) {
			fDirty = false;
			firePropertyChange(PROP_DIRTY);
		}
	}

	private void setDirty() {
		if (!isDirty()) {
			fDirty = true;
			firePropertyChange(PROP_DIRTY);
		}
	}

	private Protocol getModel() {
		return fModel;
	}

	private void setModel(Protocol pModel) {
		fModel = pModel;
		if (fController != null) {
			fController.setModel(fModel);
			fController.updateUI();
		}

		if (fOutlinePage != null) {
			fOutlinePage.setModel(fModel);
			fOutlinePage.updateUI();
		}
	}

	@Override
	public void sourceChanged(IFileEditorInput pFileEditorInput) {
		setInput(pFileEditorInput);

		Protocol newModel = null;
		IFile file = null;
		if (pFileEditorInput != null) {
			file = pFileEditorInput.getFile();
		}

		TransactionalEditingDomain domain = ProtocolEditingDomainProvider.getDomain();
		fResource = domain.getResourceSet().createResource(URI.createURI(file.getFullPath().toString()));

		if (fResource != null) {
			try {
				if (file.getContents().available() <= 0) {
					SampleChecklistFactory sampleChecklistFactory = new SampleChecklistFactory();
					Model sampleChecklist = sampleChecklistFactory.createSampleChecklist();

					ProtocolModelFactory factory = new ProtocolModelFactory();
					final Protocol protocol = factory.createProtocol(sampleChecklist);
					domain.getCommandStack().execute(new ChangeCommand(fResource) {

						@Override
						protected void doExecute() {
							fResource.getContents().add(protocol);
						}
					});
					fResource.save(null);
					fModel = protocol;
				} else {
					fResource.load(null);
					newModel = (Protocol) fResource.getContents().get(0);
				}
			} catch (Exception ex) {
				String msg = "Error opening protocol.";
				IStatus status = new Status(IStatus.ERROR, ChecklistProtocolUIActivator.bundleID(), ex.getMessage(), ex);
				ChecklistProtocolUIActivator.getDefault().getLog().log(status);
				ErrorDialog.openError(null, "Open", msg, status);
			}

		}

		String partName = "?";
		if (file != null) {
			partName = file.getName();
		}
		setPartName(partName);

		setModel(newModel);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Object getAdapter(Class pAdapter) {
		if (IContentOutlinePage.class.equals(pAdapter)) {
			if (fOutlinePage == null) {
				fOutlinePage = new ProtocolOutlinePage(this);
				fOutlinePage.setModel(getModel());
				fOutlinePage.updateUI();
			}
			return fOutlinePage;
		}
		return super.getAdapter(pAdapter);
	}

	public ProtocolEditorController getController() {
		return fController;
	}

	public ProtocolControl getProtocolControl() {
		return fControlProtocol;
	}

	public ProtocolOutlinePage getOutlinePage() {
		return fOutlinePage;
	}

	@Override
	public void dispose() {
		if (fCommandStackListener != null) {
			ProtocolEditingDomainProvider.getDomain().getCommandStack().removeCommandStackListener(fCommandStackListener);
		}
		super.dispose();
	}

}
