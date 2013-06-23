/**
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 * 
 */
package org.ustok.checklist.core.model.checklistcfg.impl;

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

import org.ustok.checklist.core.model.checklistcfg.CLNode;
import org.ustok.checklist.core.model.checklistcfg.ChecklistcfgPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CL Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ustok.checklist.core.model.checklistcfg.impl.CLNodeImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.ustok.checklist.core.model.checklistcfg.impl.CLNodeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.ustok.checklist.core.model.checklistcfg.impl.CLNodeImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.ustok.checklist.core.model.checklistcfg.impl.CLNodeImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.ustok.checklist.core.model.checklistcfg.impl.CLNodeImpl#getTargetIfPassed <em>Target If Passed</em>}</li>
 *   <li>{@link org.ustok.checklist.core.model.checklistcfg.impl.CLNodeImpl#getTragetIfFailed <em>Traget If Failed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CLNodeImpl extends MinimalEObjectImpl.Container implements CLNode
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final String copyright = "Copyright 2013 by Ustok.org.\nAll rights reserved.\n";

  /**
   * The default value of the '{@link #getText() <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected static final String TEXT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected String text = TEXT_EDEFAULT;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChildren()
   * @generated
   * @ordered
   */
  protected EList<CLNode> children;

  /**
   * The cached value of the '{@link #getTargetIfPassed() <em>Target If Passed</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetIfPassed()
   * @generated
   * @ordered
   */
  protected CLNode targetIfPassed;

  /**
   * The cached value of the '{@link #getTragetIfFailed() <em>Traget If Failed</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTragetIfFailed()
   * @generated
   * @ordered
   */
  protected CLNode tragetIfFailed;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CLNodeImpl()
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
    return ChecklistcfgPackage.Literals.CL_NODE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getText()
  {
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setText(String newText)
  {
    String oldText = text;
    text = newText;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChecklistcfgPackage.CL_NODE__TEXT, oldText, text));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChecklistcfgPackage.CL_NODE__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CLNode> getChildren()
  {
    if (children == null)
    {
      children = new EObjectContainmentWithInverseEList<CLNode>(CLNode.class, this, ChecklistcfgPackage.CL_NODE__CHILDREN, ChecklistcfgPackage.CL_NODE__PARENT);
    }
    return children;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CLNode getParent()
  {
    if (eContainerFeatureID() != ChecklistcfgPackage.CL_NODE__PARENT) return null;
    return (CLNode)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CLNode basicGetParent()
  {
    if (eContainerFeatureID() != ChecklistcfgPackage.CL_NODE__PARENT) return null;
    return (CLNode)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParent(CLNode newParent, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newParent, ChecklistcfgPackage.CL_NODE__PARENT, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParent(CLNode newParent)
  {
    if (newParent != eInternalContainer() || (eContainerFeatureID() != ChecklistcfgPackage.CL_NODE__PARENT && newParent != null))
    {
      if (EcoreUtil.isAncestor(this, newParent))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newParent != null)
        msgs = ((InternalEObject)newParent).eInverseAdd(this, ChecklistcfgPackage.CL_NODE__CHILDREN, CLNode.class, msgs);
      msgs = basicSetParent(newParent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChecklistcfgPackage.CL_NODE__PARENT, newParent, newParent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CLNode getTargetIfPassed()
  {
    if (targetIfPassed != null && targetIfPassed.eIsProxy())
    {
      InternalEObject oldTargetIfPassed = (InternalEObject)targetIfPassed;
      targetIfPassed = (CLNode)eResolveProxy(oldTargetIfPassed);
      if (targetIfPassed != oldTargetIfPassed)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChecklistcfgPackage.CL_NODE__TARGET_IF_PASSED, oldTargetIfPassed, targetIfPassed));
      }
    }
    return targetIfPassed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CLNode basicGetTargetIfPassed()
  {
    return targetIfPassed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetIfPassed(CLNode newTargetIfPassed)
  {
    CLNode oldTargetIfPassed = targetIfPassed;
    targetIfPassed = newTargetIfPassed;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChecklistcfgPackage.CL_NODE__TARGET_IF_PASSED, oldTargetIfPassed, targetIfPassed));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CLNode getTragetIfFailed()
  {
    if (tragetIfFailed != null && tragetIfFailed.eIsProxy())
    {
      InternalEObject oldTragetIfFailed = (InternalEObject)tragetIfFailed;
      tragetIfFailed = (CLNode)eResolveProxy(oldTragetIfFailed);
      if (tragetIfFailed != oldTragetIfFailed)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChecklistcfgPackage.CL_NODE__TRAGET_IF_FAILED, oldTragetIfFailed, tragetIfFailed));
      }
    }
    return tragetIfFailed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CLNode basicGetTragetIfFailed()
  {
    return tragetIfFailed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTragetIfFailed(CLNode newTragetIfFailed)
  {
    CLNode oldTragetIfFailed = tragetIfFailed;
    tragetIfFailed = newTragetIfFailed;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ChecklistcfgPackage.CL_NODE__TRAGET_IF_FAILED, oldTragetIfFailed, tragetIfFailed));
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
      case ChecklistcfgPackage.CL_NODE__CHILDREN:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildren()).basicAdd(otherEnd, msgs);
      case ChecklistcfgPackage.CL_NODE__PARENT:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetParent((CLNode)otherEnd, msgs);
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
      case ChecklistcfgPackage.CL_NODE__CHILDREN:
        return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
      case ChecklistcfgPackage.CL_NODE__PARENT:
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
      case ChecklistcfgPackage.CL_NODE__PARENT:
        return eInternalContainer().eInverseRemove(this, ChecklistcfgPackage.CL_NODE__CHILDREN, CLNode.class, msgs);
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
      case ChecklistcfgPackage.CL_NODE__TEXT:
        return getText();
      case ChecklistcfgPackage.CL_NODE__DESCRIPTION:
        return getDescription();
      case ChecklistcfgPackage.CL_NODE__CHILDREN:
        return getChildren();
      case ChecklistcfgPackage.CL_NODE__PARENT:
        if (resolve) return getParent();
        return basicGetParent();
      case ChecklistcfgPackage.CL_NODE__TARGET_IF_PASSED:
        if (resolve) return getTargetIfPassed();
        return basicGetTargetIfPassed();
      case ChecklistcfgPackage.CL_NODE__TRAGET_IF_FAILED:
        if (resolve) return getTragetIfFailed();
        return basicGetTragetIfFailed();
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
      case ChecklistcfgPackage.CL_NODE__TEXT:
        setText((String)newValue);
        return;
      case ChecklistcfgPackage.CL_NODE__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case ChecklistcfgPackage.CL_NODE__CHILDREN:
        getChildren().clear();
        getChildren().addAll((Collection<? extends CLNode>)newValue);
        return;
      case ChecklistcfgPackage.CL_NODE__PARENT:
        setParent((CLNode)newValue);
        return;
      case ChecklistcfgPackage.CL_NODE__TARGET_IF_PASSED:
        setTargetIfPassed((CLNode)newValue);
        return;
      case ChecklistcfgPackage.CL_NODE__TRAGET_IF_FAILED:
        setTragetIfFailed((CLNode)newValue);
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
      case ChecklistcfgPackage.CL_NODE__TEXT:
        setText(TEXT_EDEFAULT);
        return;
      case ChecklistcfgPackage.CL_NODE__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case ChecklistcfgPackage.CL_NODE__CHILDREN:
        getChildren().clear();
        return;
      case ChecklistcfgPackage.CL_NODE__PARENT:
        setParent((CLNode)null);
        return;
      case ChecklistcfgPackage.CL_NODE__TARGET_IF_PASSED:
        setTargetIfPassed((CLNode)null);
        return;
      case ChecklistcfgPackage.CL_NODE__TRAGET_IF_FAILED:
        setTragetIfFailed((CLNode)null);
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
      case ChecklistcfgPackage.CL_NODE__TEXT:
        return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
      case ChecklistcfgPackage.CL_NODE__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case ChecklistcfgPackage.CL_NODE__CHILDREN:
        return children != null && !children.isEmpty();
      case ChecklistcfgPackage.CL_NODE__PARENT:
        return basicGetParent() != null;
      case ChecklistcfgPackage.CL_NODE__TARGET_IF_PASSED:
        return targetIfPassed != null;
      case ChecklistcfgPackage.CL_NODE__TRAGET_IF_FAILED:
        return tragetIfFailed != null;
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
    result.append(" (text: ");
    result.append(text);
    result.append(", description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //CLNodeImpl
