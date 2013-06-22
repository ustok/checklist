/******************************************************
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.checklist.internal.ui.edit;

import org.eclipse.emf.transaction.TransactionalEditingDomain;

/**
 * Provider for the editing domain to work on checklist models.
 * 
 * @author Ingo Mohr
 * @created Mar 4, 2013
 */
public class EditingDomainProvider {

	/** editing domain ID to be used for checklist models */
	public static final String DOMAIN_ID = "org.ustok.checklist.ui.editingDomain";

	public EditingDomainProvider() {
	}

	/**
	 * Returns the transactional editing domain to edit checklist models.
	 * 
	 * @return editing domain. Never <code>null</code>.
	 */
	public TransactionalEditingDomain getEditingDomain() {
		return TransactionalEditingDomain.Registry.INSTANCE.getEditingDomain(DOMAIN_ID);
	}

}
