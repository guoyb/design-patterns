package csdn;

/**
 * Created by guoyibin on 15/1/5.
 */
public class Car implements ICar {

    Engine engine;
    Underpan underpan;
    Wheel wheel;

    public Car(Engine engine, Underpan underpan, Wheel wheel){
        this.engine = engine;
        this.underpan = underpan;
        this.wheel = wheel;
    }

    @Override
    public void show() {
        if (engine==null) engine=new Engine();
        if (underpan ==null) underpan = new Underpan();
        if (wheel==null) wheel=new Wheel();
        engine.getStyle();
        underpan.getStyle();
        wheel.getStyle();
    }
}
