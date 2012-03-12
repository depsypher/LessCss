/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.css.css.impl;

import java.util.Collection;

import nl.dslmeinte.xtext.css.css.CssPackage;
import nl.dslmeinte.xtext.css.css.SimpleSelector;
import nl.dslmeinte.xtext.css.css.SimpleSelectorSequence;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Selector Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.css.css.impl.SimpleSelectorSequenceImpl#getHead <em>Head</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.css.css.impl.SimpleSelectorSequenceImpl#getSimpleSelectors <em>Simple Selectors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleSelectorSequenceImpl extends SelectorImpl implements SimpleSelectorSequence
{
  /**
   * The cached value of the '{@link #getHead() <em>Head</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHead()
   * @generated
   * @ordered
   */
  protected SimpleSelector head;

  /**
   * The cached value of the '{@link #getSimpleSelectors() <em>Simple Selectors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSimpleSelectors()
   * @generated
   * @ordered
   */
  protected EList<SimpleSelector> simpleSelectors;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SimpleSelectorSequenceImpl()
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
    return CssPackage.Literals.SIMPLE_SELECTOR_SEQUENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleSelector getHead()
  {
    return head;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHead(SimpleSelector newHead, NotificationChain msgs)
  {
    SimpleSelector oldHead = head;
    head = newHead;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CssPackage.SIMPLE_SELECTOR_SEQUENCE__HEAD, oldHead, newHead);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHead(SimpleSelector newHead)
  {
    if (newHead != head)
    {
      NotificationChain msgs = null;
      if (head != null)
        msgs = ((InternalEObject)head).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CssPackage.SIMPLE_SELECTOR_SEQUENCE__HEAD, null, msgs);
      if (newHead != null)
        msgs = ((InternalEObject)newHead).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CssPackage.SIMPLE_SELECTOR_SEQUENCE__HEAD, null, msgs);
      msgs = basicSetHead(newHead, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssPackage.SIMPLE_SELECTOR_SEQUENCE__HEAD, newHead, newHead));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SimpleSelector> getSimpleSelectors()
  {
    if (simpleSelectors == null)
    {
      simpleSelectors = new EObjectContainmentEList<SimpleSelector>(SimpleSelector.class, this, CssPackage.SIMPLE_SELECTOR_SEQUENCE__SIMPLE_SELECTORS);
    }
    return simpleSelectors;
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
      case CssPackage.SIMPLE_SELECTOR_SEQUENCE__HEAD:
        return basicSetHead(null, msgs);
      case CssPackage.SIMPLE_SELECTOR_SEQUENCE__SIMPLE_SELECTORS:
        return ((InternalEList<?>)getSimpleSelectors()).basicRemove(otherEnd, msgs);
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
      case CssPackage.SIMPLE_SELECTOR_SEQUENCE__HEAD:
        return getHead();
      case CssPackage.SIMPLE_SELECTOR_SEQUENCE__SIMPLE_SELECTORS:
        return getSimpleSelectors();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CssPackage.SIMPLE_SELECTOR_SEQUENCE__HEAD:
        setHead((SimpleSelector)newValue);
        return;
      case CssPackage.SIMPLE_SELECTOR_SEQUENCE__SIMPLE_SELECTORS:
        getSimpleSelectors().clear();
        getSimpleSelectors().addAll((Collection<? extends SimpleSelector>)newValue);
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
      case CssPackage.SIMPLE_SELECTOR_SEQUENCE__HEAD:
        setHead((SimpleSelector)null);
        return;
      case CssPackage.SIMPLE_SELECTOR_SEQUENCE__SIMPLE_SELECTORS:
        getSimpleSelectors().clear();
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
      case CssPackage.SIMPLE_SELECTOR_SEQUENCE__HEAD:
        return head != null;
      case CssPackage.SIMPLE_SELECTOR_SEQUENCE__SIMPLE_SELECTORS:
        return simpleSelectors != null && !simpleSelectors.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SimpleSelectorSequenceImpl
