package cnblog.test1;

/**
 * Created by guoyibin on 15/1/19.
 */
public class Main {
    public static void main(String[] args) {
        //组装责任链
        Handler handler1 = new ConcreteHandler();
        Handler handler2 = new ConcreteHandler();
        handler1.setSuccessor(handler2);
        //提交请求
        handler1.handleRequest();
    }
}
