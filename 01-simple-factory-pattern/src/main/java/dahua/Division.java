package dahua;

/**
 * Created by guoyibin on 14/12/26.
 */
public class Division implements Count {

    @Override
    public void doCount(Double operA, Double operB) {
        if (operB == 0) {
            System.out.println("bei chu shu bu neng shi 0!");
        } else {
            System.out.println("liang ge shu de shang wei:" + (operA/operB));
        }
    }
}
