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
 * A representation of the model object '<em><b>Media Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.css.css.MediaQuery#isOnly <em>Only</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.css.css.MediaQuery#isNot <em>Not</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.css.css.MediaQuery#getMediaType <em>Media Type</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.css.css.MediaQuery#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.css.css.CssPackage#getMediaQuery()
 * @model
 * @generated
 */
public interface MediaQuery extends EObject
{
  /**
   * Returns the value of the '<em><b>Only</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Only</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Only</em>' attribute.
   * @see #setOnly(boolean)
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getMediaQuery_Only()
   * @model
   * @generated
   */
  boolean isOnly();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.css.css.MediaQuery#isOnly <em>Only</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Only</em>' attribute.
   * @see #isOnly()
   * @generated
   */
  void setOnly(boolean value);

  /**
   * Returns the value of the '<em><b>Not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Not</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Not</em>' attribute.
   * @see #setNot(boolean)
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getMediaQuery_Not()
   * @model
   * @generated
   */
  boolean isNot();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.css.css.MediaQuery#isNot <em>Not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Not</em>' attribute.
   * @see #isNot()
   * @generated
   */
  void setNot(boolean value);

  /**
   * Returns the value of the '<em><b>Media Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Media Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Media Type</em>' attribute.
   * @see #setMediaType(String)
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getMediaQuery_MediaType()
   * @model
   * @generated
   */
  String getMediaType();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.css.css.MediaQuery#getMediaType <em>Media Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Media Type</em>' attribute.
   * @see #getMediaType()
   * @generated
   */
  void setMediaType(String value);

  /**
   * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
   * The list contents are of type {@link nl.dslmeinte.xtext.css.css.MediaQueryExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressions</em>' containment reference list.
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getMediaQuery_Expressions()
   * @model containment="true"
   * @generated
   */
  EList<MediaQueryExpression> getExpressions();

} // MediaQuery
