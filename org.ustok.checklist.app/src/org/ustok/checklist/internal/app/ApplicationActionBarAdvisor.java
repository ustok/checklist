/******************************************************
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.checklist.internal.app;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;

/**
 * Action bar advisor.
 * 
 * @author Ingo Mohr
 * @created 11.09.2013
 */
public class ApplicationActionBarAdvisor extends ActionBarAdvisor {

	/**
	 * Constructor.
	 * 
	 * @param configurer the configurer to set.
	 */
	public ApplicationActionBarAdvisor(IActionBarConfigurer configurer) {
		super(configurer);
	}

	protected void makeActions(IWorkbenchWindow window) {
	}

	protected void fillMenuBar(IMenuManager menuBar) {
	}

}
