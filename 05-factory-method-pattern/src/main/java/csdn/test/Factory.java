package csdn.test;

/**
 * Created by guoyibin on 15/1/5.
 */
public class Factory implements IFactory {
    @Override
    public IProduct createProduct() {
        return new Product();
    }
}
