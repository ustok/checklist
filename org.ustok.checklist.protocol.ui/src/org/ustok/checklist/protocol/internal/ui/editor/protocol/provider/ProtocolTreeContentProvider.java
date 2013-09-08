/******************************************************
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.checklist.protocol.internal.ui.editor.protocol.provider;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.ustok.checklist.core.model.protocol.Protocol;
import org.ustok.checklist.core.model.protocol.ProtocolNode;

/**
 * Protocol tree content provider.
 * 
 * @author Ingo Mohr
 * @created Sep 7, 2013
 */
public class ProtocolTreeContentProvider implements ITreeContentProvider {

	@Override
	public void dispose() {
	}

	@Override
	public void inputChanged(Viewer pViewer, Object pOldInput, Object pNewInput) {
	}

	@Override
	public Object[] getElements(Object pInputElement) {
		if (pInputElement instanceof Protocol) {
			Protocol protocol = (Protocol) pInputElement;
			return protocol.getNodes().toArray();
		}
		return null;
	}

	@Override
	public Object[] getChildren(Object pParentElement) {
		return ((ProtocolNode) pParentElement).getChildren().toArray();
	}

	@Override
	public Object getParent(Object pElement) {
		if (pElement instanceof ProtocolNode) {
			ProtocolNode node = (ProtocolNode) pElement;
			if (node.getParent() != null) {
				return node.getParent();
			}
		}
		return null;
	}

	@Override
	public boolean hasChildren(Object pElement) {
		if (pElement instanceof ProtocolNode) {
			return ((ProtocolNode) pElement).getChildren().size() > 0;
		}
		return false;
	}

}
