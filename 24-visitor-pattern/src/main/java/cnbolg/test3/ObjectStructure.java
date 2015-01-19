package cnbolg.test3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guoyibin on 15/1/19.
 */
public class ObjectStructure {
    private List<Node> nodes = new ArrayList<Node>();
    /**
     * 执行方法操作
     */
    public void action(Visitor visitor){
        for(Node node : nodes) {
            node.accept(visitor);
        }
    }
    /**
     * 添加一个新元素
     */
    public void add(Node node){
        nodes.add(node);
    }
}
