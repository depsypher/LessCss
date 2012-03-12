/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.css.css;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Color</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.css.css.NamedColor#getColor <em>Color</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.css.css.CssPackage#getNamedColor()
 * @model
 * @generated
 */
public interface NamedColor extends ColorLiteral
{
  /**
   * Returns the value of the '<em><b>Color</b></em>' attribute.
   * The literals are from the enumeration {@link nl.dslmeinte.xtext.css.css.ColorNames}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Color</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Color</em>' attribute.
   * @see nl.dslmeinte.xtext.css.css.ColorNames
   * @see #setColor(ColorNames)
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getNamedColor_Color()
   * @model
   * @generated
   */
  ColorNames getColor();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.css.css.NamedColor#getColor <em>Color</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color</em>' attribute.
   * @see nl.dslmeinte.xtext.css.css.ColorNames
   * @see #getColor()
   * @generated
   */
  void setColor(ColorNames value);

} // NamedColor
