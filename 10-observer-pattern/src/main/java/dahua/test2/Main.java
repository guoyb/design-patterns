package dahua.test2;


/**
 * Created by guoyibin on 15/1/6.
 */
public class Main {
    public static void main(String[] args) {
        //前台小姐童子喆
        Subject tongzizhe1 = new Secretary();

        Observer tongshi1 = new StockObserver("张三",tongzizhe1);
        Observer tongshi2 = new NBAObserver("李四",tongzizhe1);

        tongzizhe1.attach(tongshi1);
        tongzizhe1.attach(tongshi2);

        tongzizhe1.setAction("老板回来了！");

        tongzizhe1.notice();

    }
}
