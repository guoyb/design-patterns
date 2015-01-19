package dahua;

/**
 * Created by guoyibin on 14/12/26.
 */
public class Less implements Count {

    @Override
    public void doCount(Double operA, Double operB) {
        System.out.println("liang shu zhi cha wei:" + (operA - operB));
    }
}
