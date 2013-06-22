/******************************************************
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.checklist;

import org.eclipse.jface.bindings.keys.KeyStroke;
import org.eclipse.jface.bindings.keys.ParseException;
import org.eclipse.jface.fieldassist.ContentProposalAdapter;
import org.eclipse.jface.fieldassist.ControlDecoration;
import org.eclipse.jface.fieldassist.FieldDecorationRegistry;
import org.eclipse.jface.fieldassist.SimpleContentProposalProvider;
import org.eclipse.jface.fieldassist.TextContentAdapter;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 * <Enter some description here>
 * 
 * @author tellastory
 * @created Jun 11, 2013
 */
public class Snippet2 {

	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setText("Snippet2");
		shell.setLayout(GridLayoutFactory.swtDefaults().create());

		Text text1 = new Text(shell, SWT.BORDER);
		text1.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).indent(10, SWT.DEFAULT).create());

		// Create the decoration for the text UI component
		for (final Text text : new Text[]{text1}) {
			final ControlDecoration deco = new ControlDecoration(text, SWT.LEFT | SWT.TOP);

			// Re-use an existing image
			Image image = FieldDecorationRegistry.getDefault().getFieldDecoration(FieldDecorationRegistry.DEC_CONTENT_PROPOSAL)
					.getImage();

			// Set description and image
			deco.setDescriptionText("Use CNTL + SPACE to see possible values");
			deco.setImage(image);

			// Always show decoration
			deco.setShowOnlyOnFocus(true);

			// Also if the text UI componet is not empty hide the decoration
			text.addModifyListener(new ModifyListener() {
				@Override
				public void modifyText(ModifyEvent e) {
					Text text = (Text) e.getSource();
					if (text.getText().length() > 0) {
						deco.hide();
					} else {
						deco.show();
					}
				}
			});
			text.addKeyListener(new KeyListener() {

				@Override
				public void keyReleased(KeyEvent pE) {
					// TODO Auto-generated method stub

				}

				@Override
				public void keyPressed(KeyEvent pE) {
					if (pE.keyCode == SWT.CR) {
						addText(text, deco);

					}
				}
			});

			// Help the user with the possible inputs
			// "." and "#" will also activate the content proposals
			char[] autoActivationCharacters = new char[]{'.', '#'};
			KeyStroke keyStroke;
			//
			try {
				keyStroke = KeyStroke.getInstance("Ctrl+Space");
				ContentProposalAdapter adapter = new ContentProposalAdapter(
						text,
						new TextContentAdapter(),
						new SimpleContentProposalProvider(new String[]{"Create Test Data", "Clear Test Data", "Send Raw Message"}),
						keyStroke, autoActivationCharacters);
			} catch (ParseException e1) {
				e1.printStackTrace();
			}

		}

		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();
	}

	protected static Text addText(final Text pText, final ControlDecoration pDeco) {
		Composite parent = pText.getParent();

		final Text newText = new Text(parent, SWT.BORDER);
		newText.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).indent(10, 0).create());

		// Also if the text UI componet is not empty hide the decoration
		newText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				Text text = (Text) e.getSource();
				if (text.getText().length() > 0) {
					pDeco.hide();
				} else {
					pDeco.show();
				}
			}
		});
		newText.addKeyListener(new KeyListener() {

			@Override
			public void keyReleased(KeyEvent pE) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent pE) {
				if (pE.keyCode == SWT.CR) {
					addText(newText, pDeco);
				}
			}
		});

		// Help the user with the possible inputs
		// "." and "#" will also activate the content proposals
		char[] autoActivationCharacters = new char[]{'.', '#'};
		KeyStroke keyStroke;
		//
		try {
			keyStroke = KeyStroke.getInstance("Ctrl+Space");
			ContentProposalAdapter adapter = new ContentProposalAdapter(newText, new TextContentAdapter(),
					new SimpleContentProposalProvider(new String[]{"Create Test Data", "Clear Test Data", "Send Raw Message"}),
					keyStroke, autoActivationCharacters);
		} catch (ParseException e1) {
			e1.printStackTrace();
		}

		parent.layout();
		newText.setFocus();

		return newText;
	}

}
