package csdn;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Object> objects = new ArrayList<Object>();
        objects.add("大鸟");
        objects.add("小菜");
        objects.add("行李");
        objects.add("老外");
        objects.add("公交内部员工");
        objects.add("小偷");

        ConcreteAggregate ca = new ConcreteAggregate(objects);
        Iterator i = new ConcreteIterator(ca);
        while (i.hasNext()) {
            System.out.println("请买车票！"+i.currentItem());
            i.next();
        }
    }
}
