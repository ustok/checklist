/******************************************************
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.checklist.core.io;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;

/**
 * File reader to read XText DSL based text files into EMF based models.
 * 
 * @author Ingo Mohr
 * @created Sep 7, 2013
 */
public interface DslFileReader {

	/**
	 * Reads the model from the given XText based text file.
	 * 
	 * @param pFile
	 *        the file to read from. Cannot be <code>null</code>.
	 * @return model. Never <code>null</code>.
	 * @throws IOException
	 *         if file content cannot be read.
	 * @throws CoreException
	 *         the file accept doesn't work.
	 */
	public <T extends EObject> T readTextFile(IFile pFile) throws IOException, CoreException;

}
