/******************************************************
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.checklist.protocol.internal.ui.control.list;

/**
 * A selection listener to track selection changes in a {@link ListControl}.
 * 
 * @author Ingo Mohr
 * @created Mar 6, 2013
 */
public interface IListControlSelectionListener {

	/**
	 * Invoked when the selection in the given source has changed.
	 * 
	 * @param pSource
	 *        the source control which has an updated selection.
	 */
	public void selectionChanged(ListControl pSource);

}
