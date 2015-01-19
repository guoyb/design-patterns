package dahua.test1;

/**
 * Created by guoyibin on 15/1/5.
 */
public abstract class Prototype implements Cloneable {
    private String id;

    public Prototype(String id){
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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
