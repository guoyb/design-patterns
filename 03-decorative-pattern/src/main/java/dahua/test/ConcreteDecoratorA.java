package dahua.test;

/**
 * Created by guoyibin on 15/1/4.A
 *
 * 具体装饰对象A，起到给Component添加职责的功能
 */
public class ConcreteDecoratorA extends Decorator {

    private String addedState;

    @Override
    public void operation(){
        super.operation();
        addedState = "new state";
        System.out.println("具体装饰对象A的操作！");
    }
}
