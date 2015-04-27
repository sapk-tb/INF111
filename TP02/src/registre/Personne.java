
   package registre;

import date.DateFrancaise;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author prou
 *
 */
    public class Personne {
   
      /**
	 * @uml.property  name="nom"
	 */
    private String nom;
   
      /**
	 * @uml.property  name="prenom"
	 */
    private String prenom;
   
      /**
	 * @uml.property  name="sexe"
	 */
    private char sexe;
   
      /**
	 * @uml.property  name="communeNaissance"
	 */
    private String communeNaissance;
   
      /**
	 * @uml.property  name="dateNaissance"
	 * @uml.associationEnd  readOnly="true"
	 */
    private DateFrancaise dateNaissance;
   
      /**
	 * @uml.property  name="dateDeces"
	 * @uml.associationEnd  readOnly="true"
	 */
    private DateFrancaise dateDeces;
   
      /**
	 * @uml.property  name="numero"
	 */
    private int numero;
   
      private static int dernierNumero = 0;
   
   
   
       public Personne(Personne personne) {
      }
   
       public Personne(String nom, String prenom,  char sexe,  DateFrancaise dateNaissance, String communeNaissance) {
      }

	/**
	 * @uml.property  name="registre"
	 * @uml.associationEnd  multiplicity="(0 -1)" inverse="personne:registre.Registre"
	 */
	private Collection registre;



	/**
	 * Getter of the property <tt>registre</tt>
	 * @return  Returns the registre.
	 * @uml.property  name="registre"
	 */
	public Collection getRegistre() {
		return registre;
	}

	/**
	 * Returns an iterator over the elements in this collection. 
	 * @return  an <tt>Iterator</tt> over the elements in this collection
	 * @see java.util.Collection#iterator()
	 * @uml.property  name="registre"
	 */
	public Iterator registreIterator() {
		return registre.iterator();
	}

	/**
	 * Returns <tt>true</tt> if this collection contains no elements.
	 * @return  <tt>true</tt> if this collection contains no elements
	 * @see java.util.Collection#isEmpty()
	 * @uml.property  name="registre"
	 */
	public boolean isRegistreEmpty() {
		return registre.isEmpty();
	}

	/**
	 * Returns <tt>true</tt> if this collection contains the specified element. 
	 * @param element  whose presence in this collection is to be tested.
	 * @see java.util.Collection#contains(Object)
	 * @uml.property  name="registre"
	 */
	public boolean containsRegistre(Registre registre) {
		return this.registre.contains(registre);
	}

	/**
	 * Returns <tt>true</tt> if this collection contains all of the elements in the specified collection.
	 * @param elements  collection to be checked for containment in this collection.
	 * @see java.util.Collection#containsAll(Collection)
	 * @uml.property  name="registre"
	 */
	public boolean containsAllRegistre(Collection registre) {
		return this.registre.containsAll(registre);
	}

	/**
	 * Returns the number of elements in this collection.
	 * @return  the number of elements in this collection
	 * @see java.util.Collection#size()
	 * @uml.property  name="registre"
	 */
	public int registreSize() {
		return registre.size();
	}

	/**
	 * Returns all elements of this collection in an array.
	 * @return  an array containing all of the elements in this collection
	 * @see java.util.Collection#toArray()
	 * @uml.property  name="registre"
	 */
	public Registre[] registreToArray() {
		return (Registre[]) registre.toArray(new Registre[registre.size()]);
	}

	/**
	 * Returns an array containing all of the elements in this collection;  the runtime type of the returned array is that of the specified array.
	 * @param a  the array into which the elements of this collection are to be stored.
	 * @return  an array containing all of the elements in this collection
	 * @see java.util.Collection#toArray(Object[])
	 * @uml.property  name="registre"
	 */
	public Registre[] registreToArray(Registre[] registre) {
		return (Registre[]) this.registre.toArray(registre);
	}

	/**
	 * Ensures that this collection contains the specified element (optional operation). 
	 * @param element  whose presence in this collection is to be ensured.
	 * @see java.util.Collection#add(Object)
	 * @uml.property  name="registre"
	 */
	public boolean addRegistre(Registre registre) {
		return this.registre.add(registre);
	}

	/**
	 * Setter of the property <tt>registre</tt>
	 * @param registre  the registre to set.
	 * @uml.property  name="registre"
	 */
	public void setRegistre(Collection registre) {
		this.registre = registre;
	}

	/**
	 * Removes a single instance of the specified element from this collection, if it is present (optional operation).
	 * @param element  to be removed from this collection, if present.
	 * @see java.util.Collection#add(Object)
	 * @uml.property  name="registre"
	 */
	public boolean removeRegistre(Registre registre) {
		return this.registre.remove(registre);
	}

	/**
	 * Removes all of the elements from this collection (optional operation).
	 * @see java.util.Collection#clear()
	 * @uml.property  name="registre"
	 */
	public void clearRegistre() {
		this.registre.clear();
	}

	/**
	 * @uml.property  name="unionTemoignees"
	 * @uml.associationEnd  multiplicity="(0 -1)" inverse="lesTemoins:registre.Union"
	 */
	private Collection unionTemoignees;



	/**
	 * Getter of the property <tt>unionTemoignees</tt>
	 * @return  Returns the unionTemoignees.
	 * @uml.property  name="unionTemoignees"
	 */
	public Collection getUnionTemoignees() {
		return unionTemoignees;
	}

	/**
	 * Returns an iterator over the elements in this collection. 
	 * @return  an <tt>Iterator</tt> over the elements in this collection
	 * @see java.util.Collection#iterator()
	 * @uml.property  name="unionTemoignees"
	 */
	public Iterator unionTemoigneesIterator() {
		return unionTemoignees.iterator();
	}

	/**
	 * Returns <tt>true</tt> if this collection contains no elements.
	 * @return  <tt>true</tt> if this collection contains no elements
	 * @see java.util.Collection#isEmpty()
	 * @uml.property  name="unionTemoignees"
	 */
	public boolean isUnionTemoigneesEmpty() {
		return unionTemoignees.isEmpty();
	}

	/**
	 * Returns <tt>true</tt> if this collection contains the specified element. 
	 * @param element  whose presence in this collection is to be tested.
	 * @see java.util.Collection#contains(Object)
	 * @uml.property  name="unionTemoignees"
	 */
	public boolean containsUnionTemoignees(Union union) {
		return unionTemoignees.contains(union);
	}

	/**
	 * Returns <tt>true</tt> if this collection contains all of the elements in the specified collection.
	 * @param elements  collection to be checked for containment in this collection.
	 * @see java.util.Collection#containsAll(Collection)
	 * @uml.property  name="unionTemoignees"
	 */
	public boolean containsAllUnionTemoignees(Collection unionTemoignees) {
		return this.unionTemoignees.containsAll(unionTemoignees);
	}

	/**
	 * Returns the number of elements in this collection.
	 * @return  the number of elements in this collection
	 * @see java.util.Collection#size()
	 * @uml.property  name="unionTemoignees"
	 */
	public int unionTemoigneesSize() {
		return unionTemoignees.size();
	}

	/**
	 * Returns all elements of this collection in an array.
	 * @return  an array containing all of the elements in this collection
	 * @see java.util.Collection#toArray()
	 * @uml.property  name="unionTemoignees"
	 */
	public Union[] unionTemoigneesToArray() {
		return (Union[]) unionTemoignees.toArray(new Union[unionTemoignees.size()]);
	}

	/**
	 * Returns an array containing all of the elements in this collection;  the runtime type of the returned array is that of the specified array.
	 * @param a  the array into which the elements of this collection are to be stored.
	 * @return  an array containing all of the elements in this collection
	 * @see java.util.Collection#toArray(Object[])
	 * @uml.property  name="unionTemoignees"
	 */
	public Union[] unionTemoigneesToArray(Union[] unionTemoignees) {
		return (Union[]) this.unionTemoignees.toArray(unionTemoignees);
	}

	/**
	 * Ensures that this collection contains the specified element (optional operation). 
	 * @param element  whose presence in this collection is to be ensured.
	 * @see java.util.Collection#add(Object)
	 * @uml.property  name="unionTemoignees"
	 */
	public boolean addUnionTemoignees(Union union) {
		return unionTemoignees.add(union);
	}

	/**
	 * Setter of the property <tt>unionTemoignees</tt>
	 * @param unionTemoignees  the unionTemoignees to set.
	 * @uml.property  name="unionTemoignees"
	 */
	public void setUnionTemoignees(Collection unionTemoignees) {
		this.unionTemoignees = unionTemoignees;
	}

	/**
	 * Removes a single instance of the specified element from this collection, if it is present (optional operation).
	 * @param element  to be removed from this collection, if present.
	 * @see java.util.Collection#add(Object)
	 * @uml.property  name="unionTemoignees"
	 */
	public boolean removeUnionTemoignees(Union union) {
		return unionTemoignees.remove(union);
	}

	/**
	 * Removes all of the elements from this collection (optional operation).
	 * @see java.util.Collection#clear()
	 * @uml.property  name="unionTemoignees"
	 */
	public void clearUnionTemoignees() {
		unionTemoignees.clear();
	}

	/** 
	 * @uml.property name="unionSeparees"
	 * @uml.associationEnd multiplicity="(0 -1)" inverse="lesSepares:registre.Union"
	 */
	private Collection unionSeparee;



	/**
	 * @uml.property  name="unionEnCours"
	 * @uml.associationEnd  inverse="lesUnis:registre.Union"
	 */
	private Union unionEnCours;



	/**
	 * Getter of the property <tt>unionEnCours</tt>
	 * @return  Returns the unionEnCours.
	 * @uml.property  name="unionEnCours"
	 */
	public Union getUnionEnCours() {
		return unionEnCours;
	}

	/**
	 * Setter of the property <tt>unionEnCours</tt>
	 * @param unionEnCours  The unionEnCours to set.
	 * @uml.property  name="unionEnCours"
	 */
	public void setUnionEnCours(Union unionEnCours) {
		this.unionEnCours = unionEnCours;
	}

	/**
	 * Getter of the property <tt>unionSeparees</tt>
	 * @return  Returns the unionSeparee.
	 * @uml.property  name="unionSeparees"
	 */
	public Collection getUnionSeparees() {
		return unionSeparee;
	}

	/**
	 * Returns an iterator over the elements in this collection. 
	 * @return  an <tt>Iterator</tt> over the elements in this collection
	 * @see java.util.Collection#iterator()
	 * @uml.property  name="unionSeparees"
	 */
	public Iterator unionSepareesIterator() {
		return unionSeparee.iterator();
	}

	/**
	 * Returns <tt>true</tt> if this collection contains no elements.
	 * @return  <tt>true</tt> if this collection contains no elements
	 * @see java.util.Collection#isEmpty()
	 * @uml.property  name="unionSeparees"
	 */
	public boolean isUnionSepareesEmpty() {
		return unionSeparee.isEmpty();
	}

	/**
	 * Returns <tt>true</tt> if this collection contains the specified element. 
	 * @param element  whose presence in this collection is to be tested.
	 * @see java.util.Collection#contains(Object)
	 * @uml.property  name="unionSeparees"
	 */
	public boolean containsUnionSeparees(Union union) {
		return unionSeparee.contains(union);
	}

	/**
	 * Returns <tt>true</tt> if this collection contains all of the elements in the specified collection.
	 * @param elements  collection to be checked for containment in this collection.
	 * @see java.util.Collection#containsAll(Collection)
	 * @uml.property  name="unionSeparees"
	 */
	public boolean containsAllUnionSeparees(Collection unionSeparees) {
		return unionSeparee.containsAll(unionSeparees);
	}

	/**
	 * Returns the number of elements in this collection.
	 * @return  the number of elements in this collection
	 * @see java.util.Collection#size()
	 * @uml.property  name="unionSeparees"
	 */
	public int unionSepareesSize() {
		return unionSeparee.size();
	}

	/**
	 * Returns all elements of this collection in an array.
	 * @return  an array containing all of the elements in this collection
	 * @see java.util.Collection#toArray()
	 * @uml.property  name="unionSeparees"
	 */
	public Union[] unionSepareesToArray() {
		return (Union[]) unionSeparee.toArray(new Union[unionSeparee.size()]);
	}

	/**
	 * Returns an array containing all of the elements in this collection;  the runtime type of the returned array is that of the specified array.
	 * @param a  the array into which the elements of this collection are to be stored.
	 * @return  an array containing all of the elements in this collection
	 * @see java.util.Collection#toArray(Object[])
	 * @uml.property  name="unionSeparees"
	 */
	public Union[] unionSepareesToArray(Union[] unionSeparees) {
		return (Union[]) unionSeparee.toArray(unionSeparees);
	}

	/**
	 * Ensures that this collection contains the specified element (optional operation). 
	 * @param element  whose presence in this collection is to be ensured.
	 * @see java.util.Collection#add(Object)
	 * @uml.property  name="unionSeparees"
	 */
	public boolean addUnionSeparees(Union union) {
		return unionSeparee.add(union);
	}

	/**
	 * Setter of the property <tt>unionSeparees</tt>
	 * @param unionSeparees  the unionSeparee to set.
	 * @uml.property  name="unionSeparees"
	 */
	public void setUnionSeparees(Collection unionSeparees) {
		this.unionSeparee = unionSeparees;
	}

	/**
	 * Removes a single instance of the specified element from this collection, if it is present (optional operation).
	 * @param element  to be removed from this collection, if present.
	 * @see java.util.Collection#add(Object)
	 * @uml.property  name="unionSeparees"
	 */
	public boolean removeUnionSeparees(Union union) {
		return unionSeparee.remove(union);
	}

	/**
	 * Removes all of the elements from this collection (optional operation).
	 * @see java.util.Collection#clear()
	 * @uml.property  name="unionSeparees"
	 */
	public void clearUnionSeparees() {
		unionSeparee.clear();
	}

	/**
	 * @uml.property  name="unionOfficiees"
	 * @uml.associationEnd  multiplicity="(0 -1)" inverse="officier:registre.Union"
	 */
	private Collection unionOfficiees;



	/**
	 * Getter of the property <tt>unionOfficiees</tt>
	 * @return  Returns the unionOfficiees.
	 * @uml.property  name="unionOfficiees"
	 */
	public Collection getUnionOfficiees() {
		return unionOfficiees;
	}

	/**
	 * Returns an iterator over the elements in this collection. 
	 * @return  an <tt>Iterator</tt> over the elements in this collection
	 * @see java.util.Collection#iterator()
	 * @uml.property  name="unionOfficiees"
	 */
	public Iterator unionOfficieesIterator() {
		return unionOfficiees.iterator();
	}

	/**
	 * Returns <tt>true</tt> if this collection contains no elements.
	 * @return  <tt>true</tt> if this collection contains no elements
	 * @see java.util.Collection#isEmpty()
	 * @uml.property  name="unionOfficiees"
	 */
	public boolean isUnionOfficieesEmpty() {
		return unionOfficiees.isEmpty();
	}

	/**
	 * Returns <tt>true</tt> if this collection contains the specified element. 
	 * @param element  whose presence in this collection is to be tested.
	 * @see java.util.Collection#contains(Object)
	 * @uml.property  name="unionOfficiees"
	 */
	public boolean containsUnionOfficiees(Union union) {
		return unionOfficiees.contains(union);
	}

	/**
	 * Returns <tt>true</tt> if this collection contains all of the elements in the specified collection.
	 * @param elements  collection to be checked for containment in this collection.
	 * @see java.util.Collection#containsAll(Collection)
	 * @uml.property  name="unionOfficiees"
	 */
	public boolean containsAllUnionOfficiees(Collection unionOfficiees) {
		return this.unionOfficiees.containsAll(unionOfficiees);
	}

	/**
	 * Returns the number of elements in this collection.
	 * @return  the number of elements in this collection
	 * @see java.util.Collection#size()
	 * @uml.property  name="unionOfficiees"
	 */
	public int unionOfficieesSize() {
		return unionOfficiees.size();
	}

	/**
	 * Returns all elements of this collection in an array.
	 * @return  an array containing all of the elements in this collection
	 * @see java.util.Collection#toArray()
	 * @uml.property  name="unionOfficiees"
	 */
	public Union[] unionOfficieesToArray() {
		return (Union[]) unionOfficiees
				.toArray(new Union[unionOfficiees.size()]);
	}

	/**
	 * Returns an array containing all of the elements in this collection;  the runtime type of the returned array is that of the specified array.
	 * @param a  the array into which the elements of this collection are to be stored.
	 * @return  an array containing all of the elements in this collection
	 * @see java.util.Collection#toArray(Object[])
	 * @uml.property  name="unionOfficiees"
	 */
	public Union[] unionOfficieesToArray(Union[] unionOfficiees) {
		return (Union[]) this.unionOfficiees.toArray(unionOfficiees);
	}

	/**
	 * Ensures that this collection contains the specified element (optional operation). 
	 * @param element  whose presence in this collection is to be ensured.
	 * @see java.util.Collection#add(Object)
	 * @uml.property  name="unionOfficiees"
	 */
	public boolean addUnionOfficiees(Union union) {
		return unionOfficiees.add(union);
	}

	/**
	 * Setter of the property <tt>unionOfficiees</tt>
	 * @param unionOfficiees  the unionOfficiees to set.
	 * @uml.property  name="unionOfficiees"
	 */
	public void setUnionOfficiees(Collection unionOfficiees) {
		this.unionOfficiees = unionOfficiees;
	}

	/**
	 * Removes a single instance of the specified element from this collection, if it is present (optional operation).
	 * @param element  to be removed from this collection, if present.
	 * @see java.util.Collection#add(Object)
	 * @uml.property  name="unionOfficiees"
	 */
	public boolean removeUnionOfficiees(Union union) {
		return unionOfficiees.remove(union);
	}

	/**
	 * Removes all of the elements from this collection (optional operation).
	 * @see java.util.Collection#clear()
	 * @uml.property  name="unionOfficiees"
	 */
	public void clearUnionOfficiees() {
		unionOfficiees.clear();
	}
   
   
   }
