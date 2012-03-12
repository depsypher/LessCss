/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.css.css;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.css.css.Attribute#getNamespacePrefix <em>Namespace Prefix</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.css.css.Attribute#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.css.css.CssPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject
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
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getAttribute_NamespacePrefix()
   * @model containment="true"
   * @generated
   */
  NamespacePrefix getNamespacePrefix();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.css.css.Attribute#getNamespacePrefix <em>Namespace Prefix</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Namespace Prefix</em>' containment reference.
   * @see #getNamespacePrefix()
   * @generated
   */
  void setNamespacePrefix(NamespacePrefix value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getAttribute_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.css.css.Attribute#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Attribute
