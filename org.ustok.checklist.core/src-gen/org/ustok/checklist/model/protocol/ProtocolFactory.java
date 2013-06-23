/**
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 * 
 */
package org.ustok.checklist.model.protocol;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.ustok.checklist.model.protocol.ProtocolPackage
 * @generated
 */
public interface ProtocolFactory extends EFactory
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String copyright = "Copyright 2013 by Ustok.org.\nAll rights reserved.\n";

  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ProtocolFactory eINSTANCE = org.ustok.checklist.model.protocol.impl.ProtocolFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Protocol</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Protocol</em>'.
   * @generated
   */
  Protocol createProtocol();

  /**
   * Returns a new object of class '<em>Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node</em>'.
   * @generated
   */
  ProtocolNode createProtocolNode();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ProtocolPackage getProtocolPackage();

} //ProtocolFactory
