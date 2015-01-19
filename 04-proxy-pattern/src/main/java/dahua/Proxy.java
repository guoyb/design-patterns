package dahua;

/**
 * Created by guoyibin on 15/1/5.
 */
public class Proxy extends Subject {
    RealSubject realSubject;

    @Override
    public void request() {
        if (realSubject == null) realSubject = new RealSubject();
        realSubject.request();
    }
}
