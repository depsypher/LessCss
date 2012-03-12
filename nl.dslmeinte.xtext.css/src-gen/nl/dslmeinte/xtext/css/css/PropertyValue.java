/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.css.css;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.css.css.PropertyValue#getValue <em>Value</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.css.css.PropertyValue#isImportant <em>Important</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.css.css.CssPackage#getPropertyValue()
 * @model
 * @generated
 */
public interface PropertyValue extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(ValueLiteral)
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getPropertyValue_Value()
   * @model containment="true"
   * @generated
   */
  ValueLiteral getValue();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.css.css.PropertyValue#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(ValueLiteral value);

  /**
   * Returns the value of the '<em><b>Important</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Important</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Important</em>' attribute.
   * @see #setImportant(boolean)
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getPropertyValue_Important()
   * @model
   * @generated
   */
  boolean isImportant();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.css.css.PropertyValue#isImportant <em>Important</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Important</em>' attribute.
   * @see #isImportant()
   * @generated
   */
  void setImportant(boolean value);

} // PropertyValue
