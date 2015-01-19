package cnblog.test2;

/**
 * Created by guoyibin on 15/1/19.
 */
public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight fly = factory.factory(new Character('a'));
        fly.operation("First Call");
        fly = factory.factory(new Character('b'));
        fly.operation("Second Call");
        fly = factory.factory(new Character('a'));
        fly.operation("Third Call");
    }
}
