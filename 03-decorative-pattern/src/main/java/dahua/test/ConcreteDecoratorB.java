package dahua.test;

/**
 * Created by guoyibin on 15/1/4.
 *
 * 具体装饰对象B
 */
public class ConcreteDecoratorB extends Decorator {

    @Override
    public void operation(){
        super.operation();
        addedBehavior();
        System.out.println("具体装饰对象B的操作！");
    }

    private void addedBehavior() {

    }
}
