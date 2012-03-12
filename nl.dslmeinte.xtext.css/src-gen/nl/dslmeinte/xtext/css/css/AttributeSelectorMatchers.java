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
 * A representation of the literals of the enumeration '<em><b>Attribute Selector Matchers</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see nl.dslmeinte.xtext.css.css.CssPackage#getAttributeSelectorMatchers()
 * @model
 * @generated
 */
public enum AttributeSelectorMatchers implements Enumerator
{
  /**
   * The '<em><b>Prefix</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PREFIX_VALUE
   * @generated
   * @ordered
   */
  PREFIX(0, "prefix", "^="),

  /**
   * The '<em><b>Suffix</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SUFFIX_VALUE
   * @generated
   * @ordered
   */
  SUFFIX(1, "suffix", "$="),

  /**
   * The '<em><b>Substring</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SUBSTRING_VALUE
   * @generated
   * @ordered
   */
  SUBSTRING(2, "substring", "*="),

  /**
   * The '<em><b>Exact</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EXACT_VALUE
   * @generated
   * @ordered
   */
  EXACT(3, "exact", "="),

  /**
   * The '<em><b>Includes</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INCLUDES_VALUE
   * @generated
   * @ordered
   */
  INCLUDES(4, "includes", "~="),

  /**
   * The '<em><b>Language</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LANGUAGE_VALUE
   * @generated
   * @ordered
   */
  LANGUAGE(5, "language", "|=");

  /**
   * The '<em><b>Prefix</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Prefix</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PREFIX
   * @model name="prefix" literal="^="
   * @generated
   * @ordered
   */
  public static final int PREFIX_VALUE = 0;

  /**
   * The '<em><b>Suffix</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Suffix</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SUFFIX
   * @model name="suffix" literal="$="
   * @generated
   * @ordered
   */
  public static final int SUFFIX_VALUE = 1;

  /**
   * The '<em><b>Substring</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Substring</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SUBSTRING
   * @model name="substring" literal="*="
   * @generated
   * @ordered
   */
  public static final int SUBSTRING_VALUE = 2;

  /**
   * The '<em><b>Exact</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Exact</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EXACT
   * @model name="exact" literal="="
   * @generated
   * @ordered
   */
  public static final int EXACT_VALUE = 3;

  /**
   * The '<em><b>Includes</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Includes</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INCLUDES
   * @model name="includes" literal="~="
   * @generated
   * @ordered
   */
  public static final int INCLUDES_VALUE = 4;

  /**
   * The '<em><b>Language</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Language</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LANGUAGE
   * @model name="language" literal="|="
   * @generated
   * @ordered
   */
  public static final int LANGUAGE_VALUE = 5;

  /**
   * An array of all the '<em><b>Attribute Selector Matchers</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final AttributeSelectorMatchers[] VALUES_ARRAY =
    new AttributeSelectorMatchers[]
    {
      PREFIX,
      SUFFIX,
      SUBSTRING,
      EXACT,
      INCLUDES,
      LANGUAGE,
    };

  /**
   * A public read-only list of all the '<em><b>Attribute Selector Matchers</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<AttributeSelectorMatchers> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Attribute Selector Matchers</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AttributeSelectorMatchers get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      AttributeSelectorMatchers result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Attribute Selector Matchers</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AttributeSelectorMatchers getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      AttributeSelectorMatchers result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Attribute Selector Matchers</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AttributeSelectorMatchers get(int value)
  {
    switch (value)
    {
      case PREFIX_VALUE: return PREFIX;
      case SUFFIX_VALUE: return SUFFIX;
      case SUBSTRING_VALUE: return SUBSTRING;
      case EXACT_VALUE: return EXACT;
      case INCLUDES_VALUE: return INCLUDES;
      case LANGUAGE_VALUE: return LANGUAGE;
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
  private AttributeSelectorMatchers(int value, String name, String literal)
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
  
} //AttributeSelectorMatchers
