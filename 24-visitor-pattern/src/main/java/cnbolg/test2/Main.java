package cnbolg.test2;

/**
 * Created by guoyibin on 15/1/19.
 */
public class Main {
    public static void main(String[] args) {
        //组合1
        East east = new SubEast1();
        West west = new SubWest1();
        east.goEast(west);


        //组合2
        east = new SubEast1();
        west = new SubWest2();
        east.goEast(west);
    }
}
