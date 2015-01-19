package dahua.test2;


/**
 * Created by guoyibin on 15/1/6.
 *
 * 抽象观察者
 */
public abstract class Observer {

    String name;
    Subject sub;

    public Observer(String name, Subject sub) {
        this.name = name;
        this.sub = sub;
    }

    public abstract void update();
}
