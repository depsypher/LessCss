/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.css.css;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Pseudo Class Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.css.css.FunctionalPseudoClassSelector#getPseudo <em>Pseudo</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.css.css.FunctionalPseudoClassSelector#getArgument <em>Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.css.css.CssPackage#getFunctionalPseudoClassSelector()
 * @model
 * @generated
 */
public interface FunctionalPseudoClassSelector extends PseudoSelector
{
  /**
   * Returns the value of the '<em><b>Pseudo</b></em>' attribute.
   * The literals are from the enumeration {@link nl.dslmeinte.xtext.css.css.FunctionalPseudoClasses}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pseudo</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pseudo</em>' attribute.
   * @see nl.dslmeinte.xtext.css.css.FunctionalPseudoClasses
   * @see #setPseudo(FunctionalPseudoClasses)
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getFunctionalPseudoClassSelector_Pseudo()
   * @model
   * @generated
   */
  FunctionalPseudoClasses getPseudo();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.css.css.FunctionalPseudoClassSelector#getPseudo <em>Pseudo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pseudo</em>' attribute.
   * @see nl.dslmeinte.xtext.css.css.FunctionalPseudoClasses
   * @see #getPseudo()
   * @generated
   */
  void setPseudo(FunctionalPseudoClasses value);

  /**
   * Returns the value of the '<em><b>Argument</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Argument</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Argument</em>' containment reference.
   * @see #setArgument(TypeArgument)
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getFunctionalPseudoClassSelector_Argument()
   * @model containment="true"
   * @generated
   */
  TypeArgument getArgument();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.css.css.FunctionalPseudoClassSelector#getArgument <em>Argument</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Argument</em>' containment reference.
   * @see #getArgument()
   * @generated
   */
  void setArgument(TypeArgument value);

} // FunctionalPseudoClassSelector
