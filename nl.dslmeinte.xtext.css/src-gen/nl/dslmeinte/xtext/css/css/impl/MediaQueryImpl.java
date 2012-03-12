/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.css.css.impl;

import java.util.Collection;

import nl.dslmeinte.xtext.css.css.CssPackage;
import nl.dslmeinte.xtext.css.css.MediaQuery;
import nl.dslmeinte.xtext.css.css.MediaQueryExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Media Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.css.css.impl.MediaQueryImpl#isOnly <em>Only</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.css.css.impl.MediaQueryImpl#isNot <em>Not</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.css.css.impl.MediaQueryImpl#getMediaType <em>Media Type</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.css.css.impl.MediaQueryImpl#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MediaQueryImpl extends MinimalEObjectImpl.Container implements MediaQuery
{
  /**
   * The default value of the '{@link #isOnly() <em>Only</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOnly()
   * @generated
   * @ordered
   */
  protected static final boolean ONLY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isOnly() <em>Only</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOnly()
   * @generated
   * @ordered
   */
  protected boolean only = ONLY_EDEFAULT;

  /**
   * The default value of the '{@link #isNot() <em>Not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNot()
   * @generated
   * @ordered
   */
  protected static final boolean NOT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNot() <em>Not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNot()
   * @generated
   * @ordered
   */
  protected boolean not = NOT_EDEFAULT;

  /**
   * The default value of the '{@link #getMediaType() <em>Media Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMediaType()
   * @generated
   * @ordered
   */
  protected static final String MEDIA_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMediaType() <em>Media Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMediaType()
   * @generated
   * @ordered
   */
  protected String mediaType = MEDIA_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getExpressions() <em>Expressions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressions()
   * @generated
   * @ordered
   */
  protected EList<MediaQueryExpression> expressions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MediaQueryImpl()
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
    return CssPackage.Literals.MEDIA_QUERY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isOnly()
  {
    return only;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOnly(boolean newOnly)
  {
    boolean oldOnly = only;
    only = newOnly;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssPackage.MEDIA_QUERY__ONLY, oldOnly, only));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNot()
  {
    return not;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNot(boolean newNot)
  {
    boolean oldNot = not;
    not = newNot;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssPackage.MEDIA_QUERY__NOT, oldNot, not));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMediaType()
  {
    return mediaType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMediaType(String newMediaType)
  {
    String oldMediaType = mediaType;
    mediaType = newMediaType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssPackage.MEDIA_QUERY__MEDIA_TYPE, oldMediaType, mediaType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MediaQueryExpression> getExpressions()
  {
    if (expressions == null)
    {
      expressions = new EObjectContainmentEList<MediaQueryExpression>(MediaQueryExpression.class, this, CssPackage.MEDIA_QUERY__EXPRESSIONS);
    }
    return expressions;
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
      case CssPackage.MEDIA_QUERY__EXPRESSIONS:
        return ((InternalEList<?>)getExpressions()).basicRemove(otherEnd, msgs);
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
      case CssPackage.MEDIA_QUERY__ONLY:
        return isOnly();
      case CssPackage.MEDIA_QUERY__NOT:
        return isNot();
      case CssPackage.MEDIA_QUERY__MEDIA_TYPE:
        return getMediaType();
      case CssPackage.MEDIA_QUERY__EXPRESSIONS:
        return getExpressions();
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
      case CssPackage.MEDIA_QUERY__ONLY:
        setOnly((Boolean)newValue);
        return;
      case CssPackage.MEDIA_QUERY__NOT:
        setNot((Boolean)newValue);
        return;
      case CssPackage.MEDIA_QUERY__MEDIA_TYPE:
        setMediaType((String)newValue);
        return;
      case CssPackage.MEDIA_QUERY__EXPRESSIONS:
        getExpressions().clear();
        getExpressions().addAll((Collection<? extends MediaQueryExpression>)newValue);
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
      case CssPackage.MEDIA_QUERY__ONLY:
        setOnly(ONLY_EDEFAULT);
        return;
      case CssPackage.MEDIA_QUERY__NOT:
        setNot(NOT_EDEFAULT);
        return;
      case CssPackage.MEDIA_QUERY__MEDIA_TYPE:
        setMediaType(MEDIA_TYPE_EDEFAULT);
        return;
      case CssPackage.MEDIA_QUERY__EXPRESSIONS:
        getExpressions().clear();
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
      case CssPackage.MEDIA_QUERY__ONLY:
        return only != ONLY_EDEFAULT;
      case CssPackage.MEDIA_QUERY__NOT:
        return not != NOT_EDEFAULT;
      case CssPackage.MEDIA_QUERY__MEDIA_TYPE:
        return MEDIA_TYPE_EDEFAULT == null ? mediaType != null : !MEDIA_TYPE_EDEFAULT.equals(mediaType);
      case CssPackage.MEDIA_QUERY__EXPRESSIONS:
        return expressions != null && !expressions.isEmpty();
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
    result.append(" (only: ");
    result.append(only);
    result.append(", not: ");
    result.append(not);
    result.append(", mediaType: ");
    result.append(mediaType);
    result.append(')');
    return result.toString();
  }

} //MediaQueryImpl
