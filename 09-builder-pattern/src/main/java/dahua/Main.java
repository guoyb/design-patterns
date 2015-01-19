package dahua;

/**
 * Created by guoyibin on 15/1/6.
 *
 */
public class Main {

    public static void main(String[] args) {
        Director director = new Director();
        Builder builder1 = new ConcretBuilder1();
        Builder builder2 = new ConcretBuilder2();

        director.construct(builder1);
        Product product = builder1.getResult();
        product.show();


        director.construct(builder2);
        Product product1 = builder2.getResult();
        product1.show();
    }

}
