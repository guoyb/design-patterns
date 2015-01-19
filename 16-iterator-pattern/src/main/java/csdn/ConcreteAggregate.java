package csdn;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guoyibin on 15/1/16.
 */
public class ConcreteAggregate extends Aggregate {

    private List<Object> items = new ArrayList<Object>();

    public ConcreteAggregate(List<Object> items) {
        this.items = items;
    }


    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this);
    }

    public List<Object> getItems() {
        return items;
    }

    public void setItems(List<Object> items) {
        this.items = items;
    }
}
