/******************************************************
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.checklist.internal.ui.editor;

import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;

/**
 * Editor for a file in the workspace
 * 
 * @author Ingo Mohr
 * @created Feb 10, 2013
 */
public interface IFileEditor extends IEditorPart {

	/**
	 * Returns the editor input.
	 * 
	 * @return editor input. <code>null</code> if not set.
	 */
	public IFileEditorInput getFileEditorInput();

	/**
	 * Invoked when the file has changed.
	 * 
	 * @param pFileEditorInput
	 *        the iput with the new file.
	 */
	public void sourceChanged(IFileEditorInput pFileEditorInput);

	/**
	 * Invokes when the file has been deleted.
	 * <p>
	 * <b>Note</b>: The editor will be closed automatically. Editors can implement this method to perform some action before the
	 * editor will be closed.
	 * </p>
	 */
	public void sourceDeleted();

}
