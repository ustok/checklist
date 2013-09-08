/**
 */
package org.ustok.checklist.cfg.checklist;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ustok.checklist.cfg.checklist.Step#getStepId <em>Step Id</em>}</li>
 *   <li>{@link org.ustok.checklist.cfg.checklist.Step#getType <em>Type</em>}</li>
 *   <li>{@link org.ustok.checklist.cfg.checklist.Step#getTitle <em>Title</em>}</li>
 *   <li>{@link org.ustok.checklist.cfg.checklist.Step#getDescription <em>Description</em>}</li>
 *   <li>{@link org.ustok.checklist.cfg.checklist.Step#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ustok.checklist.cfg.checklist.ChecklistPackage#getStep()
 * @model
 * @generated
 */
public interface Step extends EObject
{
  /**
   * Returns the value of the '<em><b>Step Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Step Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Step Id</em>' attribute.
   * @see #setStepId(String)
   * @see org.ustok.checklist.cfg.checklist.ChecklistPackage#getStep_StepId()
   * @model
   * @generated
   */
  String getStepId();

  /**
   * Sets the value of the '{@link org.ustok.checklist.cfg.checklist.Step#getStepId <em>Step Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Step Id</em>' attribute.
   * @see #getStepId()
   * @generated
   */
  void setStepId(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.ustok.checklist.cfg.checklist.StepType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.ustok.checklist.cfg.checklist.StepType
   * @see #setType(StepType)
   * @see org.ustok.checklist.cfg.checklist.ChecklistPackage#getStep_Type()
   * @model
   * @generated
   */
  StepType getType();

  /**
   * Sets the value of the '{@link org.ustok.checklist.cfg.checklist.Step#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.ustok.checklist.cfg.checklist.StepType
   * @see #getType()
   * @generated
   */
  void setType(StepType value);

  /**
   * Returns the value of the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Title</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' attribute.
   * @see #setTitle(String)
   * @see org.ustok.checklist.cfg.checklist.ChecklistPackage#getStep_Title()
   * @model
   * @generated
   */
  String getTitle();

  /**
   * Sets the value of the '{@link org.ustok.checklist.cfg.checklist.Step#getTitle <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' attribute.
   * @see #getTitle()
   * @generated
   */
  void setTitle(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see org.ustok.checklist.cfg.checklist.ChecklistPackage#getStep_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.ustok.checklist.cfg.checklist.Step#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Children</b></em>' containment reference list.
   * The list contents are of type {@link org.ustok.checklist.cfg.checklist.Step}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Children</em>' containment reference list.
   * @see org.ustok.checklist.cfg.checklist.ChecklistPackage#getStep_Children()
   * @model containment="true"
   * @generated
   */
  EList<Step> getChildren();

} // Step
