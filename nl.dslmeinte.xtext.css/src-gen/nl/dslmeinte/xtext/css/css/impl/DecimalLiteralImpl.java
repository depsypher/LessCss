/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.css.css.impl;

import nl.dslmeinte.xtext.css.css.CssPackage;
import nl.dslmeinte.xtext.css.css.DecimalLiteral;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decimal Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.css.css.impl.DecimalLiteralImpl#getDecimal <em>Decimal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DecimalLiteralImpl extends NumberLiteralImpl implements DecimalLiteral
{
  /**
   * The default value of the '{@link #getDecimal() <em>Decimal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecimal()
   * @generated
   * @ordered
   */
  protected static final double DECIMAL_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getDecimal() <em>Decimal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecimal()
   * @generated
   * @ordered
   */
  protected double decimal = DECIMAL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DecimalLiteralImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CssPackage.Literals.DECIMAL_LITERAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getDecimal()
  {
    return decimal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDecimal(double newDecimal)
  {
    double oldDecimal = decimal;
    decimal = newDecimal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssPackage.DECIMAL_LITERAL__DECIMAL, oldDecimal, decimal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CssPackage.DECIMAL_LITERAL__DECIMAL:
        return getDecimal();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CssPackage.DECIMAL_LITERAL__DECIMAL:
        setDecimal((Double)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CssPackage.DECIMAL_LITERAL__DECIMAL:
        setDecimal(DECIMAL_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CssPackage.DECIMAL_LITERAL__DECIMAL:
        return decimal != DECIMAL_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (decimal: ");
    result.append(decimal);
    result.append(')');
    return result.toString();
  }

} //DecimalLiteralImpl
