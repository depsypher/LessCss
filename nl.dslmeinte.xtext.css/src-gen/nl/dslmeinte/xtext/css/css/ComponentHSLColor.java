/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.css.css;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component HSL Color</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.css.css.ComponentHSLColor#getHue <em>Hue</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.css.css.ComponentHSLColor#getSaturation <em>Saturation</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.css.css.ComponentHSLColor#getLightness <em>Lightness</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.css.css.CssPackage#getComponentHSLColor()
 * @model
 * @generated
 */
public interface ComponentHSLColor extends ComponentColorLiteral
{
  /**
   * Returns the value of the '<em><b>Hue</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hue</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hue</em>' containment reference.
   * @see #setHue(ColorComponentLiteral)
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getComponentHSLColor_Hue()
   * @model containment="true"
   * @generated
   */
  ColorComponentLiteral getHue();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.css.css.ComponentHSLColor#getHue <em>Hue</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hue</em>' containment reference.
   * @see #getHue()
   * @generated
   */
  void setHue(ColorComponentLiteral value);

  /**
   * Returns the value of the '<em><b>Saturation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Saturation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Saturation</em>' containment reference.
   * @see #setSaturation(ColorComponentLiteral)
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getComponentHSLColor_Saturation()
   * @model containment="true"
   * @generated
   */
  ColorComponentLiteral getSaturation();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.css.css.ComponentHSLColor#getSaturation <em>Saturation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Saturation</em>' containment reference.
   * @see #getSaturation()
   * @generated
   */
  void setSaturation(ColorComponentLiteral value);

  /**
   * Returns the value of the '<em><b>Lightness</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lightness</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lightness</em>' containment reference.
   * @see #setLightness(ColorComponentLiteral)
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getComponentHSLColor_Lightness()
   * @model containment="true"
   * @generated
   */
  ColorComponentLiteral getLightness();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.css.css.ComponentHSLColor#getLightness <em>Lightness</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lightness</em>' containment reference.
   * @see #getLightness()
   * @generated
   */
  void setLightness(ColorComponentLiteral value);

} // ComponentHSLColor
