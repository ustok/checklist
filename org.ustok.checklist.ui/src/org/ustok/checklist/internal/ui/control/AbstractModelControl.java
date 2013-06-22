/******************************************************
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 ******************************************************/

package org.ustok.checklist.internal.ui.control;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.swt.widgets.Composite;

/**
 * Base implementation of a EMF based model control.
 * 
 * @param <T>
 *        the model type.
 * 
 * @author Ingo Mohr
 * @created Feb 9, 2013
 */
public abstract class AbstractModelControl<T extends EObject> extends Composite {

	private T fModel;

	private final Adapter fAdapter;

	public AbstractModelControl(Composite pParent, int pStyle) {
		super(pParent, pStyle);
		fAdapter = createAdapter();
		create();
	}

	/**
	 * Returns the model.
	 * 
	 * @return model. <code>null</code> if not set.
	 */
	public T getModel() {
		return fModel;
	}

	/**
	 * Sets the model and invokes a refresh.
	 * <p>
	 * Does nothing if the model is already set.
	 * </p>
	 * 
	 * @param pModel
	 *        the model to set.
	 */
	public void setModel(T pModel) {
		T oldModel = getModel();
		if (oldModel != pModel) {
			if (oldModel != null) {
				oldModel.eAdapters().remove(fAdapter);
			}
			fModel = pModel;
			if (fModel != null) {
				fModel.eAdapters().add(fAdapter);
			}
			onModelInstalled();
			refresh();
		}
	}

	/**
	 * Invoked in setModel if a new model has been set and before invoking the refreshing.
	 * <p>
	 * The default implementation does nothing. Subclasses can override.
	 * </p>
	 */
	protected void onModelInstalled() {
		// do nothing
	}

	/**
	 * Refreshes the control with its model.
	 * <p>
	 * Clients can invoke the method to explicitly refresh the control. However, they usually don't need to since the control is
	 * automatically refreshing itself when the model gets modified.
	 * </p>
	 * <p>
	 * Subclasses implement this method accordingly to show the {@link #getModel()}.
	 * </p>
	 */
	public abstract void refresh();

	/**
	 * Automatically invoked to create the control widgets at construction time.
	 * <p>
	 * The parent control is <code>this</code>.
	 * </p>
	 */
	protected abstract void create();

	private Adapter createAdapter() {
		return new EContentAdapter() {

			@Override
			public void notifyChanged(Notification pNotification) {
				super.notifyChanged(pNotification);
				if (pNotification.getEventType() != Notification.REMOVING_ADAPTER) {
					refresh();
				}
			}
		};

	}

}
