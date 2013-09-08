/******************************************************
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.checklist.protocol.internal.ui.control.list;

import org.eclipse.core.runtime.Assert;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;

/**
 * Base class for drawable components.
 * 
 * @author Ingo Mohr
 * @created Mar 6, 2013
 */
public class DrawableComponent {

	private int fX;

	private int fY;

	private int fWidth;

	private int fHeight;

	private Object fData;

	private String fText;

	/**
	 * Draws the component.
	 * <p>
	 * This method is called when the component is drawn. The default implementation does nothing. Subclasses overwrite
	 * accordingly.
	 * </p>
	 * 
	 * @param pGc
	 *        the graphics context to use for drawing. The context is disposed automatically by the caller and should not be
	 *        disposed by this method.
	 */
	public void draw(GC pGc) {
	}

	/**
	 * Returns the bounds of the component.
	 * 
	 * @return bounds. Never <code>null</code>.
	 */
	public Rectangle getBounds() {
		return new Rectangle(fX, fY, fWidth, fHeight);
	}

	/**
	 * Returns the location of the component.
	 * 
	 * @return location. Never <code>null</code>.
	 */
	public Point getLocation() {
		return new Point(fX, fY);
	}

	/**
	 * Sets the bounds of the component.
	 * <p>
	 * This has an effect next time the component is drawn.
	 * </p>
	 * 
	 * @param pBounds
	 *        bounds. Cannot be <code>null</code>.
	 */
	public void setBounds(Rectangle pBounds) {
		Assert.isNotNull(pBounds);
		fX = pBounds.x;
		fY = pBounds.y;
		fWidth = pBounds.width;
		fHeight = pBounds.height;
	}

	/**
	 * Sets the bounds of the component.
	 * <p>
	 * This has an effect next time the component is drawn.
	 * </p>
	 * 
	 * @param pX
	 *        the x value of the location
	 * @param pY
	 *        the y value of the location
	 * @param pWidth
	 *        the width of component area
	 * @param pHeight
	 *        the height of the component area
	 */
	public void setBounds(int pX, int pY, int pWidth, int pHeight) {
		fX = pX;
		fY = pY;
		fWidth = pWidth;
		fHeight = pHeight;
	}

	/**
	 * Sets the location of the component.
	 * 
	 * @param pLocation
	 *        the location to set. Cannot be <code>null</code>.
	 */
	public void setLocation(Point pLocation) {
		Assert.isNotNull(pLocation);
		fX = pLocation.x;
		fY = pLocation.y;
	}

	/**
	 * Sets the location of the component.
	 * 
	 * @param pX
	 *        the x value of the location
	 * @param pY
	 *        the y value of the location
	 */
	public void setLocation(int pX, int pY) {
		fX = pX;
		fY = pY;
	}

	/**
	 * Returns the data related to the component.
	 * 
	 * @return the data. <code>null</code> if not set.
	 */
	public Object getData() {
		return fData;
	}

	/**
	 * Sets the data related to the component.
	 * 
	 * @param pData
	 *        the data to set.
	 */
	public void setData(Object pData) {
		fData = pData;
	}

	/**
	 * Returns the text to be drawn on the comopnent.
	 * 
	 * @return the text to draw. Returns <code>null</code> if not set.
	 */
	public String getText() {
		return fText;
	}

	/**
	 * Sets the text to be drawn on the component.
	 * 
	 * @param pText
	 *        the text to draw.
	 */
	public void setText(String pText) {
		fText = pText;
	}

	/**
	 * Disposes the component.
	 * <p>
	 * This method is invoked when the SWT control on which the component is drawn get's disposed. The default implementation does
	 * nothing. Subclasses overwrite to dispose what needs to be disposed or cleared up.
	 * </p>
	 */
	public void dispose() {
	}

}
