package csdn;

/**
 * Created by guoyibin on 15/1/5.
 */
public class Main {
    public static void main(String[] args) {
        ConcretePrototype cp = new ConcretePrototype();
        for(int i=0; i< 10; i++){
            ConcretePrototype clonecp = (ConcretePrototype)cp.clone();
            clonecp.show();
        }
    }
}
