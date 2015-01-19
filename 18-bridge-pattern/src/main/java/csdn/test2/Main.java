package csdn.test2;

/**
 * Created by guoyibin on 15/1/16.
 */
public class Main {
    public static void main(String[] args){
        People man = new Man();
        man.road = new SpeedWay();
        man.road.aCar = new Car();
        man.run();

        People woman = new Woman();
        woman.road = new Street();
        woman.road.aCar = new Bus();
        woman.run();
    }
}
