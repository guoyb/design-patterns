package csdn.test2;

/**
 * Created by guoyibin on 15/1/19.
 */
class ColleagueA extends AbstractColleague{

    public void setNumber(int number, AbstractMediator am) {
        this.number = number;
        am.AaffectB();
    }
}
