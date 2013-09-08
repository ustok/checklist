/******************************************************
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.checklist.protocol.internal.ui.util;

import org.eclipse.swt.graphics.Image;
import org.ustok.checklist.protocol.internal.ui.ImageConstants;
import org.ustok.checklist.protocol.ui.ChecklistProtocolUIActivator;

/**
 * Plug-in internal image provider.
 * 
 * @author tellastory
 * @created Sep 7, 2013
 */
public final class ImageProvider {

	private ImageProvider() {
	}

	/**
	 * Return the image for the given image key. See {@link ImageConstants} for keys.
	 * 
	 * @param pKey
	 *        the key.
	 * @return image for key. <code>null</code> if not found.
	 */
	public static Image getImage(String pKey) {
		return ChecklistProtocolUIActivator.getDefault().getImageRegistry().get(pKey);
	}

}
