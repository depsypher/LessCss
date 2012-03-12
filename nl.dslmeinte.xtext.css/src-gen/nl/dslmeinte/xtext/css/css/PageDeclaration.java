/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.css.css;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.css.css.PageDeclaration#getPseudoPage <em>Pseudo Page</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.css.css.PageDeclaration#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.css.css.CssPackage#getPageDeclaration()
 * @model
 * @generated
 */
public interface PageDeclaration extends CSSOtherTopLevelDeclaration
{
  /**
   * Returns the value of the '<em><b>Pseudo Page</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pseudo Page</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pseudo Page</em>' attribute.
   * @see #setPseudoPage(String)
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getPageDeclaration_PseudoPage()
   * @model
   * @generated
   */
  String getPseudoPage();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.css.css.PageDeclaration#getPseudoPage <em>Pseudo Page</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pseudo Page</em>' attribute.
   * @see #getPseudoPage()
   * @generated
   */
  void setPseudoPage(String value);

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
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getPageDeclaration_Body()
   * @model containment="true"
   * @generated
   */
  RuleSetBody getBody();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.css.css.PageDeclaration#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(RuleSetBody value);

} // PageDeclaration
