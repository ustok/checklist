/******************************************************
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.checklist.internal.ui.edit;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.ustok.checklist.core.model.checklistcfg.CLCfg;
import org.ustok.checklist.core.model.checklistcfg.CLNode;
import org.ustok.checklist.ui.ChecklistUIActivator;

/**
 * Editing support for {@link CLCfg} editing models.
 * <p>
 * Internally uses a {@link TransactionalEditingDomain} to work on the model. So, all <code>perform</code> methods in this class
 * actually execute an undoable command within a transaction.
 * </p>
 * 
 * @author Ingo Mohr
 * @created Mar 4, 2013
 */
public class CLCfgEditingSupport {

	private final CommandFactory fCommandFactory;

	public CLCfgEditingSupport() {
		fCommandFactory = new CommandFactory(this);
	}

	/**
	 * Creates a new {@link CLNode} and appends it to the children of the given parent.
	 * 
	 * @param pParent
	 *        the parent node. Cannot be <code>null</code>.
	 * @param pText
	 *        the text for the new node.
	 * @param pDescription
	 *        the description for the new node.
	 */
	public void performAddNewNode(CLNode pParent, String pText, String pDescription) {
		AbstractCommand command = getCommandFactory().createCommandCreateAndAppendCLNode(pParent, pText, pDescription);
		getCommandStack().execute(command);
	}

	private CommandFactory getCommandFactory() {
		return fCommandFactory;
	}

	public CommandStack getCommandStack() {
		CommandStack stack = getEditingDomain().getCommandStack();
		return stack;
	}

	public TransactionalEditingDomain getEditingDomain() {
		return ChecklistUIActivator.getDefault().getEditingDomainProvider().getEditingDomain();
	}

}
