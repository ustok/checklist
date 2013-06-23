/**
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 * 
 */
package org.ustok.checklist.core.model.protocol.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.ustok.checklist.core.model.checklistcfg.CLCfg;

import org.ustok.checklist.core.model.protocol.Protocol;
import org.ustok.checklist.core.model.protocol.ProtocolNode;
import org.ustok.checklist.core.model.protocol.ProtocolPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protocol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ustok.checklist.core.model.protocol.impl.ProtocolImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link org.ustok.checklist.core.model.protocol.impl.ProtocolImpl#getCfgModel <em>Cfg Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProtocolImpl extends MinimalEObjectImpl.Container implements Protocol
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
  protected ProtocolNode root;

  /**
   * The cached value of the '{@link #getCfgModel() <em>Cfg Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCfgModel()
   * @generated
   * @ordered
   */
  protected CLCfg cfgModel;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProtocolImpl()
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
    return ProtocolPackage.Literals.PROTOCOL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProtocolNode getRoot()
  {
    return root;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRoot(ProtocolNode newRoot, NotificationChain msgs)
  {
    ProtocolNode oldRoot = root;
    root = newRoot;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProtocolPackage.PROTOCOL__ROOT, oldRoot, newRoot);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRoot(ProtocolNode newRoot)
  {
    if (newRoot != root)
    {
      NotificationChain msgs = null;
      if (root != null)
        msgs = ((InternalEObject)root).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProtocolPackage.PROTOCOL__ROOT, null, msgs);
      if (newRoot != null)
        msgs = ((InternalEObject)newRoot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProtocolPackage.PROTOCOL__ROOT, null, msgs);
      msgs = basicSetRoot(newRoot, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProtocolPackage.PROTOCOL__ROOT, newRoot, newRoot));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CLCfg getCfgModel()
  {
    return cfgModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCfgModel(CLCfg newCfgModel, NotificationChain msgs)
  {
    CLCfg oldCfgModel = cfgModel;
    cfgModel = newCfgModel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProtocolPackage.PROTOCOL__CFG_MODEL, oldCfgModel, newCfgModel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCfgModel(CLCfg newCfgModel)
  {
    if (newCfgModel != cfgModel)
    {
      NotificationChain msgs = null;
      if (cfgModel != null)
        msgs = ((InternalEObject)cfgModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProtocolPackage.PROTOCOL__CFG_MODEL, null, msgs);
      if (newCfgModel != null)
        msgs = ((InternalEObject)newCfgModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProtocolPackage.PROTOCOL__CFG_MODEL, null, msgs);
      msgs = basicSetCfgModel(newCfgModel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProtocolPackage.PROTOCOL__CFG_MODEL, newCfgModel, newCfgModel));
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
      case ProtocolPackage.PROTOCOL__ROOT:
        return basicSetRoot(null, msgs);
      case ProtocolPackage.PROTOCOL__CFG_MODEL:
        return basicSetCfgModel(null, msgs);
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
      case ProtocolPackage.PROTOCOL__ROOT:
        return getRoot();
      case ProtocolPackage.PROTOCOL__CFG_MODEL:
        return getCfgModel();
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
      case ProtocolPackage.PROTOCOL__ROOT:
        setRoot((ProtocolNode)newValue);
        return;
      case ProtocolPackage.PROTOCOL__CFG_MODEL:
        setCfgModel((CLCfg)newValue);
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
      case ProtocolPackage.PROTOCOL__ROOT:
        setRoot((ProtocolNode)null);
        return;
      case ProtocolPackage.PROTOCOL__CFG_MODEL:
        setCfgModel((CLCfg)null);
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
      case ProtocolPackage.PROTOCOL__ROOT:
        return root != null;
      case ProtocolPackage.PROTOCOL__CFG_MODEL:
        return cfgModel != null;
    }
    return super.eIsSet(featureID);
  }

} //ProtocolImpl
