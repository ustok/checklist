/******************************************************
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.checklist.internal.ui.util.controls.list;

import org.eclipse.core.runtime.Assert;
import org.ustok.checklist.internal.ui.util.controls.RenderedComponent;

/**
 * ListItems are drawn onto a {@link ListControl}.
 * 
 * @author Ingo Mohr
 * @created Mar 6, 2013
 */
public class ListItem extends RenderedComponent {

	private final ListControl fControl;

	/**
	 * Creates a new ListItem and adds it to the items of the given control.
	 * 
	 * @param pControl
	 *        the control to create the item for. Cannot be <code>null</code>.
	 */
	public ListItem(ListControl pControl) {
		Assert.isNotNull(pControl);
		fControl = pControl;
		fControl.getItems().add(this);
	}

	/**
	 * Returns the control for which the item has been created.
	 * 
	 * @return control. Never <code>null</code>.
	 */
	public ListControl getControl() {
		return fControl;
	}

}
