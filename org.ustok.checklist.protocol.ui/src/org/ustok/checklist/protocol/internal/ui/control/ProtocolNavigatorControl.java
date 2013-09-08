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
import org.ustok.checklist.protocol.internal.ui.ImageConstants;
import org.ustok.checklist.protocol.internal.ui.util.ImageProvider;

/**
 * Control on which the user can edit the current protocol node and navigate through the nodes of the protocol.
 * 
 * @author Ingo Mohr
 * @created Sep 7, 2013
 */
public class ProtocolNavigatorControl extends Composite {

	private static final int WIDTH_BUTTON = 100;

	// buttons
	private Button fButtonPrev;

	private Button fButtonNext;

	private Button fButtonCurrentPassed;

	private Button fButtonCurrentFailed;

	private Button fButtonCurrentNone;

	// labels
	private Label fLabelCurrentTitle;

	private Label fLabelCurrentDescription;

	private Label fLabelCurrentStatus;

	private Label fLabelCurrentNotes;

	// value widgets
	private Label fLabelCurrentTitleValue;

	private Label fLabelCurrentDescriptionValue;

	private Label fLabelCurrentStatusValue;

	private Text fTextCurrentNotesValue;

	/**
	 * Constructor of ProtocolNavigatorControl.
	 * 
	 * @param pParent
	 *        the parent. Cannot be <code>null</code>.
	 * @param pStyle
	 *        the style.
	 */
	public ProtocolNavigatorControl(Composite pParent, int pStyle) {
		super(pParent, pStyle);
		create();
	}

	private void create() {
		// <-, label, text, failed, none, passed, ->
		final int numColumns = 7;

		setLayout(GridLayoutFactory.swtDefaults().numColumns(numColumns).create());

		createFirstRow();
		createRowDescription();
		createRowStatus();
		createRowNotes();
	}

	private void createFirstRow() {
		fButtonPrev = new Button(this, SWT.ARROW | SWT.LEFT);

		fLabelCurrentTitle = new Label(this, SWT.NONE);
		fLabelCurrentTitle.setText("Title:");

		fLabelCurrentTitleValue = new Label(this, SWT.NONE);
		fLabelCurrentTitleValue.setLayoutData(GridDataFactory.fillDefaults().align(SWT.FILL, SWT.CENTER).grab(true, false)
				.create());
		fLabelCurrentTitleValue.setText("This is a sample title");

		fButtonCurrentFailed = new Button(this, SWT.PUSH);
		fButtonCurrentFailed.setText("Failed");
		fButtonCurrentFailed.setImage(ImageProvider.getImage(ImageConstants.PROTOCOL_NODE_ERROR));
		fButtonCurrentFailed.setLayoutData(GridDataFactory.swtDefaults().hint(WIDTH_BUTTON, SWT.DEFAULT).create());

		fButtonCurrentNone = new Button(this, SWT.PUSH);
		fButtonCurrentNone.setText("Skipped");
		fButtonCurrentNone.setImage(ImageProvider.getImage(ImageConstants.PROTOCOL_NODE_NONE));
		fButtonCurrentNone.setLayoutData(GridDataFactory.swtDefaults().hint(WIDTH_BUTTON, SWT.DEFAULT).create());

		fButtonCurrentPassed = new Button(this, SWT.PUSH);
		fButtonCurrentPassed.setText("OK");
		fButtonCurrentPassed.setImage(ImageProvider.getImage(ImageConstants.PROTOCOL_NODE_OK));
		fButtonCurrentPassed.setLayoutData(GridDataFactory.swtDefaults().hint(WIDTH_BUTTON, SWT.DEFAULT).create());

		fButtonNext = new Button(this, SWT.ARROW | SWT.RIGHT);
	}

	private void createRowDescription() {
		new Label(this, SWT.NONE); // space

		fLabelCurrentDescription = new Label(this, SWT.NONE);
		fLabelCurrentDescription.setText("Description:");
		fLabelCurrentDescription.setLayoutData(GridDataFactory.swtDefaults().align(SWT.BEGINNING, SWT.BEGINNING).create());

		fLabelCurrentDescriptionValue = new Label(this, SWT.WRAP);
		final int height = 75;
		fLabelCurrentDescriptionValue.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).hint(SWT.DEFAULT, height)
				.create());

		Label space = new Label(this, SWT.NONE);
		space.setLayoutData(GridDataFactory.swtDefaults().span(4, 1).create());
	}

	private void createRowStatus() {
		new Label(this, SWT.NONE); // space

		fLabelCurrentStatus = new Label(this, SWT.NONE);
		fLabelCurrentStatus.setText("Status:");

		fLabelCurrentStatusValue = new Label(this, SWT.NONE);
		fLabelCurrentStatusValue.setLayoutData(GridDataFactory.swtDefaults().align(SWT.BEGINNING, SWT.CENTER).create());

		Label space = new Label(this, SWT.NONE);
		space.setLayoutData(GridDataFactory.swtDefaults().span(4, 1).create());
	}

	private void createRowNotes() {
		new Label(this, SWT.NONE); // space

		fLabelCurrentNotes = new Label(this, SWT.NONE);
		fLabelCurrentNotes.setLayoutData(GridDataFactory.swtDefaults().align(SWT.BEGINNING, SWT.BEGINNING).create());
		fLabelCurrentNotes.setText("Notes:");

		fTextCurrentNotesValue = new Text(this, SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
		final int height = 150;
		fTextCurrentNotesValue.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).hint(SWT.DEFAULT, height).create());

		Label space = new Label(this, SWT.NONE);
		space.setLayoutData(GridDataFactory.swtDefaults().span(4, 1).create());
	}

	public Button getButtonPrev() {
		return fButtonPrev;
	}

	public Button getButtonNext() {
		return fButtonNext;
	}

	public Button getButtonCurrentPassed() {
		return fButtonCurrentPassed;
	}

	public Button getButtonCurrentFailed() {
		return fButtonCurrentFailed;
	}

	public Button getButtonCurrentNone() {
		return fButtonCurrentNone;
	}

	public Label getLabelCurrentTitle() {
		return fLabelCurrentTitle;
	}

	public Label getLabelCurrentDescription() {
		return fLabelCurrentDescription;
	}

	public Label getLabelCurrentStatus() {
		return fLabelCurrentStatus;
	}

	public Label getLabelCurrentNotes() {
		return fLabelCurrentNotes;
	}

	public Label getLabelCurrentTitleValue() {
		return fLabelCurrentTitleValue;
	}

	public Label getLabelCurrentDescriptionValue() {
		return fLabelCurrentDescriptionValue;
	}

	public Label getLabelCurrentStatusValue() {
		return fLabelCurrentStatusValue;
	}

	public Text getTextCurrentNotesValue() {
		return fTextCurrentNotesValue;
	}

}
