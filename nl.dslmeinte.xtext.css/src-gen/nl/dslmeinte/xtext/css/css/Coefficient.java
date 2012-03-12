/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.css.css;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coefficient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.css.css.Coefficient#getIdent <em>Ident</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.css.css.Coefficient#getInt <em>Int</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.css.css.CssPackage#getCoefficient()
 * @model
 * @generated
 */
public interface Coefficient extends EObject
{
  /**
   * Returns the value of the '<em><b>Ident</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ident</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ident</em>' attribute.
   * @see #setIdent(String)
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getCoefficient_Ident()
   * @model
   * @generated
   */
  String getIdent();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.css.css.Coefficient#getIdent <em>Ident</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ident</em>' attribute.
   * @see #getIdent()
   * @generated
   */
  void setIdent(String value);

  /**
   * Returns the value of the '<em><b>Int</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int</em>' attribute.
   * @see #setInt(int)
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getCoefficient_Int()
   * @model
   * @generated
   */
  int getInt();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.css.css.Coefficient#getInt <em>Int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int</em>' attribute.
   * @see #getInt()
   * @generated
   */
  void setInt(int value);

} // Coefficient
