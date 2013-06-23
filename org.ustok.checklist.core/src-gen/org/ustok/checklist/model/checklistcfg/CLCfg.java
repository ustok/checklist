/**
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 * 
 */
package org.ustok.checklist.model.checklistcfg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CL Cfg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Model object. Contains the root node.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ustok.checklist.model.checklistcfg.CLCfg#getRoot <em>Root</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ustok.checklist.model.checklistcfg.ChecklistcfgPackage#getCLCfg()
 * @model
 * @generated
 */
public interface CLCfg extends EObject
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String copyright = "Copyright 2013 by Ustok.org.\nAll rights reserved.\n";

  /**
   * Returns the value of the '<em><b>Root</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Root</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Root</em>' containment reference.
   * @see #setRoot(CLNode)
   * @see org.ustok.checklist.model.checklistcfg.ChecklistcfgPackage#getCLCfg_Root()
   * @model containment="true"
   * @generated
   */
  CLNode getRoot();

  /**
   * Sets the value of the '{@link org.ustok.checklist.model.checklistcfg.CLCfg#getRoot <em>Root</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Root</em>' containment reference.
   * @see #getRoot()
   * @generated
   */
  void setRoot(CLNode value);

} // CLCfg
