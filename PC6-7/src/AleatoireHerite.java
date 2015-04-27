
import java.util.Random;

/**
 *
 * @author sapk
 */
public class AleatoireHerite extends Random {

    public AleatoireHerite(long semence) {
        super(semence);
    }

    public int unEntier(int min, int max) throws Exception {
        if (min < 0 || min >= max) {
            throw new Exception();
        }

        return min + this.nextInt(max + 1 - min);
    }

}
