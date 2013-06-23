/**
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 * 
 */
package org.ustok.checklist.model.protocol.impl;

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

import org.ustok.checklist.model.checklistcfg.CLNode;

import org.ustok.checklist.model.protocol.ProtocolNode;
import org.ustok.checklist.model.protocol.ProtocolPackage;
import org.ustok.checklist.model.protocol.State;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ustok.checklist.model.protocol.impl.ProtocolNodeImpl#getInfo <em>Info</em>}</li>
 *   <li>{@link org.ustok.checklist.model.protocol.impl.ProtocolNodeImpl#getState <em>State</em>}</li>
 *   <li>{@link org.ustok.checklist.model.protocol.impl.ProtocolNodeImpl#getNode <em>Node</em>}</li>
 *   <li>{@link org.ustok.checklist.model.protocol.impl.ProtocolNodeImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.ustok.checklist.model.protocol.impl.ProtocolNodeImpl#getParent <em>Parent</em>}</li>
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
   * The default value of the '{@link #getState() <em>State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getState()
   * @generated
   * @ordered
   */
  protected static final State STATE_EDEFAULT = State.NONE;

  /**
   * The cached value of the '{@link #getState() <em>State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getState()
   * @generated
   * @ordered
   */
  protected State state = STATE_EDEFAULT;

  /**
   * The cached value of the '{@link #getNode() <em>Node</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNode()
   * @generated
   * @ordered
   */
  protected CLNode node;

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
  public State getState()
  {
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setState(State newState)
  {
    State oldState = state;
    state = newState == null ? STATE_EDEFAULT : newState;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProtocolPackage.PROTOCOL_NODE__STATE, oldState, state));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CLNode getNode()
  {
    if (node != null && node.eIsProxy())
    {
      InternalEObject oldNode = (InternalEObject)node;
      node = (CLNode)eResolveProxy(oldNode);
      if (node != oldNode)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProtocolPackage.PROTOCOL_NODE__NODE, oldNode, node));
      }
    }
    return node;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CLNode basicGetNode()
  {
    return node;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNode(CLNode newNode)
  {
    CLNode oldNode = node;
    node = newNode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProtocolPackage.PROTOCOL_NODE__NODE, oldNode, node));
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
      case ProtocolPackage.PROTOCOL_NODE__STATE:
        return getState();
      case ProtocolPackage.PROTOCOL_NODE__NODE:
        if (resolve) return getNode();
        return basicGetNode();
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
      case ProtocolPackage.PROTOCOL_NODE__STATE:
        setState((State)newValue);
        return;
      case ProtocolPackage.PROTOCOL_NODE__NODE:
        setNode((CLNode)newValue);
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
      case ProtocolPackage.PROTOCOL_NODE__STATE:
        setState(STATE_EDEFAULT);
        return;
      case ProtocolPackage.PROTOCOL_NODE__NODE:
        setNode((CLNode)null);
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
      case ProtocolPackage.PROTOCOL_NODE__STATE:
        return state != STATE_EDEFAULT;
      case ProtocolPackage.PROTOCOL_NODE__NODE:
        return node != null;
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
    result.append(", state: ");
    result.append(state);
    result.append(')');
    return result.toString();
  }

} //ProtocolNodeImpl
