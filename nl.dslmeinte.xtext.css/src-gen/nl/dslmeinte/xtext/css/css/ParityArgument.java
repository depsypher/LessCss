/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.css.css;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parity Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.css.css.ParityArgument#getParity <em>Parity</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.css.css.CssPackage#getParityArgument()
 * @model
 * @generated
 */
public interface ParityArgument extends TypeArgument
{
  /**
   * Returns the value of the '<em><b>Parity</b></em>' attribute.
   * The literals are from the enumeration {@link nl.dslmeinte.xtext.css.css.Parities}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parity</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parity</em>' attribute.
   * @see nl.dslmeinte.xtext.css.css.Parities
   * @see #setParity(Parities)
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getParityArgument_Parity()
   * @model
   * @generated
   */
  Parities getParity();

  /**
   * Sets the value of the '{@link nl.dslmeinte.xtext.css.css.ParityArgument#getParity <em>Parity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parity</em>' attribute.
   * @see nl.dslmeinte.xtext.css.css.Parities
   * @see #getParity()
   * @generated
   */
  void setParity(Parities value);

} // ParityArgument
