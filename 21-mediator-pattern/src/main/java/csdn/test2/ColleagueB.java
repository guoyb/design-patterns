package csdn.test2;

/**
 * Created by guoyibin on 15/1/19.
 */
class ColleagueB extends AbstractColleague{

    @Override
    public void setNumber(int number, AbstractMediator am) {
        this.number = number;
        am.BaffectA();
    }
}
