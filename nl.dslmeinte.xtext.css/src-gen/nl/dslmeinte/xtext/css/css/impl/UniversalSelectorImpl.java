/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.css.css.impl;

import nl.dslmeinte.xtext.css.css.CssPackage;
import nl.dslmeinte.xtext.css.css.NamespacePrefix;
import nl.dslmeinte.xtext.css.css.UniversalSelector;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Universal Selector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.css.css.impl.UniversalSelectorImpl#getNamespacePrefix <em>Namespace Prefix</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UniversalSelectorImpl extends SimpleSelectorImpl implements UniversalSelector
{
  /**
   * The cached value of the '{@link #getNamespacePrefix() <em>Namespace Prefix</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamespacePrefix()
   * @generated
   * @ordered
   */
  protected NamespacePrefix namespacePrefix;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UniversalSelectorImpl()
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
    return CssPackage.Literals.UNIVERSAL_SELECTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamespacePrefix getNamespacePrefix()
  {
    return namespacePrefix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNamespacePrefix(NamespacePrefix newNamespacePrefix, NotificationChain msgs)
  {
    NamespacePrefix oldNamespacePrefix = namespacePrefix;
    namespacePrefix = newNamespacePrefix;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CssPackage.UNIVERSAL_SELECTOR__NAMESPACE_PREFIX, oldNamespacePrefix, newNamespacePrefix);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNamespacePrefix(NamespacePrefix newNamespacePrefix)
  {
    if (newNamespacePrefix != namespacePrefix)
    {
      NotificationChain msgs = null;
      if (namespacePrefix != null)
        msgs = ((InternalEObject)namespacePrefix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CssPackage.UNIVERSAL_SELECTOR__NAMESPACE_PREFIX, null, msgs);
      if (newNamespacePrefix != null)
        msgs = ((InternalEObject)newNamespacePrefix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CssPackage.UNIVERSAL_SELECTOR__NAMESPACE_PREFIX, null, msgs);
      msgs = basicSetNamespacePrefix(newNamespacePrefix, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssPackage.UNIVERSAL_SELECTOR__NAMESPACE_PREFIX, newNamespacePrefix, newNamespacePrefix));
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
      case CssPackage.UNIVERSAL_SELECTOR__NAMESPACE_PREFIX:
        return basicSetNamespacePrefix(null, msgs);
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
      case CssPackage.UNIVERSAL_SELECTOR__NAMESPACE_PREFIX:
        return getNamespacePrefix();
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
      case CssPackage.UNIVERSAL_SELECTOR__NAMESPACE_PREFIX:
        setNamespacePrefix((NamespacePrefix)newValue);
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
      case CssPackage.UNIVERSAL_SELECTOR__NAMESPACE_PREFIX:
        setNamespacePrefix((NamespacePrefix)null);
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
      case CssPackage.UNIVERSAL_SELECTOR__NAMESPACE_PREFIX:
        return namespacePrefix != null;
    }
    return super.eIsSet(featureID);
  }

} //UniversalSelectorImpl
