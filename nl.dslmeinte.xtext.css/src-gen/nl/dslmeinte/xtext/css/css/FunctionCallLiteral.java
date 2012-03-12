/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.css.css;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Call Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.css.css.FunctionCallLiteral#getFunction <em>Function</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.css.css.FunctionCallLiteral#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.css.css.CssPackage#getFunctionCallLiteral()
 * @model
 * @generated
 */
public interface FunctionCallLiteral extends ValueLiteral
{
  /**
   * Returns the value of the '<em><b>Function</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function</em>' attribute.
   * @see #setFunction(String)
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getFunctionCallLiteral_Function()
   * @model
   * @generated
   */
  String getFunction();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.css.css.FunctionCallLiteral#getFunction <em>Function</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function</em>' attribute.
   * @see #getFunction()
   * @generated
   */
  void setFunction(String value);

  /**
   * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
   * The list contents are of type {@link nl.dslmeinte.xtext.css.css.ValueLiteral}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arguments</em>' containment reference list.
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getFunctionCallLiteral_Arguments()
   * @model containment="true"
   * @generated
   */
  EList<ValueLiteral> getArguments();

} // FunctionCallLiteral
