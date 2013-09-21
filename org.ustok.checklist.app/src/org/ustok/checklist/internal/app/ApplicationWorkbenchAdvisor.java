/******************************************************
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.checklist.internal.app;

import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchAdvisor;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

/**
 * Workbench advisor.
 * 
 * @author Ingo Mohr
 * @created 11.09.2013
 */
public class ApplicationWorkbenchAdvisor extends WorkbenchAdvisor {

	private static final String PERSPECTIVE_ID = "org.ustok.checklist.internal.app.Perspective"; //$NON-NLS-1$

	public WorkbenchWindowAdvisor createWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
		return new ApplicationWorkbenchWindowAdvisor(configurer);
	}

	public String getInitialWindowPerspectiveId() {
		return PERSPECTIVE_ID;
	}
}
