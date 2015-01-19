package csdn.test1;

/**
 * Created by guoyibin on 15/1/19.
 */
class ColleagueA extends AbstractColleague{
    public void setNumber(int number, AbstractColleague coll) {
        this.number = number;
        coll.setNumber(number*100);
    }
}
