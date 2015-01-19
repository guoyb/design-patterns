package dahua.test;

/**
 * Created by guoyibin on 15/1/4.
 *
 * 装饰抽象类，继承了Component的扩展功能
 */
public abstract class Decorator extends Component {

    Component component;

    @Override
    public void operation(){
        if (component != null) component.operation();
    }

    public void setComponent(Component component){
        this.component = component;
    }
}
