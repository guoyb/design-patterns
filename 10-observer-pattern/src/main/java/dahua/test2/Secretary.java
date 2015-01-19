package dahua.test2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guoyibin on 15/1/6.
 */
public class Secretary implements Subject {
    private List<Observer> observers=new ArrayList<Observer>();
    private String action;

    //增加
    public void attach(Observer observer){
        observers.add(observer);
    }

    //减少
    public void detach(Observer observer){
        observers.remove(observer);
    }

    //通知
    public void notice(){
        for (Observer o : observers){
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
