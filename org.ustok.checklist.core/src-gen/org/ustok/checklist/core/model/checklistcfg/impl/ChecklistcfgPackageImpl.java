/**
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 * 
 */
package org.ustok.checklist.core.model.checklistcfg.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.ustok.checklist.core.model.checklistcfg.CLCfg;
import org.ustok.checklist.core.model.checklistcfg.CLNode;
import org.ustok.checklist.core.model.checklistcfg.ChecklistcfgFactory;
import org.ustok.checklist.core.model.checklistcfg.ChecklistcfgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChecklistcfgPackageImpl extends EPackageImpl implements ChecklistcfgPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final String copyright = "Copyright 2013 by Ustok.org.\nAll rights reserved.\n";

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass clCfgEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass clNodeEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.ustok.checklist.core.model.checklistcfg.ChecklistcfgPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ChecklistcfgPackageImpl()
  {
    super(eNS_URI, ChecklistcfgFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link ChecklistcfgPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ChecklistcfgPackage init()
  {
    if (isInited) return (ChecklistcfgPackage)EPackage.Registry.INSTANCE.getEPackage(ChecklistcfgPackage.eNS_URI);

    // Obtain or create and register package
    ChecklistcfgPackageImpl theChecklistcfgPackage = (ChecklistcfgPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ChecklistcfgPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ChecklistcfgPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    EcorePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theChecklistcfgPackage.createPackageContents();

    // Initialize created meta-data
    theChecklistcfgPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theChecklistcfgPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ChecklistcfgPackage.eNS_URI, theChecklistcfgPackage);
    return theChecklistcfgPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCLCfg()
  {
    return clCfgEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCLCfg_Root()
  {
    return (EReference)clCfgEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCLNode()
  {
    return clNodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCLNode_Text()
  {
    return (EAttribute)clNodeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCLNode_Description()
  {
    return (EAttribute)clNodeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCLNode_Children()
  {
    return (EReference)clNodeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCLNode_Parent()
  {
    return (EReference)clNodeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCLNode_TargetIfPassed()
  {
    return (EReference)clNodeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCLNode_TragetIfFailed()
  {
    return (EReference)clNodeEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChecklistcfgFactory getChecklistcfgFactory()
  {
    return (ChecklistcfgFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    clCfgEClass = createEClass(CL_CFG);
    createEReference(clCfgEClass, CL_CFG__ROOT);

    clNodeEClass = createEClass(CL_NODE);
    createEAttribute(clNodeEClass, CL_NODE__TEXT);
    createEAttribute(clNodeEClass, CL_NODE__DESCRIPTION);
    createEReference(clNodeEClass, CL_NODE__CHILDREN);
    createEReference(clNodeEClass, CL_NODE__PARENT);
    createEReference(clNodeEClass, CL_NODE__TARGET_IF_PASSED);
    createEReference(clNodeEClass, CL_NODE__TRAGET_IF_FAILED);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes, features, and operations; add parameters
    initEClass(clCfgEClass, CLCfg.class, "CLCfg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCLCfg_Root(), this.getCLNode(), null, "root", null, 0, 1, CLCfg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(clNodeEClass, CLNode.class, "CLNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCLNode_Text(), theEcorePackage.getEString(), "text", null, 0, 1, CLNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCLNode_Description(), theEcorePackage.getEString(), "description", null, 0, 1, CLNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCLNode_Children(), this.getCLNode(), this.getCLNode_Parent(), "children", null, 0, -1, CLNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCLNode_Parent(), this.getCLNode(), this.getCLNode_Children(), "parent", null, 0, 1, CLNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCLNode_TargetIfPassed(), this.getCLNode(), null, "targetIfPassed", null, 0, 1, CLNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCLNode_TragetIfFailed(), this.getCLNode(), null, "tragetIfFailed", null, 0, 1, CLNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // http://www.eclipse.org/emf/2011/Xcore
    createXcoreAnnotations();
  }

  /**
   * Initializes the annotations for <b>http://www.eclipse.org/emf/2011/Xcore</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createXcoreAnnotations()
  {
    String source = "http://www.eclipse.org/emf/2011/Xcore";			
    addAnnotation
      (this, 
       source, 
       new String[] 
       {
       "GenModel", "http://www.eclipse.org/emf/2002/GenModel"
       });								
  }

} //ChecklistcfgPackageImpl
