/******************************************************
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.checklist.internal.ui.control;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.ustok.checklist.core.model.protocol.ProtocolNode;
import org.ustok.checklist.core.model.protocol.State;
import org.ustok.checklist.protocol.internal.ui.util.StringUtil;

/**
 * Control for the currently selected {@link ProtocolNode}.
 * 
 * @author Ingo Mohr
 * @created Feb 9, 2013
 */
public class ProtocolNodeControl extends AbstractModelControl<ProtocolNode> {

	private Label fLabelCfgText;

	private Text fTextCfgDescription;

	private Text fTextProtocolNodeNotes;

	private Button fButtonOK;

	private Button fButtonFail;

	private SelectionListener fListenerPostSelection;

	public ProtocolNodeControl(Composite pParent, int pStyle) {
		super(pParent, pStyle);
	}

	@Override
	public void refresh() {
		ProtocolNode model = getModel();

		boolean hasValidModel = model != null && model.getNode() != null;

		fTextCfgDescription.setEnabled(hasValidModel);
		fTextProtocolNodeNotes.setEnabled(hasValidModel);
		fButtonFail.setEnabled(hasValidModel);
		fButtonOK.setEnabled(hasValidModel);

		if (!hasValidModel) {
			fLabelCfgText.setText("-");
			fTextCfgDescription.setText("");
			fTextProtocolNodeNotes.setText("");
		} else {
			fLabelCfgText.setText(StringUtil.createNonNull(model.getNode().getText()));
			fTextCfgDescription.setText(StringUtil.createNonNull(model.getNode().getDescription()));
			reconcileNodeInfo(true);
		}
	}

	/**
	 * Returns the post selection listener.
	 * <p>
	 * Invoked when one of the buttons FAILED or OK is pressed.
	 * </p>
	 * 
	 * @return post selection listener. <code>null</code> if not set.
	 */
	public SelectionListener getPostSelectionListener() {
		return fListenerPostSelection;
	}

	/**
	 * Sets the post selection listener.
	 * <p>
	 * Invoked when one of the buttons FAILED or OK is pressed.
	 * </p>
	 * 
	 * @param pListenerPostSelection
	 *        the listener to set.
	 */
	public void setPostSelectionListener(SelectionListener pListenerPostSelection) {
		fListenerPostSelection = pListenerPostSelection;
	}

	/**
	 * Returns the OK button.
	 * 
	 * @return OK button. Never <code>null</code> once control is created.
	 */
	public Button getButtonOK() {
		return fButtonOK;
	}

	/**
	 * Returns the FAIL button.
	 * 
	 * @return FAIL button. Never <code>null</code> once control is created.
	 */
	public Button getButtonFail() {
		return fButtonFail;
	}

	@Override
	protected void create() {
		final int numColumns = 4;
		setLayout(GridLayoutFactory.fillDefaults().numColumns(numColumns).create());

		fLabelCfgText = new Label(this, SWT.NONE);
		fLabelCfgText.setLayoutData(GridDataFactory.fillDefaults().span(numColumns, 1).create());

		Label label = new Label(this, SWT.NONE);
		label.setText("Description:");
		fTextCfgDescription = new Text(this, SWT.BORDER | SWT.WRAP | SWT.V_SCROLL | SWT.READ_ONLY);
		final int heightHint = 60;
		fTextCfgDescription.setLayoutData(GridDataFactory.fillDefaults().span(numColumns - 1, 1).hint(SWT.DEFAULT, heightHint)
				.grab(true, false).create());

		Label labelSep = new Label(this, SWT.SEPARATOR | SWT.HORIZONTAL);
		labelSep.setLayoutData(GridDataFactory.fillDefaults().span(numColumns, 1).create());

		Label label2 = new Label(this, SWT.NONE);
		label2.setText("Notes:");
		fTextProtocolNodeNotes = new Text(this, SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
		fTextProtocolNodeNotes.setLayoutData(GridDataFactory.fillDefaults().span(numColumns - 1, 1).hint(SWT.DEFAULT, heightHint)
				.grab(true, false).create());

		Label placeHolder = new Label(this, SWT.NONE);
		placeHolder.setLayoutData(GridDataFactory.fillDefaults().span(numColumns - 2, 1).create());

		fButtonFail = new Button(this, SWT.PUSH);
		fButtonFail.setText("Failed");

		fButtonOK = new Button(this, SWT.PUSH);
		fButtonOK.setText("OK");

		createListeners();
	}

	private void notifyPostSelectionListener(final SelectionEvent pEvent) {
		SelectionListener listener = getPostSelectionListener();
		if (listener != null) {
			listener.widgetSelected(pEvent);
		}
	}

	private void reconcileNodeInfo(boolean pModelIsMaster) {
		ProtocolNode model = getModel();
		if (model != null) {
			String valueModel = model.getInfo();
			String valueUI = fTextProtocolNodeNotes.getText();

			if (!valueUI.equals(valueModel)) {
				if (pModelIsMaster) {
					fTextProtocolNodeNotes.setText(StringUtil.createNonNull(valueModel));
				} else {
					model.setInfo(valueUI);
				}
			}
		}
	}

	private void createListeners() {
		fTextProtocolNodeNotes.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent pEvent) {
				reconcileNodeInfo(false);
			}
		});

		fButtonOK.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent pEvent) {
				ProtocolNode model = getModel();
				if (model != null && model.getState() != State.PASSED) {
					model.setState(State.PASSED);
				}
				notifyPostSelectionListener(pEvent);
			}
		});

		fButtonFail.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent pEvent) {
				ProtocolNode model = getModel();
				if (model != null && model.getState() != State.FAILED) {
					model.setState(State.FAILED);
				}
				notifyPostSelectionListener(pEvent);
			}
		});

	}

}
