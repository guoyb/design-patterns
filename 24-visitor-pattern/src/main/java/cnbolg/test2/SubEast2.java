package cnbolg.test2;

/**
 * Created by guoyibin on 15/1/19.
 */
public class SubEast2 extends East{
    @Override
    public void goEast(West west) {
        west.goWest2(this);
    }
    public String myName2(){
        return "SubEast2";
    }
}
