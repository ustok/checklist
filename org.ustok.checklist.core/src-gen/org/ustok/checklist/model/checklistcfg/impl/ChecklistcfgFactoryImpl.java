/**
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 * 
 */
package org.ustok.checklist.model.checklistcfg.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.ustok.checklist.model.checklistcfg.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChecklistcfgFactoryImpl extends EFactoryImpl implements ChecklistcfgFactory
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final String copyright = "Copyright 2013 by Ustok.org.\nAll rights reserved.\n";

  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ChecklistcfgFactory init()
  {
    try
    {
      ChecklistcfgFactory theChecklistcfgFactory = (ChecklistcfgFactory)EPackage.Registry.INSTANCE.getEFactory(ChecklistcfgPackage.eNS_URI);
      if (theChecklistcfgFactory != null)
      {
        return theChecklistcfgFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ChecklistcfgFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChecklistcfgFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ChecklistcfgPackage.CL_CFG: return createCLCfg();
      case ChecklistcfgPackage.CL_NODE: return createCLNode();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CLCfg createCLCfg()
  {
    CLCfgImpl clCfg = new CLCfgImpl();
    return clCfg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CLNode createCLNode()
  {
    CLNodeImpl clNode = new CLNodeImpl();
    return clNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChecklistcfgPackage getChecklistcfgPackage()
  {
    return (ChecklistcfgPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ChecklistcfgPackage getPackage()
  {
    return ChecklistcfgPackage.eINSTANCE;
  }

} //ChecklistcfgFactoryImpl
