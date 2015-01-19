package csdn.test;

/**
 * Created by guoyibin on 15/1/5.
 */
public class Main {
    public static void main(String[] args) {
        IFactory factory = new Factory();
        IProduct prodect = factory.createProduct();
        prodect.productMethod();
    }
}
