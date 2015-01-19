package csdn;

/**
 * Created by guoyibin on 15/1/5.
 */
public class Factory implements IFactory {
    @Override
    public ICar createCar() {
        Engine engine = new Engine();
        Underpan underpan = new Underpan();
        Wheel wheel = new Wheel();
        ICar car = new Car(engine,underpan, wheel);
        return car;
    }
}
