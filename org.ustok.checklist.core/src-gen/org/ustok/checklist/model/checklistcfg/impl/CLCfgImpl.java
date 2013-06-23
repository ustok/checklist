/**
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 * 
 */
package org.ustok.checklist.model.checklistcfg.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.ustok.checklist.model.checklistcfg.CLCfg;
import org.ustok.checklist.model.checklistcfg.CLNode;
import org.ustok.checklist.model.checklistcfg.ChecklistcfgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CL Cfg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ustok.checklist.model.checklistcfg.impl.CLCfgImpl#getRoot <em>Root</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CLCfgImpl extends MinimalEObjectImpl.Container implements CLCfg
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final String copyright = "Copyright 2013 by Ustok.org.\nAll rights reserved.\n";

  /**
   * The cached value of the '{@link #getRoot() <em>Root</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRoot()
   * @generated
   * @ordered
   */
  protected CLNode root;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CLCfgImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ChecklistcfgPackage.Literals.CL_CFG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CLNode getRoot()
  {
    return root;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRoot(CLNode newRoot, NotificationChain msgs)
  {
    CLNode oldRoot = root;
    root = newRoot;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChecklistcfgPackage.CL_CFG__ROOT, oldRoot, newRoot);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRoot(CLNode newRoot)
  {
    if (newRoot != root)
    {
      NotificationChain msgs = null;
      if (root != null)
        msgs = ((InternalEObject)root).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChecklistcfgPackage.CL_CFG__ROOT, null, msgs);
      if (newRoot != null)
        msgs = ((InternalEObject)newRoot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChecklistcfgPackage.CL_CFG__ROOT, null, msgs);
      msgs = basicSetRoot(newRoot, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChecklistcfgPackage.CL_CFG__ROOT, newRoot, newRoot));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ChecklistcfgPackage.CL_CFG__ROOT:
        return basicSetRoot(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ChecklistcfgPackage.CL_CFG__ROOT:
        return getRoot();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ChecklistcfgPackage.CL_CFG__ROOT:
        setRoot((CLNode)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ChecklistcfgPackage.CL_CFG__ROOT:
        setRoot((CLNode)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ChecklistcfgPackage.CL_CFG__ROOT:
        return root != null;
    }
    return super.eIsSet(featureID);
  }

} //CLCfgImpl
