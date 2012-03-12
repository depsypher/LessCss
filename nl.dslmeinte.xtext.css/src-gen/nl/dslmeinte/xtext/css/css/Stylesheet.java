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
 * A representation of the model object '<em><b>Stylesheet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.css.css.Stylesheet#getCharSet <em>Char Set</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.css.css.Stylesheet#getImports <em>Imports</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.css.css.Stylesheet#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.css.css.CssPackage#getStylesheet()
 * @model
 * @generated
 */
public interface Stylesheet extends EObject
{
  /**
   * Returns the value of the '<em><b>Char Set</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Char Set</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Char Set</em>' attribute.
   * @see #setCharSet(String)
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getStylesheet_CharSet()
   * @model
   * @generated
   */
  String getCharSet();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.css.css.Stylesheet#getCharSet <em>Char Set</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Char Set</em>' attribute.
   * @see #getCharSet()
   * @generated
   */
  void setCharSet(String value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link nl.dslmeinte.xtext.css.css.ImportDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getStylesheet_Imports()
   * @model containment="true"
   * @generated
   */
  EList<ImportDeclaration> getImports();

  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link nl.dslmeinte.xtext.css.css.CSSTopLevelStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getStylesheet_Statements()
   * @model containment="true"
   * @generated
   */
  EList<CSSTopLevelStatement> getStatements();

} // Stylesheet
