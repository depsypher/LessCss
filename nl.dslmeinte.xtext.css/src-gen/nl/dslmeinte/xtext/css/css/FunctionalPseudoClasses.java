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
 * A representation of the literals of the enumeration '<em><b>Functional Pseudo Classes</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see nl.dslmeinte.xtext.css.css.CssPackage#getFunctionalPseudoClasses()
 * @model
 * @generated
 */
public enum FunctionalPseudoClasses implements Enumerator
{
  /**
   * The '<em><b>Nth Child</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NTH_CHILD_VALUE
   * @generated
   * @ordered
   */
  NTH_CHILD(0, "nthChild", "nth-child"),

  /**
   * The '<em><b>Nth Last Child</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NTH_LAST_CHILD_VALUE
   * @generated
   * @ordered
   */
  NTH_LAST_CHILD(1, "nthLastChild", "nth-last-child"),

  /**
   * The '<em><b>Nth Of Type</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NTH_OF_TYPE_VALUE
   * @generated
   * @ordered
   */
  NTH_OF_TYPE(2, "nthOfType", "nth-of-type"),

  /**
   * The '<em><b>Nth Last Of Type</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NTH_LAST_OF_TYPE_VALUE
   * @generated
   * @ordered
   */
  NTH_LAST_OF_TYPE(3, "nthLastOfType", "nth-last-if-type"),

  /**
   * The '<em><b>First Of Type</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FIRST_OF_TYPE_VALUE
   * @generated
   * @ordered
   */
  FIRST_OF_TYPE(4, "firstOfType", "first-of-type"),

  /**
   * The '<em><b>Last Of Type</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LAST_OF_TYPE_VALUE
   * @generated
   * @ordered
   */
  LAST_OF_TYPE(5, "lastOfType", "last-of-type"),

  /**
   * The '<em><b>Only Of Type</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ONLY_OF_TYPE_VALUE
   * @generated
   * @ordered
   */
  ONLY_OF_TYPE(6, "onlyOfType", "only-of-type");

  /**
   * The '<em><b>Nth Child</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Nth Child</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NTH_CHILD
   * @model name="nthChild" literal="nth-child"
   * @generated
   * @ordered
   */
  public static final int NTH_CHILD_VALUE = 0;

  /**
   * The '<em><b>Nth Last Child</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Nth Last Child</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NTH_LAST_CHILD
   * @model name="nthLastChild" literal="nth-last-child"
   * @generated
   * @ordered
   */
  public static final int NTH_LAST_CHILD_VALUE = 1;

  /**
   * The '<em><b>Nth Of Type</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Nth Of Type</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NTH_OF_TYPE
   * @model name="nthOfType" literal="nth-of-type"
   * @generated
   * @ordered
   */
  public static final int NTH_OF_TYPE_VALUE = 2;

  /**
   * The '<em><b>Nth Last Of Type</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Nth Last Of Type</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NTH_LAST_OF_TYPE
   * @model name="nthLastOfType" literal="nth-last-if-type"
   * @generated
   * @ordered
   */
  public static final int NTH_LAST_OF_TYPE_VALUE = 3;

  /**
   * The '<em><b>First Of Type</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>First Of Type</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FIRST_OF_TYPE
   * @model name="firstOfType" literal="first-of-type"
   * @generated
   * @ordered
   */
  public static final int FIRST_OF_TYPE_VALUE = 4;

  /**
   * The '<em><b>Last Of Type</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Last Of Type</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LAST_OF_TYPE
   * @model name="lastOfType" literal="last-of-type"
   * @generated
   * @ordered
   */
  public static final int LAST_OF_TYPE_VALUE = 5;

  /**
   * The '<em><b>Only Of Type</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Only Of Type</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ONLY_OF_TYPE
   * @model name="onlyOfType" literal="only-of-type"
   * @generated
   * @ordered
   */
  public static final int ONLY_OF_TYPE_VALUE = 6;

  /**
   * An array of all the '<em><b>Functional Pseudo Classes</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final FunctionalPseudoClasses[] VALUES_ARRAY =
    new FunctionalPseudoClasses[]
    {
      NTH_CHILD,
      NTH_LAST_CHILD,
      NTH_OF_TYPE,
      NTH_LAST_OF_TYPE,
      FIRST_OF_TYPE,
      LAST_OF_TYPE,
      ONLY_OF_TYPE,
    };

  /**
   * A public read-only list of all the '<em><b>Functional Pseudo Classes</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<FunctionalPseudoClasses> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Functional Pseudo Classes</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FunctionalPseudoClasses get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      FunctionalPseudoClasses result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Functional Pseudo Classes</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FunctionalPseudoClasses getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      FunctionalPseudoClasses result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Functional Pseudo Classes</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FunctionalPseudoClasses get(int value)
  {
    switch (value)
    {
      case NTH_CHILD_VALUE: return NTH_CHILD;
      case NTH_LAST_CHILD_VALUE: return NTH_LAST_CHILD;
      case NTH_OF_TYPE_VALUE: return NTH_OF_TYPE;
      case NTH_LAST_OF_TYPE_VALUE: return NTH_LAST_OF_TYPE;
      case FIRST_OF_TYPE_VALUE: return FIRST_OF_TYPE;
      case LAST_OF_TYPE_VALUE: return LAST_OF_TYPE;
      case ONLY_OF_TYPE_VALUE: return ONLY_OF_TYPE;
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
  private FunctionalPseudoClasses(int value, String name, String literal)
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
  
} //FunctionalPseudoClasses
