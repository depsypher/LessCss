/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.css.css;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decimal Attribute Value Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.css.css.DecimalAttributeValueLiteral#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.css.css.CssPackage#getDecimalAttributeValueLiteral()
 * @model
 * @generated
 */
public interface DecimalAttributeValueLiteral extends AttributeValueLiteral
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(double)
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getDecimalAttributeValueLiteral_Value()
   * @model
   * @generated
   */
  double getValue();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.css.css.DecimalAttributeValueLiteral#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(double value);

} // DecimalAttributeValueLiteral
