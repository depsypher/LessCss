/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.css.css;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linear Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.css.css.LinearArgument#getCoefficient <em>Coefficient</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.css.css.LinearArgument#getConstantSign <em>Constant Sign</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.css.css.LinearArgument#getConstant <em>Constant</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.css.css.CssPackage#getLinearArgument()
 * @model
 * @generated
 */
public interface LinearArgument extends TypeArgument
{
  /**
   * Returns the value of the '<em><b>Coefficient</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Coefficient</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Coefficient</em>' containment reference.
   * @see #setCoefficient(Coefficient)
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getLinearArgument_Coefficient()
   * @model containment="true"
   * @generated
   */
  Coefficient getCoefficient();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.css.css.LinearArgument#getCoefficient <em>Coefficient</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Coefficient</em>' containment reference.
   * @see #getCoefficient()
   * @generated
   */
  void setCoefficient(Coefficient value);

  /**
   * Returns the value of the '<em><b>Constant Sign</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constant Sign</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constant Sign</em>' attribute.
   * @see #setConstantSign(String)
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getLinearArgument_ConstantSign()
   * @model
   * @generated
   */
  String getConstantSign();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.css.css.LinearArgument#getConstantSign <em>Constant Sign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constant Sign</em>' attribute.
   * @see #getConstantSign()
   * @generated
   */
  void setConstantSign(String value);

  /**
   * Returns the value of the '<em><b>Constant</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constant</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constant</em>' attribute.
   * @see #setConstant(int)
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getLinearArgument_Constant()
   * @model
   * @generated
   */
  int getConstant();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.css.css.LinearArgument#getConstant <em>Constant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constant</em>' attribute.
   * @see #getConstant()
   * @generated
   */
  void setConstant(int value);

} // LinearArgument
