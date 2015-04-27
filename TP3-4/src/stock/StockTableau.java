package stock;

import java.util.Iterator;
import java.util.NoSuchElementException;

import produit.Produit;

/**
 * Realisation de la classe abstraite Stock sous forme de tableau. Ma taille
 * maximale est fixee a ma creation.
 * 
 * un stock sait : - etre cree avec une taille donnee - ajouter/enlever un
 * produit - indiquer s'il est plein - renvoyer une chaine de caracteres
 * decrivant son contenu
 * 
 * @author F. Dagnat P. Geffroy
 */
public class StockTableau extends Stock {

	protected Produit[] content;

	private class IterInterneTableau implements Iterator<Produit>{
		protected int pos = 0;
		public boolean hasNext() {
			return pos!=size;
		}

		public Produit next() throws NoSuchElementException{
			if(pos>=size)
				throw new NoSuchElementException();
			return content[pos++];
		}

		public void remove() throws UnsupportedOperationException, IllegalStateException{
			try {
				StockTableau.this.remove(content[pos-1]);
			} catch (ProduitNull e) {
				throw new UnsupportedOperationException();
			} catch (StockEmpty e) {
				throw new IllegalStateException();
			}
		}
	}
	/**
	 * Construit un stock dont la capacite est donne par s
	 * 
	 * @param s
	 *            la taille du stock
	 */
	public StockTableau(int s) {
		if (s < 0)
			s = 0;
		content = new Produit[s];
	}

	/**
	 * ajoute un produit, et incremente le nombre d'elements
	 * 
	 * @param p
	 *            le produit ajoute
	 */
	public void add(Produit p) throws ProduitNull, StockFull {
		if (p == null)
			throw new ProduitNull();
		if (isFull())
			throw new StockFull();
		content[size++] = p;
	}

	/**
	 * retire un produit, et decremente le nombre d'elements on voit ici que le
	 * choix du produit retire pourrait etre different...
	 */
	public Produit remove() throws StockEmpty {
		if (isEmpty())
			throw new StockEmpty();
		Produit p = content[--size];
		content[size] = null;
		return p;
	}

	/**
	 * retire un produit, et decremente le nombre d'elements
	 * 
	 * @param p
	 *            le Produit a retirer
	 * @return true si le produit existait dans le stock et false autrement
	 */
	public boolean remove(Produit p) throws ProduitNull, StockEmpty {
		if (p == null)
			throw new ProduitNull();
		if (isEmpty())
			throw new StockEmpty();
		int i = 0;
		while (i < size && !p.equals(content[i]))
			i++;
		if (i < size) {// le produit existait bien
			for (int j = i; j < size - 1; j++)
				// avec decalage des elements pour maintenir l'ordre
				content[j] = content[j + 1];
			size--;
			content[size] = null;
			return true;
		}
		return false;
	}

	/**
	 * indique si je suis plein
	 */
	public boolean isFull() {
		return size == content.length;
	}

	/**
	 * renvoie une chaine de caracteres representant le contenu du stock
	 */
	/*
	 * public String toString() { String result = "["; if (!isEmpty()) { result
	 * += content[0]; for (int i = 1; i < size; i++) result += ";" + content[i];
	 * } return result + "]"; }
	 */

	public Produit iemeElement(int i) {
		return content[i];
	}

	@Override
	public Iterator<Produit> iterator() {
		//return new  IterInterneTableau();
		return new  IterExterneTableau(this);
	}

}
