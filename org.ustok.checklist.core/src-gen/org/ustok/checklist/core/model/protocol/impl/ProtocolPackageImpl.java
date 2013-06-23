/**
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 * 
 */
package org.ustok.checklist.core.model.protocol.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.ustok.checklist.core.model.checklistcfg.ChecklistcfgPackage;

import org.ustok.checklist.core.model.protocol.Protocol;
import org.ustok.checklist.core.model.protocol.ProtocolFactory;
import org.ustok.checklist.core.model.protocol.ProtocolNode;
import org.ustok.checklist.core.model.protocol.ProtocolPackage;
import org.ustok.checklist.core.model.protocol.State;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProtocolPackageImpl extends EPackageImpl implements ProtocolPackage
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
  private EClass protocolEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass protocolNodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum stateEEnum = null;

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
   * @see org.ustok.checklist.core.model.protocol.ProtocolPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ProtocolPackageImpl()
  {
    super(eNS_URI, ProtocolFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link ProtocolPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ProtocolPackage init()
  {
    if (isInited) return (ProtocolPackage)EPackage.Registry.INSTANCE.getEPackage(ProtocolPackage.eNS_URI);

    // Obtain or create and register package
    ProtocolPackageImpl theProtocolPackage = (ProtocolPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ProtocolPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ProtocolPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    ChecklistcfgPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theProtocolPackage.createPackageContents();

    // Initialize created meta-data
    theProtocolPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theProtocolPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ProtocolPackage.eNS_URI, theProtocolPackage);
    return theProtocolPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProtocol()
  {
    return protocolEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProtocol_Root()
  {
    return (EReference)protocolEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProtocol_CfgModel()
  {
    return (EReference)protocolEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProtocolNode()
  {
    return protocolNodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProtocolNode_Info()
  {
    return (EAttribute)protocolNodeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProtocolNode_State()
  {
    return (EAttribute)protocolNodeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProtocolNode_Node()
  {
    return (EReference)protocolNodeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProtocolNode_Children()
  {
    return (EReference)protocolNodeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProtocolNode_Parent()
  {
    return (EReference)protocolNodeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getState()
  {
    return stateEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProtocolFactory getProtocolFactory()
  {
    return (ProtocolFactory)getEFactoryInstance();
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
    protocolEClass = createEClass(PROTOCOL);
    createEReference(protocolEClass, PROTOCOL__ROOT);
    createEReference(protocolEClass, PROTOCOL__CFG_MODEL);

    protocolNodeEClass = createEClass(PROTOCOL_NODE);
    createEAttribute(protocolNodeEClass, PROTOCOL_NODE__INFO);
    createEAttribute(protocolNodeEClass, PROTOCOL_NODE__STATE);
    createEReference(protocolNodeEClass, PROTOCOL_NODE__NODE);
    createEReference(protocolNodeEClass, PROTOCOL_NODE__CHILDREN);
    createEReference(protocolNodeEClass, PROTOCOL_NODE__PARENT);

    // Create enums
    stateEEnum = createEEnum(STATE);
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
    ChecklistcfgPackage theChecklistcfgPackage = (ChecklistcfgPackage)EPackage.Registry.INSTANCE.getEPackage(ChecklistcfgPackage.eNS_URI);
    EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes, features, and operations; add parameters
    initEClass(protocolEClass, Protocol.class, "Protocol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProtocol_Root(), this.getProtocolNode(), null, "root", null, 0, 1, Protocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProtocol_CfgModel(), theChecklistcfgPackage.getCLCfg(), null, "cfgModel", null, 0, 1, Protocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(protocolNodeEClass, ProtocolNode.class, "ProtocolNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProtocolNode_Info(), theEcorePackage.getEString(), "info", null, 0, 1, ProtocolNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProtocolNode_State(), this.getState(), "state", null, 0, 1, ProtocolNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProtocolNode_Node(), theChecklistcfgPackage.getCLNode(), null, "node", null, 0, 1, ProtocolNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProtocolNode_Children(), this.getProtocolNode(), this.getProtocolNode_Parent(), "children", null, 0, -1, ProtocolNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProtocolNode_Parent(), this.getProtocolNode(), this.getProtocolNode_Children(), "parent", null, 0, 1, ProtocolNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(stateEEnum, State.class, "State");
    addEEnumLiteral(stateEEnum, State.NONE);
    addEEnumLiteral(stateEEnum, State.PASSED);
    addEEnumLiteral(stateEEnum, State.FAILED);

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

} //ProtocolPackageImpl
