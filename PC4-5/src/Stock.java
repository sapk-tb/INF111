/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sapk
 */
abstract public class Stock {

    /**
     * le nombre de produits actuellement dans le stock
     */
    protected int size = 0;

    abstract public void add(Produit p);

    abstract public Produit remove();

    abstract public boolean remove(Produit p);

    /**
     * indique si je suis vide
     *
     * @return true si le stock ne contient pas de produit et false autrement
     */
    public boolean isEmpty() {
        return size == 0;
    }

    abstract public boolean isFull();

    /**
     * retourne le nombre d'elements presents dans le StockTableau
     *
     * @return le nombre de produits dans le stock
     */
    public int getSize() {
        return size;
    }


    abstract public String toString();
}
