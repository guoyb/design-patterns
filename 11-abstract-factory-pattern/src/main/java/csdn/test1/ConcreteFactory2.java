package csdn.test1;

/**
 * Created by guoyibin on 15/1/8.
 */
public class ConcreteFactory2 extends AbstractFactory {
    @Override
    public AbstractProductA CreateProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB CreateProductB() {
        return new ProductB2();
    }
}
