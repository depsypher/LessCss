/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.css.css;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Known Property Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.css.css.KnownPropertyDeclaration#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.css.css.CssPackage#getKnownPropertyDeclaration()
 * @model
 * @generated
 */
public interface KnownPropertyDeclaration extends PropertyDeclaration
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * The literals are from the enumeration {@link nl.dslmeinte.xtext.css.css.KnownProperties}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see nl.dslmeinte.xtext.css.css.KnownProperties
   * @see #setName(KnownProperties)
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getKnownPropertyDeclaration_Name()
   * @model
   * @generated
   */
  KnownProperties getName();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.css.css.KnownPropertyDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see nl.dslmeinte.xtext.css.css.KnownProperties
   * @see #getName()
   * @generated
   */
  void setName(KnownProperties value);

} // KnownPropertyDeclaration
