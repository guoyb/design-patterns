package csdn.test2;

/**
 * Created by guoyibin on 15/1/16.
 */
public class SpeedWay extends AbstractRoad {
    @Override
    void run() {
        // TODO Auto-generated method stub
        super.run();
        aCar.run();
        System.out.println("在高速公路行驶");
    }
}
