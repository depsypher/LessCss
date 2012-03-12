/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.css.css;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pseudo Element Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.css.css.PseudoElementSelector#isDoubleSemiColon <em>Double Semi Colon</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.css.css.PseudoElementSelector#getPseudo <em>Pseudo</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.css.css.CssPackage#getPseudoElementSelector()
 * @model
 * @generated
 */
public interface PseudoElementSelector extends PseudoSelector
{
  /**
   * Returns the value of the '<em><b>Double Semi Colon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Double Semi Colon</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Double Semi Colon</em>' attribute.
   * @see #setDoubleSemiColon(boolean)
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getPseudoElementSelector_DoubleSemiColon()
   * @model
   * @generated
   */
  boolean isDoubleSemiColon();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.css.css.PseudoElementSelector#isDoubleSemiColon <em>Double Semi Colon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Double Semi Colon</em>' attribute.
   * @see #isDoubleSemiColon()
   * @generated
   */
  void setDoubleSemiColon(boolean value);

  /**
   * Returns the value of the '<em><b>Pseudo</b></em>' attribute.
   * The literals are from the enumeration {@link nl.dslmeinte.xtext.css.css.PseudoElements}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pseudo</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pseudo</em>' attribute.
   * @see nl.dslmeinte.xtext.css.css.PseudoElements
   * @see #setPseudo(PseudoElements)
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getPseudoElementSelector_Pseudo()
   * @model
   * @generated
   */
  PseudoElements getPseudo();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.css.css.PseudoElementSelector#getPseudo <em>Pseudo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pseudo</em>' attribute.
   * @see nl.dslmeinte.xtext.css.css.PseudoElements
   * @see #getPseudo()
   * @generated
   */
  void setPseudo(PseudoElements value);

} // PseudoElementSelector
