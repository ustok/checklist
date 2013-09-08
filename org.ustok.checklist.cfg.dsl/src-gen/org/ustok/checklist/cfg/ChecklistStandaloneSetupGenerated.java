/*
* generated by Xtext
*/
package org.ustok.checklist.cfg;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.ISetup;
import org.eclipse.emf.ecore.resource.Resource;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Generated from StandaloneSetup.xpt!
 */
@SuppressWarnings("all")
public class ChecklistStandaloneSetupGenerated implements ISetup {

	public Injector createInjectorAndDoEMFRegistration() {
		org.eclipse.xtext.common.TerminalsStandaloneSetup.doSetup();

		Injector injector = createInjector();
		register(injector);
		return injector;
	}
	
	public Injector createInjector() {
		return Guice.createInjector(new org.ustok.checklist.cfg.ChecklistRuntimeModule());
	}
	
	public void register(Injector injector) {
	if (!EPackage.Registry.INSTANCE.containsKey("http://www.ustok.org/checklist/cfg/Checklist")) {
		EPackage.Registry.INSTANCE.put("http://www.ustok.org/checklist/cfg/Checklist", org.ustok.checklist.cfg.checklist.ChecklistPackage.eINSTANCE);
	}

		org.eclipse.xtext.resource.IResourceFactory resourceFactory = injector.getInstance(org.eclipse.xtext.resource.IResourceFactory.class);
		org.eclipse.xtext.resource.IResourceServiceProvider serviceProvider = injector.getInstance(org.eclipse.xtext.resource.IResourceServiceProvider.class);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("checklist", resourceFactory);
		org.eclipse.xtext.resource.IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("checklist", serviceProvider);
		


	}
}