/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.css.css;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Namespace Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.css.css.NamespaceDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.css.css.NamespaceDeclaration#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.css.css.CssPackage#getNamespaceDeclaration()
 * @model
 * @generated
 */
public interface NamespaceDeclaration extends CSSOtherTopLevelDeclaration
{
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
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getNamespaceDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.css.css.NamespaceDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Url</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Url</em>' attribute.
   * @see #setUrl(String)
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getNamespaceDeclaration_Url()
   * @model
   * @generated
   */
  String getUrl();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.css.css.NamespaceDeclaration#getUrl <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Url</em>' attribute.
   * @see #getUrl()
   * @generated
   */
  void setUrl(String value);

} // NamespaceDeclaration
