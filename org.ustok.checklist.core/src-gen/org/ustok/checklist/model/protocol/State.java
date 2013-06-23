/**
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 * 
 */
package org.ustok.checklist.model.protocol;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>State</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Status to be used by protocol nodes.
 * <!-- end-model-doc -->
 * @see org.ustok.checklist.model.protocol.ProtocolPackage#getState()
 * @model
 * @generated
 */
public enum State implements Enumerator
{
  /**
   * The '<em><b>NONE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NONE_VALUE
   * @generated
   * @ordered
   */
  NONE(0, "NONE", "NONE"),

  /**
   * The '<em><b>PASSED</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PASSED_VALUE
   * @generated
   * @ordered
   */
  PASSED(1, "PASSED", "PASSED"),

  /**
   * The '<em><b>FAILED</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FAILED_VALUE
   * @generated
   * @ordered
   */
  FAILED(2, "FAILED", "FAILED");

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final String copyright = "Copyright 2013 by Ustok.org.\nAll rights reserved.\n";

  /**
   * The '<em><b>NONE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Status indicating that the corresponding node is not set.
   * <!-- end-model-doc -->
   * @see #NONE
   * @model
   * @generated
   * @ordered
   */
  public static final int NONE_VALUE = 0;

  /**
   * The '<em><b>PASSED</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Status indicating that the corresponding node is passed.
   * <!-- end-model-doc -->
   * @see #PASSED
   * @model
   * @generated
   * @ordered
   */
  public static final int PASSED_VALUE = 1;

  /**
   * The '<em><b>FAILED</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Status indicating that the corresponding node is failed.
   * <!-- end-model-doc -->
   * @see #FAILED
   * @model
   * @generated
   * @ordered
   */
  public static final int FAILED_VALUE = 2;

  /**
   * An array of all the '<em><b>State</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final State[] VALUES_ARRAY =
    new State[]
    {
      NONE,
      PASSED,
      FAILED,
    };

  /**
   * A public read-only list of all the '<em><b>State</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<State> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>State</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static State get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      State result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>State</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static State getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      State result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>State</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static State get(int value)
  {
    switch (value)
    {
      case NONE_VALUE: return NONE;
      case PASSED_VALUE: return PASSED;
      case FAILED_VALUE: return FAILED;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private State(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //State
