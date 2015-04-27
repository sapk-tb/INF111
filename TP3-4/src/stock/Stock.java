package stock;

import java.util.Iterator;

import produit.Produit;

/**
 * Classe abstraite gerant un stock de Produit qui ne connait que le nombre de
 * Produit size
 * 
 * un stock sait : - ajouter/enlever un produit (doivent etre defini) - indiquer
 * s'il est vide ou plein (doit etre defini) - donner le nombre de produits
 * qu'il contient - s'afficher (doit etre defini)
 * 
 * @authors A. Beugnard R.Ogor F. Dagnat
 * @version 0.2
 */
public abstract class Stock {

	protected int size = 0;

	/**
	 * indique si je suis vide
	 */
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * retourne le nombre d'elements presents dans le Stock
	 */
	public int getSize() {
		return size;
	}

	/**
	 * ajoute un produit et leve l'exception StockFull si le stock est plein
	 * 
	 * @param p
	 *            le produit ajoute
	 */
	public abstract void add(Produit p) throws ProduitNull, StockFull;

	/**
	 * retire un produit, et leve l'exception StockEmpty si le stock est vide
	 */
	public abstract Produit remove() throws StockEmpty;

	/**
	 * retire un produit, et leve l'exception StockEmpty si le stock est vide
	 * 
	 * @param p
	 *            le produit a retirer
	 * @return true si le produit existait dans le stock et false autrement
	 */
	public abstract boolean remove(Produit p) throws ProduitNull, StockEmpty;

	/**
	 * indique si je suis plein
	 */
	public abstract boolean isFull();

	/**
	 * Retourne le Nième element
	 */

	public abstract Produit iemeElement(int i);

	/**
	 * Rend une chaine qui decrit chaque element present dans le Stock
	 */
	/*
	 * public String toString() { String result = "["; if (!isEmpty()) { result
	 * += iemeElement(0); for (int i = 1; i < size; i++) result += ";" +
	 * iemeElement(i); } return result + "]"; }
	 */

	public String toString() {
		String result = "[";
		Iterator<Produit> el = iterator();
		//result += iemeElement(0);
		while (el.hasNext()) {
			result +=  el.next()+(el.hasNext()?";":"");	
		}
		return result + "]";
	}

	public abstract Iterator<Produit> iterator();
}
