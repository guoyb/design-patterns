package dahua.test1;

/**
 * Created by guoyibin on 15/1/6.
 */
public class Main {
    public static void main(String[] args) {
        //前台小姐童子喆
        Secretary tongzizhe = new Secretary();

        StockObserver tongshi1 = new StockObserver("张三",tongzizhe);
        StockObserver tongshi2 = new StockObserver("李四",tongzizhe);

        tongzizhe.attach(tongshi1);
        tongzizhe.attach(tongshi2);

        tongzizhe.setAction("老板回来了！");

        tongzizhe.notice();

    }
}
