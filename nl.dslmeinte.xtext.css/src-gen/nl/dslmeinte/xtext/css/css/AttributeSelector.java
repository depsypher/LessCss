/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.css.css;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.css.css.AttributeSelector#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.css.css.AttributeSelector#getMatcher <em>Matcher</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.css.css.AttributeSelector#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.css.css.CssPackage#getAttributeSelector()
 * @model
 * @generated
 */
public interface AttributeSelector extends SimpleSelector
{
  /**
   * Returns the value of the '<em><b>Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' containment reference.
   * @see #setAttribute(Attribute)
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getAttributeSelector_Attribute()
   * @model containment="true"
   * @generated
   */
  Attribute getAttribute();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.css.css.AttributeSelector#getAttribute <em>Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute</em>' containment reference.
   * @see #getAttribute()
   * @generated
   */
  void setAttribute(Attribute value);

  /**
   * Returns the value of the '<em><b>Matcher</b></em>' attribute.
   * The literals are from the enumeration {@link nl.dslmeinte.xtext.css.css.AttributeSelectorMatchers}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Matcher</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Matcher</em>' attribute.
   * @see nl.dslmeinte.xtext.css.css.AttributeSelectorMatchers
   * @see #setMatcher(AttributeSelectorMatchers)
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getAttributeSelector_Matcher()
   * @model
   * @generated
   */
  AttributeSelectorMatchers getMatcher();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.css.css.AttributeSelector#getMatcher <em>Matcher</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Matcher</em>' attribute.
   * @see nl.dslmeinte.xtext.css.css.AttributeSelectorMatchers
   * @see #getMatcher()
   * @generated
   */
  void setMatcher(AttributeSelectorMatchers value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(AttributeValueLiteral)
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getAttributeSelector_Value()
   * @model containment="true"
   * @generated
   */
  AttributeValueLiteral getValue();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.css.css.AttributeSelector#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(AttributeValueLiteral value);

} // AttributeSelector
