/**
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 * 
 */
package org.ustok.checklist.core.model.checklistcfg;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Model object. Contains the root node.
 * <!-- end-model-doc -->
 * @see org.ustok.checklist.core.model.checklistcfg.ChecklistcfgFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel copyrightFields='true' copyrightText='Copyright 2013 by Ustok.org.\nAll rights reserved.\n' basePackage='org.ustok.checklist.core.model'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore GenModel='http://www.eclipse.org/emf/2002/GenModel'"
 * @generated
 */
public interface ChecklistcfgPackage extends EPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String copyright = "Copyright 2013 by Ustok.org.\nAll rights reserved.\n";

  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "checklistcfg";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "org.ustok.checklist.core.model.checklistcfg";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "checklistcfg";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ChecklistcfgPackage eINSTANCE = org.ustok.checklist.core.model.checklistcfg.impl.ChecklistcfgPackageImpl.init();

  /**
   * The meta object id for the '{@link org.ustok.checklist.core.model.checklistcfg.impl.CLCfgImpl <em>CL Cfg</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ustok.checklist.core.model.checklistcfg.impl.CLCfgImpl
   * @see org.ustok.checklist.core.model.checklistcfg.impl.ChecklistcfgPackageImpl#getCLCfg()
   * @generated
   */
  int CL_CFG = 0;

  /**
   * The feature id for the '<em><b>Root</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CL_CFG__ROOT = 0;

  /**
   * The number of structural features of the '<em>CL Cfg</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CL_CFG_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>CL Cfg</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CL_CFG_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.ustok.checklist.core.model.checklistcfg.impl.CLNodeImpl <em>CL Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ustok.checklist.core.model.checklistcfg.impl.CLNodeImpl
   * @see org.ustok.checklist.core.model.checklistcfg.impl.ChecklistcfgPackageImpl#getCLNode()
   * @generated
   */
  int CL_NODE = 1;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CL_NODE__TEXT = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CL_NODE__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CL_NODE__CHILDREN = 2;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CL_NODE__PARENT = 3;

  /**
   * The feature id for the '<em><b>Target If Passed</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CL_NODE__TARGET_IF_PASSED = 4;

  /**
   * The feature id for the '<em><b>Traget If Failed</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CL_NODE__TRAGET_IF_FAILED = 5;

  /**
   * The number of structural features of the '<em>CL Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CL_NODE_FEATURE_COUNT = 6;

  /**
   * The number of operations of the '<em>CL Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CL_NODE_OPERATION_COUNT = 0;


  /**
   * Returns the meta object for class '{@link org.ustok.checklist.core.model.checklistcfg.CLCfg <em>CL Cfg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CL Cfg</em>'.
   * @see org.ustok.checklist.core.model.checklistcfg.CLCfg
   * @generated
   */
  EClass getCLCfg();

  /**
   * Returns the meta object for the containment reference '{@link org.ustok.checklist.core.model.checklistcfg.CLCfg#getRoot <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Root</em>'.
   * @see org.ustok.checklist.core.model.checklistcfg.CLCfg#getRoot()
   * @see #getCLCfg()
   * @generated
   */
  EReference getCLCfg_Root();

  /**
   * Returns the meta object for class '{@link org.ustok.checklist.core.model.checklistcfg.CLNode <em>CL Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CL Node</em>'.
   * @see org.ustok.checklist.core.model.checklistcfg.CLNode
   * @generated
   */
  EClass getCLNode();

  /**
   * Returns the meta object for the attribute '{@link org.ustok.checklist.core.model.checklistcfg.CLNode#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.ustok.checklist.core.model.checklistcfg.CLNode#getText()
   * @see #getCLNode()
   * @generated
   */
  EAttribute getCLNode_Text();

  /**
   * Returns the meta object for the attribute '{@link org.ustok.checklist.core.model.checklistcfg.CLNode#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.ustok.checklist.core.model.checklistcfg.CLNode#getDescription()
   * @see #getCLNode()
   * @generated
   */
  EAttribute getCLNode_Description();

  /**
   * Returns the meta object for the containment reference list '{@link org.ustok.checklist.core.model.checklistcfg.CLNode#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children</em>'.
   * @see org.ustok.checklist.core.model.checklistcfg.CLNode#getChildren()
   * @see #getCLNode()
   * @generated
   */
  EReference getCLNode_Children();

  /**
   * Returns the meta object for the container reference '{@link org.ustok.checklist.core.model.checklistcfg.CLNode#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see org.ustok.checklist.core.model.checklistcfg.CLNode#getParent()
   * @see #getCLNode()
   * @generated
   */
  EReference getCLNode_Parent();

  /**
   * Returns the meta object for the reference '{@link org.ustok.checklist.core.model.checklistcfg.CLNode#getTargetIfPassed <em>Target If Passed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target If Passed</em>'.
   * @see org.ustok.checklist.core.model.checklistcfg.CLNode#getTargetIfPassed()
   * @see #getCLNode()
   * @generated
   */
  EReference getCLNode_TargetIfPassed();

  /**
   * Returns the meta object for the reference '{@link org.ustok.checklist.core.model.checklistcfg.CLNode#getTragetIfFailed <em>Traget If Failed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Traget If Failed</em>'.
   * @see org.ustok.checklist.core.model.checklistcfg.CLNode#getTragetIfFailed()
   * @see #getCLNode()
   * @generated
   */
  EReference getCLNode_TragetIfFailed();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ChecklistcfgFactory getChecklistcfgFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each operation of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.ustok.checklist.core.model.checklistcfg.impl.CLCfgImpl <em>CL Cfg</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ustok.checklist.core.model.checklistcfg.impl.CLCfgImpl
     * @see org.ustok.checklist.core.model.checklistcfg.impl.ChecklistcfgPackageImpl#getCLCfg()
     * @generated
     */
    EClass CL_CFG = eINSTANCE.getCLCfg();

    /**
     * The meta object literal for the '<em><b>Root</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CL_CFG__ROOT = eINSTANCE.getCLCfg_Root();

    /**
     * The meta object literal for the '{@link org.ustok.checklist.core.model.checklistcfg.impl.CLNodeImpl <em>CL Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ustok.checklist.core.model.checklistcfg.impl.CLNodeImpl
     * @see org.ustok.checklist.core.model.checklistcfg.impl.ChecklistcfgPackageImpl#getCLNode()
     * @generated
     */
    EClass CL_NODE = eINSTANCE.getCLNode();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CL_NODE__TEXT = eINSTANCE.getCLNode_Text();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CL_NODE__DESCRIPTION = eINSTANCE.getCLNode_Description();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CL_NODE__CHILDREN = eINSTANCE.getCLNode_Children();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CL_NODE__PARENT = eINSTANCE.getCLNode_Parent();

    /**
     * The meta object literal for the '<em><b>Target If Passed</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CL_NODE__TARGET_IF_PASSED = eINSTANCE.getCLNode_TargetIfPassed();

    /**
     * The meta object literal for the '<em><b>Traget If Failed</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CL_NODE__TRAGET_IF_FAILED = eINSTANCE.getCLNode_TragetIfFailed();

  }

} //ChecklistcfgPackage
