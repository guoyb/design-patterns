package csdn;

/**
 * Created by guoyibin on 15/1/16.
 */
public class ConcreteIterator extends Iterator{

    // 定义了一个具体聚集对象
    private ConcreteAggregate concreteAggregate;

    private int current = 0;

    // 初始化对象将具体聚集类传入
    public ConcreteIterator(ConcreteAggregate concreteAggregate) {
        this.concreteAggregate = concreteAggregate;
    }


    @Override
    public Object first() {
        return concreteAggregate.getItems().get(0);
    }

    @Override
    public Object last() {
        return concreteAggregate.getItems().get(concreteAggregate.getItems().size()-1);
    }

    @Override
    public Object next() {
        Object obj = null;
        if(hasNext()){
            obj = concreteAggregate.getItems().get(current++);
        }
        return obj;
    }

    @Override
    public Object currentItem() {
        return concreteAggregate.getItems().get(current);
    }

    @Override
    public Boolean hasNext() {
        return !(concreteAggregate.getItems().size()==current);
    }
}
