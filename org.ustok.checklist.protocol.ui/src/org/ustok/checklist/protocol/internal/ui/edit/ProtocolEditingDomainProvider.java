/******************************************************
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.checklist.protocol.internal.ui.edit;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

/**
 * Convenience class to access the editing domain for Protocol models.
 * 
 * @author Ingo Mohr
 * @created Sep 8, 2013
 */
public final class ProtocolEditingDomainProvider {

	private static final String EXTENSION_ID = "org.ustok.checklist.protocol.internal.ui.edit.ProtocolEditingDomainFactory";

	private ProtocolEditingDomainProvider() {
	}

	/**
	 * Returns the editing domain.
	 * 
	 * @return editing domain. Never <code>null</code>.
	 */
	public static TransactionalEditingDomain getDomain() {
		TransactionalEditingDomain domain = TransactionalEditingDomain.Registry.INSTANCE.getEditingDomain(EXTENSION_ID);
		Assert.isNotNull(domain, "Cannot find editing domain.");
		return domain;
	}

}
