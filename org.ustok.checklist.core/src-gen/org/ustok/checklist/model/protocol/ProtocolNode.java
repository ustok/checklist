/**
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 * 
 */
package org.ustok.checklist.model.protocol;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.ustok.checklist.model.checklistcfg.CLNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Protocol node
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ustok.checklist.model.protocol.ProtocolNode#getInfo <em>Info</em>}</li>
 *   <li>{@link org.ustok.checklist.model.protocol.ProtocolNode#getState <em>State</em>}</li>
 *   <li>{@link org.ustok.checklist.model.protocol.ProtocolNode#getNode <em>Node</em>}</li>
 *   <li>{@link org.ustok.checklist.model.protocol.ProtocolNode#getChildren <em>Children</em>}</li>
 *   <li>{@link org.ustok.checklist.model.protocol.ProtocolNode#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ustok.checklist.model.protocol.ProtocolPackage#getProtocolNode()
 * @model
 * @generated
 */
public interface ProtocolNode extends EObject
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String copyright = "Copyright 2013 by Ustok.org.\nAll rights reserved.\n";

  /**
   * Returns the value of the '<em><b>Info</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * The information text added by the user.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Info</em>' attribute.
   * @see #setInfo(String)
   * @see org.ustok.checklist.model.protocol.ProtocolPackage#getProtocolNode_Info()
   * @model unique="false"
   * @generated
   */
  String getInfo();

  /**
   * Sets the value of the '{@link org.ustok.checklist.model.protocol.ProtocolNode#getInfo <em>Info</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Info</em>' attribute.
   * @see #getInfo()
   * @generated
   */
  void setInfo(String value);

  /**
   * Returns the value of the '<em><b>State</b></em>' attribute.
   * The literals are from the enumeration {@link org.ustok.checklist.model.protocol.State}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Status for this node.
   * <!-- end-model-doc -->
   * @return the value of the '<em>State</em>' attribute.
   * @see org.ustok.checklist.model.protocol.State
   * @see #setState(State)
   * @see org.ustok.checklist.model.protocol.ProtocolPackage#getProtocolNode_State()
   * @model unique="false"
   * @generated
   */
  State getState();

  /**
   * Sets the value of the '{@link org.ustok.checklist.model.protocol.ProtocolNode#getState <em>State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State</em>' attribute.
   * @see org.ustok.checklist.model.protocol.State
   * @see #getState()
   * @generated
   */
  void setState(State value);

  /**
   * Returns the value of the '<em><b>Node</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * The checklist configuration node which the protocol node refers to.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Node</em>' reference.
   * @see #setNode(CLNode)
   * @see org.ustok.checklist.model.protocol.ProtocolPackage#getProtocolNode_Node()
   * @model
   * @generated
   */
  CLNode getNode();

  /**
   * Sets the value of the '{@link org.ustok.checklist.model.protocol.ProtocolNode#getNode <em>Node</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Node</em>' reference.
   * @see #getNode()
   * @generated
   */
  void setNode(CLNode value);

  /**
   * Returns the value of the '<em><b>Children</b></em>' containment reference list.
   * The list contents are of type {@link org.ustok.checklist.model.protocol.ProtocolNode}.
   * It is bidirectional and its opposite is '{@link org.ustok.checklist.model.protocol.ProtocolNode#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * The children of the node.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Children</em>' containment reference list.
   * @see org.ustok.checklist.model.protocol.ProtocolPackage#getProtocolNode_Children()
   * @see org.ustok.checklist.model.protocol.ProtocolNode#getParent
   * @model opposite="parent" containment="true"
   * @generated
   */
  EList<ProtocolNode> getChildren();

  /**
   * Returns the value of the '<em><b>Parent</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.ustok.checklist.model.protocol.ProtocolNode#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * The node parent. The root node has no parent.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Parent</em>' container reference.
   * @see #setParent(ProtocolNode)
   * @see org.ustok.checklist.model.protocol.ProtocolPackage#getProtocolNode_Parent()
   * @see org.ustok.checklist.model.protocol.ProtocolNode#getChildren
   * @model opposite="children" transient="false"
   * @generated
   */
  ProtocolNode getParent();

  /**
   * Sets the value of the '{@link org.ustok.checklist.model.protocol.ProtocolNode#getParent <em>Parent</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' container reference.
   * @see #getParent()
   * @generated
   */
  void setParent(ProtocolNode value);

} // ProtocolNode
