/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.css.css;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Descendant Combinator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.css.css.DescendantCombinator#getLeft <em>Left</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.css.css.DescendantCombinator#getWsI <em>Ws I</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.css.css.DescendantCombinator#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.css.css.CssPackage#getDescendantCombinator()
 * @model
 * @generated
 */
public interface DescendantCombinator extends Selector
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Selector)
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getDescendantCombinator_Left()
   * @model containment="true"
   * @generated
   */
  Selector getLeft();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.css.css.DescendantCombinator#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Selector value);

  /**
   * Returns the value of the '<em><b>Ws I</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ws I</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ws I</em>' attribute.
   * @see #setWsI(String)
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getDescendantCombinator_WsI()
   * @model
   * @generated
   */
  String getWsI();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.css.css.DescendantCombinator#getWsI <em>Ws I</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ws I</em>' attribute.
   * @see #getWsI()
   * @generated
   */
  void setWsI(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Selector)
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getDescendantCombinator_Right()
   * @model containment="true"
   * @generated
   */
  Selector getRight();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.css.css.DescendantCombinator#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Selector value);

} // DescendantCombinator
