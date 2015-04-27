
import date.Date;
import date.DateInvalide;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sapk
 */
public class ProduitPerissable extends Produit {

    private Date bestBeforeDate;

    public ProduitPerissable(String name, Date bestBefore) {
        super(name);
        this.bestBeforeDate = bestBefore;
    }

    /**
     * @return the bestBeforeDate
     */
    public Date getBestBeforeDate() {
        return bestBeforeDate;
    }

    public boolean isOutOfDate() {
        return (this.bestBeforeDate.before(new Date()));
    }

    @Override
    public String toString() {
        return super.toString() + " & ProduitPerissable{" + "bestBefore=" + bestBeforeDate + '}';
    }

    public static void main(String[] args)  {
        Produit p = null;
       
        try {
            p = new ProduitPerissable("Beurre", new Date(2010,2,20));
        } catch (DateInvalide ex) {
            Logger.getLogger(ProduitPerissable.class.getName()).log(Level.SEVERE, null, ex);
        }

        if(((ProduitPerissable)p).isOutOfDate()){
         System.out.println("Le produit est périmé");
        }
        
        System.out.println(p.toString());
        System.out.println(((ProduitPerissable)p).toString());
        
    }
}
