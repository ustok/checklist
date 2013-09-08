/******************************************************
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.checklist.protocol.internal.ui.control.list;

import org.eclipse.swt.graphics.GC;

/**
 * A component renderer is used to perform the actual rendering for a {@link DrawableComponent}.
 * 
 * @param <T>
 *        the component type.
 * @author Ingo Mohr
 * @created Mar 6, 2013
 */
public interface IComponentRenderer<T extends DrawableComponent> {

	/**
	 * Draws the given component using the given {@link GC}.
	 * 
	 * @param pGc
	 *        the GC to use for drawing. The renderer should never dispose the GC as it is automatically disposed by the caller
	 *        after all drawing is finished.
	 * @param pComponent
	 *        the component to draw.
	 */
	public void draw(GC pGc, T pComponent);

}
