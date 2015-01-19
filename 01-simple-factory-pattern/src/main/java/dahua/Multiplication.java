package dahua;

/**
 * Created by guoyibin on 14/12/26.
 */
public class Multiplication implements Count {
    @Override
    public void doCount(Double operA, Double operB) {
        System.out.println("liang shu zhi ji wei:" + (operA * operB));
    }
}
