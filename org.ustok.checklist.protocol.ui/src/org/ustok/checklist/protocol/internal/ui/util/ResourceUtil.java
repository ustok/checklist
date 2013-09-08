/******************************************************
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.checklist.protocol.internal.ui.util;

import org.eclipse.core.resources.IFile;

/**
 * Resource util.
 * 
 * @author Ingo Mohr
 * @created Sep 8, 2013
 */
public final class ResourceUtil {

	private ResourceUtil() {

	}

	/**
	 * Returns the file name without extension. - e.g. "sample.txt" -> "sample".
	 * 
	 * @param pFile
	 *        the file.
	 * @return file name without extension. <code>null</code> if there's no name.
	 */
	public static String extractName(IFile pFile) {
		if (pFile != null && pFile.getName() != null) {

			String fileExtension = pFile.getFileExtension();
			if (fileExtension != null) {
				int endIndex = pFile.getName().length() - fileExtension.length() - 1; // remove "." also
				return pFile.getName().substring(0, endIndex);
			}
		}
		return null;
	}

}
