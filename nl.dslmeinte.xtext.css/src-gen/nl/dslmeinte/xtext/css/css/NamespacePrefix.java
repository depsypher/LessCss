/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.css.css;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Namespace Prefix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.css.css.NamespacePrefix#getNamespace <em>Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.css.css.CssPackage#getNamespacePrefix()
 * @model
 * @generated
 */
public interface NamespacePrefix extends EObject
{
  /**
   * Returns the value of the '<em><b>Namespace</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Namespace</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Namespace</em>' reference.
   * @see #setNamespace(NamespaceDeclaration)
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getNamespacePrefix_Namespace()
   * @model
   * @generated
   */
  NamespaceDeclaration getNamespace();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.css.css.NamespacePrefix#getNamespace <em>Namespace</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Namespace</em>' reference.
   * @see #getNamespace()
   * @generated
   */
  void setNamespace(NamespaceDeclaration value);

} // NamespacePrefix
