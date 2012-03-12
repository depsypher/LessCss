/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.css.css.impl;

import java.util.Collection;

import nl.dslmeinte.xtext.css.css.CssPackage;
import nl.dslmeinte.xtext.css.css.MediaDeclaration;
import nl.dslmeinte.xtext.css.css.MediaDeclarationMembers;
import nl.dslmeinte.xtext.css.css.MediaQuery;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Media Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.css.css.impl.MediaDeclarationImpl#getMediaQueries <em>Media Queries</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.css.css.impl.MediaDeclarationImpl#getMedia <em>Media</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.css.css.impl.MediaDeclarationImpl#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MediaDeclarationImpl extends CSSOtherTopLevelDeclarationImpl implements MediaDeclaration
{
  /**
   * The cached value of the '{@link #getMediaQueries() <em>Media Queries</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMediaQueries()
   * @generated
   * @ordered
   */
  protected EList<MediaQuery> mediaQueries;

  /**
   * The cached value of the '{@link #getMedia() <em>Media</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMedia()
   * @generated
   * @ordered
   */
  protected EList<MediaQuery> media;

  /**
   * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMembers()
   * @generated
   * @ordered
   */
  protected EList<MediaDeclarationMembers> members;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MediaDeclarationImpl()
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
    return CssPackage.Literals.MEDIA_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MediaQuery> getMediaQueries()
  {
    if (mediaQueries == null)
    {
      mediaQueries = new EObjectContainmentEList<MediaQuery>(MediaQuery.class, this, CssPackage.MEDIA_DECLARATION__MEDIA_QUERIES);
    }
    return mediaQueries;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MediaQuery> getMedia()
  {
    if (media == null)
    {
      media = new EObjectContainmentEList<MediaQuery>(MediaQuery.class, this, CssPackage.MEDIA_DECLARATION__MEDIA);
    }
    return media;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MediaDeclarationMembers> getMembers()
  {
    if (members == null)
    {
      members = new EObjectContainmentEList<MediaDeclarationMembers>(MediaDeclarationMembers.class, this, CssPackage.MEDIA_DECLARATION__MEMBERS);
    }
    return members;
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
      case CssPackage.MEDIA_DECLARATION__MEDIA_QUERIES:
        return ((InternalEList<?>)getMediaQueries()).basicRemove(otherEnd, msgs);
      case CssPackage.MEDIA_DECLARATION__MEDIA:
        return ((InternalEList<?>)getMedia()).basicRemove(otherEnd, msgs);
      case CssPackage.MEDIA_DECLARATION__MEMBERS:
        return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
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
      case CssPackage.MEDIA_DECLARATION__MEDIA_QUERIES:
        return getMediaQueries();
      case CssPackage.MEDIA_DECLARATION__MEDIA:
        return getMedia();
      case CssPackage.MEDIA_DECLARATION__MEMBERS:
        return getMembers();
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
      case CssPackage.MEDIA_DECLARATION__MEDIA_QUERIES:
        getMediaQueries().clear();
        getMediaQueries().addAll((Collection<? extends MediaQuery>)newValue);
        return;
      case CssPackage.MEDIA_DECLARATION__MEDIA:
        getMedia().clear();
        getMedia().addAll((Collection<? extends MediaQuery>)newValue);
        return;
      case CssPackage.MEDIA_DECLARATION__MEMBERS:
        getMembers().clear();
        getMembers().addAll((Collection<? extends MediaDeclarationMembers>)newValue);
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
      case CssPackage.MEDIA_DECLARATION__MEDIA_QUERIES:
        getMediaQueries().clear();
        return;
      case CssPackage.MEDIA_DECLARATION__MEDIA:
        getMedia().clear();
        return;
      case CssPackage.MEDIA_DECLARATION__MEMBERS:
        getMembers().clear();
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
      case CssPackage.MEDIA_DECLARATION__MEDIA_QUERIES:
        return mediaQueries != null && !mediaQueries.isEmpty();
      case CssPackage.MEDIA_DECLARATION__MEDIA:
        return media != null && !media.isEmpty();
      case CssPackage.MEDIA_DECLARATION__MEMBERS:
        return members != null && !members.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MediaDeclarationImpl
