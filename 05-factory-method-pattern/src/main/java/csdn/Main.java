package csdn;

/**
 * Created by guoyibin on 15/1/5.
 */
public class Main {
    public static void main(String[] args) {
        IFactory factory = new Factory();
        ICar car = factory.createCar();
        car.show();
    }
}
