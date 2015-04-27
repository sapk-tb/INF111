package stock;

import java.util.Iterator;
import java.util.LinkedList;

import produit.Produit;

/**
 * @author agirar01
 * 
 */
public class StockListe extends Stock {

	protected LinkedList<Produit> content;
	protected int nbMax = 0;

	/**
	 * Construit un stock dont la capacite est donne par s
	 * 
	 * @param s
	 *            la taille du stock
	 */
	public StockListe(int s) {
		if (s < 0)
			s = 0;
		content = new LinkedList<Produit>();
		nbMax = s;
	}

	public void add(Produit p) throws ProduitNull, StockFull {
		if (p == null)
			throw new ProduitNull();
		if (isFull())
			throw new StockFull();
		size++;
		content.add(p);
	}

	public Produit remove() throws StockEmpty {
		if (isEmpty())
			throw new StockEmpty();
		size--;
		return content.removeLast();
	}

	public boolean remove(Produit p) throws ProduitNull, StockEmpty {
		if (p == null)
			throw new ProduitNull();
		if (isEmpty())
			throw new StockEmpty();
		boolean b = content.remove(p);
		// On décrémente seulement si on a supprimé un element
		if(b){
			size--;
		}
		return b;
	}

	public boolean isFull() {
		return nbMax == content.size();
	}

	/*
	 * public String toString() { String result = "["; if (!isEmpty()) { result
	 * += content.get(0); for (int i = 1; i < content.size(); i++) result += ";"
	 * + content.get(i); } return result + "]"; }
	 */
	public Produit iemeElement(int i) {
		return content.get(i);
	}

	@Override
	public Iterator<Produit> iterator() {
		return content.listIterator();
	}
}
