package csdn.test2;

/**
 * Created by guoyibin on 15/1/16.
 */
public class Woman extends People {
    @Override
    void run() {
        // TODO Auto-generated method stub
        super.run();
        System.out.print("女人开着");
        road.run();
    }
}
