package dahua.test1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guoyibin on 15/1/6.
 *
 * 前台秘书类
 */
public class Secretary {
    private List<StockObserver> observers=new ArrayList<StockObserver>();
    private String action;

    //增加
    public void attach(StockObserver stockObserver){
        observers.add(stockObserver);
    }

    //通知
    public void notice(){
        for (StockObserver o : observers){
            o.update();
        }
    }

    //前台状态
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
