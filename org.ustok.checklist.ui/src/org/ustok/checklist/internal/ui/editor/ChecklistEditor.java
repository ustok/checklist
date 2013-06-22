/******************************************************
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.checklist.internal.ui.editor;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.ustok.checklist.core.io.EmfFileIoFactory;
import org.ustok.checklist.internal.ui.DefaultModelFactory;
import org.ustok.checklist.internal.ui.control.ChecklistControl;
import org.ustok.checklist.model.checklistcfg.CLCfg;
import org.ustok.checklist.ui.ChecklistUIActivator;

/**
 * Checklist editor.
 * 
 * @author Ingo Mohr
 * @created Feb 13, 2013
 */
public class ChecklistEditor extends AbstractFileEditor implements IEditingDomainProvider {

	private CLCfg fModel;

	private boolean fDirty;

	private ScrolledComposite fControl;

	private ChecklistControl fControlChecklist;

	private final Adapter fAdapter;

	public ChecklistEditor() {
		fAdapter = new EContentAdapter() {

			@Override
			public void notifyChanged(Notification pNotification) {
				super.notifyChanged(pNotification);
				if (pNotification.getEventType() != Notification.REMOVING_ADAPTER) {
					setDirty();
				}
			}
		};
	}

	@Override
	public void doSave(IProgressMonitor pMonitor) {
		IFileEditorInput input = (IFileEditorInput) getEditorInput();
		try {
			EmfFileIoFactory.INSTANCE.createWriter().write(getModel(), input.getFile());
			clearDirty();
		} catch (Exception ex) {
			String msg = "Error saving protocol.";
			IStatus status = new Status(IStatus.ERROR, ChecklistUIActivator.bundleID(), ex.getMessage(), ex);
			ChecklistUIActivator.getDefault().getLog().log(status);
			ErrorDialog.openError(null, "Save", msg, status);
		}
	}

	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}

	@Override
	public void doSaveAs() {
		// not supported
	}

	@Override
	public void init(IEditorSite pSite, IEditorInput pInput) throws PartInitException {
		setSite(pSite);
		setInput(pInput);

		IFileEditorInput input = (IFileEditorInput) pInput;
		sourceChanged(input);
	}

	@Override
	public boolean isDirty() {
		return fDirty;
	}

	@Override
	public void createPartControl(Composite pParent) {
		ScrolledComposite sc = new ScrolledComposite(pParent, SWT.V_SCROLL | SWT.H_SCROLL);
		sc.setExpandHorizontal(true);
		sc.setExpandVertical(true);
		sc.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());

		ChecklistControl control = new ChecklistControl(sc, SWT.NONE);
		sc.setContent(control);
		sc.setMinSize(control.computeSize(SWT.DEFAULT, SWT.DEFAULT));
		sc.layout();

		fControl = sc;
		fControlChecklist = control;

		updateUI();
	}

	private void updateUI() {
		fControlChecklist.setModel(getModel());
	}

	@Override
	public void setFocus() {
		getControl().setFocus();
	}

	/**
	 * Returns the model.
	 * <p>
	 * The model is loaded from the file.
	 * </p>
	 * 
	 * @return model. <code>null</code> if there's none.
	 */
	public CLCfg getModel() {
		return fModel;
	}

	private void setModel(CLCfg pModel) {
		CLCfg oldModel = getModel();
		if (oldModel != pModel) {
			if (oldModel != null) {
				oldModel.eAdapters().remove(fAdapter);
			}
			fModel = pModel;
			if (fModel != null) {
				fModel.eAdapters().add(fAdapter);
			}
		}
	}

	private Composite getControl() {
		return fControl;
	}

	private void clearDirty() {
		if (isDirty()) {
			fDirty = false;
			firePropertyChange(PROP_DIRTY);
		}
	}

	private void setDirty() {
		if (!isDirty()) {
			fDirty = true;
			firePropertyChange(PROP_DIRTY);
		}
	}

	@Override
	public void sourceChanged(IFileEditorInput pFileEditorInput) {
		setInput(pFileEditorInput);

		CLCfg newModel = null;
		IFile file = null;
		if (pFileEditorInput != null) {
			file = pFileEditorInput.getFile();
		}

		if (file != null) {
			try {
				if (file.getContents().available() <= 0) {
					DefaultModelFactory factory = new DefaultModelFactory();
					newModel = factory.createCfg();
				} else {
					newModel = (CLCfg) EmfFileIoFactory.INSTANCE.createReader().read(file);
				}
			} catch (Exception ex) {
				String msg = "Error opening checklist.";
				IStatus status = new Status(IStatus.ERROR, ChecklistUIActivator.bundleID(), ex.getMessage(), ex);
				ChecklistUIActivator.getDefault().getLog().log(status);
				ErrorDialog.openError(null, "Open", msg, status);
			}

		}

		String partName = "?";
		if (file != null) {
			partName = file.getName();
		}
		setPartName(partName);

		setModel(newModel);
	}

	@Override
	public EditingDomain getEditingDomain() {
		return ChecklistUIActivator.getDefault().getEditingDomainProvider().getEditingDomain();
	}

}
