package cnblogs.test1;

/**
 * Created by guoyibin on 15/1/8.
 */
public class Main {
    public static void main(String[] args) {

        // 设置Context的初始状态为ConcreteStateA
        Context context = new Context(new ConcreteStateA());
        // 不断地进行请求，同时更改状态
        context.Request();
        context.Request();
        context.Request();
        context.Request();
    }
}
