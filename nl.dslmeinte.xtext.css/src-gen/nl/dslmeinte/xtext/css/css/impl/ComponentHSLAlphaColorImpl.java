/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.css.css.impl;

import nl.dslmeinte.xtext.css.css.ColorComponentLiteral;
import nl.dslmeinte.xtext.css.css.ComponentHSLAlphaColor;
import nl.dslmeinte.xtext.css.css.CssPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component HSL Alpha Color</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.css.css.impl.ComponentHSLAlphaColorImpl#getHue <em>Hue</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.css.css.impl.ComponentHSLAlphaColorImpl#getSaturation <em>Saturation</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.css.css.impl.ComponentHSLAlphaColorImpl#getLightness <em>Lightness</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.css.css.impl.ComponentHSLAlphaColorImpl#getOpacity <em>Opacity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentHSLAlphaColorImpl extends ComponentColorLiteralImpl implements ComponentHSLAlphaColor
{
  /**
   * The cached value of the '{@link #getHue() <em>Hue</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHue()
   * @generated
   * @ordered
   */
  protected ColorComponentLiteral hue;

  /**
   * The cached value of the '{@link #getSaturation() <em>Saturation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSaturation()
   * @generated
   * @ordered
   */
  protected ColorComponentLiteral saturation;

  /**
   * The cached value of the '{@link #getLightness() <em>Lightness</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLightness()
   * @generated
   * @ordered
   */
  protected ColorComponentLiteral lightness;

  /**
   * The cached value of the '{@link #getOpacity() <em>Opacity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpacity()
   * @generated
   * @ordered
   */
  protected ColorComponentLiteral opacity;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComponentHSLAlphaColorImpl()
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
    return CssPackage.Literals.COMPONENT_HSL_ALPHA_COLOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColorComponentLiteral getHue()
  {
    return hue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHue(ColorComponentLiteral newHue, NotificationChain msgs)
  {
    ColorComponentLiteral oldHue = hue;
    hue = newHue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CssPackage.COMPONENT_HSL_ALPHA_COLOR__HUE, oldHue, newHue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHue(ColorComponentLiteral newHue)
  {
    if (newHue != hue)
    {
      NotificationChain msgs = null;
      if (hue != null)
        msgs = ((InternalEObject)hue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CssPackage.COMPONENT_HSL_ALPHA_COLOR__HUE, null, msgs);
      if (newHue != null)
        msgs = ((InternalEObject)newHue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CssPackage.COMPONENT_HSL_ALPHA_COLOR__HUE, null, msgs);
      msgs = basicSetHue(newHue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssPackage.COMPONENT_HSL_ALPHA_COLOR__HUE, newHue, newHue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColorComponentLiteral getSaturation()
  {
    return saturation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSaturation(ColorComponentLiteral newSaturation, NotificationChain msgs)
  {
    ColorComponentLiteral oldSaturation = saturation;
    saturation = newSaturation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CssPackage.COMPONENT_HSL_ALPHA_COLOR__SATURATION, oldSaturation, newSaturation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSaturation(ColorComponentLiteral newSaturation)
  {
    if (newSaturation != saturation)
    {
      NotificationChain msgs = null;
      if (saturation != null)
        msgs = ((InternalEObject)saturation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CssPackage.COMPONENT_HSL_ALPHA_COLOR__SATURATION, null, msgs);
      if (newSaturation != null)
        msgs = ((InternalEObject)newSaturation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CssPackage.COMPONENT_HSL_ALPHA_COLOR__SATURATION, null, msgs);
      msgs = basicSetSaturation(newSaturation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssPackage.COMPONENT_HSL_ALPHA_COLOR__SATURATION, newSaturation, newSaturation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColorComponentLiteral getLightness()
  {
    return lightness;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLightness(ColorComponentLiteral newLightness, NotificationChain msgs)
  {
    ColorComponentLiteral oldLightness = lightness;
    lightness = newLightness;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CssPackage.COMPONENT_HSL_ALPHA_COLOR__LIGHTNESS, oldLightness, newLightness);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLightness(ColorComponentLiteral newLightness)
  {
    if (newLightness != lightness)
    {
      NotificationChain msgs = null;
      if (lightness != null)
        msgs = ((InternalEObject)lightness).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CssPackage.COMPONENT_HSL_ALPHA_COLOR__LIGHTNESS, null, msgs);
      if (newLightness != null)
        msgs = ((InternalEObject)newLightness).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CssPackage.COMPONENT_HSL_ALPHA_COLOR__LIGHTNESS, null, msgs);
      msgs = basicSetLightness(newLightness, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssPackage.COMPONENT_HSL_ALPHA_COLOR__LIGHTNESS, newLightness, newLightness));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColorComponentLiteral getOpacity()
  {
    return opacity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOpacity(ColorComponentLiteral newOpacity, NotificationChain msgs)
  {
    ColorComponentLiteral oldOpacity = opacity;
    opacity = newOpacity;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CssPackage.COMPONENT_HSL_ALPHA_COLOR__OPACITY, oldOpacity, newOpacity);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOpacity(ColorComponentLiteral newOpacity)
  {
    if (newOpacity != opacity)
    {
      NotificationChain msgs = null;
      if (opacity != null)
        msgs = ((InternalEObject)opacity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CssPackage.COMPONENT_HSL_ALPHA_COLOR__OPACITY, null, msgs);
      if (newOpacity != null)
        msgs = ((InternalEObject)newOpacity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CssPackage.COMPONENT_HSL_ALPHA_COLOR__OPACITY, null, msgs);
      msgs = basicSetOpacity(newOpacity, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssPackage.COMPONENT_HSL_ALPHA_COLOR__OPACITY, newOpacity, newOpacity));
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
      case CssPackage.COMPONENT_HSL_ALPHA_COLOR__HUE:
        return basicSetHue(null, msgs);
      case CssPackage.COMPONENT_HSL_ALPHA_COLOR__SATURATION:
        return basicSetSaturation(null, msgs);
      case CssPackage.COMPONENT_HSL_ALPHA_COLOR__LIGHTNESS:
        return basicSetLightness(null, msgs);
      case CssPackage.COMPONENT_HSL_ALPHA_COLOR__OPACITY:
        return basicSetOpacity(null, msgs);
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
      case CssPackage.COMPONENT_HSL_ALPHA_COLOR__HUE:
        return getHue();
      case CssPackage.COMPONENT_HSL_ALPHA_COLOR__SATURATION:
        return getSaturation();
      case CssPackage.COMPONENT_HSL_ALPHA_COLOR__LIGHTNESS:
        return getLightness();
      case CssPackage.COMPONENT_HSL_ALPHA_COLOR__OPACITY:
        return getOpacity();
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
      case CssPackage.COMPONENT_HSL_ALPHA_COLOR__HUE:
        setHue((ColorComponentLiteral)newValue);
        return;
      case CssPackage.COMPONENT_HSL_ALPHA_COLOR__SATURATION:
        setSaturation((ColorComponentLiteral)newValue);
        return;
      case CssPackage.COMPONENT_HSL_ALPHA_COLOR__LIGHTNESS:
        setLightness((ColorComponentLiteral)newValue);
        return;
      case CssPackage.COMPONENT_HSL_ALPHA_COLOR__OPACITY:
        setOpacity((ColorComponentLiteral)newValue);
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
      case CssPackage.COMPONENT_HSL_ALPHA_COLOR__HUE:
        setHue((ColorComponentLiteral)null);
        return;
      case CssPackage.COMPONENT_HSL_ALPHA_COLOR__SATURATION:
        setSaturation((ColorComponentLiteral)null);
        return;
      case CssPackage.COMPONENT_HSL_ALPHA_COLOR__LIGHTNESS:
        setLightness((ColorComponentLiteral)null);
        return;
      case CssPackage.COMPONENT_HSL_ALPHA_COLOR__OPACITY:
        setOpacity((ColorComponentLiteral)null);
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
      case CssPackage.COMPONENT_HSL_ALPHA_COLOR__HUE:
        return hue != null;
      case CssPackage.COMPONENT_HSL_ALPHA_COLOR__SATURATION:
        return saturation != null;
      case CssPackage.COMPONENT_HSL_ALPHA_COLOR__LIGHTNESS:
        return lightness != null;
      case CssPackage.COMPONENT_HSL_ALPHA_COLOR__OPACITY:
        return opacity != null;
    }
    return super.eIsSet(featureID);
  }

} //ComponentHSLAlphaColorImpl
