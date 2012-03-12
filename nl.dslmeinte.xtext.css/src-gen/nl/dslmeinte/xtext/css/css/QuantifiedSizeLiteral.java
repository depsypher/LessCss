/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.css.css;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantified Size Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.css.css.QuantifiedSizeLiteral#getNumber <em>Number</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.css.css.QuantifiedSizeLiteral#getDimension <em>Dimension</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.css.css.CssPackage#getQuantifiedSizeLiteral()
 * @model
 * @generated
 */
public interface QuantifiedSizeLiteral extends SizeLiteral
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
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getQuantifiedSizeLiteral_Number()
   * @model containment="true"
   * @generated
   */
  NumberLiteral getNumber();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.css.css.QuantifiedSizeLiteral#getNumber <em>Number</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number</em>' containment reference.
   * @see #getNumber()
   * @generated
   */
  void setNumber(NumberLiteral value);

  /**
   * Returns the value of the '<em><b>Dimension</b></em>' attribute.
   * The literals are from the enumeration {@link nl.dslmeinte.xtext.css.css.Dimensions}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dimension</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dimension</em>' attribute.
   * @see nl.dslmeinte.xtext.css.css.Dimensions
   * @see #setDimension(Dimensions)
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getQuantifiedSizeLiteral_Dimension()
   * @model
   * @generated
   */
  Dimensions getDimension();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.css.css.QuantifiedSizeLiteral#getDimension <em>Dimension</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dimension</em>' attribute.
   * @see nl.dslmeinte.xtext.css.css.Dimensions
   * @see #getDimension()
   * @generated
   */
  void setDimension(Dimensions value);

} // QuantifiedSizeLiteral
