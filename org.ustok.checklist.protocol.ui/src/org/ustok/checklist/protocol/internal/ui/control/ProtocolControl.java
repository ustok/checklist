/******************************************************
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.checklist.protocol.internal.ui.control;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.ustok.checklist.core.model.protocol.Protocol;

/**
 * Control for to show and edit {@link Protocol} models.
 * <p>
 * Has a navigator control and a title.
 * </p>
 * 
 * @author Ingo Mohr
 * @created Sep 7, 2013
 */
public class ProtocolControl extends Composite {

	private Label fLabelTitle;

	private ProtocolNavigatorControl fNavigatorControl;

	private ProtocolExportControl fExportControl;

	public ProtocolControl(Composite pParent, int pStyle) {
		super(pParent, pStyle);
		create();
	}

	private void create() {
		setLayout(GridLayoutFactory.swtDefaults().create());

		fLabelTitle = new Label(this, SWT.NONE);
		fLabelTitle.setLayoutData(GridDataFactory.swtDefaults().align(SWT.BEGINNING, SWT.BEGINNING).indent(20, 0).create());

		fNavigatorControl = new ProtocolNavigatorControl(this, SWT.NONE);
		fNavigatorControl.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());

		Label labelSep = new Label(this, SWT.SEPARATOR | SWT.HORIZONTAL);
		labelSep.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());

		fExportControl = new ProtocolExportControl(this, SWT.NONE);
		fExportControl.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
	}

	public ProtocolNavigatorControl getNavigatorControl() {
		return fNavigatorControl;
	}

	public Label getLabelTitle() {
		return fLabelTitle;
	}

	public ProtocolExportControl getExportControl() {
		return fExportControl;
	}

}
