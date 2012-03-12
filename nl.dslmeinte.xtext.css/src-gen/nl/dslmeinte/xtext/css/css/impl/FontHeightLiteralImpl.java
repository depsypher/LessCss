/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.css.css.impl;

import nl.dslmeinte.xtext.css.css.CssPackage;
import nl.dslmeinte.xtext.css.css.Dimensions;
import nl.dslmeinte.xtext.css.css.FontHeightLiteral;
import nl.dslmeinte.xtext.css.css.NumberLiteral;
import nl.dslmeinte.xtext.css.css.SizeLiteral;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Font Height Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.css.css.impl.FontHeightLiteralImpl#getFontHeight <em>Font Height</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.css.css.impl.FontHeightLiteralImpl#getLineHeight <em>Line Height</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.css.css.impl.FontHeightLiteralImpl#getLineHeightDimension <em>Line Height Dimension</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FontHeightLiteralImpl extends SizeLiteralImpl implements FontHeightLiteral
{
  /**
   * The cached value of the '{@link #getFontHeight() <em>Font Height</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFontHeight()
   * @generated
   * @ordered
   */
  protected SizeLiteral fontHeight;

  /**
   * The cached value of the '{@link #getLineHeight() <em>Line Height</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLineHeight()
   * @generated
   * @ordered
   */
  protected NumberLiteral lineHeight;

  /**
   * The default value of the '{@link #getLineHeightDimension() <em>Line Height Dimension</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLineHeightDimension()
   * @generated
   * @ordered
   */
  protected static final Dimensions LINE_HEIGHT_DIMENSION_EDEFAULT = Dimensions.IN;

  /**
   * The cached value of the '{@link #getLineHeightDimension() <em>Line Height Dimension</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLineHeightDimension()
   * @generated
   * @ordered
   */
  protected Dimensions lineHeightDimension = LINE_HEIGHT_DIMENSION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FontHeightLiteralImpl()
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
    return CssPackage.Literals.FONT_HEIGHT_LITERAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SizeLiteral getFontHeight()
  {
    return fontHeight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFontHeight(SizeLiteral newFontHeight, NotificationChain msgs)
  {
    SizeLiteral oldFontHeight = fontHeight;
    fontHeight = newFontHeight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CssPackage.FONT_HEIGHT_LITERAL__FONT_HEIGHT, oldFontHeight, newFontHeight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFontHeight(SizeLiteral newFontHeight)
  {
    if (newFontHeight != fontHeight)
    {
      NotificationChain msgs = null;
      if (fontHeight != null)
        msgs = ((InternalEObject)fontHeight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CssPackage.FONT_HEIGHT_LITERAL__FONT_HEIGHT, null, msgs);
      if (newFontHeight != null)
        msgs = ((InternalEObject)newFontHeight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CssPackage.FONT_HEIGHT_LITERAL__FONT_HEIGHT, null, msgs);
      msgs = basicSetFontHeight(newFontHeight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssPackage.FONT_HEIGHT_LITERAL__FONT_HEIGHT, newFontHeight, newFontHeight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberLiteral getLineHeight()
  {
    return lineHeight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLineHeight(NumberLiteral newLineHeight, NotificationChain msgs)
  {
    NumberLiteral oldLineHeight = lineHeight;
    lineHeight = newLineHeight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CssPackage.FONT_HEIGHT_LITERAL__LINE_HEIGHT, oldLineHeight, newLineHeight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLineHeight(NumberLiteral newLineHeight)
  {
    if (newLineHeight != lineHeight)
    {
      NotificationChain msgs = null;
      if (lineHeight != null)
        msgs = ((InternalEObject)lineHeight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CssPackage.FONT_HEIGHT_LITERAL__LINE_HEIGHT, null, msgs);
      if (newLineHeight != null)
        msgs = ((InternalEObject)newLineHeight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CssPackage.FONT_HEIGHT_LITERAL__LINE_HEIGHT, null, msgs);
      msgs = basicSetLineHeight(newLineHeight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssPackage.FONT_HEIGHT_LITERAL__LINE_HEIGHT, newLineHeight, newLineHeight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dimensions getLineHeightDimension()
  {
    return lineHeightDimension;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLineHeightDimension(Dimensions newLineHeightDimension)
  {
    Dimensions oldLineHeightDimension = lineHeightDimension;
    lineHeightDimension = newLineHeightDimension == null ? LINE_HEIGHT_DIMENSION_EDEFAULT : newLineHeightDimension;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssPackage.FONT_HEIGHT_LITERAL__LINE_HEIGHT_DIMENSION, oldLineHeightDimension, lineHeightDimension));
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
      case CssPackage.FONT_HEIGHT_LITERAL__FONT_HEIGHT:
        return basicSetFontHeight(null, msgs);
      case CssPackage.FONT_HEIGHT_LITERAL__LINE_HEIGHT:
        return basicSetLineHeight(null, msgs);
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
      case CssPackage.FONT_HEIGHT_LITERAL__FONT_HEIGHT:
        return getFontHeight();
      case CssPackage.FONT_HEIGHT_LITERAL__LINE_HEIGHT:
        return getLineHeight();
      case CssPackage.FONT_HEIGHT_LITERAL__LINE_HEIGHT_DIMENSION:
        return getLineHeightDimension();
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
      case CssPackage.FONT_HEIGHT_LITERAL__FONT_HEIGHT:
        setFontHeight((SizeLiteral)newValue);
        return;
      case CssPackage.FONT_HEIGHT_LITERAL__LINE_HEIGHT:
        setLineHeight((NumberLiteral)newValue);
        return;
      case CssPackage.FONT_HEIGHT_LITERAL__LINE_HEIGHT_DIMENSION:
        setLineHeightDimension((Dimensions)newValue);
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
      case CssPackage.FONT_HEIGHT_LITERAL__FONT_HEIGHT:
        setFontHeight((SizeLiteral)null);
        return;
      case CssPackage.FONT_HEIGHT_LITERAL__LINE_HEIGHT:
        setLineHeight((NumberLiteral)null);
        return;
      case CssPackage.FONT_HEIGHT_LITERAL__LINE_HEIGHT_DIMENSION:
        setLineHeightDimension(LINE_HEIGHT_DIMENSION_EDEFAULT);
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
      case CssPackage.FONT_HEIGHT_LITERAL__FONT_HEIGHT:
        return fontHeight != null;
      case CssPackage.FONT_HEIGHT_LITERAL__LINE_HEIGHT:
        return lineHeight != null;
      case CssPackage.FONT_HEIGHT_LITERAL__LINE_HEIGHT_DIMENSION:
        return lineHeightDimension != LINE_HEIGHT_DIMENSION_EDEFAULT;
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
    result.append(" (lineHeightDimension: ");
    result.append(lineHeightDimension);
    result.append(')');
    return result.toString();
  }

} //FontHeightLiteralImpl
