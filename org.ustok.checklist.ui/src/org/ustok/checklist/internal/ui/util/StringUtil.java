/******************************************************
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.checklist.internal.ui.util;

/**
 * String util.
 * 
 * @author Ingo Mohr
 * @created Feb 9, 2013
 */
public final class StringUtil {

	private StringUtil() {

	}

	/**
	 * Returns either the given value or an empty String if the value is <code>null</code>.
	 * 
	 * @param pValue
	 *        the value.
	 * @return value or empty string if value is <code>null</code>.
	 */
	public static String createNonNull(String pValue) {
		return pValue != null ? pValue : "";
	}

}
