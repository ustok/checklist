/******************************************************
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.checklist.protocol.internal.ui.editor.general;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.part.EditorPart;

/**
 * Base implementation of a file editor.
 * 
 * @author Ingo Mohr
 * @created Feb 10, 2013
 */
public abstract class AbstractFileEditor extends EditorPart implements IFileEditor {

	private final FileEditorInputResourceChangeListener resourceChangedListener;

	public AbstractFileEditor() {
		resourceChangedListener = new FileEditorInputResourceChangeListener(this);
		ResourcesPlugin.getWorkspace().addResourceChangeListener(resourceChangedListener);
	}

	@Override
	public IFileEditorInput getFileEditorInput() {
		IEditorInput input = getEditorInput();
		if (input instanceof IFileEditorInput) {
			return (IFileEditorInput) input;
		}
		return null;
	}

	@Override
	public void sourceDeleted() {
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(resourceChangedListener);
	}

}
