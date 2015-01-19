package csdn.test2;

/**
 * Created by guoyibin on 15/1/16.
 */
public class TMain {
    public static void main(String[] args){
        TestStream ts1 = TestStream.getTest();
        ts1.setName("jason");
        TestStream ts2 = TestStream.getTest();
        ts2.setName("0539");

        ts1.printInfo();
        ts2.printInfo();

        if(ts1 == ts2){
            System.out.println("创建的是同一个实例");
        }else{
            System.out.println("创建的不是同一个实例");
        }
    }
}
