
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sapk
 */
public class Aleatoire {

    private Random generateur;

    public Aleatoire(long semence) {
        this.generateur = new Random(semence);
    }

    public int unEntier(int min, int max) throws Exception {
        if (min < 0 || min >= max) {
            throw new Exception();
        }

        return min + generateur.nextInt(max + 1 - min);
    }

    public static void main(String[] args) {
        Aleatoire a = new Aleatoire(20);

        for (int i = 0; i < 20; i++) {
            try {
                System.out.println(a.unEntier(7, 15));
            } catch (Exception ex) {
                Logger.getLogger(Aleatoire.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
