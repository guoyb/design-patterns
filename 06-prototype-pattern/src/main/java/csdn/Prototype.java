package csdn;

/**
 * Created by guoyibin on 15/1/5.
 */
public class Prototype implements Cloneable {
    public Prototype clone(){
        Prototype prototype = null;
        try{
            prototype = (Prototype)super.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return prototype;
    }
}
