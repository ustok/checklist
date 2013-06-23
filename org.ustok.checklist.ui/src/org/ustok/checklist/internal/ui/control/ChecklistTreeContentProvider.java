/******************************************************
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.checklist.internal.ui.control;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.ustok.checklist.core.model.checklistcfg.CLCfg;
import org.ustok.checklist.core.model.checklistcfg.CLNode;

/**
 * Tree content provider for {@link CLCfg} models.
 * 
 * @author Ingo Mohr
 * @created Mar 4, 2013
 */
public class ChecklistTreeContentProvider implements ITreeContentProvider {

	@Override
	public void dispose() {
	}

	@Override
	public void inputChanged(Viewer pViewer, Object pOldInput, Object pNewInput) {
	}

	@Override
	public Object[] getElements(Object pInputElement) {
		if (pInputElement instanceof CLCfg) {
			CLCfg model = (CLCfg) pInputElement;
			if (model.getRoot() != null) {
				return new Object[]{model.getRoot()};
			}
		}
		return null;
	}

	@Override
	public Object[] getChildren(Object pParentElement) {
		return ((CLNode) pParentElement).getChildren().toArray();
	}

	@Override
	public Object getParent(Object pElement) {
		return ((CLNode) pElement).getParent();
	}

	@Override
	public boolean hasChildren(Object pElement) {
		return !((CLNode) pElement).getChildren().isEmpty();
	}

}
