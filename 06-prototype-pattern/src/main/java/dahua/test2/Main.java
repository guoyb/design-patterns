package dahua.test2;

/**
 * Created by guoyibin on 15/1/5.
 *
 */
public class Main {
    public static void main(String[] args) {

        Resume a = new Resume("大鸟");
        a.setPersonalInfo("男","29");
        a.setWordExperience("2000-2010","YY企业");

        Resume b = a.clone();
        b.setWordExperience("1990-2000","XX企业");

        Resume c = a.clone();
        c.setPersonalInfo("男","24");


        a.display();
        b.display();
        c.display();

    }
}
