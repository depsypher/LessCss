/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.css.css;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Color Component Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.css.css.ColorComponentLiteral#getNumber <em>Number</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.css.css.ColorComponentLiteral#isPercentage <em>Percentage</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.css.css.CssPackage#getColorComponentLiteral()
 * @model
 * @generated
 */
public interface ColorComponentLiteral extends EObject
{
  /**
   * Returns the value of the '<em><b>Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Number</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number</em>' containment reference.
   * @see #setNumber(NumberLiteral)
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getColorComponentLiteral_Number()
   * @model containment="true"
   * @generated
   */
  NumberLiteral getNumber();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.css.css.ColorComponentLiteral#getNumber <em>Number</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number</em>' containment reference.
   * @see #getNumber()
   * @generated
   */
  void setNumber(NumberLiteral value);

  /**
   * Returns the value of the '<em><b>Percentage</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Percentage</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Percentage</em>' attribute.
   * @see #setPercentage(boolean)
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getColorComponentLiteral_Percentage()
   * @model
   * @generated
   */
  boolean isPercentage();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.css.css.ColorComponentLiteral#isPercentage <em>Percentage</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Percentage</em>' attribute.
   * @see #isPercentage()
   * @generated
   */
  void setPercentage(boolean value);

} // ColorComponentLiteral
