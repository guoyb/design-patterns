package cnbolg.test3;

/**
 * Created by guoyibin on 15/1/19.
 */
public class NodeB extends Node{
    /**
     * 接受方法
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    /**
     * NodeB特有的方法
     */
    public String operationB(){ return "NodeB"; }
}
