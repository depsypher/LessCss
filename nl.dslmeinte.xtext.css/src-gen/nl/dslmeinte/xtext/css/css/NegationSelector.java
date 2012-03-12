/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.css.css;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Negation Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.css.css.NegationSelector#getSimpleSelector <em>Simple Selector</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.css.css.CssPackage#getNegationSelector()
 * @model
 * @generated
 */
public interface NegationSelector extends SimpleSelector
{
  /**
   * Returns the value of the '<em><b>Simple Selector</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Simple Selector</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Simple Selector</em>' containment reference.
   * @see #setSimpleSelector(SimpleSelector)
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getNegationSelector_SimpleSelector()
   * @model containment="true"
   * @generated
   */
  SimpleSelector getSimpleSelector();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.css.css.NegationSelector#getSimpleSelector <em>Simple Selector</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Simple Selector</em>' containment reference.
   * @see #getSimpleSelector()
   * @generated
   */
  void setSimpleSelector(SimpleSelector value);

} // NegationSelector
