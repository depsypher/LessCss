/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.css.css;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.css.css.PropertyDeclaration#getValuesLists <em>Values Lists</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.css.css.CssPackage#getPropertyDeclaration()
 * @model
 * @generated
 */
public interface PropertyDeclaration extends MediaDeclarationMembers
{
  /**
   * Returns the value of the '<em><b>Values Lists</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values Lists</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values Lists</em>' containment reference.
   * @see #setValuesLists(PropertyValuesLists)
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getPropertyDeclaration_ValuesLists()
   * @model containment="true"
   * @generated
   */
  PropertyValuesLists getValuesLists();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.css.css.PropertyDeclaration#getValuesLists <em>Values Lists</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Values Lists</em>' containment reference.
   * @see #getValuesLists()
   * @generated
   */
  void setValuesLists(PropertyValuesLists value);

} // PropertyDeclaration
