/*
* generated by Xtext
*/
package org.ustok.checklist.cfg;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ChecklistStandaloneSetup extends ChecklistStandaloneSetupGenerated{

	public static void doSetup() {
		new ChecklistStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
