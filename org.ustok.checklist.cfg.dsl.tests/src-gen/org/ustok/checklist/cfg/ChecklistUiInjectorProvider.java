/*
* generated by Xtext
*/
package org.ustok.checklist.cfg;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class ChecklistUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.ustok.checklist.cfg.ui.internal.ChecklistActivator.getInstance().getInjector("org.ustok.checklist.cfg.Checklist");
	}
	
}
