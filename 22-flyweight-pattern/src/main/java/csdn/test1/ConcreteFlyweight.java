package csdn.test1;

/**
 * Created by guoyibin on 15/1/19.
 */
public class ConcreteFlyweight extends Flyweight{
    private String string;

    public ConcreteFlyweight(String str){
        string = str;
    }

    public void operation(){
        System.out.println("Concrete---Flyweight : " + string);
    }
}
