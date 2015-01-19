package csdn.test1;

/**
 * Created by guoyibin on 15/1/8.
 */
public class Environment {
    private AbstractProductA AbstractProductA;
    private AbstractProductB AbstractProductB;

    // Constructors
    public Environment( AbstractFactory factory ){
        AbstractProductB = factory.CreateProductB();
        AbstractProductA = factory.CreateProductA();
    }

    // Methods
    public void Run(){
        AbstractProductB.interact( AbstractProductA );
    }
}
