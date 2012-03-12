/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.css.css;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.css.css.RuleSet#getSelectors <em>Selectors</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.css.css.RuleSet#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.css.css.CssPackage#getRuleSet()
 * @model
 * @generated
 */
public interface RuleSet extends CSSTopLevelStatement, MediaDeclarationMembers
{
  /**
   * Returns the value of the '<em><b>Selectors</b></em>' containment reference list.
   * The list contents are of type {@link nl.dslmeinte.xtext.css.css.Selector}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selectors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selectors</em>' containment reference list.
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getRuleSet_Selectors()
   * @model containment="true"
   * @generated
   */
  EList<Selector> getSelectors();

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(RuleSetBody)
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getRuleSet_Body()
   * @model containment="true"
   * @generated
   */
  RuleSetBody getBody();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.css.css.RuleSet#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(RuleSetBody value);

} // RuleSet
