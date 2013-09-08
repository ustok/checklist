/******************************************************
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.checklist.protocol.internal.ui.editor.protocol.provider;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.ustok.checklist.core.model.protocol.ProtocolNode;
import org.ustok.checklist.protocol.internal.ui.ImageConstants;
import org.ustok.checklist.protocol.internal.ui.util.ImageProvider;
import org.ustok.checklist.protocol.internal.ui.util.StringUtil;

/**
 * Protocol tree label provider.
 * 
 * @author Ingo Mohr
 * @created Sep 7, 2013
 */
public class ProtocolTreeLabelProvider extends LabelProvider {

	@Override
	public Image getImage(Object pElement) {
		if (pElement instanceof ProtocolNode) {
			ProtocolNode node = (ProtocolNode) pElement;
			switch (node.getStatus()) {
			case OK:
				return ImageProvider.getImage(ImageConstants.PROTOCOL_NODE_OK);
			case SKIPPED:
				return ImageProvider.getImage(ImageConstants.PROTOCOL_NODE_NONE);
			case FAILED:
				return ImageProvider.getImage(ImageConstants.PROTOCOL_NODE_ERROR);
			default:
				break;
			}
		}
		return super.getImage(pElement);
	}

	@Override
	public String getText(Object pElement) {
		if (pElement instanceof ProtocolNode) {
			ProtocolNode node = (ProtocolNode) pElement;
			String title = null;
			if (node.getStep() != null && node.getStep().getTitle() != null) {
				title = node.getStep().getTitle();
			}

			return StringUtil.createNonNull(title);
		}
		return super.getText(pElement);
	}

}
