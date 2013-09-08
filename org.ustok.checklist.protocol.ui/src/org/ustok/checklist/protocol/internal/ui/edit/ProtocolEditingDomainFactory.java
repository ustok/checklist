/******************************************************
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.checklist.protocol.internal.ui.edit;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.ustok.checklist.core.model.protocol.Protocol;

/**
 * Editing domain factory for editing {@link Protocol} models.
 * <p>
 * Hooked into system via extension point. See plugin.xml.
 * </p>
 * 
 * @author Ingo Mohr
 * @created Sep 8, 2013
 */
public class ProtocolEditingDomainFactory implements TransactionalEditingDomain.Factory {

	public TransactionalEditingDomain createEditingDomain() {
		return TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain();
	}

	public TransactionalEditingDomain createEditingDomain(ResourceSet rset) {
		return TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(rset);
	}

	public TransactionalEditingDomain getEditingDomain(ResourceSet rset) {
		return TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(rset);
	}
}
