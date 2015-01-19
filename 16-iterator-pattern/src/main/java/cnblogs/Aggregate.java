package cnblogs;

/**
 * Created by guoyibin on 15/1/16.
 *
 * 模拟集合接口 增删 差(遍历)
 */
public interface Aggregate {
    public void add(Object obj);
    public void remove(Object obj);
    public Iterator iterator();
}
