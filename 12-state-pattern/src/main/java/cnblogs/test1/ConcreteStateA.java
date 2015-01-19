package cnblogs.test1;

/**
 * Created by guoyibin on 15/1/8.
 */
public class ConcreteStateA extends State {
    @Override
    public void handle(Context context) {
        System.out.println("当前状态是A");
        context.setState(new ConcreteStateB());
    }
}
