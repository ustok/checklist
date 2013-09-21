/******************************************************
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.checklist.internal.app;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

/**
 * Protocols perspective.
 * 
 * @author Ingo Mohr
 * @created Sep 11, 2013
 */
public class Perspective implements IPerspectiveFactory {

	private static final String VIEW_PROJECT_EXPLORER = "org.eclipse.ui.navigator.ProjectExplorer";

	private static final String VIEW_PROBLEMS = "org.eclipse.ui.views.ProblemView";

	private static final String VIEW_SEARCH = "org.eclipse.search.ui.views.SearchView";

	@Override
	public void createInitialLayout(IPageLayout pLayout) {
		pLayout.addView(VIEW_PROJECT_EXPLORER, IPageLayout.LEFT, 0.3F, pLayout.getEditorArea());

		IFolderLayout folder = pLayout.createFolder("stuffBelow", IPageLayout.BOTTOM, 0.8F, pLayout.getEditorArea());
		folder.addView(VIEW_PROBLEMS);
		folder.addView(VIEW_SEARCH);
	}

}
