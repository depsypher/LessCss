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
 * A representation of the literals of the enumeration '<em><b>Dimensions</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see nl.dslmeinte.xtext.css.css.CssPackage#getDimensions()
 * @model
 * @generated
 */
public enum Dimensions implements Enumerator
{
  /**
   * The '<em><b>In</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #IN_VALUE
   * @generated
   * @ordered
   */
  IN(0, "in", "in"),

  /**
   * The '<em><b>Cm</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CM_VALUE
   * @generated
   * @ordered
   */
  CM(1, "cm", "cm"),

  /**
   * The '<em><b>Mm</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MM_VALUE
   * @generated
   * @ordered
   */
  MM(2, "mm", "mm"),

  /**
   * The '<em><b>Pt</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PT_VALUE
   * @generated
   * @ordered
   */
  PT(3, "pt", "pt"),

  /**
   * The '<em><b>Pc</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PC_VALUE
   * @generated
   * @ordered
   */
  PC(4, "pc", "pc"),

  /**
   * The '<em><b>Em</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EM_VALUE
   * @generated
   * @ordered
   */
  EM(5, "em", "em"),

  /**
   * The '<em><b>Ex</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EX_VALUE
   * @generated
   * @ordered
   */
  EX(6, "ex", "ex"),

  /**
   * The '<em><b>Px</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PX_VALUE
   * @generated
   * @ordered
   */
  PX(7, "px", "px"),

  /**
   * The '<em><b>Perc</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PERC_VALUE
   * @generated
   * @ordered
   */
  PERC(8, "perc", "%");

  /**
   * The '<em><b>In</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>In</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #IN
   * @model name="in"
   * @generated
   * @ordered
   */
  public static final int IN_VALUE = 0;

  /**
   * The '<em><b>Cm</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Cm</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CM
   * @model name="cm"
   * @generated
   * @ordered
   */
  public static final int CM_VALUE = 1;

  /**
   * The '<em><b>Mm</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Mm</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MM
   * @model name="mm"
   * @generated
   * @ordered
   */
  public static final int MM_VALUE = 2;

  /**
   * The '<em><b>Pt</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Pt</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PT
   * @model name="pt"
   * @generated
   * @ordered
   */
  public static final int PT_VALUE = 3;

  /**
   * The '<em><b>Pc</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Pc</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PC
   * @model name="pc"
   * @generated
   * @ordered
   */
  public static final int PC_VALUE = 4;

  /**
   * The '<em><b>Em</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Em</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EM
   * @model name="em"
   * @generated
   * @ordered
   */
  public static final int EM_VALUE = 5;

  /**
   * The '<em><b>Ex</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Ex</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EX
   * @model name="ex"
   * @generated
   * @ordered
   */
  public static final int EX_VALUE = 6;

  /**
   * The '<em><b>Px</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Px</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PX
   * @model name="px"
   * @generated
   * @ordered
   */
  public static final int PX_VALUE = 7;

  /**
   * The '<em><b>Perc</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Perc</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PERC
   * @model name="perc" literal="%"
   * @generated
   * @ordered
   */
  public static final int PERC_VALUE = 8;

  /**
   * An array of all the '<em><b>Dimensions</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Dimensions[] VALUES_ARRAY =
    new Dimensions[]
    {
      IN,
      CM,
      MM,
      PT,
      PC,
      EM,
      EX,
      PX,
      PERC,
    };

  /**
   * A public read-only list of all the '<em><b>Dimensions</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Dimensions> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Dimensions</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Dimensions get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Dimensions result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Dimensions</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Dimensions getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Dimensions result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Dimensions</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Dimensions get(int value)
  {
    switch (value)
    {
      case IN_VALUE: return IN;
      case CM_VALUE: return CM;
      case MM_VALUE: return MM;
      case PT_VALUE: return PT;
      case PC_VALUE: return PC;
      case EM_VALUE: return EM;
      case EX_VALUE: return EX;
      case PX_VALUE: return PX;
      case PERC_VALUE: return PERC;
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
  private Dimensions(int value, String name, String literal)
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
  
} //Dimensions
