/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.css.css;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Universal Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.css.css.UniversalSelector#getNamespacePrefix <em>Namespace Prefix</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.css.css.CssPackage#getUniversalSelector()
 * @model
 * @generated
 */
public interface UniversalSelector extends SimpleSelector
{
  /**
   * Returns the value of the '<em><b>Namespace Prefix</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Namespace Prefix</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Namespace Prefix</em>' containment reference.
   * @see #setNamespacePrefix(NamespacePrefix)
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getUniversalSelector_NamespacePrefix()
   * @model containment="true"
   * @generated
   */
  NamespacePrefix getNamespacePrefix();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.css.css.UniversalSelector#getNamespacePrefix <em>Namespace Prefix</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Namespace Prefix</em>' containment reference.
   * @see #getNamespacePrefix()
   * @generated
   */
  void setNamespacePrefix(NamespacePrefix value);

} // UniversalSelector
