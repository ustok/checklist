/******************************************************
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.checklist.protocol.internal.ui.editor.protocol;

import org.eclipse.core.runtime.Assert;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;
import org.ustok.checklist.core.model.protocol.Protocol;
import org.ustok.checklist.protocol.internal.ui.editor.protocol.provider.ProtocolTreeContentProvider;
import org.ustok.checklist.protocol.internal.ui.editor.protocol.provider.ProtocolTreeLabelProvider;

/**
 * Outline page for {@link ProtocolEditor}.
 * 
 * @author Ingo Mohr
 * @created Sep 7, 2013
 */
public class ProtocolOutlinePage extends ContentOutlinePage {

	private final ProtocolEditor fEditor;

	private Protocol fModel;
	
	public ProtocolOutlinePage(ProtocolEditor pProtocolEditor) {
		Assert.isNotNull(pProtocolEditor, "Editor cannot be null.");
		fEditor = pProtocolEditor;
	}

	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);
		TreeViewer treeViewer = getTreeViewer();
		treeViewer.setContentProvider(new ProtocolTreeContentProvider());
		treeViewer.setLabelProvider(new ProtocolTreeLabelProvider());

		treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent pEvent) {
				ISelection selection = pEvent.getSelection();
				if (fEditor.getController() != null) {
					fEditor.getController().selectProtocolNode(selection);
				}
			}
		});

		updateUI();
	}

	public void setModel(Protocol pModel) {
		fModel = pModel;
	}

	public void updateUI() {
		TreeViewer treeViewer = getTreeViewer();
		if (treeViewer != null) {
			Protocol model = getModel();
			if (treeViewer.getInput() != model) {
				treeViewer.setInput(getModel());
			}
			treeViewer.refresh();
		}
	}

	public Protocol getModel() {
		return fModel;
	}

	public ProtocolEditor getEditor() {
		return fEditor;
	}

}
