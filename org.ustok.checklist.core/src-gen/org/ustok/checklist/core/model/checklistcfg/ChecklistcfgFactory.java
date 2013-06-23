/**
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 * 
 */
package org.ustok.checklist.core.model.checklistcfg;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.ustok.checklist.core.model.checklistcfg.ChecklistcfgPackage
 * @generated
 */
public interface ChecklistcfgFactory extends EFactory
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String copyright = "Copyright 2013 by Ustok.org.\nAll rights reserved.\n";

  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ChecklistcfgFactory eINSTANCE = org.ustok.checklist.core.model.checklistcfg.impl.ChecklistcfgFactoryImpl.init();

  /**
   * Returns a new object of class '<em>CL Cfg</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CL Cfg</em>'.
   * @generated
   */
  CLCfg createCLCfg();

  /**
   * Returns a new object of class '<em>CL Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CL Node</em>'.
   * @generated
   */
  CLNode createCLNode();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ChecklistcfgPackage getChecklistcfgPackage();

} //ChecklistcfgFactory
