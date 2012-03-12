/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.css.css;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>General Sibling Combinator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.css.css.GeneralSiblingCombinator#getLeft <em>Left</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.css.css.GeneralSiblingCombinator#getWsL <em>Ws L</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.css.css.GeneralSiblingCombinator#getWsR <em>Ws R</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.css.css.GeneralSiblingCombinator#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.css.css.CssPackage#getGeneralSiblingCombinator()
 * @model
 * @generated
 */
public interface GeneralSiblingCombinator extends Selector
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
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getGeneralSiblingCombinator_Left()
   * @model containment="true"
   * @generated
   */
  Selector getLeft();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.css.css.GeneralSiblingCombinator#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Selector value);

  /**
   * Returns the value of the '<em><b>Ws L</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ws L</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ws L</em>' attribute.
   * @see #setWsL(String)
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getGeneralSiblingCombinator_WsL()
   * @model
   * @generated
   */
  String getWsL();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.css.css.GeneralSiblingCombinator#getWsL <em>Ws L</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ws L</em>' attribute.
   * @see #getWsL()
   * @generated
   */
  void setWsL(String value);

  /**
   * Returns the value of the '<em><b>Ws R</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ws R</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ws R</em>' attribute.
   * @see #setWsR(String)
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getGeneralSiblingCombinator_WsR()
   * @model
   * @generated
   */
  String getWsR();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.css.css.GeneralSiblingCombinator#getWsR <em>Ws R</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ws R</em>' attribute.
   * @see #getWsR()
   * @generated
   */
  void setWsR(String value);

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
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getGeneralSiblingCombinator_Right()
   * @model containment="true"
   * @generated
   */
  Selector getRight();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.css.css.GeneralSiblingCombinator#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Selector value);

} // GeneralSiblingCombinator
