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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ustok.checklist.cfg.checklist.Step;

import org.ustok.checklist.core.model.protocol.ProtocolNode;
import org.ustok.checklist.core.model.protocol.ProtocolPackage;
import org.ustok.checklist.core.model.protocol.Status;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ustok.checklist.core.model.protocol.impl.ProtocolNodeImpl#getInfo <em>Info</em>}</li>
 *   <li>{@link org.ustok.checklist.core.model.protocol.impl.ProtocolNodeImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.ustok.checklist.core.model.protocol.impl.ProtocolNodeImpl#getStep <em>Step</em>}</li>
 *   <li>{@link org.ustok.checklist.core.model.protocol.impl.ProtocolNodeImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.ustok.checklist.core.model.protocol.impl.ProtocolNodeImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProtocolNodeImpl extends MinimalEObjectImpl.Container implements ProtocolNode
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final String copyright = "Copyright 2013 by Ustok.org.\nAll rights reserved.\n";

  /**
   * The default value of the '{@link #getInfo() <em>Info</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInfo()
   * @generated
   * @ordered
   */
  protected static final String INFO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInfo() <em>Info</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInfo()
   * @generated
   * @ordered
   */
  protected String info = INFO_EDEFAULT;

  /**
   * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatus()
   * @generated
   * @ordered
   */
  protected static final Status STATUS_EDEFAULT = Status.SKIPPED;

  /**
   * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatus()
   * @generated
   * @ordered
   */
  protected Status status = STATUS_EDEFAULT;

  /**
   * The cached value of the '{@link #getStep() <em>Step</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStep()
   * @generated
   * @ordered
   */
  protected Step step;

  /**
   * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChildren()
   * @generated
   * @ordered
   */
  protected EList<ProtocolNode> children;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProtocolNodeImpl()
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
    return ProtocolPackage.Literals.PROTOCOL_NODE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInfo()
  {
    return info;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInfo(String newInfo)
  {
    String oldInfo = info;
    info = newInfo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProtocolPackage.PROTOCOL_NODE__INFO, oldInfo, info));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Status getStatus()
  {
    return status;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatus(Status newStatus)
  {
    Status oldStatus = status;
    status = newStatus == null ? STATUS_EDEFAULT : newStatus;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProtocolPackage.PROTOCOL_NODE__STATUS, oldStatus, status));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Step getStep()
  {
    if (step != null && step.eIsProxy())
    {
      InternalEObject oldStep = (InternalEObject)step;
      step = (Step)eResolveProxy(oldStep);
      if (step != oldStep)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProtocolPackage.PROTOCOL_NODE__STEP, oldStep, step));
      }
    }
    return step;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Step basicGetStep()
  {
    return step;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStep(Step newStep)
  {
    Step oldStep = step;
    step = newStep;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProtocolPackage.PROTOCOL_NODE__STEP, oldStep, step));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ProtocolNode> getChildren()
  {
    if (children == null)
    {
      children = new EObjectContainmentWithInverseEList<ProtocolNode>(ProtocolNode.class, this, ProtocolPackage.PROTOCOL_NODE__CHILDREN, ProtocolPackage.PROTOCOL_NODE__PARENT);
    }
    return children;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProtocolNode getParent()
  {
    if (eContainerFeatureID() != ProtocolPackage.PROTOCOL_NODE__PARENT) return null;
    return (ProtocolNode)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProtocolNode basicGetParent()
  {
    if (eContainerFeatureID() != ProtocolPackage.PROTOCOL_NODE__PARENT) return null;
    return (ProtocolNode)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParent(ProtocolNode newParent, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newParent, ProtocolPackage.PROTOCOL_NODE__PARENT, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParent(ProtocolNode newParent)
  {
    if (newParent != eInternalContainer() || (eContainerFeatureID() != ProtocolPackage.PROTOCOL_NODE__PARENT && newParent != null))
    {
      if (EcoreUtil.isAncestor(this, newParent))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newParent != null)
        msgs = ((InternalEObject)newParent).eInverseAdd(this, ProtocolPackage.PROTOCOL_NODE__CHILDREN, ProtocolNode.class, msgs);
      msgs = basicSetParent(newParent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProtocolPackage.PROTOCOL_NODE__PARENT, newParent, newParent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ProtocolPackage.PROTOCOL_NODE__CHILDREN:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildren()).basicAdd(otherEnd, msgs);
      case ProtocolPackage.PROTOCOL_NODE__PARENT:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetParent((ProtocolNode)otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
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
      case ProtocolPackage.PROTOCOL_NODE__CHILDREN:
        return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
      case ProtocolPackage.PROTOCOL_NODE__PARENT:
        return basicSetParent(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
    switch (eContainerFeatureID())
    {
      case ProtocolPackage.PROTOCOL_NODE__PARENT:
        return eInternalContainer().eInverseRemove(this, ProtocolPackage.PROTOCOL_NODE__CHILDREN, ProtocolNode.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
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
      case ProtocolPackage.PROTOCOL_NODE__INFO:
        return getInfo();
      case ProtocolPackage.PROTOCOL_NODE__STATUS:
        return getStatus();
      case ProtocolPackage.PROTOCOL_NODE__STEP:
        if (resolve) return getStep();
        return basicGetStep();
      case ProtocolPackage.PROTOCOL_NODE__CHILDREN:
        return getChildren();
      case ProtocolPackage.PROTOCOL_NODE__PARENT:
        if (resolve) return getParent();
        return basicGetParent();
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
      case ProtocolPackage.PROTOCOL_NODE__INFO:
        setInfo((String)newValue);
        return;
      case ProtocolPackage.PROTOCOL_NODE__STATUS:
        setStatus((Status)newValue);
        return;
      case ProtocolPackage.PROTOCOL_NODE__STEP:
        setStep((Step)newValue);
        return;
      case ProtocolPackage.PROTOCOL_NODE__CHILDREN:
        getChildren().clear();
        getChildren().addAll((Collection<? extends ProtocolNode>)newValue);
        return;
      case ProtocolPackage.PROTOCOL_NODE__PARENT:
        setParent((ProtocolNode)newValue);
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
      case ProtocolPackage.PROTOCOL_NODE__INFO:
        setInfo(INFO_EDEFAULT);
        return;
      case ProtocolPackage.PROTOCOL_NODE__STATUS:
        setStatus(STATUS_EDEFAULT);
        return;
      case ProtocolPackage.PROTOCOL_NODE__STEP:
        setStep((Step)null);
        return;
      case ProtocolPackage.PROTOCOL_NODE__CHILDREN:
        getChildren().clear();
        return;
      case ProtocolPackage.PROTOCOL_NODE__PARENT:
        setParent((ProtocolNode)null);
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
      case ProtocolPackage.PROTOCOL_NODE__INFO:
        return INFO_EDEFAULT == null ? info != null : !INFO_EDEFAULT.equals(info);
      case ProtocolPackage.PROTOCOL_NODE__STATUS:
        return status != STATUS_EDEFAULT;
      case ProtocolPackage.PROTOCOL_NODE__STEP:
        return step != null;
      case ProtocolPackage.PROTOCOL_NODE__CHILDREN:
        return children != null && !children.isEmpty();
      case ProtocolPackage.PROTOCOL_NODE__PARENT:
        return basicGetParent() != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (info: ");
    result.append(info);
    result.append(", status: ");
    result.append(status);
    result.append(')');
    return result.toString();
  }

} //ProtocolNodeImpl
