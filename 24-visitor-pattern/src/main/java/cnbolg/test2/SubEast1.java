package cnbolg.test2;

/**
 * Created by guoyibin on 15/1/19.
 */
public class SubEast1 extends East{
    @Override
    public void goEast(West west) {
        west.goWest1(this);
    }
    public String myName1(){
        return "SubEast1";
    }
}
