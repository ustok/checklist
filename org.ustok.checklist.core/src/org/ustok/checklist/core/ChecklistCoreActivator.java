/******************************************************
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.checklist.core;

import org.eclipse.emf.ecore.EPackage;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.ustok.checklist.model.checklistcfg.ChecklistcfgPackage;
import org.ustok.checklist.model.protocol.ProtocolPackage;

/**
 * Activator for the bundle.
 * 
 * @author Ingo Mohr
 * @created Mar 4, 2013
 */
public class ChecklistCoreActivator implements BundleActivator {

	private static ChecklistCoreActivator sharedInstance;

	private BundleContext fContext;

	@Override
	public void start(BundleContext pContext) throws Exception {
		sharedInstance = this;
		fContext = pContext;
		registerEmfPackages();
	}

	@Override
	public void stop(BundleContext pContext) throws Exception {
		sharedInstance = null;
		fContext = null;
	}

	private void registerEmfPackages() {
		EPackage.Registry.INSTANCE.put(ChecklistcfgPackage.eNS_URI, ChecklistcfgPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(ProtocolPackage.eNS_URI, ProtocolPackage.eINSTANCE);
	}

	/**
	 * Returns the shared instance of the activator.
	 * 
	 * @return shared instance. Never <code>null</code> while plug-in is running.
	 */
	public static ChecklistCoreActivator getDefault() {
		return sharedInstance;
	}

	/**
	 * Returns the bundle context.
	 * 
	 * @return bundle context. Never <code>null</code> while plug-in is running.
	 */
	public BundleContext getBundleContext() {
		return fContext;
	}

}
