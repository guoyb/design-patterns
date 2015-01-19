package cnblogs;

import java.util.List;

/**
 * Created by guoyibin on 15/1/16.
 *
 *
 */
public class ConcreteAggregate implements Aggregate {

    private List<Object> list;

    public ConcreteAggregate(List<Object> list) {
        this.list  = list;
    }

    @Override
    public void add(Object obj) {
        list.add(obj);
    }

    @Override
    public void remove(Object obj) {
        list.remove(obj);
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(list);
    }
}
