package csdn.test1;

/**
 * Created by guoyibin on 15/1/19.
 */
public class Variable extends Expression{

    public int interpret(Context con){

        //this为调用interpret方法的Variable对象
        return con.LookupValue(this);
    }

}
