package cnblogs.test1;

/**
 * Created by guoyibin on 15/1/8.
 */
public class ConcreteStateB extends State {
    @Override
    public void handle(Context context) {
        System.out.println("当前状态是B");
        context.setState(new ConcreteStateA());
    }
}
