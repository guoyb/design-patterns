package dahua.test2;

/**
 * Created by guoyibin on 15/1/6.
 */
public class NBAObserver extends Observer {

    public NBAObserver(String name, Subject sub) {
        super(name, sub);
    }

    @Override
    public void update() {
        System.out.println(sub.getAction()+name+"关闭NBA，继续工作");
    }
}
