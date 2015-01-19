package csdn.test2;

/**
 * Created by guoyibin on 15/1/16.
 */
public class Man extends People {
    @Override
    void run() {
        // TODO Auto-generated method stub
        super.run();
        System.out.print("男人开着");
        road.run();
    }
}
