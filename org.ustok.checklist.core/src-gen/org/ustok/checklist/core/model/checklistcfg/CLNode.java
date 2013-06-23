/**
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 * 
 */
package org.ustok.checklist.core.model.checklistcfg;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CL Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A node in the cfg. Has a text and an optional description. The root node has no parent. Each node can have children. Optionally, each node can specify a special target node depending the result on the processing of the node in the checklist.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ustok.checklist.core.model.checklistcfg.CLNode#getText <em>Text</em>}</li>
 *   <li>{@link org.ustok.checklist.core.model.checklistcfg.CLNode#getDescription <em>Description</em>}</li>
 *   <li>{@link org.ustok.checklist.core.model.checklistcfg.CLNode#getChildren <em>Children</em>}</li>
 *   <li>{@link org.ustok.checklist.core.model.checklistcfg.CLNode#getParent <em>Parent</em>}</li>
 *   <li>{@link org.ustok.checklist.core.model.checklistcfg.CLNode#getTargetIfPassed <em>Target If Passed</em>}</li>
 *   <li>{@link org.ustok.checklist.core.model.checklistcfg.CLNode#getTragetIfFailed <em>Traget If Failed</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ustok.checklist.core.model.checklistcfg.ChecklistcfgPackage#getCLNode()
 * @model
 * @generated
 */
public interface CLNode extends EObject
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String copyright = "Copyright 2013 by Ustok.org.\nAll rights reserved.\n";

  /**
   * Returns the value of the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * The text to show in the checklist.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Text</em>' attribute.
   * @see #setText(String)
   * @see org.ustok.checklist.core.model.checklistcfg.ChecklistcfgPackage#getCLNode_Text()
   * @model unique="false"
   * @generated
   */
  String getText();

  /**
   * Sets the value of the '{@link org.ustok.checklist.core.model.checklistcfg.CLNode#getText <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' attribute.
   * @see #getText()
   * @generated
   */
  void setText(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * The description to show in the checklist.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see org.ustok.checklist.core.model.checklistcfg.ChecklistcfgPackage#getCLNode_Description()
   * @model unique="false"
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.ustok.checklist.core.model.checklistcfg.CLNode#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Children</b></em>' containment reference list.
   * The list contents are of type {@link org.ustok.checklist.core.model.checklistcfg.CLNode}.
   * It is bidirectional and its opposite is '{@link org.ustok.checklist.core.model.checklistcfg.CLNode#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * The children of the node.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Children</em>' containment reference list.
   * @see org.ustok.checklist.core.model.checklistcfg.ChecklistcfgPackage#getCLNode_Children()
   * @see org.ustok.checklist.core.model.checklistcfg.CLNode#getParent
   * @model opposite="parent" containment="true"
   * @generated
   */
  EList<CLNode> getChildren();

  /**
   * Returns the value of the '<em><b>Parent</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.ustok.checklist.core.model.checklistcfg.CLNode#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * The node parent. The root node has no parent.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Parent</em>' container reference.
   * @see #setParent(CLNode)
   * @see org.ustok.checklist.core.model.checklistcfg.ChecklistcfgPackage#getCLNode_Parent()
   * @see org.ustok.checklist.core.model.checklistcfg.CLNode#getChildren
   * @model opposite="children" transient="false"
   * @generated
   */
  CLNode getParent();

  /**
   * Sets the value of the '{@link org.ustok.checklist.core.model.checklistcfg.CLNode#getParent <em>Parent</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' container reference.
   * @see #getParent()
   * @generated
   */
  void setParent(CLNode value);

  /**
   * Returns the value of the '<em><b>Target If Passed</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * The special target to go to in the checklist when the node is 'passed'. Leave null if you want to step to the next node in line.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Target If Passed</em>' reference.
   * @see #setTargetIfPassed(CLNode)
   * @see org.ustok.checklist.core.model.checklistcfg.ChecklistcfgPackage#getCLNode_TargetIfPassed()
   * @model
   * @generated
   */
  CLNode getTargetIfPassed();

  /**
   * Sets the value of the '{@link org.ustok.checklist.core.model.checklistcfg.CLNode#getTargetIfPassed <em>Target If Passed</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target If Passed</em>' reference.
   * @see #getTargetIfPassed()
   * @generated
   */
  void setTargetIfPassed(CLNode value);

  /**
   * Returns the value of the '<em><b>Traget If Failed</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * The special target to go to in the checklist when the node is 'failed'. Leave null if you want to step to the next node in line.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Traget If Failed</em>' reference.
   * @see #setTragetIfFailed(CLNode)
   * @see org.ustok.checklist.core.model.checklistcfg.ChecklistcfgPackage#getCLNode_TragetIfFailed()
   * @model
   * @generated
   */
  CLNode getTragetIfFailed();

  /**
   * Sets the value of the '{@link org.ustok.checklist.core.model.checklistcfg.CLNode#getTragetIfFailed <em>Traget If Failed</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Traget If Failed</em>' reference.
   * @see #getTragetIfFailed()
   * @generated
   */
  void setTragetIfFailed(CLNode value);

} // CLNode
