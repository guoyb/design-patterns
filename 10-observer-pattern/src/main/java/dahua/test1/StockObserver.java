package dahua.test1;

/**
 * Created by guoyibin on 15/1/6.
 */
public class StockObserver {
    private String name;
    private Secretary secretary;

    public StockObserver(String name, Secretary secretary) {
        this.name = name;
        this.secretary = secretary;
    }

    public void update() {
        System.out.println(secretary.getAction()+name+"关闭股票，继续工作");
    }
}
