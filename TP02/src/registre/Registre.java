   package registre;

   import date.DateFrancaise;
import java.util.Collection;
import java.util.Iterator;


/**
 * @author prou
 *
 */
    public class Registre extends Personne {
   
      public Registre(Personne personne) {
		super(personne);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @uml.property  name="nom"
	 */
    private String nom;
   
   
   
   
       public int ajouterPersonne() {
         return 0;
      }
   
       public void consulter() {
      }
   
       public Personne rechercherPersonne(Personne personne) {
         return null;
      }
   
       public void modifierContrat() {
      }
   
       public void redigerDeces(){
      
      }
   	
       public void redigerSeparation() {
      
      }
   
       public int  redigerUnion()  {
         return 0;
      }
   
   
       public String saisirContrat() {
         return null;
      }
   
       public DateFrancaise saisirDate() {
         return null;
      }
   
       public Personne saisirPersonne() {
         return null;
      }

	/**
	 * @uml.property  name="personne"
	 * @uml.associationEnd  inverse="registre:registre.Personne"
	 */
	private Personne personne;




	/**
	 * Getter of the property <tt>personne</tt>
	 * @return  Returns the personne.
	 * @uml.property  name="personne"
	 */
	public Personne getPersonne() {
		return personne;
	}

	/**
	 * Setter of the property <tt>personne</tt>
	 * @param personne  The personne to set.
	 * @uml.property  name="personne"
	 */
	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	/**
	 * @uml.property  name="lesUnions"
	 * @uml.associationEnd  multiplicity="(0 -1)" inverse="registre:registre.Union"
	 */
	private Collection lesUnions;




	/**
	 * Getter of the property <tt>lesUnions</tt>
	 * @return  Returns the lesUnions.
	 * @uml.property  name="lesUnions"
	 */
	public Collection getLesUnions() {
		return lesUnions;
	}

	/**
	 * Returns an iterator over the elements in this collection. 
	 * @return  an <tt>Iterator</tt> over the elements in this collection
	 * @see java.util.Collection#iterator()
	 * @uml.property  name="lesUnions"
	 */
	public Iterator lesUnionsIterator() {
		return lesUnions.iterator();
	}

	/**
	 * Returns <tt>true</tt> if this collection contains no elements.
	 * @return  <tt>true</tt> if this collection contains no elements
	 * @see java.util.Collection#isEmpty()
	 * @uml.property  name="lesUnions"
	 */
	public boolean isLesUnionsEmpty() {
		return lesUnions.isEmpty();
	}

	/**
	 * Returns <tt>true</tt> if this collection contains the specified element. 
	 * @param element  whose presence in this collection is to be tested.
	 * @see java.util.Collection#contains(Object)
	 * @uml.property  name="lesUnions"
	 */
	public boolean containsLesUnions(Union union) {
		return lesUnions.contains(union);
	}

	/**
	 * Returns <tt>true</tt> if this collection contains all of the elements in the specified collection.
	 * @param elements  collection to be checked for containment in this collection.
	 * @see java.util.Collection#containsAll(Collection)
	 * @uml.property  name="lesUnions"
	 */
	public boolean containsAllLesUnions(Collection lesUnions) {
		return this.lesUnions.containsAll(lesUnions);
	}

	/**
	 * Returns the number of elements in this collection.
	 * @return  the number of elements in this collection
	 * @see java.util.Collection#size()
	 * @uml.property  name="lesUnions"
	 */
	public int lesUnionsSize() {
		return lesUnions.size();
	}

	/**
	 * Returns all elements of this collection in an array.
	 * @return  an array containing all of the elements in this collection
	 * @see java.util.Collection#toArray()
	 * @uml.property  name="lesUnions"
	 */
	public Union[] lesUnionsToArray() {
		return (Union[]) lesUnions.toArray(new Union[lesUnions.size()]);
	}

	/**
	 * Returns an array containing all of the elements in this collection;  the runtime type of the returned array is that of the specified array.
	 * @param a  the array into which the elements of this collection are to be stored.
	 * @return  an array containing all of the elements in this collection
	 * @see java.util.Collection#toArray(Object[])
	 * @uml.property  name="lesUnions"
	 */
	public Union[] lesUnionsToArray(Union[] lesUnions) {
		return (Union[]) this.lesUnions.toArray(lesUnions);
	}

	/**
	 * Ensures that this collection contains the specified element (optional operation). 
	 * @param element  whose presence in this collection is to be ensured.
	 * @see java.util.Collection#add(Object)
	 * @uml.property  name="lesUnions"
	 */
	public boolean addLesUnions(Union union) {
		return lesUnions.add(union);
	}

	/**
	 * Setter of the property <tt>lesUnions</tt>
	 * @param lesUnions  the lesUnions to set.
	 * @uml.property  name="lesUnions"
	 */
	public void setLesUnions(Collection lesUnions) {
		this.lesUnions = lesUnions;
	}

	/**
	 * Removes a single instance of the specified element from this collection, if it is present (optional operation).
	 * @param element  to be removed from this collection, if present.
	 * @see java.util.Collection#add(Object)
	 * @uml.property  name="lesUnions"
	 */
	public boolean removeLesUnions(Union union) {
		return lesUnions.remove(union);
	}

	/**
	 * Removes all of the elements from this collection (optional operation).
	 * @see java.util.Collection#clear()
	 * @uml.property  name="lesUnions"
	 */
	public void clearLesUnions() {
		lesUnions.clear();
	}

	/**
	 * @uml.property  name="lesPersonnes"
	 * @uml.associationEnd  multiplicity="(0 -1)" inverse="registre1:registre.Personne"
	 */
	private Collection lesPersonnes;




	/**
	 * Getter of the property <tt>lesPersonnes</tt>
	 * @return  Returns the lesPersonnes.
	 * @uml.property  name="lesPersonnes"
	 */
	public Collection getLesPersonnes() {
		return lesPersonnes;
	}

	/**
	 * Returns an iterator over the elements in this collection. 
	 * @return  an <tt>Iterator</tt> over the elements in this collection
	 * @see java.util.Collection#iterator()
	 * @uml.property  name="lesPersonnes"
	 */
	public Iterator lesPersonnesIterator() {
		return lesPersonnes.iterator();
	}

	/**
	 * Returns <tt>true</tt> if this collection contains no elements.
	 * @return  <tt>true</tt> if this collection contains no elements
	 * @see java.util.Collection#isEmpty()
	 * @uml.property  name="lesPersonnes"
	 */
	public boolean isLesPersonnesEmpty() {
		return lesPersonnes.isEmpty();
	}

	/**
	 * Returns <tt>true</tt> if this collection contains the specified element. 
	 * @param element  whose presence in this collection is to be tested.
	 * @see java.util.Collection#contains(Object)
	 * @uml.property  name="lesPersonnes"
	 */
	public boolean containsLesPersonnes(Personne personne) {
		return lesPersonnes.contains(personne);
	}

	/**
	 * Returns <tt>true</tt> if this collection contains all of the elements in the specified collection.
	 * @param elements  collection to be checked for containment in this collection.
	 * @see java.util.Collection#containsAll(Collection)
	 * @uml.property  name="lesPersonnes"
	 */
	public boolean containsAllLesPersonnes(Collection lesPersonnes) {
		return this.lesPersonnes.containsAll(lesPersonnes);
	}

	/**
	 * Returns the number of elements in this collection.
	 * @return  the number of elements in this collection
	 * @see java.util.Collection#size()
	 * @uml.property  name="lesPersonnes"
	 */
	public int lesPersonnesSize() {
		return lesPersonnes.size();
	}

	/**
	 * Returns all elements of this collection in an array.
	 * @return  an array containing all of the elements in this collection
	 * @see java.util.Collection#toArray()
	 * @uml.property  name="lesPersonnes"
	 */
	public Personne[] lesPersonnesToArray() {
		return (Personne[]) lesPersonnes.toArray(new Personne[lesPersonnes
				.size()]);
	}

	/**
	 * Returns an array containing all of the elements in this collection;  the runtime type of the returned array is that of the specified array.
	 * @param a  the array into which the elements of this collection are to be stored.
	 * @return  an array containing all of the elements in this collection
	 * @see java.util.Collection#toArray(Object[])
	 * @uml.property  name="lesPersonnes"
	 */
	public Personne[] lesPersonnesToArray(Personne[] lesPersonnes) {
		return (Personne[]) this.lesPersonnes.toArray(lesPersonnes);
	}

	/**
	 * Ensures that this collection contains the specified element (optional operation). 
	 * @param element  whose presence in this collection is to be ensured.
	 * @see java.util.Collection#add(Object)
	 * @uml.property  name="lesPersonnes"
	 */
	public boolean addLesPersonnes(Personne personne) {
		return lesPersonnes.add(personne);
	}

	/**
	 * Setter of the property <tt>lesPersonnes</tt>
	 * @param lesPersonnes  the lesPersonnes to set.
	 * @uml.property  name="lesPersonnes"
	 */
	public void setLesPersonnes(Collection lesPersonnes) {
		this.lesPersonnes = lesPersonnes;
	}

	/**
	 * Removes a single instance of the specified element from this collection, if it is present (optional operation).
	 * @param element  to be removed from this collection, if present.
	 * @see java.util.Collection#add(Object)
	 * @uml.property  name="lesPersonnes"
	 */
	public boolean removeLesPersonnes(Personne personne) {
		return lesPersonnes.remove(personne);
	}

	/**
	 * Removes all of the elements from this collection (optional operation).
	 * @see java.util.Collection#clear()
	 * @uml.property  name="lesPersonnes"
	 */
	public void clearLesPersonnes() {
		lesPersonnes.clear();
	}
   
   
   }
