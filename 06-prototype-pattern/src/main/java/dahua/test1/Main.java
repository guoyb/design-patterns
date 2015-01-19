package dahua.test1;

/**
 * Created by guoyibin on 15/1/5.
 */
public class Main {
    public static void main(String[] args) {

        ConcretePrototype1 p1= new ConcretePrototype1("1");
        ConcretePrototype1 c1 = (ConcretePrototype1) p1.clone();
        System.out.println(c1.getId());
    }
}
