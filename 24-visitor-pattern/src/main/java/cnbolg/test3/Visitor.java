package cnbolg.test3;

/**
 * Created by guoyibin on 15/1/19.
 */
public interface Visitor {
    /**
     * 对应于NodeA的访问操作
     */
    public void visit(NodeA node);
    /**
     * 对应于NodeB的访问操作
     */
    public void visit(NodeB node);
}
