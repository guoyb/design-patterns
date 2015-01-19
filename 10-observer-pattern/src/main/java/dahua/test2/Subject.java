package dahua.test2;

/**
 * Created by guoyibin on 15/1/6.
 */
public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notice();

    void setAction(String s);
    String getAction();
}
