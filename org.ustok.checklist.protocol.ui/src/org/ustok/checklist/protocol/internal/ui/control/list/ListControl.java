/******************************************************
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.checklist.protocol.internal.ui.control.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.events.MouseTrackListener;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.ustok.checklist.protocol.internal.ui.control.list.renderer.DefaultListItemRenderer;

/**
 * A control with a number of ListItems on it.
 * 
 * @author Ingo Mohr
 * @created Mar 6, 2013
 */
public class ListControl extends Canvas {

	private final List<ListItem> fListItems = new ArrayList<ListItem>();

	private final List<ListItem> fListSelectedItems = new ArrayList<ListItem>();

	private ListItem fMouseOverItem;

	private Listener fEventListener;

	private int fMargin = 5;

	private int fItemHeight = 25;

	private final List<IListControlSelectionListener> fListSelectionListeners = new ArrayList<IListControlSelectionListener>();

	private IComponentRenderer<ListItem> fItemRenderer = new DefaultListItemRenderer();

	/**
	 * Creates a new control.
	 * 
	 * @param pParent
	 *        the parent composite. Cannot be <code>null</code>.
	 * @param pStyle
	 *        the style to set.
	 */
	public ListControl(Composite pParent, int pStyle) {
		super(pParent, pStyle);

		initListeners();
		
		// TODO get constant white background instead
		setBackground(new Color(this.getDisplay(), new RGB(255, 255, 255)));
	}

	/**
	 * Adds the given selection listener to the control.
	 * 
	 * @param pListener
	 *        the listener to add.
	 */
	public void addSelectionListener(IListControlSelectionListener pListener) {
		if (pListener != null) {
			synchronized (this) {
				fListSelectionListeners.add(pListener);
			}
		}
	}

	/**
	 * Returns all selection listeners that are attached to the control.
	 * 
	 * @return all selection listeners. Never <code>null</code>.
	 */
	public List<IListControlSelectionListener> getSelectionListeners() {
		return fListSelectionListeners;
	}

	/**
	 * Removes the given selection listener from the control.
	 * 
	 * @param pListener
	 *        the listener to remove.
	 * @return <code>true</code> if the listener was attached before.
	 */
	public boolean removeSelectionListener(IListControlSelectionListener pListener) {
		synchronized (this) {
			return fListSelectionListeners.remove(pListener);
		}
	}

	/**
	 * Returns all list items on the control.
	 * 
	 * @return list items. Never <code>null</code> but possibly empty.
	 */
	public List<ListItem> getItems() {
		return fListItems;
	}

	/**
	 * Returns the item at the given location.
	 * 
	 * @param pX
	 *        the x value of the location.
	 * @param pY
	 *        the y value of the location.
	 * 
	 * @return item at given location. <code>null</code> if none found at that location.
	 */
	public ListItem getItem(int pX, int pY) {
		for (ListItem item : fListItems) {
			if (item.getBounds().contains(pX, pY)) {
				return item;
			}
		}
		return null;
	}

	/**
	 * Returns all currently selected items. If no item is selected, this returns an empty collection.
	 * 
	 * @return selected items. Never <code>null</code> but possibly empty.
	 */
	public List<ListItem> getSelectedItems() {
		return fListSelectedItems;
	}

	/**
	 * Sets the selected items and invokes a redraw.
	 * 
	 * @param pItems
	 *        items to select.
	 */
	public void setSelectedItems(Collection<ListItem> pItems) {
		fListSelectedItems.clear();
		if (pItems != null) {
			Set<Integer> indexes = new HashSet<Integer>();
			for (ListItem item : pItems) {
				int index = fListItems.indexOf(item);
				indexes.add(index);
			}
			ArrayList<Integer> listIndexes = new ArrayList<Integer>(indexes);
			Collections.sort(listIndexes);

			for (int index : listIndexes) {
				fListSelectedItems.add(fListItems.get(index));
			}
		}
		redraw();
	}

	/**
	 * Selects the item at the given index.
	 * 
	 * @param pIndex
	 *        the index of the item to select.
	 */
	protected void setSelectionIndex(int pIndex) {
		ListItem item = getItems().get(pIndex);
		setSelectedItems(Arrays.asList(item));
	}

	@Override
	public void dispose() {
		if (fEventListener != null) {
			removeListener(SWT.KeyDown, fEventListener);
		}
		super.dispose();
	}

	/**
	 * Returns the item that is currently under mouse-over effect.
	 * 
	 * @return mouseover item. <code>null</code> if none.
	 */
	public ListItem getMouseOverItem() {
		return fMouseOverItem;
	}

	/**
	 * Sets the item that is currently under mouse-over effect.
	 * 
	 * @param pItem
	 *        the item to set.
	 */
	public void setMouseOverItem(ListItem pItem) {
		fMouseOverItem = pItem;
	}

	/**
	 * Returns the margin. Default value is 5 pixels.
	 * 
	 * @return the margin to be used.
	 */
	public int getMargin() {
		return fMargin;
	}

	/**
	 * Sets the margin to be used for drawing. Default value is 5 pixels.
	 * 
	 * @param pMargin
	 *        the margin to use.
	 */
	public void setMargin(int pMargin) {
		fMargin = pMargin;
	}

	/**
	 * Returns the height of each single item.
	 * <p>
	 * Default is 25 pixels.
	 * </p>
	 * 
	 * @return the itemHeight
	 */
	public int getItemHeight() {
		return fItemHeight;
	}

	/**
	 * Sets the height of each single item.
	 * <p>
	 * Default is 25 pixels.
	 * </p>
	 * 
	 * @param pItemHeight
	 *        the itemHeight to set
	 */
	public void setItemHeight(int pItemHeight) {
		fItemHeight = pItemHeight;
	}

	/**
	 * Returns the renderer to be used to draw the list items.
	 * <p>
	 * Default is the {@link DefaultListItemRenderer}.
	 * </p>
	 * 
	 * @return the itemRenderer.
	 */
	public IComponentRenderer<ListItem> getItemRenderer() {
		return fItemRenderer;
	}

	/**
	 * Sets the renderer to be used to draw the list items.
	 * <p>
	 * Default is the {@link DefaultListItemRenderer}.
	 * </p>
	 * 
	 * @param pItemRenderer
	 *        the itemRenderer to set.
	 */
	public void setItemRenderer(IComponentRenderer<ListItem> pItemRenderer) {
		fItemRenderer = pItemRenderer;
	}

	/**
	 * Invoked by the event listener to handle a given event.
	 * 
	 * @param pEvent
	 *        event to handle.
	 */
	protected void handleEvent(Event pEvent) {
		List<ListItem> selection = getSelectedItems();
		if (selection.size() > 0) {
			switch (pEvent.type) {
			case SWT.KeyDown:
				switch (pEvent.keyCode) {
				case SWT.HOME:
					setSelectionIndex(0);
					break;
				case SWT.END:
					setSelectionIndex(getItems().size() - 1);
					break;
				case SWT.ARROW_DOWN:
					ListItem lastSelectionItem = selection.get(selection.size() - 1);
					int index = getItems().indexOf(lastSelectionItem);
					if (index < fListItems.size() - 1) {
						index++;
						setSelectionIndex(index);
					}
					break;
				case SWT.ARROW_UP:
					ListItem firstSelectionItem = selection.get(0);
					index = getItems().indexOf(firstSelectionItem);
					if (index > 0) {
						index--;
						setSelectionIndex(index);
					}
					break;
				default:
					break;
				}
			default:
				break;
			}
		}
	}

	/**
	 * Updates the mouse-over hightlight and performs a redraw.
	 * 
	 * @param pX
	 *        the x value of the location.
	 * @param pY
	 *        the y value of the location.
	 */
	protected void updateHighlight(int pX, int pY) {
		ListItem item = getItem(pX, pY);
		setMouseOverItem(item);
		redraw();
	}

	/**
	 * Performs the drawing for the control and all its items.
	 * 
	 * @param pGc
	 *        the GC to use. The GC is automatically disposed by the caller and is not to be disposed inside of this method.
	 */
	protected void doPaint(GC pGc) {
		updateBounds();
		for (ListItem item : fListItems) {
			item.setRenderer(getItemRenderer());
			item.draw(pGc);
		}
	}

	/**
	 * Updates the bounds of all items and the size of the control.
	 */
	protected void updateBounds() {
		int margin = getMargin();

		Rectangle bounds = getBounds();
		int width = bounds.width - (2 * margin) - 2;
		int height = getItemHeight();

		int x = margin;
		int y = margin;

		for (ListItem item : fListItems) {
			item.setBounds(x, y, width, height);
			y = y + height + margin;
		}

		if (getParent() instanceof ScrolledComposite) {
			ScrolledComposite comp = (ScrolledComposite) getParent();
			comp.setMinHeight(y);
		}
	}

	private void initListeners() {
		fEventListener = new Listener() {
			@Override
			public void handleEvent(Event pEvent) {
				ListControl.this.handleEvent(pEvent);
			}
		};
		addListener(SWT.KeyDown, fEventListener);

		addPaintListener(new PaintListener() {
			@Override
			public void paintControl(PaintEvent pEvent) {
				boolean disposed = isDisposed();
				boolean isLastEventInLine = pEvent.count <= 1; // depends on OS

				if (!disposed && isLastEventInLine) {
					GC gc = pEvent.gc;
					doPaint(gc);
					gc.dispose();
				}
			}
		});

		addMouseMoveListener(new MouseMoveListener() {
			@Override
			public void mouseMove(MouseEvent pEvent) {
				updateHighlight(pEvent.x, pEvent.y);
			}
		});

		addMouseTrackListener(new MouseTrackListener() {
			@Override
			public void mouseHover(MouseEvent pEvent) {
			}

			@Override
			public void mouseExit(MouseEvent pEvent) {
				updateHighlight(-1, -1);
			}

			@Override
			public void mouseEnter(MouseEvent pEvent) {
				updateHighlight(pEvent.x, pEvent.y);
			}
		});

		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent pEvent) {
				ListItem item = getItem(pEvent.x, pEvent.y);
				if (item != null) {
					setSelectedItems(Arrays.asList(item));
				} else {
					List<ListItem> noItems = Collections.emptyList();
					setSelectedItems(noItems);
				}
			}
		});
	}

}
