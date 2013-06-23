/******************************************************
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.checklist.internal.ui.control;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;
import org.ustok.checklist.core.model.protocol.Protocol;
import org.ustok.checklist.core.model.protocol.ProtocolNode;

/**
 * Control to show/edit a protocol.
 * 
 * @author Ingo Mohr
 * @created Feb 9, 2013
 */
public class ProtocolControl extends AbstractModelControl<Protocol> {

	private ProtocolNodeControl fControlCurrentNodePrev;

	private ProtocolNodeControl fControlCurrentNode;

	private ProtocolNodeControl fControlCurrentNodeNext;

	private ProtocolNode fCurrentNode;

	public ProtocolControl(Composite pParent, int pStyle) {
		super(pParent, pStyle);
	}

	@Override
	public void refresh() {
		fControlCurrentNodePrev.setEnabled(false);
		fControlCurrentNodeNext.setEnabled(false);

		Protocol model = getModel();

		fControlCurrentNode.setEnabled(model != null);
	}

	@Override
	protected void create() {
		setLayout(GridLayoutFactory.swtDefaults().create());

		fControlCurrentNodePrev = new ProtocolNodeControl(this, SWT.BORDER);
		fControlCurrentNodePrev.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());

		fControlCurrentNode = new ProtocolNodeControl(this, SWT.BORDER);
		fControlCurrentNode.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());

		fControlCurrentNode.setPostSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent pEvent) {
				moveToNextNode();
			}

		});

		fControlCurrentNodeNext = new ProtocolNodeControl(this, SWT.BORDER);
		fControlCurrentNodeNext.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
	}

	private void moveToNextNode() {
		Protocol model = getModel();
		if (model != null && model.getRoot() != null && !model.getRoot().getChildren().isEmpty()) {
			int nextIndex;

			EList<ProtocolNode> nodes = model.getRoot().getChildren();

			if (fCurrentNode == null) {
				nextIndex = 0;
			} else {
				nextIndex = nodes.indexOf(fCurrentNode) + 1;
				Assert.isTrue(nextIndex != 0, "Current node must belong to the model.");
			}

			if (nodes.size() > nextIndex) {
				fCurrentNode = nodes.get(nextIndex);
				fControlCurrentNode.setModel(fCurrentNode);
			} else {
				fCurrentNode = null;
				fControlCurrentNode.setModel(null);
			}
		}
	}

	@Override
	protected void onModelInstalled() {
		fCurrentNode = null;
		moveToNextNode();
	}

}
