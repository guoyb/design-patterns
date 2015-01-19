package csdn.test1;

/**
 * Created by guoyibin on 15/1/8.
 */
public class Main {
    public static void main(String[] args) {
        AbstractFactory factory1 = new ConcreteFactory1();
        Environment e1 = new Environment( factory1 );
        e1.Run();

        AbstractFactory factory2 = new ConcreteFactory2();
        Environment e2 = new Environment( factory2 );
        e2.Run();
    }
}
