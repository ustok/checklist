/******************************************************
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.checklist.internal.ui.edit;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.ustok.checklist.core.model.checklistcfg.CLNode;
import org.ustok.checklist.core.model.checklistcfg.ChecklistcfgFactory;

/**
 * Factory for EMF commands.
 * <p>
 * The commands created by the factory are to be executed on the command stack of the editing domain.
 * </p>
 * 
 * @author Ingo Mohr
 * @created Mar 4, 2013
 */
public class CommandFactory {
	
	private final CLCfgEditingSupport fEditingSupport;

	public CommandFactory(CLCfgEditingSupport pEditingSupport) {
		fEditingSupport = pEditingSupport;
	}

	/**
	 * Creates a command that appends a new child node to the children of the given parent node.
	 * 
	 * @param pParent
	 *        the parent node. Cannot be <code>null</code>.
	 * @param pText
	 *        the text for the new node.
	 * @param pDescription
	 *        the description for the new node.
	 * @return new command. Never <code>null</code>.
	 */
	public AbstractCommand createCommandCreateAndAppendCLNode(CLNode pParent, String pText, String pDescription) {
		Assert.isNotNull(pParent);

		TransactionalEditingDomain domain = fEditingSupport.getEditingDomain();

		List<CLNode> nodesToAdd = new ArrayList<CLNode>();
		CLNode node = ChecklistcfgFactory.eINSTANCE.createCLNode();
		node.setText(pText);
		node.setDescription(pDescription);
		nodesToAdd.add(node);

		AddCommand command = new AddCommand(domain, pParent.getChildren(), nodesToAdd);
		return command;
	}

}
