/******************************************************
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.checklist.protocol.internal.ui.control;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

/**
 * Summary control showing the summary and a button to copy the summy to the clipboard.
 * 
 * @author Ingo Mohr
 * @created Sep 8, 2013
 */
public class ProtocolExportControl extends Composite {

	private Label fLabelContent;

	private Text fTextContent;

	private Button fButtonCopyToClipboard;

	public ProtocolExportControl(Composite pParent, int pStyle) {
		super(pParent, pStyle);
		create();
	}

	private void create() {
		setLayout(GridLayoutFactory.swtDefaults().numColumns(2).create());

		fLabelContent = new Label(this, SWT.NONE);
		fLabelContent.setText("Export preview:");
		fLabelContent.setLayoutData(GridDataFactory.swtDefaults().span(2, 1).create());

		fTextContent = new Text(this, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		fTextContent.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());

		fButtonCopyToClipboard = new Button(this, SWT.PUSH);
		fButtonCopyToClipboard.setLayoutData(GridDataFactory.swtDefaults().align(SWT.END, SWT.BEGINNING).create());
		fButtonCopyToClipboard.setText("Copy");
	}

	public Label getLabelContent() {
		return fLabelContent;
	}

	public Text getTextContent() {
		return fTextContent;
	}

	public Button getButtonCopyToClipboard() {
		return fButtonCopyToClipboard;
	}

}
