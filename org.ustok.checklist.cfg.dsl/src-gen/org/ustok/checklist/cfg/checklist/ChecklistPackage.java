/**
 */
package org.ustok.checklist.cfg.checklist;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.ustok.checklist.cfg.checklist.ChecklistFactory
 * @model kind="package"
 * @generated
 */
public interface ChecklistPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "checklist";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ustok.org/checklist/cfg/Checklist";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "checklist";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ChecklistPackage eINSTANCE = org.ustok.checklist.cfg.checklist.impl.ChecklistPackageImpl.init();

  /**
   * The meta object id for the '{@link org.ustok.checklist.cfg.checklist.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ustok.checklist.cfg.checklist.impl.ModelImpl
   * @see org.ustok.checklist.cfg.checklist.impl.ChecklistPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__TITLE = 0;

  /**
   * The feature id for the '<em><b>Steps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__STEPS = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.ustok.checklist.cfg.checklist.impl.TitleImpl <em>Title</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ustok.checklist.cfg.checklist.impl.TitleImpl
   * @see org.ustok.checklist.cfg.checklist.impl.ChecklistPackageImpl#getTitle()
   * @generated
   */
  int TITLE = 1;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TITLE__TITLE = 0;

  /**
   * The number of structural features of the '<em>Title</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TITLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.ustok.checklist.cfg.checklist.impl.StepImpl <em>Step</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ustok.checklist.cfg.checklist.impl.StepImpl
   * @see org.ustok.checklist.cfg.checklist.impl.ChecklistPackageImpl#getStep()
   * @generated
   */
  int STEP = 2;

  /**
   * The feature id for the '<em><b>Step Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP__STEP_ID = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP__TYPE = 1;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP__TITLE = 2;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP__DESCRIPTION = 3;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP__CHILDREN = 4;

  /**
   * The number of structural features of the '<em>Step</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.ustok.checklist.cfg.checklist.StepType <em>Step Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ustok.checklist.cfg.checklist.StepType
   * @see org.ustok.checklist.cfg.checklist.impl.ChecklistPackageImpl#getStepType()
   * @generated
   */
  int STEP_TYPE = 3;


  /**
   * Returns the meta object for class '{@link org.ustok.checklist.cfg.checklist.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.ustok.checklist.cfg.checklist.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference '{@link org.ustok.checklist.cfg.checklist.Model#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Title</em>'.
   * @see org.ustok.checklist.cfg.checklist.Model#getTitle()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Title();

  /**
   * Returns the meta object for the containment reference list '{@link org.ustok.checklist.cfg.checklist.Model#getSteps <em>Steps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Steps</em>'.
   * @see org.ustok.checklist.cfg.checklist.Model#getSteps()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Steps();

  /**
   * Returns the meta object for class '{@link org.ustok.checklist.cfg.checklist.Title <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Title</em>'.
   * @see org.ustok.checklist.cfg.checklist.Title
   * @generated
   */
  EClass getTitle();

  /**
   * Returns the meta object for the attribute '{@link org.ustok.checklist.cfg.checklist.Title#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see org.ustok.checklist.cfg.checklist.Title#getTitle()
   * @see #getTitle()
   * @generated
   */
  EAttribute getTitle_Title();

  /**
   * Returns the meta object for class '{@link org.ustok.checklist.cfg.checklist.Step <em>Step</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Step</em>'.
   * @see org.ustok.checklist.cfg.checklist.Step
   * @generated
   */
  EClass getStep();

  /**
   * Returns the meta object for the attribute '{@link org.ustok.checklist.cfg.checklist.Step#getStepId <em>Step Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Step Id</em>'.
   * @see org.ustok.checklist.cfg.checklist.Step#getStepId()
   * @see #getStep()
   * @generated
   */
  EAttribute getStep_StepId();

  /**
   * Returns the meta object for the attribute '{@link org.ustok.checklist.cfg.checklist.Step#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.ustok.checklist.cfg.checklist.Step#getType()
   * @see #getStep()
   * @generated
   */
  EAttribute getStep_Type();

  /**
   * Returns the meta object for the attribute '{@link org.ustok.checklist.cfg.checklist.Step#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see org.ustok.checklist.cfg.checklist.Step#getTitle()
   * @see #getStep()
   * @generated
   */
  EAttribute getStep_Title();

  /**
   * Returns the meta object for the attribute '{@link org.ustok.checklist.cfg.checklist.Step#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.ustok.checklist.cfg.checklist.Step#getDescription()
   * @see #getStep()
   * @generated
   */
  EAttribute getStep_Description();

  /**
   * Returns the meta object for the containment reference list '{@link org.ustok.checklist.cfg.checklist.Step#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children</em>'.
   * @see org.ustok.checklist.cfg.checklist.Step#getChildren()
   * @see #getStep()
   * @generated
   */
  EReference getStep_Children();

  /**
   * Returns the meta object for enum '{@link org.ustok.checklist.cfg.checklist.StepType <em>Step Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Step Type</em>'.
   * @see org.ustok.checklist.cfg.checklist.StepType
   * @generated
   */
  EEnum getStepType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ChecklistFactory getChecklistFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.ustok.checklist.cfg.checklist.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ustok.checklist.cfg.checklist.impl.ModelImpl
     * @see org.ustok.checklist.cfg.checklist.impl.ChecklistPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__TITLE = eINSTANCE.getModel_Title();

    /**
     * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__STEPS = eINSTANCE.getModel_Steps();

    /**
     * The meta object literal for the '{@link org.ustok.checklist.cfg.checklist.impl.TitleImpl <em>Title</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ustok.checklist.cfg.checklist.impl.TitleImpl
     * @see org.ustok.checklist.cfg.checklist.impl.ChecklistPackageImpl#getTitle()
     * @generated
     */
    EClass TITLE = eINSTANCE.getTitle();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TITLE__TITLE = eINSTANCE.getTitle_Title();

    /**
     * The meta object literal for the '{@link org.ustok.checklist.cfg.checklist.impl.StepImpl <em>Step</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ustok.checklist.cfg.checklist.impl.StepImpl
     * @see org.ustok.checklist.cfg.checklist.impl.ChecklistPackageImpl#getStep()
     * @generated
     */
    EClass STEP = eINSTANCE.getStep();

    /**
     * The meta object literal for the '<em><b>Step Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STEP__STEP_ID = eINSTANCE.getStep_StepId();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STEP__TYPE = eINSTANCE.getStep_Type();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STEP__TITLE = eINSTANCE.getStep_Title();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STEP__DESCRIPTION = eINSTANCE.getStep_Description();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STEP__CHILDREN = eINSTANCE.getStep_Children();

    /**
     * The meta object literal for the '{@link org.ustok.checklist.cfg.checklist.StepType <em>Step Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ustok.checklist.cfg.checklist.StepType
     * @see org.ustok.checklist.cfg.checklist.impl.ChecklistPackageImpl#getStepType()
     * @generated
     */
    EEnum STEP_TYPE = eINSTANCE.getStepType();

  }

} //ChecklistPackage
