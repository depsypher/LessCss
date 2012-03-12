/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.css.css;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Values Lists</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.css.css.PropertyValuesLists#getLists <em>Lists</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.css.css.CssPackage#getPropertyValuesLists()
 * @model
 * @generated
 */
public interface PropertyValuesLists extends EObject
{
  /**
   * Returns the value of the '<em><b>Lists</b></em>' containment reference list.
   * The list contents are of type {@link nl.dslmeinte.xtext.css.css.PropertyValuesList}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lists</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lists</em>' containment reference list.
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getPropertyValuesLists_Lists()
   * @model containment="true"
   * @generated
   */
  EList<PropertyValuesList> getLists();

} // PropertyValuesLists
