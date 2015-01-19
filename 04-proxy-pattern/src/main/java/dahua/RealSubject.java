package dahua;

/**
 * Created by guoyibin on 15/1/5.
 *
 */
public class RealSubject extends Subject {
    @Override
    public void request() {
        System.out.println("真实的请求");
    }
}
