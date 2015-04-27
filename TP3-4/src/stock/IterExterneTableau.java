/**
 * 
 */
package stock;

import java.util.Iterator;
import java.util.NoSuchElementException;
import produit.Produit;

/**
 * @author agirar01
 *
 */
public class IterExterneTableau implements Iterator<Produit> {

	StockTableau stock;
	int pos = 0;
	
	public IterExterneTableau(StockTableau stock) {
		this.stock = stock;
	}

	public boolean hasNext() {
		return pos!=stock.getSize();
	}


	public Produit next() throws NoSuchElementException{
		if(pos>=stock.getSize())
			throw new NoSuchElementException();
		return stock.iemeElement(pos++);
	}

	public void remove() throws UnsupportedOperationException, IllegalStateException{
		try {
			stock.remove(stock.iemeElement(pos-1));
		} catch (ProduitNull e) {
			throw new UnsupportedOperationException();
		} catch (StockEmpty e) {
			throw new IllegalStateException();
		}
	}

}
