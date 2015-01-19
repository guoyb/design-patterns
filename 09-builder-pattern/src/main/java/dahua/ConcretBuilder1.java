package dahua;

/**
 * Created by guoyibin on 15/1/6.
 */
public class ConcretBuilder1 extends Builder {
    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("邮件A");
    }

    @Override
    public void buildPartB() {
        product.add("邮件B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
