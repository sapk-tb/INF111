
/**
 * Je gere un StockTableau d'objet instance de Produit.
 * <br> Ma taille est fixee a ma creation.
 * 
* <br> un stock sait :
 * <br> - etre cree avec une taille donnee
 * <br> - ajouter/enlever un produit (doit etre defini)
 * <br> - indiquer s'il est vide ou plein
 * <br> - donner le nombre de produits qu'il contient
 * <br> le main permet de tester la classe
 * 
* <br> J'utilise les classes systeme : String, (System pour le test)
 * <br> J'utilise les classes : Produit
 * 
* @author A. Beugnard R.Ogor F. Dagnat
 * @version 0.2
 */
public class StockTableau extends Stock {

    /**
     * le tableau ou ranger les produits du stock
     */
    private Produit[] content; // un tableau de produit par exemple

    /**
     * Construit un stock dont la capacite est donne par s
     *
     * @param s la taille du stock
     */
    public StockTableau(int s) {
        content = new Produit[s];
    }

    /**
     * ajoute un produit, et incremente le nombre d'elements
     *
     * @param p le produit ajoute
     */
    public void add(Produit p) {
        content[size++] = p;
    }

    /**
     * retire un produit, et decremente le nombre d'elements on voit ici que le
     * choix du produit retire pourrait etre different...
     *
     * @return le dernier produit mis dans le stock
     */
    public Produit remove() {
        Produit p;
        p = content[--size];
        return p;
    }

    /**
     * indique si je suis plein
     *
     * @return true si le tableau ou sont les produits du stock est plein et
     * false autrement
     */
    public boolean isFull() {
        return size == content.length;
    }

    /**
     * Rend une chaine qui decrit chaque element present dans le StockTableau
     *
     * @return une representation textuelle d'un stock
     */
    public String toString() {
        if (isEmpty()) {
            return "Le stock est vide";
        }
        String s = "Stock contient :\n " + content[0];
        for (int i = 1; i < size; i++) {
            s = s + ", " + content[i];
        }
        return s;
    }

    public boolean remove(Produit p) {
        if (p == null) {
            return false;
        }
        if (isEmpty()) {
            return false;
        }

        int i = 0;

        while (i < size && p != content[i]) {
            i++;
        }

        if (i == size) {
            return false;
        }

        content[i] = content[--size];
        content[size] = null;
        return true;
    }
    
    public static void main(String args[]) {
        StockTableau s;
        s = new StockTableau(5);
        if (!s.isEmpty()) {
            System.out.println("Le stock devrait etre vide");
        }
        if (s.isFull()) {
            System.out.println("Le stock ne devrait pas etre plein");
        }
        if (s.getSize() != 0) {
            System.out.println("Le stock devrait contenir 0 produit");
        }
        s.add(new Produit("Beurre"));
        if (s.getSize() != 1) {
            System.out.println("Le stock devrait contenir 1 produit");
        }
        s.add(new Produit("lait"));
        Produit pAjoute = new Produit("fromage");
        s.add(pAjoute);
        if (s.getSize() != 3) {
            System.out.println("Le stock devrait contenir 3 produits");
        }
        Produit pRetire = s.remove();
        if (pRetire != pAjoute) {
            System.out.println("Le produit retire n'est pas le dernier ajoute");
        }
        if (s.getSize() != 2) {
            System.out.println("Le stock devrait contenir 2 produits");
        }
        s.add(new Produit("lait"));
        s.add(new Produit("fromage"));
        s.add(new Produit("fromage"));
        if (!s.isFull()) {
            System.out.println("Le stock devrait etre plein");
        }
        System.out.println(s);
    }

}
