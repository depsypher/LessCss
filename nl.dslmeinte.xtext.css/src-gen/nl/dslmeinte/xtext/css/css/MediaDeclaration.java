/**
 * <copyright>
 * </copyright>
 *
 */
package nl.dslmeinte.xtext.css.css;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Media Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.dslmeinte.xtext.css.css.MediaDeclaration#getMediaQueries <em>Media Queries</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.css.css.MediaDeclaration#getMedia <em>Media</em>}</li>
 *   <li>{@link nl.dslmeinte.xtext.css.css.MediaDeclaration#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.dslmeinte.xtext.css.css.CssPackage#getMediaDeclaration()
 * @model
 * @generated
 */
public interface MediaDeclaration extends CSSOtherTopLevelDeclaration
{
  /**
   * Returns the value of the '<em><b>Media Queries</b></em>' containment reference list.
   * The list contents are of type {@link nl.dslmeinte.xtext.css.css.MediaQuery}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Media Queries</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Media Queries</em>' containment reference list.
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getMediaDeclaration_MediaQueries()
   * @model containment="true"
   * @generated
   */
  EList<MediaQuery> getMediaQueries();

  /**
   * Returns the value of the '<em><b>Media</b></em>' containment reference list.
   * The list contents are of type {@link nl.dslmeinte.xtext.css.css.MediaQuery}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Media</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Media</em>' containment reference list.
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getMediaDeclaration_Media()
   * @model containment="true"
   * @generated
   */
  EList<MediaQuery> getMedia();

  /**
   * Returns the value of the '<em><b>Members</b></em>' containment reference list.
   * The list contents are of type {@link nl.dslmeinte.xtext.css.css.MediaDeclarationMembers}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Members</em>' containment reference list.
   * @see nl.dslmeinte.xtext.css.css.CssPackage#getMediaDeclaration_Members()
   * @model containment="true"
   * @generated
   */
  EList<MediaDeclarationMembers> getMembers();

} // MediaDeclaration
