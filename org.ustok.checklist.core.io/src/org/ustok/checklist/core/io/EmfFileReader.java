/******************************************************
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.checklist.core.io;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.EObject;

/**
 * EMF file reader. Reads EMF based models from files.
 * 
 * @author Ingo Mohr
 * @created Feb 9, 2013
 */
public interface EmfFileReader {

	/**
	 * Reads the model from the given file.
	 * 
	 * @param pFile
	 *        the file to read from.
	 * @return the model that has been read from the file. Never <code>null</code>.
	 */
	public EObject read(IFile pFile);

}
