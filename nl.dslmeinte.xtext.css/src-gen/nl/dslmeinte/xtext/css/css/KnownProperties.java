/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.css.css;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Known Properties</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see nl.dslmeinte.xtext.css.css.CssPackage#getKnownProperties()
 * @model
 * @generated
 */
public enum KnownProperties implements Enumerator
{
  /**
   * The '<em><b>Color</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #COLOR_VALUE
   * @generated
   * @ordered
   */
  COLOR(0, "color", "color"),

  /**
   * The '<em><b>Border top</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BORDER_TOP_VALUE
   * @generated
   * @ordered
   */
  BORDER_TOP(1, "border_top", "border-top");

  /**
   * The '<em><b>Color</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Color</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #COLOR
   * @model name="color"
   * @generated
   * @ordered
   */
  public static final int COLOR_VALUE = 0;

  /**
   * The '<em><b>Border top</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Border top</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BORDER_TOP
   * @model name="border_top" literal="border-top"
   * @generated
   * @ordered
   */
  public static final int BORDER_TOP_VALUE = 1;

  /**
   * An array of all the '<em><b>Known Properties</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final KnownProperties[] VALUES_ARRAY =
    new KnownProperties[]
    {
      COLOR,
      BORDER_TOP,
    };

  /**
   * A public read-only list of all the '<em><b>Known Properties</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<KnownProperties> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Known Properties</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static KnownProperties get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      KnownProperties result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Known Properties</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static KnownProperties getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      KnownProperties result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Known Properties</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static KnownProperties get(int value)
  {
    switch (value)
    {
      case COLOR_VALUE: return COLOR;
      case BORDER_TOP_VALUE: return BORDER_TOP;
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
  private KnownProperties(int value, String name, String literal)
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
  
} //KnownProperties
