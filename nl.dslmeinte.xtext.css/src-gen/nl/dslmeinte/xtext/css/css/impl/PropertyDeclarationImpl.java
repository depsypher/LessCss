/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.css.css.impl;

import nl.dslmeinte.xtext.css.css.CssPackage;
import nl.dslmeinte.xtext.css.css.PropertyDeclaration;
import nl.dslmeinte.xtext.css.css.PropertyValuesLists;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.css.css.impl.PropertyDeclarationImpl#getValuesLists <em>Values Lists</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyDeclarationImpl extends MediaDeclarationMembersImpl implements PropertyDeclaration
{
  /**
   * The cached value of the '{@link #getValuesLists() <em>Values Lists</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValuesLists()
   * @generated
   * @ordered
   */
  protected PropertyValuesLists valuesLists;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PropertyDeclarationImpl()
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
    return CssPackage.Literals.PROPERTY_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyValuesLists getValuesLists()
  {
    return valuesLists;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValuesLists(PropertyValuesLists newValuesLists, NotificationChain msgs)
  {
    PropertyValuesLists oldValuesLists = valuesLists;
    valuesLists = newValuesLists;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CssPackage.PROPERTY_DECLARATION__VALUES_LISTS, oldValuesLists, newValuesLists);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValuesLists(PropertyValuesLists newValuesLists)
  {
    if (newValuesLists != valuesLists)
    {
      NotificationChain msgs = null;
      if (valuesLists != null)
        msgs = ((InternalEObject)valuesLists).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CssPackage.PROPERTY_DECLARATION__VALUES_LISTS, null, msgs);
      if (newValuesLists != null)
        msgs = ((InternalEObject)newValuesLists).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CssPackage.PROPERTY_DECLARATION__VALUES_LISTS, null, msgs);
      msgs = basicSetValuesLists(newValuesLists, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssPackage.PROPERTY_DECLARATION__VALUES_LISTS, newValuesLists, newValuesLists));
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
      case CssPackage.PROPERTY_DECLARATION__VALUES_LISTS:
        return basicSetValuesLists(null, msgs);
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
      case CssPackage.PROPERTY_DECLARATION__VALUES_LISTS:
        return getValuesLists();
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
      case CssPackage.PROPERTY_DECLARATION__VALUES_LISTS:
        setValuesLists((PropertyValuesLists)newValue);
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
      case CssPackage.PROPERTY_DECLARATION__VALUES_LISTS:
        setValuesLists((PropertyValuesLists)null);
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
      case CssPackage.PROPERTY_DECLARATION__VALUES_LISTS:
        return valuesLists != null;
    }
    return super.eIsSet(featureID);
  }

} //PropertyDeclarationImpl
