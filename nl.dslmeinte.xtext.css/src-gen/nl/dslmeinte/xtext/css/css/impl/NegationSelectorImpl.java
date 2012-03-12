/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.css.css.impl;

import nl.dslmeinte.xtext.css.css.CssPackage;
import nl.dslmeinte.xtext.css.css.NegationSelector;
import nl.dslmeinte.xtext.css.css.SimpleSelector;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Negation Selector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.css.css.impl.NegationSelectorImpl#getSimpleSelector <em>Simple Selector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NegationSelectorImpl extends SimpleSelectorImpl implements NegationSelector
{
  /**
   * The cached value of the '{@link #getSimpleSelector() <em>Simple Selector</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSimpleSelector()
   * @generated
   * @ordered
   */
  protected SimpleSelector simpleSelector;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NegationSelectorImpl()
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
    return CssPackage.Literals.NEGATION_SELECTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleSelector getSimpleSelector()
  {
    return simpleSelector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSimpleSelector(SimpleSelector newSimpleSelector, NotificationChain msgs)
  {
    SimpleSelector oldSimpleSelector = simpleSelector;
    simpleSelector = newSimpleSelector;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CssPackage.NEGATION_SELECTOR__SIMPLE_SELECTOR, oldSimpleSelector, newSimpleSelector);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSimpleSelector(SimpleSelector newSimpleSelector)
  {
    if (newSimpleSelector != simpleSelector)
    {
      NotificationChain msgs = null;
      if (simpleSelector != null)
        msgs = ((InternalEObject)simpleSelector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CssPackage.NEGATION_SELECTOR__SIMPLE_SELECTOR, null, msgs);
      if (newSimpleSelector != null)
        msgs = ((InternalEObject)newSimpleSelector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CssPackage.NEGATION_SELECTOR__SIMPLE_SELECTOR, null, msgs);
      msgs = basicSetSimpleSelector(newSimpleSelector, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssPackage.NEGATION_SELECTOR__SIMPLE_SELECTOR, newSimpleSelector, newSimpleSelector));
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
      case CssPackage.NEGATION_SELECTOR__SIMPLE_SELECTOR:
        return basicSetSimpleSelector(null, msgs);
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
      case CssPackage.NEGATION_SELECTOR__SIMPLE_SELECTOR:
        return getSimpleSelector();
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
      case CssPackage.NEGATION_SELECTOR__SIMPLE_SELECTOR:
        setSimpleSelector((SimpleSelector)newValue);
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
      case CssPackage.NEGATION_SELECTOR__SIMPLE_SELECTOR:
        setSimpleSelector((SimpleSelector)null);
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
      case CssPackage.NEGATION_SELECTOR__SIMPLE_SELECTOR:
        return simpleSelector != null;
    }
    return super.eIsSet(featureID);
  }

} //NegationSelectorImpl
