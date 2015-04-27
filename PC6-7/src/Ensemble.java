
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sapk
 * @param <E>
 */
public class Ensemble<E> extends LinkedList<E> {
    
    public Ensemble() {
        super();
    }
    
    
    @Override
    public boolean add(E e) {
        if (!contains(e)) {
            return super.add(e);
        }else{
            return false;
        }
    }
    
    public static void main(String[] args) {
        
        Aleatoire a = new Aleatoire(20);
        Ensemble<Integer> e = new Ensemble<Integer>();

        int n = 0;
        while (n<100) {
            try {
                if(e.add(a.unEntier(1, 2012))){
                    n++;
                }
            } catch (Exception ex) {
                Logger.getLogger(Aleatoire.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(e.contains(1515))
            System.out.println("L'ensemble contient 1515");
        else
            System.out.println("L'ensemble ne contient pas 1515");
       
    }
}
