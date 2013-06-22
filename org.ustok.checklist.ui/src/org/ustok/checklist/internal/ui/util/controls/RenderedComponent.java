/******************************************************
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.checklist.internal.ui.util.controls;

import org.eclipse.core.runtime.Assert;
import org.eclipse.swt.graphics.GC;

/**
 * A component that is drawn using a renderer.
 * 
 * @author Ingo Mohr
 * @created Mar 6, 2013
 */
public class RenderedComponent extends DrawableComponent {

	private IComponentRenderer<?> fRenderer;

	/**
	 * Returns the renderer that renders the component.
	 * 
	 * @return renderer. <code>null</code> if not set.
	 */
	public IComponentRenderer<?> getRenderer() {
		return fRenderer;
	}

	/**
	 * Sets the renderer that renders the component.
	 * 
	 * @param pRenderer
	 *        the renderer to set.
	 */
	public void setRenderer(IComponentRenderer<?> pRenderer) {
		fRenderer = pRenderer;
	}

	@Override
	@SuppressWarnings({"rawtypes", "unchecked"})
	public void draw(GC pGc) {
		IComponentRenderer renderer = getRenderer();
		Assert.isNotNull(renderer);
		renderer.draw(pGc, this);
	}

}
