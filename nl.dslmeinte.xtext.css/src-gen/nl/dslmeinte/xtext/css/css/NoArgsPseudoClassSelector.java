/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.css.css;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>No Args Pseudo Class Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.css.css.NoArgsPseudoClassSelector#getPseudo <em>Pseudo</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.css.css.CssPackage#getNoArgsPseudoClassSelector()
 * @model
 * @generated
 */
public interface NoArgsPseudoClassSelector extends PseudoSelector
{
  /**
   * Returns the value of the '<em><b>Pseudo</b></em>' attribute.
   * The literals are from the enumeration {@link nl.dslmeinte.xtext.css.css.NoArgsPseudos}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pseudo</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pseudo</em>' attribute.
   * @see nl.dslmeinte.xtext.css.css.NoArgsPseudos
   * @see #setPseudo(NoArgsPseudos)
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getNoArgsPseudoClassSelector_Pseudo()
   * @model
   * @generated
   */
  NoArgsPseudos getPseudo();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.css.css.NoArgsPseudoClassSelector#getPseudo <em>Pseudo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pseudo</em>' attribute.
   * @see nl.dslmeinte.xtext.css.css.NoArgsPseudos
   * @see #getPseudo()
   * @generated
   */
  void setPseudo(NoArgsPseudos value);

} // NoArgsPseudoClassSelector
