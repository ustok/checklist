/******************************************************
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.checklist.protocol.internal.ui.editor.general;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IPath;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;

/**
 * Resource change listener for editors with {@link IFileEditorInput}.
 * 
 * @author Ingo Mohr
 * @created Feb 10, 2013
 */
public class FileEditorInputResourceChangeListener implements IResourceChangeListener {
	
	/*
	 * The implementation is based on FileInPlaceEditorInput
	 */

	private final IFileEditor editor;

	public FileEditorInputResourceChangeListener(IFileEditor pEditor) {
		Assert.isNotNull(pEditor);
		editor = pEditor;
	}

	@Override
	public void resourceChanged(IResourceChangeEvent event) {
		IResourceDelta mainDelta = event.getDelta();
		IFile file = getFile();
		if (mainDelta != null && file != null) {
			editor.getEditorInput();
			IResourceDelta affectedElement = mainDelta.findMember(file.getFullPath());
			if (affectedElement != null) {
				processDelta(affectedElement);
			}
		}
	}

	private boolean processDelta(final IResourceDelta delta) {
		Runnable changeRunnable = null;

		switch (delta.getKind()) {
		case IResourceDelta.REMOVED:
			if ((IResourceDelta.MOVED_TO & delta.getFlags()) != 0) {
				changeRunnable = new Runnable() {
					public void run() {
						IPath path = delta.getMovedToPath();
						IFile newFile = delta.getResource().getWorkspace().getRoot().getFile(path);
						if (newFile != null) {
							getEditor().sourceChanged(new FileEditorInput(newFile));
						}
					}
				};
			} else {
				changeRunnable = new Runnable() {
					public void run() {
						getEditor().sourceDeleted();
						IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
						page.closeEditor(getEditor(), true);
					}
				};

			}
		}

		if (changeRunnable != null) {
			Display.getDefault().asyncExec(changeRunnable);
		}

		return true; // because we are sitting on files anyway
	}

	private IFileEditor getEditor() {
		return editor;
	}

	private IFile getFile() {
		IEditorInput input = getEditor().getEditorInput();
		if (input != null && input instanceof IFileEditorInput) {
			IFileEditorInput fileEditorInput = (IFileEditorInput) input;
			return fileEditorInput.getFile();
		}
		return null;
	}

}
