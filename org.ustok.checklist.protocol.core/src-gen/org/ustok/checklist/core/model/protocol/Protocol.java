/**
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 * 
 */
package org.ustok.checklist.core.model.protocol;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.ustok.checklist.cfg.checklist.Model;

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
 *   <li>{@link org.ustok.checklist.core.model.protocol.Protocol#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.ustok.checklist.core.model.protocol.Protocol#getChecklistModel <em>Checklist Model</em>}</li>
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
   * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
   * The list contents are of type {@link org.ustok.checklist.core.model.protocol.ProtocolNode}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Protocol nodes
   * <!-- end-model-doc -->
   * @return the value of the '<em>Nodes</em>' containment reference list.
   * @see org.ustok.checklist.core.model.protocol.ProtocolPackage#getProtocol_Nodes()
   * @model containment="true"
   * @generated
   */
  EList<ProtocolNode> getNodes();

  /**
   * Returns the value of the '<em><b>Checklist Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Checklist model. Each protocol node refers to a step in the checklist model.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Checklist Model</em>' containment reference.
   * @see #setChecklistModel(Model)
   * @see org.ustok.checklist.core.model.protocol.ProtocolPackage#getProtocol_ChecklistModel()
   * @model containment="true"
   * @generated
   */
  Model getChecklistModel();

  /**
   * Sets the value of the '{@link org.ustok.checklist.core.model.protocol.Protocol#getChecklistModel <em>Checklist Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Checklist Model</em>' containment reference.
   * @see #getChecklistModel()
   * @generated
   */
  void setChecklistModel(Model value);

} // Protocol
