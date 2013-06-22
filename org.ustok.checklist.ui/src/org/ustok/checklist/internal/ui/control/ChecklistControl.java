/******************************************************
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.checklist.internal.ui.control;

import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.ToolBar;
import org.ustok.checklist.internal.ui.control.checklist.action.ActionCreateCLNode;
import org.ustok.checklist.internal.ui.control.checklist.action.ActionRemoveCLNode;
import org.ustok.checklist.model.checklistcfg.CLCfg;

/**
 * Control for {@link CLCfg}.
 * 
 * @author Ingo Mohr
 * @created Feb 13, 2013
 */
public class ChecklistControl extends AbstractModelControl<CLCfg> {

	private TreeViewer fTreeViewer;

	private ToolBar fToolBar;

	public ChecklistControl(Composite pParent, int pStyle) {
		super(pParent, pStyle);
	}

	@Override
	public void refresh() {
		fTreeViewer.refresh();
	}

	@Override
	protected void onModelInstalled() {
		fTreeViewer.setInput(getModel());
	}

	@Override
	protected void create() {
		final int numColumns = 2;
		setLayout(GridLayoutFactory.fillDefaults().numColumns(numColumns).create());

		fTreeViewer = new TreeViewer(this, SWT.NONE);
		fTreeViewer.getControl().setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		fTreeViewer.setContentProvider(new ChecklistTreeContentProvider());
		fTreeViewer.setLabelProvider(new ChecklistTreeLabelProvider());

		ToolBarManager toolBarManager = new ToolBarManager(SWT.VERTICAL | SWT.FLAT);
		toolBarManager.add(new ActionCreateCLNode(this));
		toolBarManager.add(new ActionRemoveCLNode());
		ToolBar toolbar = toolBarManager.createControl(this);
		toolbar.setLayoutData(GridDataFactory.swtDefaults().align(SWT.END, SWT.BEGINNING).create());
	}

}
