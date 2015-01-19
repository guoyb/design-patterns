package dahua.test;

/**
 * Created by guoyibin on 15/1/4.
 *
 * 定义具体对象，可以给对象添加职责
 *
 */
public class ConcreteComponent extends Component {
    @Override
    public void operation() {
        System.out.println("具体对象的操作！");
    }
}
