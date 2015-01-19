package dahua.test2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guoyibin on 15/1/6.
 */
public class Boss implements Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private String action;


    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notice() {
        for (Observer o : observers){
            o.update();
        }
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
