package csdn.test1;

/**
 * Created by guoyibin on 15/1/16.
 */
public class Main {
    public static void main(String[] args) {
        //小汽车在高速公路行驶
        CarOnSpeedWay carOnSpeedWay = new CarOnSpeedWay();
        carOnSpeedWay.run();
        //公交车在市区街道行驶
        BusOnStreet busOnStreet = new BusOnStreet();
        busOnStreet.run();
    }
}
