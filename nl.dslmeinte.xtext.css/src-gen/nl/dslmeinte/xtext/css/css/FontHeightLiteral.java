/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.css.css;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Font Height Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.css.css.FontHeightLiteral#getFontHeight <em>Font Height</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.css.css.FontHeightLiteral#getLineHeight <em>Line Height</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.css.css.FontHeightLiteral#getLineHeightDimension <em>Line Height Dimension</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.css.css.CssPackage#getFontHeightLiteral()
 * @model
 * @generated
 */
public interface FontHeightLiteral extends SizeLiteral
{
  /**
   * Returns the value of the '<em><b>Font Height</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Font Height</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Font Height</em>' containment reference.
   * @see #setFontHeight(SizeLiteral)
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getFontHeightLiteral_FontHeight()
   * @model containment="true"
   * @generated
   */
  SizeLiteral getFontHeight();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.css.css.FontHeightLiteral#getFontHeight <em>Font Height</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Font Height</em>' containment reference.
   * @see #getFontHeight()
   * @generated
   */
  void setFontHeight(SizeLiteral value);

  /**
   * Returns the value of the '<em><b>Line Height</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Line Height</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Line Height</em>' containment reference.
   * @see #setLineHeight(NumberLiteral)
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getFontHeightLiteral_LineHeight()
   * @model containment="true"
   * @generated
   */
  NumberLiteral getLineHeight();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.css.css.FontHeightLiteral#getLineHeight <em>Line Height</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Line Height</em>' containment reference.
   * @see #getLineHeight()
   * @generated
   */
  void setLineHeight(NumberLiteral value);

  /**
   * Returns the value of the '<em><b>Line Height Dimension</b></em>' attribute.
   * The literals are from the enumeration {@link nl.dslmeinte.xtext.css.css.Dimensions}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Line Height Dimension</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Line Height Dimension</em>' attribute.
   * @see nl.dslmeinte.xtext.css.css.Dimensions
   * @see #setLineHeightDimension(Dimensions)
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getFontHeightLiteral_LineHeightDimension()
   * @model
   * @generated
   */
  Dimensions getLineHeightDimension();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.css.css.FontHeightLiteral#getLineHeightDimension <em>Line Height Dimension</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Line Height Dimension</em>' attribute.
   * @see nl.dslmeinte.xtext.css.css.Dimensions
   * @see #getLineHeightDimension()
   * @generated
   */
  void setLineHeightDimension(Dimensions value);

} // FontHeightLiteral
