/******************************************************
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.checklist.protocol.internal.ui.control.list.viewer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.Assert;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.ustok.checklist.protocol.internal.ui.control.list.IListControlSelectionListener;
import org.ustok.checklist.protocol.internal.ui.control.list.ListControl;
import org.ustok.checklist.protocol.internal.ui.control.list.ListItem;

/**
 * A ListViewer applies the JFace viewer concept to the {@link ListControl}.
 * 
 * @author Ingo Mohr
 * @created Mar 6, 2013
 */
public class ListViewer extends Viewer {

	private LabelProvider fLabelProvider;

	private IStructuredContentProvider fContentProvider;

	private ListControl fControl;

	private Object fInput;

	private final List<ISelectionChangedListener> fListListenersSelChanged = new ArrayList<ISelectionChangedListener>();

	private ViewerComparator fComparator = null;

	/**
	 * Creates a new ListViewer.
	 * 
	 * @param pControl
	 *        the control for which to create the viewer. Cannot be <code>null</code>.
	 */
	public ListViewer(ListControl pControl) {
		Assert.isNotNull(pControl);
		fControl = pControl;
		fControl.addSelectionListener(new IListControlSelectionListener() {

			@Override
			public void selectionChanged(ListControl pSource) {
				ISelection sel = getSelection();
				for (ISelectionChangedListener li : fListListenersSelChanged) {
					li.selectionChanged(new SelectionChangedEvent(ListViewer.this, sel));
				}
			}
		});
	}

	@Override
	public ListControl getControl() {
		return fControl;
	}

	@Override
	public Object getInput() {
		return fInput;
	}

	@Override
	public void setInput(Object pInput) {
		if (getInput() != pInput) {
			fInput = pInput;
			Assert.isNotNull(fContentProvider, "Viewer must have a content provider when input is set.");
			Assert.isNotNull(fLabelProvider, "Viewer must have a label provider when input is set.");
		}
	}

	/**
	 * Returns the label provider.
	 * <p>
	 * The label provider is responsible to define how each element of the input model has to be shown on its related widget.
	 * </p>
	 * 
	 * @return the labelProvider. <code>null</code> if not set.
	 */
	public LabelProvider getLabelProvider() {
		return fLabelProvider;
	}

	/**
	 * Sets the label provider.
	 * <p>
	 * The label provider is responsible to define how each element of the input model has to be shown on its related widget.
	 * </p>
	 * 
	 * @param pLabelProvider
	 *        the label provider to set.
	 */
	public void setLabelProvider(LabelProvider pLabelProvider) {
		fLabelProvider = pLabelProvider;
	}

	/**
	 * Returns the content provider.
	 * <p>
	 * The content provider is responsible to define the number and order of widgets to be shown by the viewer. The content
	 * provider must be set before setting the input model.
	 * </p>
	 * 
	 * @return the content provider. <code>null</code> if not set.
	 */
	public IStructuredContentProvider getContentProvider() {
		return fContentProvider;
	}

	/**
	 * Sets the content provider.
	 * <p>
	 * The content provider is responsible to define the number and order of widgets to be shown by the viewer. The content
	 * provider must be set before setting the input model.
	 * </p>
	 * 
	 * @param pContentProvider
	 *        the content provider to set.
	 */
	public void setContentProvider(IStructuredContentProvider pContentProvider) {
		fContentProvider = pContentProvider;
	}

	@Override
	public void refresh() {
		internalRefresh();
	}

	@Override
	public void addSelectionChangedListener(ISelectionChangedListener pListener) {
		if (pListener != null) {
			fListListenersSelChanged.add(pListener);
		}
	}

	/**
	 * Returns all added selectionchanged listeners.
	 * 
	 * @return all selectionchanged listeners. Never <code>null</code>.
	 */
	public List<ISelectionChangedListener> getSelectionChangedListeners() {
		return fListListenersSelChanged;
	}

	/**
	 * Returns <code>true</code> if the given ISelectionChangedListener has been added to the viewer.
	 * 
	 * @param pListener
	 *        the listener to check.
	 * @return <code>true</code> if listener has been added. <code>false</code> otherwise.
	 */
	public boolean containsSelectionChangedListener(ISelectionChangedListener pListener) {
		return fListListenersSelChanged.contains(pListener);
	}

	@Override
	public void removeSelectionChangedListener(ISelectionChangedListener pListener) {
		fListListenersSelChanged.remove(pListener);
	}

	/**
	 * Removes all ISelectionChangedListeners that have been added to the viewer.
	 */
	public void removeAllSelectionChangedListeners() {
		fListListenersSelChanged.clear();
	}

	/**
	 * Returns the selection of the viewer.
	 * <p>
	 * Returns an <code>IStructuredSelection</code>.
	 * </p>
	 * 
	 * @return selection of the viewer. Never <code>null</code>.
	 */
	@Override
	public ISelection getSelection() {
		ListControl control = getControl();
		if (control == null || control.isDisposed()) {
			return StructuredSelection.EMPTY;
		}

		List<Object> selectedData = new ArrayList<Object>();
		for (ListItem item : control.getSelectedItems()) {
			selectedData.add(item.getData());
		}

		if (!selectedData.isEmpty()) {
			return new StructuredSelection(selectedData);
		}

		return StructuredSelection.EMPTY;
	}

	/**
	 * Sets the selection to the viewer.
	 * <p>
	 * The selection is supposed to be an {@link IStructuredSelection}.
	 * </p>
	 * <p>
	 * Does nothing if the selection is <code>null</code>.
	 * </p>
	 * 
	 * @param pSelection
	 *        the selection to set.
	 * @param pReveal
	 *        the reveal-flag. Set {@code true} to reveal the selection.
	 */
	@Override
	public void setSelection(ISelection pSelection, boolean pReveal) {
		if (pSelection != null) {
			ListControl control = getControl();
			if (control != null && !control.isDisposed()) {
				Assert.isTrue(pSelection instanceof IStructuredSelection);
				if (!pSelection.isEmpty()) {
					IStructuredSelection sel = (IStructuredSelection) pSelection;
					List<?> elements = sel.toList();
					Set<ListItem> newSelection = new HashSet<ListItem>();

					for (ListItem item : control.getItems()) {
						if (elements.contains(item.getData())) {
							newSelection.add(item);
						}
					}

					control.setSelectedItems(newSelection);
					control.redraw();
				}
			}
		}
	}

	@Override
	public void setSelection(ISelection pSelection) {
		setSelection(pSelection, true);
	}

	/**
	 * Sets the viewers comparator used for sorting. Will refresh the ListViewer.
	 * 
	 * @param pComparator
	 *        Comparator to set or <code>null</code> to set no comparator.
	 */
	public void setComperator(ViewerComparator pComparator) {
		if (fComparator != pComparator) {
			fComparator = pComparator;
			refresh();
		}
	}

	/**
	 * Returns the viewer comparator.
	 * 
	 * @return viewer comparator that was set before or <code>null</code> if none.
	 */
	public ViewerComparator getComperator() {
		return fComparator;
	}

	/**
	 * Refreshes the viewer and its widgets.
	 */
	protected void internalRefresh() {
		List<ListItem> items = getControl().getItems();
		int numItemsCurrent = items.size();
		int numItemsRequired = 0;

		Object[] elmts = null;
		if (getContentProvider() != null) {
			elmts = getContentProvider().getElements(getInput());
		}
		if (elmts != null) {
			numItemsRequired = elmts.length;
		}

		if (fComparator != null) {
			elmts = elmts.clone();
			fComparator.sort(this, elmts);
		}

		if (numItemsCurrent != numItemsRequired) {
			int toCreate = numItemsRequired - numItemsCurrent;
			for (int i = toCreate; i < 0; i++) {
				items.remove(0);
			}
			for (int i = 0; i < toCreate; i++) {
				new ListItem(getControl());
			}
		}

		if (numItemsRequired > 0) {
			items = getControl().getItems();
			LabelProvider labelProvider = getLabelProvider();
			Assert.isNotNull(labelProvider);

			for (int i = 0; i < numItemsRequired; i++) {
				ListItem item = getControl().getItems().get(i);
				Object elmt = elmts[i];

				updateListItem(item, elmt);
			}
		}

		getControl().redraw();
	}

	/**
	 * Updates a list item for the given element.
	 * 
	 * @param pItem
	 *        the item ot update.
	 * @param pElement
	 *        the element the item will be reflecting.
	 */
	protected void updateListItem(ListItem pItem, Object pElement) {
		pItem.setData(pElement);

		LabelProvider labelProvider = getLabelProvider();
		String text = labelProvider.getText(pElement);
		pItem.setText(text);
	}

}
