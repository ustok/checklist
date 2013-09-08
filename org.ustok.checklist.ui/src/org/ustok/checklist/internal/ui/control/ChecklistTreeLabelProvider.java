/******************************************************
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.checklist.internal.ui.control;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.ustok.checklist.core.model.checklistcfg.CLCfg;
import org.ustok.checklist.core.model.checklistcfg.CLNode;
import org.ustok.checklist.protocol.internal.ui.util.StringUtil;

/**
 * Label provider for {@link CLCfg} models.
 * 
 * @author Ingo Mohr
 * @created Mar 4, 2013
 */
public class ChecklistTreeLabelProvider extends LabelProvider {

	@Override
	public Image getImage(Object pElement) {
		return super.getImage(pElement);
	}

	@Override
	public String getText(Object pElement) {
		return StringUtil.createNonNull(((CLNode) pElement).getText());
	}

}
