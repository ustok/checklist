/******************************************************
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.checklist.internal.ui.util.controls.list.renderer;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Rectangle;
import org.ustok.checklist.internal.ui.util.controls.IComponentRenderer;
import org.ustok.checklist.internal.ui.util.controls.list.ListItem;

/**
 * Default implementation of a renderer for {@link ListItem}s.
 * 
 * @author Ingo Mohr
 * @created Mar 7, 2013
 */
public class DefaultListItemRenderer implements IComponentRenderer<ListItem> {

	private Color fBackground;

	private Color fSelectionBackground;

	private Color fMouseOverBackground;

	private Color fForeground;

	private Color fBorderColor;

	private Font fFont;

	/**
	 * Creates a new renderer.
	 */
	public DefaultListItemRenderer() {

	}

	@Override
	public void draw(GC pGc, ListItem pItem) {
		pGc.setTextAntialias(SWT.OFF);
		drawMainBackgroundRect(pGc, pItem);
	}

	/**
	 * @return the background
	 */
	public Color getBackground() {
		return fBackground;
	}

	/**
	 * @param pBackground
	 *        the background to set
	 */
	public void setBackground(Color pBackground) {
		fBackground = pBackground;
	}

	/**
	 * @return the foreground
	 */
	public Color getForeground() {
		return fForeground;
	}

	/**
	 * @param pForeground
	 *        the foreground to set
	 */
	public void setForeground(Color pForeground) {
		fForeground = pForeground;
	}

	/**
	 * @return the selectionBackground
	 */
	public Color getSelectionBackground() {
		return fSelectionBackground;
	}

	/**
	 * @param pSelectionBackground
	 *        the selectionBackground to set
	 */
	public void setSelectionBackground(Color pSelectionBackground) {
		fSelectionBackground = pSelectionBackground;
	}

	/**
	 * @return the font
	 */
	public Font getFont() {
		return fFont;
	}

	/**
	 * @param pFont
	 *        the font to set
	 */
	public void setFont(Font pFont) {
		fFont = pFont;
	}

	/**
	 * @return the borderColor
	 */
	public Color getBorderColor() {
		return fBorderColor;
	}

	/**
	 * @param pBorderColor
	 *        the borderColor to set
	 */
	public void setBorderColor(Color pBorderColor) {
		fBorderColor = pBorderColor;
	}

	/**
	 * @return the mouseOverBackground
	 */
	public Color getMouseOverBackground() {
		return fMouseOverBackground;
	}

	/**
	 * @param pMouseOverBackground
	 *        the mouseOverBackground to set
	 */
	public void setMouseOverBackground(Color pMouseOverBackground) {
		fMouseOverBackground = pMouseOverBackground;
	}

	/**
	 * Draws the background rectangle.
	 * 
	 * @param pGc
	 *        GC to draw with.
	 * @param pItem
	 *        the item to draw the rectangle for.
	 */
	protected void drawMainBackgroundRect(GC pGc, ListItem pItem) {
		Rectangle rect = pItem.getBounds();

		if (pItem.getControl().getSelectedItems().contains(pItem)) {
			pGc.setBackground(getSelectionBackground());
		} else {
			if (pItem.getControl().getMouseOverItem() == pItem) {
				pGc.setBackground(getMouseOverBackground());
			} else {
				pGc.setBackground(getBackground());
			}
		}
		pGc.fillRectangle(rect);

		pGc.setForeground(getBorderColor());
		pGc.drawRectangle(rect);
	}
}
