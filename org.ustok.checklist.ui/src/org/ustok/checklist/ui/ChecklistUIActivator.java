package org.ustok.checklist.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.ustok.checklist.core.ChecklistCoreActivator;
import org.ustok.checklist.internal.ui.edit.EditingDomainProvider;

/**
 * The activator class controls the plug-in life cycle
 */
public class ChecklistUIActivator extends AbstractUIPlugin {

	private static ChecklistUIActivator plugin;

	private EditingDomainProvider fEditingDomainProvider;

	/**
	 * The constructor
	 */
	public ChecklistUIActivator() {
	}

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;

		// hot fix:
		// Make sure EMF packages are registered (core plug-in has been started)
		// 
		ChecklistCoreActivator.getDefault();

		fEditingDomainProvider = new EditingDomainProvider();
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		fEditingDomainProvider = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static ChecklistUIActivator getDefault() {
		return plugin;
	}

	/**
	 * Returns the bundle ID.
	 * 
	 * @return bundle ID.
	 */
	public static String bundleID() {
		return ChecklistUIActivator.getDefault().getBundle().getSymbolicName();
	}

	/**
	 * Returns the editing domain provider to be used to edit the models.
	 * 
	 * @return editing domain provider. Never <code>null</code> while plug-in is running.
	 */
	public EditingDomainProvider getEditingDomainProvider() {
		return fEditingDomainProvider;
	}

}
