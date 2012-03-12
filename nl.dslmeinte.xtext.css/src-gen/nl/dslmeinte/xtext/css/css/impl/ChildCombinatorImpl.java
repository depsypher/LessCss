/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.css.css.impl;

import nl.dslmeinte.xtext.css.css.ChildCombinator;
import nl.dslmeinte.xtext.css.css.CssPackage;
import nl.dslmeinte.xtext.css.css.Selector;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Child Combinator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.css.css.impl.ChildCombinatorImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.css.css.impl.ChildCombinatorImpl#getWsL <em>Ws L</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.css.css.impl.ChildCombinatorImpl#getWsR <em>Ws R</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.css.css.impl.ChildCombinatorImpl#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChildCombinatorImpl extends SelectorImpl implements ChildCombinator
{
  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected Selector left;

  /**
   * The default value of the '{@link #getWsL() <em>Ws L</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWsL()
   * @generated
   * @ordered
   */
  protected static final String WS_L_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getWsL() <em>Ws L</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWsL()
   * @generated
   * @ordered
   */
  protected String wsL = WS_L_EDEFAULT;

  /**
   * The default value of the '{@link #getWsR() <em>Ws R</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWsR()
   * @generated
   * @ordered
   */
  protected static final String WS_R_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getWsR() <em>Ws R</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWsR()
   * @generated
   * @ordered
   */
  protected String wsR = WS_R_EDEFAULT;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected Selector right;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ChildCombinatorImpl()
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
    return CssPackage.Literals.CHILD_COMBINATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Selector getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(Selector newLeft, NotificationChain msgs)
  {
    Selector oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CssPackage.CHILD_COMBINATOR__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(Selector newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CssPackage.CHILD_COMBINATOR__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CssPackage.CHILD_COMBINATOR__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssPackage.CHILD_COMBINATOR__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getWsL()
  {
    return wsL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWsL(String newWsL)
  {
    String oldWsL = wsL;
    wsL = newWsL;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssPackage.CHILD_COMBINATOR__WS_L, oldWsL, wsL));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getWsR()
  {
    return wsR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWsR(String newWsR)
  {
    String oldWsR = wsR;
    wsR = newWsR;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssPackage.CHILD_COMBINATOR__WS_R, oldWsR, wsR));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Selector getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(Selector newRight, NotificationChain msgs)
  {
    Selector oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CssPackage.CHILD_COMBINATOR__RIGHT, oldRight, newRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight(Selector newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CssPackage.CHILD_COMBINATOR__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CssPackage.CHILD_COMBINATOR__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssPackage.CHILD_COMBINATOR__RIGHT, newRight, newRight));
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
      case CssPackage.CHILD_COMBINATOR__LEFT:
        return basicSetLeft(null, msgs);
      case CssPackage.CHILD_COMBINATOR__RIGHT:
        return basicSetRight(null, msgs);
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
      case CssPackage.CHILD_COMBINATOR__LEFT:
        return getLeft();
      case CssPackage.CHILD_COMBINATOR__WS_L:
        return getWsL();
      case CssPackage.CHILD_COMBINATOR__WS_R:
        return getWsR();
      case CssPackage.CHILD_COMBINATOR__RIGHT:
        return getRight();
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
      case CssPackage.CHILD_COMBINATOR__LEFT:
        setLeft((Selector)newValue);
        return;
      case CssPackage.CHILD_COMBINATOR__WS_L:
        setWsL((String)newValue);
        return;
      case CssPackage.CHILD_COMBINATOR__WS_R:
        setWsR((String)newValue);
        return;
      case CssPackage.CHILD_COMBINATOR__RIGHT:
        setRight((Selector)newValue);
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
      case CssPackage.CHILD_COMBINATOR__LEFT:
        setLeft((Selector)null);
        return;
      case CssPackage.CHILD_COMBINATOR__WS_L:
        setWsL(WS_L_EDEFAULT);
        return;
      case CssPackage.CHILD_COMBINATOR__WS_R:
        setWsR(WS_R_EDEFAULT);
        return;
      case CssPackage.CHILD_COMBINATOR__RIGHT:
        setRight((Selector)null);
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
      case CssPackage.CHILD_COMBINATOR__LEFT:
        return left != null;
      case CssPackage.CHILD_COMBINATOR__WS_L:
        return WS_L_EDEFAULT == null ? wsL != null : !WS_L_EDEFAULT.equals(wsL);
      case CssPackage.CHILD_COMBINATOR__WS_R:
        return WS_R_EDEFAULT == null ? wsR != null : !WS_R_EDEFAULT.equals(wsR);
      case CssPackage.CHILD_COMBINATOR__RIGHT:
        return right != null;
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
    result.append(" (wsL: ");
    result.append(wsL);
    result.append(", wsR: ");
    result.append(wsR);
    result.append(')');
    return result.toString();
  }

} //ChildCombinatorImpl
