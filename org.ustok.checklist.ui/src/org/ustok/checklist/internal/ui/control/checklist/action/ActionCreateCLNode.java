/******************************************************
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.checklist.internal.ui.control.checklist.action;

import org.eclipse.jface.action.Action;
import org.ustok.checklist.internal.ui.control.ChecklistControl;
import org.ustok.checklist.internal.ui.edit.CLCfgEditingSupport;
import org.ustok.checklist.model.checklistcfg.CLCfg;
import org.ustok.checklist.model.checklistcfg.CLNode;

/**
 * Action to create a {@link CLNode} and append it to the model.
 * 
 * @author Ingo Mohr
 * @created Feb 24, 2013
 */
public class ActionCreateCLNode extends Action {

	private final ChecklistControl fControl;

	public ActionCreateCLNode(ChecklistControl pControl) {
		super("+");
		fControl = pControl;
	}

	@Override
	public void run() {
		final CLCfg model = fControl.getModel();

		CLCfgEditingSupport support = new CLCfgEditingSupport();
		support.performAddNewNode(model.getRoot(), "A Node", "A new node");
	}

}
