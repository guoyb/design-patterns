package cnblogs;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guoyibin on 15/1/16.
 */
public class Main {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<Object>();
        list.add("a");
        list.add("b");
        list.add("c");
        Aggregate aggregate = new ConcreteAggregate(list);
        Iterator iterator = aggregate.iterator();

        while (iterator.hasNext()) {
            String o = (String) iterator.next();
            System.out.println(o);
        }
    }

}
