/**
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 * 
 */
package org.ustok.checklist.core.model.protocol;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * Protocol
 * <!-- end-model-doc -->
 * @see org.ustok.checklist.core.model.protocol.ProtocolFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel copyrightFields='true' copyrightText='Copyright 2013 by Ustok.org.\nAll rights reserved.\n' basePackage='org.ustok.checklist.core.model'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore GenModel='http://www.eclipse.org/emf/2002/GenModel'"
 * @generated
 */
public interface ProtocolPackage extends EPackage
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
  String eNAME = "protocol";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "org.ustok.checklist.core.model.protocol";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "protocol";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ProtocolPackage eINSTANCE = org.ustok.checklist.core.model.protocol.impl.ProtocolPackageImpl.init();

  /**
   * The meta object id for the '{@link org.ustok.checklist.core.model.protocol.impl.ProtocolImpl <em>Protocol</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ustok.checklist.core.model.protocol.impl.ProtocolImpl
   * @see org.ustok.checklist.core.model.protocol.impl.ProtocolPackageImpl#getProtocol()
   * @generated
   */
  int PROTOCOL = 0;

  /**
   * The feature id for the '<em><b>Root</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__ROOT = 0;

  /**
   * The feature id for the '<em><b>Cfg Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__CFG_MODEL = 1;

  /**
   * The number of structural features of the '<em>Protocol</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Protocol</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.ustok.checklist.core.model.protocol.impl.ProtocolNodeImpl <em>Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ustok.checklist.core.model.protocol.impl.ProtocolNodeImpl
   * @see org.ustok.checklist.core.model.protocol.impl.ProtocolPackageImpl#getProtocolNode()
   * @generated
   */
  int PROTOCOL_NODE = 1;

  /**
   * The feature id for the '<em><b>Info</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_NODE__INFO = 0;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_NODE__STATE = 1;

  /**
   * The feature id for the '<em><b>Node</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_NODE__NODE = 2;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_NODE__CHILDREN = 3;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_NODE__PARENT = 4;

  /**
   * The number of structural features of the '<em>Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_NODE_FEATURE_COUNT = 5;

  /**
   * The number of operations of the '<em>Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_NODE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.ustok.checklist.core.model.protocol.State <em>State</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ustok.checklist.core.model.protocol.State
   * @see org.ustok.checklist.core.model.protocol.impl.ProtocolPackageImpl#getState()
   * @generated
   */
  int STATE = 2;


  /**
   * Returns the meta object for class '{@link org.ustok.checklist.core.model.protocol.Protocol <em>Protocol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Protocol</em>'.
   * @see org.ustok.checklist.core.model.protocol.Protocol
   * @generated
   */
  EClass getProtocol();

  /**
   * Returns the meta object for the containment reference '{@link org.ustok.checklist.core.model.protocol.Protocol#getRoot <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Root</em>'.
   * @see org.ustok.checklist.core.model.protocol.Protocol#getRoot()
   * @see #getProtocol()
   * @generated
   */
  EReference getProtocol_Root();

  /**
   * Returns the meta object for the containment reference '{@link org.ustok.checklist.core.model.protocol.Protocol#getCfgModel <em>Cfg Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cfg Model</em>'.
   * @see org.ustok.checklist.core.model.protocol.Protocol#getCfgModel()
   * @see #getProtocol()
   * @generated
   */
  EReference getProtocol_CfgModel();

  /**
   * Returns the meta object for class '{@link org.ustok.checklist.core.model.protocol.ProtocolNode <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node</em>'.
   * @see org.ustok.checklist.core.model.protocol.ProtocolNode
   * @generated
   */
  EClass getProtocolNode();

  /**
   * Returns the meta object for the attribute '{@link org.ustok.checklist.core.model.protocol.ProtocolNode#getInfo <em>Info</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Info</em>'.
   * @see org.ustok.checklist.core.model.protocol.ProtocolNode#getInfo()
   * @see #getProtocolNode()
   * @generated
   */
  EAttribute getProtocolNode_Info();

  /**
   * Returns the meta object for the attribute '{@link org.ustok.checklist.core.model.protocol.ProtocolNode#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>State</em>'.
   * @see org.ustok.checklist.core.model.protocol.ProtocolNode#getState()
   * @see #getProtocolNode()
   * @generated
   */
  EAttribute getProtocolNode_State();

  /**
   * Returns the meta object for the reference '{@link org.ustok.checklist.core.model.protocol.ProtocolNode#getNode <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Node</em>'.
   * @see org.ustok.checklist.core.model.protocol.ProtocolNode#getNode()
   * @see #getProtocolNode()
   * @generated
   */
  EReference getProtocolNode_Node();

  /**
   * Returns the meta object for the containment reference list '{@link org.ustok.checklist.core.model.protocol.ProtocolNode#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children</em>'.
   * @see org.ustok.checklist.core.model.protocol.ProtocolNode#getChildren()
   * @see #getProtocolNode()
   * @generated
   */
  EReference getProtocolNode_Children();

  /**
   * Returns the meta object for the container reference '{@link org.ustok.checklist.core.model.protocol.ProtocolNode#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see org.ustok.checklist.core.model.protocol.ProtocolNode#getParent()
   * @see #getProtocolNode()
   * @generated
   */
  EReference getProtocolNode_Parent();

  /**
   * Returns the meta object for enum '{@link org.ustok.checklist.core.model.protocol.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>State</em>'.
   * @see org.ustok.checklist.core.model.protocol.State
   * @generated
   */
  EEnum getState();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ProtocolFactory getProtocolFactory();

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
     * The meta object literal for the '{@link org.ustok.checklist.core.model.protocol.impl.ProtocolImpl <em>Protocol</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ustok.checklist.core.model.protocol.impl.ProtocolImpl
     * @see org.ustok.checklist.core.model.protocol.impl.ProtocolPackageImpl#getProtocol()
     * @generated
     */
    EClass PROTOCOL = eINSTANCE.getProtocol();

    /**
     * The meta object literal for the '<em><b>Root</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROTOCOL__ROOT = eINSTANCE.getProtocol_Root();

    /**
     * The meta object literal for the '<em><b>Cfg Model</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROTOCOL__CFG_MODEL = eINSTANCE.getProtocol_CfgModel();

    /**
     * The meta object literal for the '{@link org.ustok.checklist.core.model.protocol.impl.ProtocolNodeImpl <em>Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ustok.checklist.core.model.protocol.impl.ProtocolNodeImpl
     * @see org.ustok.checklist.core.model.protocol.impl.ProtocolPackageImpl#getProtocolNode()
     * @generated
     */
    EClass PROTOCOL_NODE = eINSTANCE.getProtocolNode();

    /**
     * The meta object literal for the '<em><b>Info</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROTOCOL_NODE__INFO = eINSTANCE.getProtocolNode_Info();

    /**
     * The meta object literal for the '<em><b>State</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROTOCOL_NODE__STATE = eINSTANCE.getProtocolNode_State();

    /**
     * The meta object literal for the '<em><b>Node</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROTOCOL_NODE__NODE = eINSTANCE.getProtocolNode_Node();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROTOCOL_NODE__CHILDREN = eINSTANCE.getProtocolNode_Children();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROTOCOL_NODE__PARENT = eINSTANCE.getProtocolNode_Parent();

    /**
     * The meta object literal for the '{@link org.ustok.checklist.core.model.protocol.State <em>State</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ustok.checklist.core.model.protocol.State
     * @see org.ustok.checklist.core.model.protocol.impl.ProtocolPackageImpl#getState()
     * @generated
     */
    EEnum STATE = eINSTANCE.getState();

  }

} //ProtocolPackage
