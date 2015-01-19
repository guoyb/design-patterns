package dahua.test2;

/**
 * Created by guoyibin on 15/1/6.
 */
public class StockObserver extends Observer {

    public StockObserver(String name, Subject sub) {
        super(name, sub);
    }

    @Override
    public void update() {
        System.out.println(sub.getAction()+name+"关闭股票，继续工作");
    }
}
