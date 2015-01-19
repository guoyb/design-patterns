package cnblogs;

import java.util.List;

/**
 * Created by guoyibin on 15/1/16.
 */
public class ConcreteIterator implements Iterator {

    private List<Object> list;
    private int cursor = 0;// 当前游标位置

    public ConcreteIterator(List<Object> list) {
        this.list = list;
    }

    @Override
    public Object next() {
        Object obj = null;
        if (hasNext()) {
            obj = list.get(cursor++);
        }
        return obj;
    }

    @Override
    public boolean hasNext() {
        return !(cursor == list.size());
    }
}
