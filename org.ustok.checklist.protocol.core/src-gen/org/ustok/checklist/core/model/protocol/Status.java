/**
 * Copyright 2013 by Ustok.org.
 * All rights reserved.
 * 
 */
package org.ustok.checklist.core.model.protocol;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Status to be used by protocol nodes.
 * <!-- end-model-doc -->
 * @see org.ustok.checklist.core.model.protocol.ProtocolPackage#getStatus()
 * @model
 * @generated
 */
public enum Status implements Enumerator
{
  /**
   * The '<em><b>SKIPPED</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SKIPPED_VALUE
   * @generated
   * @ordered
   */
  SKIPPED(0, "SKIPPED", "SKIPPED"),

  /**
   * The '<em><b>OK</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OK_VALUE
   * @generated
   * @ordered
   */
  OK(1, "OK", "OK"),

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
   * The '<em><b>SKIPPED</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Status indicating that the corresponding node is skipped.
   * <!-- end-model-doc -->
   * @see #SKIPPED
   * @model
   * @generated
   * @ordered
   */
  public static final int SKIPPED_VALUE = 0;

  /**
   * The '<em><b>OK</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Status indicating that the corresponding node is passed.
   * <!-- end-model-doc -->
   * @see #OK
   * @model
   * @generated
   * @ordered
   */
  public static final int OK_VALUE = 1;

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
   * An array of all the '<em><b>Status</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Status[] VALUES_ARRAY =
    new Status[]
    {
      SKIPPED,
      OK,
      FAILED,
    };

  /**
   * A public read-only list of all the '<em><b>Status</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Status> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Status</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Status get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Status result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Status</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Status getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Status result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Status</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Status get(int value)
  {
    switch (value)
    {
      case SKIPPED_VALUE: return SKIPPED;
      case OK_VALUE: return OK;
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
  private Status(int value, String name, String literal)
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
  
} //Status
