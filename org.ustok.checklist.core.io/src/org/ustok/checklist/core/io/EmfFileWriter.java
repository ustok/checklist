/******************************************************
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.checklist.core.io;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.EObject;

/**
 * EMF file writer. Writes EMF based models to files.
 * 
 * @author Ingo Mohr
 * @created Feb 9, 2013
 */
public interface EmfFileWriter {

	/**
	 * Writes the given model to the given file.
	 * 
	 * @param pModel
	 *        the model to write. Cannot be <code>null</code>.
	 * @param pFile
	 *        the file to write to. Cannot be <code>null</code>.
	 * @throws IOException
	 *         if file canont be saved.
	 */
	public void write(EObject pModel, IFile pFile) throws IOException;

}
