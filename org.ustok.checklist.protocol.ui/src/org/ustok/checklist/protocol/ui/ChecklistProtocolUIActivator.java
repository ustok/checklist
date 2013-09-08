package org.ustok.checklist.protocol.ui;

import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.ustok.checklist.protocol.internal.ui.ImageConstants;

/**
 * The activator class controls the plug-in life cycle
 */
public class ChecklistProtocolUIActivator extends AbstractUIPlugin {

	// The shared instance
	private static ChecklistProtocolUIActivator plugin;

	public ChecklistProtocolUIActivator() {
	}

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static ChecklistProtocolUIActivator getDefault() {
		return plugin;
	}

	public static String bundleID() {
		return getDefault().getBundle().getSymbolicName();
	}

	@Override
	protected void initializeImageRegistry(ImageRegistry pReg) {
		super.initializeImageRegistry(pReg);

		internalRegister(pReg, ImageConstants.PROTOCOL_NODE_ERROR);
		internalRegister(pReg, ImageConstants.PROTOCOL_NODE_NONE);
		internalRegister(pReg, ImageConstants.PROTOCOL_NODE_OK);
	}

	private void internalRegister(ImageRegistry pReg, String pPath) {
		pReg.put(pPath, imageDescriptorFromPlugin(bundleID(), pPath));
	}

}
