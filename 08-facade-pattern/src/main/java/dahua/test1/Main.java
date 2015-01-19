package dahua.test1;

/**
 * Created by guoyibin on 15/1/6.
 */
public class Main {
    public static void main(String[] args) {
        Stock1 stock1 = new Stock1();
        Stock2 stock2 = new Stock2();
        Stock3 stock3 = new Stock3();

        stock1.buy();
        stock2.buy();
        stock3.buy();


        stock1.sell();
        stock2.sell();
        stock3.sell();
    }
}
