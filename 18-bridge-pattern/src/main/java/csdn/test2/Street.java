package csdn.test2;

/**
 * Created by guoyibin on 15/1/16.
 */
public class Street extends AbstractRoad {
    @Override
    void run() {
        // TODO Auto-generated method stub
        super.run();
        aCar.run();
        System.out.println("在市区街道行驶");
    }
}
