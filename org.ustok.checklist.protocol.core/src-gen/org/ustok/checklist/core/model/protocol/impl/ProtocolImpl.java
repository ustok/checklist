/**
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 * 
 */
package org.ustok.checklist.core.model.protocol.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ustok.checklist.cfg.checklist.Model;

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
 *   <li>{@link org.ustok.checklist.core.model.protocol.impl.ProtocolImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.ustok.checklist.core.model.protocol.impl.ProtocolImpl#getChecklistModel <em>Checklist Model</em>}</li>
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
   * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodes()
   * @generated
   * @ordered
   */
  protected EList<ProtocolNode> nodes;

  /**
   * The cached value of the '{@link #getChecklistModel() <em>Checklist Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChecklistModel()
   * @generated
   * @ordered
   */
  protected Model checklistModel;

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
  public EList<ProtocolNode> getNodes()
  {
    if (nodes == null)
    {
      nodes = new EObjectContainmentEList<ProtocolNode>(ProtocolNode.class, this, ProtocolPackage.PROTOCOL__NODES);
    }
    return nodes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model getChecklistModel()
  {
    return checklistModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetChecklistModel(Model newChecklistModel, NotificationChain msgs)
  {
    Model oldChecklistModel = checklistModel;
    checklistModel = newChecklistModel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProtocolPackage.PROTOCOL__CHECKLIST_MODEL, oldChecklistModel, newChecklistModel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChecklistModel(Model newChecklistModel)
  {
    if (newChecklistModel != checklistModel)
    {
      NotificationChain msgs = null;
      if (checklistModel != null)
        msgs = ((InternalEObject)checklistModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProtocolPackage.PROTOCOL__CHECKLIST_MODEL, null, msgs);
      if (newChecklistModel != null)
        msgs = ((InternalEObject)newChecklistModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProtocolPackage.PROTOCOL__CHECKLIST_MODEL, null, msgs);
      msgs = basicSetChecklistModel(newChecklistModel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProtocolPackage.PROTOCOL__CHECKLIST_MODEL, newChecklistModel, newChecklistModel));
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
      case ProtocolPackage.PROTOCOL__NODES:
        return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
      case ProtocolPackage.PROTOCOL__CHECKLIST_MODEL:
        return basicSetChecklistModel(null, msgs);
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
      case ProtocolPackage.PROTOCOL__NODES:
        return getNodes();
      case ProtocolPackage.PROTOCOL__CHECKLIST_MODEL:
        return getChecklistModel();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ProtocolPackage.PROTOCOL__NODES:
        getNodes().clear();
        getNodes().addAll((Collection<? extends ProtocolNode>)newValue);
        return;
      case ProtocolPackage.PROTOCOL__CHECKLIST_MODEL:
        setChecklistModel((Model)newValue);
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
      case ProtocolPackage.PROTOCOL__NODES:
        getNodes().clear();
        return;
      case ProtocolPackage.PROTOCOL__CHECKLIST_MODEL:
        setChecklistModel((Model)null);
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
      case ProtocolPackage.PROTOCOL__NODES:
        return nodes != null && !nodes.isEmpty();
      case ProtocolPackage.PROTOCOL__CHECKLIST_MODEL:
        return checklistModel != null;
    }
    return super.eIsSet(featureID);
  }

} //ProtocolImpl
