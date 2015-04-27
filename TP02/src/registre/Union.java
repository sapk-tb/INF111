
package registre;

import date.DateFrancaise;

import java.util.Collection;
import java.util.Iterator;

/**
 * @author prou
 *
 */
public class Union {

	/**
	 * @uml.property  name="numero"
	 */
	private int numero;


	/**
	 * @uml.property  name="dateUnion"
	 * @uml.associationEnd  readOnly="true"
	 */
	private DateFrancaise dateUnion;

	/**
	 * @uml.property  name="dateSeparation"
	 * @uml.associationEnd  readOnly="true"
	 */
	private DateFrancaise dateSeparation;

	private static int dernierNumero = 0;



	public Union(Collection lesPersonnesUnies, Personne LOfficier, Collection lesTemoins, DateFrancaise date, String leContrat) {
	}

	public void separer(DateFrancaise dateSeparation) {
	}

	public void modifierContrat( String nouveauContrat,	DateFrancaise dateNouveauContrat) {
	}

	/**
	 * @uml.property  name="contrats"
	 * @uml.associationEnd  multiplicity="(0 -1)" inverse="union:registre.Contrat"
	 */
	private Collection contrats;



	/**
	 * Getter of the property <tt>contrats</tt>
	 * @return  Returns the contrats.
	 * @uml.property  name="contrats"
	 */
	public Collection getContrats() {
		return contrats;
	}

	/**
	 * Returns an iterator over the elements in this collection. 
	 * @return  an <tt>Iterator</tt> over the elements in this collection
	 * @see java.util.Collection#iterator()
	 * @uml.property  name="contrats"
	 */
	public Iterator contratsIterator() {
		return contrats.iterator();
	}

	/**
	 * Returns <tt>true</tt> if this collection contains no elements.
	 * @return  <tt>true</tt> if this collection contains no elements
	 * @see java.util.Collection#isEmpty()
	 * @uml.property  name="contrats"
	 */
	public boolean isContratsEmpty() {
		return contrats.isEmpty();
	}

	/**
	 * Returns <tt>true</tt> if this collection contains the specified element. 
	 * @param element  whose presence in this collection is to be tested.
	 * @see java.util.Collection#contains(Object)
	 * @uml.property  name="contrats"
	 */
	public boolean containsContrats(Contrat contrat) {
		return contrats.contains(contrat);
	}

	/**
	 * Returns <tt>true</tt> if this collection contains all of the elements in the specified collection.
	 * @param elements  collection to be checked for containment in this collection.
	 * @see java.util.Collection#containsAll(Collection)
	 * @uml.property  name="contrats"
	 */
	public boolean containsAllContrats(Collection contrats) {
		return this.contrats.containsAll(contrats);
	}

	/**
	 * Returns the number of elements in this collection.
	 * @return  the number of elements in this collection
	 * @see java.util.Collection#size()
	 * @uml.property  name="contrats"
	 */
	public int contratsSize() {
		return contrats.size();
	}

	/**
	 * Returns all elements of this collection in an array.
	 * @return  an array containing all of the elements in this collection
	 * @see java.util.Collection#toArray()
	 * @uml.property  name="contrats"
	 */
	public Contrat[] contratsToArray() {
		return (Contrat[]) contrats.toArray(new Contrat[contrats.size()]);
	}

	/**
	 * Returns an array containing all of the elements in this collection;  the runtime type of the returned array is that of the specified array.
	 * @param a  the array into which the elements of this collection are to be stored.
	 * @return  an array containing all of the elements in this collection
	 * @see java.util.Collection#toArray(Object[])
	 * @uml.property  name="contrats"
	 */
	public Contrat[] contratsToArray(Contrat[] contrats) {
		return (Contrat[]) this.contrats.toArray(contrats);
	}

	/**
	 * Ensures that this collection contains the specified element (optional operation). 
	 * @param element  whose presence in this collection is to be ensured.
	 * @see java.util.Collection#add(Object)
	 * @uml.property  name="contrats"
	 */
	public boolean addContrats(Contrat contrat) {
		return contrats.add(contrat);
	}

	/**
	 * Setter of the property <tt>contrats</tt>
	 * @param contrats  the contrats to set.
	 * @uml.property  name="contrats"
	 */
	public void setContrats(Collection contrats) {
		this.contrats = contrats;
	}

	/**
	 * Removes a single instance of the specified element from this collection, if it is present (optional operation).
	 * @param element  to be removed from this collection, if present.
	 * @see java.util.Collection#add(Object)
	 * @uml.property  name="contrats"
	 */
	public boolean removeContrats(Contrat contrat) {
		return contrats.remove(contrat);
	}

	/**
	 * Removes all of the elements from this collection (optional operation).
	 * @see java.util.Collection#clear()
	 * @uml.property  name="contrats"
	 */
	public void clearContrats() {
		contrats.clear();
	}

	/**
	 * @uml.property  name="lesTemoins"
	 * @uml.associationEnd  multiplicity="(2 -1)" inverse="unionTemoignees:registre.Personne"
	 */
	private Collection lesTemoins;



	/**
	 * Getter of the property <tt>lesTemoins</tt>
	 * @return  Returns the lesTemoins.
	 * @uml.property  name="lesTemoins"
	 */
	public Collection getLesTemoins() {
		return lesTemoins;
	}

	/**
	 * Returns an iterator over the elements in this collection. 
	 * @return  an <tt>Iterator</tt> over the elements in this collection
	 * @see java.util.Collection#iterator()
	 * @uml.property  name="lesTemoins"
	 */
	public Iterator lesTemoinsIterator() {
		return lesTemoins.iterator();
	}

	/**
	 * Returns <tt>true</tt> if this collection contains no elements.
	 * @return  <tt>true</tt> if this collection contains no elements
	 * @see java.util.Collection#isEmpty()
	 * @uml.property  name="lesTemoins"
	 */
	public boolean isLesTemoinsEmpty() {
		return lesTemoins.isEmpty();
	}

	/**
	 * Returns <tt>true</tt> if this collection contains the specified element. 
	 * @param element  whose presence in this collection is to be tested.
	 * @see java.util.Collection#contains(Object)
	 * @uml.property  name="lesTemoins"
	 */
	public boolean containsLesTemoins(Personne personne) {
		return lesTemoins.contains(personne);
	}

	/**
	 * Returns <tt>true</tt> if this collection contains all of the elements in the specified collection.
	 * @param elements  collection to be checked for containment in this collection.
	 * @see java.util.Collection#containsAll(Collection)
	 * @uml.property  name="lesTemoins"
	 */
	public boolean containsAllLesTemoins(Collection lesTemoins) {
		return this.lesTemoins.containsAll(lesTemoins);
	}

	/**
	 * Returns the number of elements in this collection.
	 * @return  the number of elements in this collection
	 * @see java.util.Collection#size()
	 * @uml.property  name="lesTemoins"
	 */
	public int lesTemoinsSize() {
		return lesTemoins.size();
	}

	/**
	 * Returns all elements of this collection in an array.
	 * @return  an array containing all of the elements in this collection
	 * @see java.util.Collection#toArray()
	 * @uml.property  name="lesTemoins"
	 */
	public Personne[] lesTemoinsToArray() {
		return (Personne[]) lesTemoins.toArray(new Personne[lesTemoins.size()]);
	}

	/**
	 * Returns an array containing all of the elements in this collection;  the runtime type of the returned array is that of the specified array.
	 * @param a  the array into which the elements of this collection are to be stored.
	 * @return  an array containing all of the elements in this collection
	 * @see java.util.Collection#toArray(Object[])
	 * @uml.property  name="lesTemoins"
	 */
	public Personne[] lesTemoinsToArray(Personne[] lesTemoins) {
		return (Personne[]) this.lesTemoins.toArray(lesTemoins);
	}

	/**
	 * Ensures that this collection contains the specified element (optional operation). 
	 * @param element  whose presence in this collection is to be ensured.
	 * @see java.util.Collection#add(Object)
	 * @uml.property  name="lesTemoins"
	 */
	public boolean addLesTemoins(Personne personne) {
		return lesTemoins.add(personne);
	}

	/**
	 * Setter of the property <tt>lesTemoins</tt>
	 * @param lesTemoins  the lesTemoins to set.
	 * @uml.property  name="lesTemoins"
	 */
	public void setLesTemoins(Collection lesTemoins) {
		this.lesTemoins = lesTemoins;
	}

	/**
	 * Removes a single instance of the specified element from this collection, if it is present (optional operation).
	 * @param element  to be removed from this collection, if present.
	 * @see java.util.Collection#add(Object)
	 * @uml.property  name="lesTemoins"
	 */
	public boolean removeLesTemoins(Personne personne) {
		return lesTemoins.remove(personne);
	}

	/**
	 * Removes all of the elements from this collection (optional operation).
	 * @see java.util.Collection#clear()
	 * @uml.property  name="lesTemoins"
	 */
	public void clearLesTemoins() {
		lesTemoins.clear();
	}

	/** 
	 * @uml.property name="lesSepares"
	 * @uml.associationEnd inverse="unionSeparees:registre.Personne"
	 */
	private Personne lesSepares;



	/** 
	 * Getter of the property <tt>lesSepares</tt>
	 * @return  Returns the lesSepares.
	 * @uml.property  name="lesSepares"
	 */
	public Personne getLesSepares() {
		return lesSepares;
	}

	/** 
	 * Setter of the property <tt>lesSepares</tt>
	 * @param lesSepares  The lesSepares to set.
	 * @uml.property  name="lesSepares"
	 */
	public void setLesSepares(Personne lesSepares) {
		this.lesSepares = lesSepares;
	}

	/**
	 * @uml.property  name="lesUnis"
	 * @uml.associationEnd  multiplicity="(2 -1)" inverse="unionEnCours:registre.Personne"
	 */
	private Collection lesUnis;



	/**
	 * Getter of the property <tt>lesUnis</tt>
	 * @return  Returns the lesUnis.
	 * @uml.property  name="lesUnis"
	 */
	public Collection getLesUnis() {
		return lesUnis;
	}

	/**
	 * Returns an iterator over the elements in this collection. 
	 * @return  an <tt>Iterator</tt> over the elements in this collection
	 * @see java.util.Collection#iterator()
	 * @uml.property  name="lesUnis"
	 */
	public Iterator lesUnisIterator() {
		return lesUnis.iterator();
	}

	/**
	 * Returns <tt>true</tt> if this collection contains no elements.
	 * @return  <tt>true</tt> if this collection contains no elements
	 * @see java.util.Collection#isEmpty()
	 * @uml.property  name="lesUnis"
	 */
	public boolean isLesUnisEmpty() {
		return lesUnis.isEmpty();
	}

	/**
	 * Returns <tt>true</tt> if this collection contains the specified element. 
	 * @param element  whose presence in this collection is to be tested.
	 * @see java.util.Collection#contains(Object)
	 * @uml.property  name="lesUnis"
	 */
	public boolean containsLesUnis(Personne personne) {
		return lesUnis.contains(personne);
	}

	/**
	 * Returns <tt>true</tt> if this collection contains all of the elements in the specified collection.
	 * @param elements  collection to be checked for containment in this collection.
	 * @see java.util.Collection#containsAll(Collection)
	 * @uml.property  name="lesUnis"
	 */
	public boolean containsAllLesUnis(Collection lesUnis) {
		return this.lesUnis.containsAll(lesUnis);
	}

	/**
	 * Returns the number of elements in this collection.
	 * @return  the number of elements in this collection
	 * @see java.util.Collection#size()
	 * @uml.property  name="lesUnis"
	 */
	public int lesUnisSize() {
		return lesUnis.size();
	}

	/**
	 * Returns all elements of this collection in an array.
	 * @return  an array containing all of the elements in this collection
	 * @see java.util.Collection#toArray()
	 * @uml.property  name="lesUnis"
	 */
	public Personne[] lesUnisToArray() {
		return (Personne[]) lesUnis.toArray(new Personne[lesUnis.size()]);
	}

	/**
	 * Returns an array containing all of the elements in this collection;  the runtime type of the returned array is that of the specified array.
	 * @param a  the array into which the elements of this collection are to be stored.
	 * @return  an array containing all of the elements in this collection
	 * @see java.util.Collection#toArray(Object[])
	 * @uml.property  name="lesUnis"
	 */
	public Personne[] lesUnisToArray(Personne[] lesUnis) {
		return (Personne[]) this.lesUnis.toArray(lesUnis);
	}

	/**
	 * Ensures that this collection contains the specified element (optional operation). 
	 * @param element  whose presence in this collection is to be ensured.
	 * @see java.util.Collection#add(Object)
	 * @uml.property  name="lesUnis"
	 */
	public boolean addLesUnis(Personne personne) {
		return lesUnis.add(personne);
	}

	/**
	 * Setter of the property <tt>lesUnis</tt>
	 * @param lesUnis  the lesUnis to set.
	 * @uml.property  name="lesUnis"
	 */
	public void setLesUnis(Collection lesUnis) {
		this.lesUnis = lesUnis;
	}

	/**
	 * Removes a single instance of the specified element from this collection, if it is present (optional operation).
	 * @param element  to be removed from this collection, if present.
	 * @see java.util.Collection#add(Object)
	 * @uml.property  name="lesUnis"
	 */
	public boolean removeLesUnis(Personne personne) {
		return lesUnis.remove(personne);
	}

	/**
	 * Removes all of the elements from this collection (optional operation).
	 * @see java.util.Collection#clear()
	 * @uml.property  name="lesUnis"
	 */
	public void clearLesUnis() {
		lesUnis.clear();
	}

	/**
	 * @uml.property  name="officier"
	 * @uml.associationEnd  multiplicity="(1 1)" inverse="unionOfficiees:registre.Personne"
	 */
	private Personne officier = null;



	/**
	 * Getter of the property <tt>officier</tt>
	 * @return  Returns the officier.
	 * @uml.property  name="officier"
	 */
	public Personne getOfficier() {
		return officier;
	}

	/**
	 * Setter of the property <tt>officier</tt>
	 * @param officier  The officier to set.
	 * @uml.property  name="officier"
	 */
	public void setOfficier(Personne officier) {
		this.officier = officier;
	}



}
