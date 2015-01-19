package csdn.test1;

/**
 * Created by guoyibin on 15/1/19.
 */
public class Multiply extends Expression{

    private Expression left , right ;

    public Multiply(Expression left , Expression right){

        this.left = left ;

        this.right= right ;

    }

    public int interpret(Context con){

        return left.interpret(con) * right.interpret(con);

    }

}