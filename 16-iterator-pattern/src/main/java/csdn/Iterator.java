package csdn;

/**
 * Created by guoyibin on 15/1/16.
 *
 *  Iterator迭代器抽象类
*/
public abstract class Iterator {
    public abstract Object first();
    public abstract Object last();
    public abstract Object next();
    public abstract Object currentItem();
    public abstract Boolean hasNext();
}
