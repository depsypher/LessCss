/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.css.css;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Selector Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.css.css.SimpleSelectorSequence#getHead <em>Head</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.css.css.SimpleSelectorSequence#getSimpleSelectors <em>Simple Selectors</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.css.css.CssPackage#getSimpleSelectorSequence()
 * @model
 * @generated
 */
public interface SimpleSelectorSequence extends Selector
{
  /**
   * Returns the value of the '<em><b>Head</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Head</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Head</em>' containment reference.
   * @see #setHead(SimpleSelector)
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getSimpleSelectorSequence_Head()
   * @model containment="true"
   * @generated
   */
  SimpleSelector getHead();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.css.css.SimpleSelectorSequence#getHead <em>Head</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Head</em>' containment reference.
   * @see #getHead()
   * @generated
   */
  void setHead(SimpleSelector value);

  /**
   * Returns the value of the '<em><b>Simple Selectors</b></em>' containment reference list.
   * The list contents are of type {@link nl.dslmeinte.xtext.css.css.SimpleSelector}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Simple Selectors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Simple Selectors</em>' containment reference list.
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getSimpleSelectorSequence_SimpleSelectors()
   * @model containment="true"
   * @generated
   */
  EList<SimpleSelector> getSimpleSelectors();

} // SimpleSelectorSequence
