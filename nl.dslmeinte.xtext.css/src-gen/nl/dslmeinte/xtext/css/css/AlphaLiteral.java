/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.css.css;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alpha Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.css.css.AlphaLiteral#getOpacity <em>Opacity</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.css.css.CssPackage#getAlphaLiteral()
 * @model
 * @generated
 */
public interface AlphaLiteral extends FunctionCallLiteral
{
  /**
   * Returns the value of the '<em><b>Opacity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Opacity</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Opacity</em>' containment reference.
   * @see #setOpacity(NumberLiteral)
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getAlphaLiteral_Opacity()
   * @model containment="true"
   * @generated
   */
  NumberLiteral getOpacity();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.css.css.AlphaLiteral#getOpacity <em>Opacity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Opacity</em>' containment reference.
   * @see #getOpacity()
   * @generated
   */
  void setOpacity(NumberLiteral value);

} // AlphaLiteral
