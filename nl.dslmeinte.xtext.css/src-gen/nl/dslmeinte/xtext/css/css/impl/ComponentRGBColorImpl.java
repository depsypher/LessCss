/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.css.css.impl;

import nl.dslmeinte.xtext.css.css.ColorComponentLiteral;
import nl.dslmeinte.xtext.css.css.ComponentRGBColor;
import nl.dslmeinte.xtext.css.css.CssPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component RGB Color</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.css.css.impl.ComponentRGBColorImpl#getRed <em>Red</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.css.css.impl.ComponentRGBColorImpl#getGreen <em>Green</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.css.css.impl.ComponentRGBColorImpl#getBlue <em>Blue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentRGBColorImpl extends ComponentColorLiteralImpl implements ComponentRGBColor
{
  /**
   * The cached value of the '{@link #getRed() <em>Red</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRed()
   * @generated
   * @ordered
   */
  protected ColorComponentLiteral red;

  /**
   * The cached value of the '{@link #getGreen() <em>Green</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGreen()
   * @generated
   * @ordered
   */
  protected ColorComponentLiteral green;

  /**
   * The cached value of the '{@link #getBlue() <em>Blue</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlue()
   * @generated
   * @ordered
   */
  protected ColorComponentLiteral blue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComponentRGBColorImpl()
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
    return CssPackage.Literals.COMPONENT_RGB_COLOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColorComponentLiteral getRed()
  {
    return red;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRed(ColorComponentLiteral newRed, NotificationChain msgs)
  {
    ColorComponentLiteral oldRed = red;
    red = newRed;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CssPackage.COMPONENT_RGB_COLOR__RED, oldRed, newRed);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRed(ColorComponentLiteral newRed)
  {
    if (newRed != red)
    {
      NotificationChain msgs = null;
      if (red != null)
        msgs = ((InternalEObject)red).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CssPackage.COMPONENT_RGB_COLOR__RED, null, msgs);
      if (newRed != null)
        msgs = ((InternalEObject)newRed).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CssPackage.COMPONENT_RGB_COLOR__RED, null, msgs);
      msgs = basicSetRed(newRed, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssPackage.COMPONENT_RGB_COLOR__RED, newRed, newRed));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColorComponentLiteral getGreen()
  {
    return green;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGreen(ColorComponentLiteral newGreen, NotificationChain msgs)
  {
    ColorComponentLiteral oldGreen = green;
    green = newGreen;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CssPackage.COMPONENT_RGB_COLOR__GREEN, oldGreen, newGreen);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGreen(ColorComponentLiteral newGreen)
  {
    if (newGreen != green)
    {
      NotificationChain msgs = null;
      if (green != null)
        msgs = ((InternalEObject)green).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CssPackage.COMPONENT_RGB_COLOR__GREEN, null, msgs);
      if (newGreen != null)
        msgs = ((InternalEObject)newGreen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CssPackage.COMPONENT_RGB_COLOR__GREEN, null, msgs);
      msgs = basicSetGreen(newGreen, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssPackage.COMPONENT_RGB_COLOR__GREEN, newGreen, newGreen));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColorComponentLiteral getBlue()
  {
    return blue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlue(ColorComponentLiteral newBlue, NotificationChain msgs)
  {
    ColorComponentLiteral oldBlue = blue;
    blue = newBlue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CssPackage.COMPONENT_RGB_COLOR__BLUE, oldBlue, newBlue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlue(ColorComponentLiteral newBlue)
  {
    if (newBlue != blue)
    {
      NotificationChain msgs = null;
      if (blue != null)
        msgs = ((InternalEObject)blue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CssPackage.COMPONENT_RGB_COLOR__BLUE, null, msgs);
      if (newBlue != null)
        msgs = ((InternalEObject)newBlue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CssPackage.COMPONENT_RGB_COLOR__BLUE, null, msgs);
      msgs = basicSetBlue(newBlue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssPackage.COMPONENT_RGB_COLOR__BLUE, newBlue, newBlue));
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
      case CssPackage.COMPONENT_RGB_COLOR__RED:
        return basicSetRed(null, msgs);
      case CssPackage.COMPONENT_RGB_COLOR__GREEN:
        return basicSetGreen(null, msgs);
      case CssPackage.COMPONENT_RGB_COLOR__BLUE:
        return basicSetBlue(null, msgs);
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
      case CssPackage.COMPONENT_RGB_COLOR__RED:
        return getRed();
      case CssPackage.COMPONENT_RGB_COLOR__GREEN:
        return getGreen();
      case CssPackage.COMPONENT_RGB_COLOR__BLUE:
        return getBlue();
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
      case CssPackage.COMPONENT_RGB_COLOR__RED:
        setRed((ColorComponentLiteral)newValue);
        return;
      case CssPackage.COMPONENT_RGB_COLOR__GREEN:
        setGreen((ColorComponentLiteral)newValue);
        return;
      case CssPackage.COMPONENT_RGB_COLOR__BLUE:
        setBlue((ColorComponentLiteral)newValue);
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
      case CssPackage.COMPONENT_RGB_COLOR__RED:
        setRed((ColorComponentLiteral)null);
        return;
      case CssPackage.COMPONENT_RGB_COLOR__GREEN:
        setGreen((ColorComponentLiteral)null);
        return;
      case CssPackage.COMPONENT_RGB_COLOR__BLUE:
        setBlue((ColorComponentLiteral)null);
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
      case CssPackage.COMPONENT_RGB_COLOR__RED:
        return red != null;
      case CssPackage.COMPONENT_RGB_COLOR__GREEN:
        return green != null;
      case CssPackage.COMPONENT_RGB_COLOR__BLUE:
        return blue != null;
    }
    return super.eIsSet(featureID);
  }

} //ComponentRGBColorImpl
