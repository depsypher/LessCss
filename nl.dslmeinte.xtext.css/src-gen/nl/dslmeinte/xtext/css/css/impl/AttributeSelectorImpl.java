/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.css.css.impl;

import nl.dslmeinte.xtext.css.css.Attribute;
import nl.dslmeinte.xtext.css.css.AttributeSelector;
import nl.dslmeinte.xtext.css.css.AttributeSelectorMatchers;
import nl.dslmeinte.xtext.css.css.AttributeValueLiteral;
import nl.dslmeinte.xtext.css.css.CssPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Selector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.css.css.impl.AttributeSelectorImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.css.css.impl.AttributeSelectorImpl#getMatcher <em>Matcher</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.css.css.impl.AttributeSelectorImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeSelectorImpl extends SimpleSelectorImpl implements AttributeSelector
{
  /**
   * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttribute()
   * @generated
   * @ordered
   */
  protected Attribute attribute;

  /**
   * The default value of the '{@link #getMatcher() <em>Matcher</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMatcher()
   * @generated
   * @ordered
   */
  protected static final AttributeSelectorMatchers MATCHER_EDEFAULT = AttributeSelectorMatchers.PREFIX;

  /**
   * The cached value of the '{@link #getMatcher() <em>Matcher</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMatcher()
   * @generated
   * @ordered
   */
  protected AttributeSelectorMatchers matcher = MATCHER_EDEFAULT;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected AttributeValueLiteral value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeSelectorImpl()
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
    return CssPackage.Literals.ATTRIBUTE_SELECTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute getAttribute()
  {
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAttribute(Attribute newAttribute, NotificationChain msgs)
  {
    Attribute oldAttribute = attribute;
    attribute = newAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CssPackage.ATTRIBUTE_SELECTOR__ATTRIBUTE, oldAttribute, newAttribute);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttribute(Attribute newAttribute)
  {
    if (newAttribute != attribute)
    {
      NotificationChain msgs = null;
      if (attribute != null)
        msgs = ((InternalEObject)attribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CssPackage.ATTRIBUTE_SELECTOR__ATTRIBUTE, null, msgs);
      if (newAttribute != null)
        msgs = ((InternalEObject)newAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CssPackage.ATTRIBUTE_SELECTOR__ATTRIBUTE, null, msgs);
      msgs = basicSetAttribute(newAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssPackage.ATTRIBUTE_SELECTOR__ATTRIBUTE, newAttribute, newAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeSelectorMatchers getMatcher()
  {
    return matcher;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMatcher(AttributeSelectorMatchers newMatcher)
  {
    AttributeSelectorMatchers oldMatcher = matcher;
    matcher = newMatcher == null ? MATCHER_EDEFAULT : newMatcher;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssPackage.ATTRIBUTE_SELECTOR__MATCHER, oldMatcher, matcher));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeValueLiteral getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(AttributeValueLiteral newValue, NotificationChain msgs)
  {
    AttributeValueLiteral oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CssPackage.ATTRIBUTE_SELECTOR__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(AttributeValueLiteral newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CssPackage.ATTRIBUTE_SELECTOR__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CssPackage.ATTRIBUTE_SELECTOR__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssPackage.ATTRIBUTE_SELECTOR__VALUE, newValue, newValue));
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
      case CssPackage.ATTRIBUTE_SELECTOR__ATTRIBUTE:
        return basicSetAttribute(null, msgs);
      case CssPackage.ATTRIBUTE_SELECTOR__VALUE:
        return basicSetValue(null, msgs);
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
      case CssPackage.ATTRIBUTE_SELECTOR__ATTRIBUTE:
        return getAttribute();
      case CssPackage.ATTRIBUTE_SELECTOR__MATCHER:
        return getMatcher();
      case CssPackage.ATTRIBUTE_SELECTOR__VALUE:
        return getValue();
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
      case CssPackage.ATTRIBUTE_SELECTOR__ATTRIBUTE:
        setAttribute((Attribute)newValue);
        return;
      case CssPackage.ATTRIBUTE_SELECTOR__MATCHER:
        setMatcher((AttributeSelectorMatchers)newValue);
        return;
      case CssPackage.ATTRIBUTE_SELECTOR__VALUE:
        setValue((AttributeValueLiteral)newValue);
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
      case CssPackage.ATTRIBUTE_SELECTOR__ATTRIBUTE:
        setAttribute((Attribute)null);
        return;
      case CssPackage.ATTRIBUTE_SELECTOR__MATCHER:
        setMatcher(MATCHER_EDEFAULT);
        return;
      case CssPackage.ATTRIBUTE_SELECTOR__VALUE:
        setValue((AttributeValueLiteral)null);
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
      case CssPackage.ATTRIBUTE_SELECTOR__ATTRIBUTE:
        return attribute != null;
      case CssPackage.ATTRIBUTE_SELECTOR__MATCHER:
        return matcher != MATCHER_EDEFAULT;
      case CssPackage.ATTRIBUTE_SELECTOR__VALUE:
        return value != null;
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
    result.append(" (matcher: ");
    result.append(matcher);
    result.append(')');
    return result.toString();
  }

} //AttributeSelectorImpl
