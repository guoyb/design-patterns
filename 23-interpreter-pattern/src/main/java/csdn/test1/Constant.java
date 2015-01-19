package csdn.test1;

/**
 * Created by guoyibin on 15/1/19.
 *
 */
public class Constant extends Expression{

    private int i ;

    public Constant(int i){

        this.i = i;

    }

    public int interpret(Context con){

        return i ;

    }

}
