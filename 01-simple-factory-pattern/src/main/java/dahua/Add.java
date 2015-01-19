package dahua;

/**
 * Created by guoyibin on 14/12/26.
 */
public class Add implements Count {
    @Override
    public void doCount(Double operA, Double operB) {
        System.out.println("the sum is:" + (operA + operB));
    }
}
