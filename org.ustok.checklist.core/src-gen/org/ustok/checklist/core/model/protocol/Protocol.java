/**
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 * 
 */
package org.ustok.checklist.core.model.protocol;

import org.eclipse.emf.ecore.EObject;

import org.ustok.checklist.core.model.checklistcfg.CLCfg;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protocol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Protocol
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ustok.checklist.core.model.protocol.Protocol#getRoot <em>Root</em>}</li>
 *   <li>{@link org.ustok.checklist.core.model.protocol.Protocol#getCfgModel <em>Cfg Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ustok.checklist.core.model.protocol.ProtocolPackage#getProtocol()
 * @model
 * @generated
 */
public interface Protocol extends EObject
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
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Protocol root
   * <!-- end-model-doc -->
   * @return the value of the '<em>Root</em>' containment reference.
   * @see #setRoot(ProtocolNode)
   * @see org.ustok.checklist.core.model.protocol.ProtocolPackage#getProtocol_Root()
   * @model containment="true"
   * @generated
   */
  ProtocolNode getRoot();

  /**
   * Sets the value of the '{@link org.ustok.checklist.core.model.protocol.Protocol#getRoot <em>Root</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Root</em>' containment reference.
   * @see #getRoot()
   * @generated
   */
  void setRoot(ProtocolNode value);

  /**
   * Returns the value of the '<em><b>Cfg Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Configuration model. The protocol root node refers to the root node of the cfg model
   * <!-- end-model-doc -->
   * @return the value of the '<em>Cfg Model</em>' containment reference.
   * @see #setCfgModel(CLCfg)
   * @see org.ustok.checklist.core.model.protocol.ProtocolPackage#getProtocol_CfgModel()
   * @model containment="true"
   * @generated
   */
  CLCfg getCfgModel();

  /**
   * Sets the value of the '{@link org.ustok.checklist.core.model.protocol.Protocol#getCfgModel <em>Cfg Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cfg Model</em>' containment reference.
   * @see #getCfgModel()
   * @generated
   */
  void setCfgModel(CLCfg value);

} // Protocol
