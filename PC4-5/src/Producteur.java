/**
 * 
 */

/**
 * @author Antione GIRARD
 * 
 */
public class Producteur {

	/**
	 * Nom du producteur
	 */
	private String name;

	/*
	 * StockTableau du producteur
	 */
	private StockTableau stock;

	/**
	 * @param name
	 *            Le nom du producteur et son stock sont passés en paramètre
	 */
	public Producteur(String name, StockTableau stock) {
		this.name = name;
		this.stock = stock;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the stock
	 */
	public StockTableau getStock() {
		return stock;
	}

	public void produce(String product) {
		stock.add(new Produit(product,this));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Producteur : " + name + " et " + stock + "]";
	}

	public static void main(String[] args) {

		System.out.println("Test de la classe Producteur");

		Producteur p1,p2,p3;
		
		p1 = new Producteur("Danone", new StockTableau(42));
		p2 = new Producteur("Knacki", new StockTableau(42));
		p3 = new Producteur("KFC", new StockTableau(42));
		

		System.out.println("Producteur 1 : "+p1);
		System.out.println("Producteur 2 : "+p2);
		System.out.println("Producteur 3 : "+p3);

		p1.produce("Yaourt");
		System.out.println("Producteur 1 : "+p1);
		

		p3.setName("McDo");
		p3.produce("Burger");
		System.out.println("Producteur 3 : "+p3);
		
		
		System.out.println("Stock du producteur 2 : "+p2.getStock());
	}

}
