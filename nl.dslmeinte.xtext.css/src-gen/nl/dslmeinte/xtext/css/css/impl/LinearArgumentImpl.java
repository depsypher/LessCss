/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.css.css.impl;

import nl.dslmeinte.xtext.css.css.Coefficient;
import nl.dslmeinte.xtext.css.css.CssPackage;
import nl.dslmeinte.xtext.css.css.LinearArgument;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Linear Argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.css.css.impl.LinearArgumentImpl#getCoefficient <em>Coefficient</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.css.css.impl.LinearArgumentImpl#getConstantSign <em>Constant Sign</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.css.css.impl.LinearArgumentImpl#getConstant <em>Constant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinearArgumentImpl extends TypeArgumentImpl implements LinearArgument
{
  /**
   * The cached value of the '{@link #getCoefficient() <em>Coefficient</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCoefficient()
   * @generated
   * @ordered
   */
  protected Coefficient coefficient;

  /**
   * The default value of the '{@link #getConstantSign() <em>Constant Sign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstantSign()
   * @generated
   * @ordered
   */
  protected static final String CONSTANT_SIGN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getConstantSign() <em>Constant Sign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstantSign()
   * @generated
   * @ordered
   */
  protected String constantSign = CONSTANT_SIGN_EDEFAULT;

  /**
   * The default value of the '{@link #getConstant() <em>Constant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstant()
   * @generated
   * @ordered
   */
  protected static final int CONSTANT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getConstant() <em>Constant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstant()
   * @generated
   * @ordered
   */
  protected int constant = CONSTANT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LinearArgumentImpl()
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
    return CssPackage.Literals.LINEAR_ARGUMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Coefficient getCoefficient()
  {
    return coefficient;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCoefficient(Coefficient newCoefficient, NotificationChain msgs)
  {
    Coefficient oldCoefficient = coefficient;
    coefficient = newCoefficient;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CssPackage.LINEAR_ARGUMENT__COEFFICIENT, oldCoefficient, newCoefficient);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCoefficient(Coefficient newCoefficient)
  {
    if (newCoefficient != coefficient)
    {
      NotificationChain msgs = null;
      if (coefficient != null)
        msgs = ((InternalEObject)coefficient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CssPackage.LINEAR_ARGUMENT__COEFFICIENT, null, msgs);
      if (newCoefficient != null)
        msgs = ((InternalEObject)newCoefficient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CssPackage.LINEAR_ARGUMENT__COEFFICIENT, null, msgs);
      msgs = basicSetCoefficient(newCoefficient, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssPackage.LINEAR_ARGUMENT__COEFFICIENT, newCoefficient, newCoefficient));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getConstantSign()
  {
    return constantSign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstantSign(String newConstantSign)
  {
    String oldConstantSign = constantSign;
    constantSign = newConstantSign;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssPackage.LINEAR_ARGUMENT__CONSTANT_SIGN, oldConstantSign, constantSign));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getConstant()
  {
    return constant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstant(int newConstant)
  {
    int oldConstant = constant;
    constant = newConstant;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssPackage.LINEAR_ARGUMENT__CONSTANT, oldConstant, constant));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CssPackage.LINEAR_ARGUMENT__COEFFICIENT:
        return basicSetCoefficient(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case CssPackage.LINEAR_ARGUMENT__COEFFICIENT:
        return getCoefficient();
      case CssPackage.LINEAR_ARGUMENT__CONSTANT_SIGN:
        return getConstantSign();
      case CssPackage.LINEAR_ARGUMENT__CONSTANT:
        return getConstant();
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
      case CssPackage.LINEAR_ARGUMENT__COEFFICIENT:
        setCoefficient((Coefficient)newValue);
        return;
      case CssPackage.LINEAR_ARGUMENT__CONSTANT_SIGN:
        setConstantSign((String)newValue);
        return;
      case CssPackage.LINEAR_ARGUMENT__CONSTANT:
        setConstant((Integer)newValue);
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
      case CssPackage.LINEAR_ARGUMENT__COEFFICIENT:
        setCoefficient((Coefficient)null);
        return;
      case CssPackage.LINEAR_ARGUMENT__CONSTANT_SIGN:
        setConstantSign(CONSTANT_SIGN_EDEFAULT);
        return;
      case CssPackage.LINEAR_ARGUMENT__CONSTANT:
        setConstant(CONSTANT_EDEFAULT);
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
      case CssPackage.LINEAR_ARGUMENT__COEFFICIENT:
        return coefficient != null;
      case CssPackage.LINEAR_ARGUMENT__CONSTANT_SIGN:
        return CONSTANT_SIGN_EDEFAULT == null ? constantSign != null : !CONSTANT_SIGN_EDEFAULT.equals(constantSign);
      case CssPackage.LINEAR_ARGUMENT__CONSTANT:
        return constant != CONSTANT_EDEFAULT;
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
    result.append(" (constantSign: ");
    result.append(constantSign);
    result.append(", constant: ");
    result.append(constant);
    result.append(')');
    return result.toString();
  }

} //LinearArgumentImpl
