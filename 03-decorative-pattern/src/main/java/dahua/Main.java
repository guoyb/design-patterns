package dahua;

/**
 * Created by guoyibin on 15/1/4.
 *
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person("小菜");

        BigTrouser bigTrouser = new BigTrouser();
        TShirts tShirts = new TShirts();

        bigTrouser.decorate(person);
        tShirts.decorate(bigTrouser);
        tShirts.show();

    }
}
