/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.css.css;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decimal Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.css.css.DecimalLiteral#getDecimal <em>Decimal</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.css.css.CssPackage#getDecimalLiteral()
 * @model
 * @generated
 */
public interface DecimalLiteral extends NumberLiteral
{
  /**
   * Returns the value of the '<em><b>Decimal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Decimal</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Decimal</em>' attribute.
   * @see #setDecimal(double)
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getDecimalLiteral_Decimal()
   * @model
   * @generated
   */
  double getDecimal();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.css.css.DecimalLiteral#getDecimal <em>Decimal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Decimal</em>' attribute.
   * @see #getDecimal()
   * @generated
   */
  void setDecimal(double value);

} // DecimalLiteral
