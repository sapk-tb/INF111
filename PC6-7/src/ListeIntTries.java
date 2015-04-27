
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sapk
 */
public class ListeIntTries {

    private LinkedList<Integer> list;

    public ListeIntTries() {
        this.list = new LinkedList();
    }

    public boolean add(int number) {
        if (this.contient(number)) {
            return false;
        }
        int i = 0;
        for (i = 0; i < list.size(); i++) {
            if (list.get(i) > number) {
                break;
            }
        }
        this.list.add(i, number);
        return true;
    }

    private boolean contient(int number) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == number) {
                return true;
            } else if (list.get(i) > number) {
                return false;
            }
        }
        return false;
    }

    public int[] donneTableau() {
        int[] tab = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            tab[i] = list.get(i);
        }
        return tab;
    }
    
    public static void main(String[] args) {
        AleatoireHerite a = new AleatoireHerite(42);
        ListeIntTries lt = new ListeIntTries();
        int n =0;
        while (n<100) {
            try {
                if(lt.add(a.unEntier(1789, 1917)))
                    n++;
            } catch (Exception ex) {
                Logger.getLogger(ListeIntTries.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        int[] t = lt.donneTableau();
        for (int i = 0; i < t.length; i++) {
            System.out.println(t[i]);
            
        }
    }
}
