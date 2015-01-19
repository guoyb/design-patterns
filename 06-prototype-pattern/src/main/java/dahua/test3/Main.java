package dahua.test3;

/**
 * Created by guoyibin on 15/1/6.
 */
public class Main {
    public static void main(String[] args) {
        Resume a = new Resume("大鸟");
        a.setPersonalInfo("男","29");
        a.setWordExperience("1998-2000","xx公司");

        Resume b = a.clone();
        b.setWordExperience("1998-2006","yy企业");

        Resume c = a.clone();
        c.setWordExperience("1998-2003","zz企业");

        a.display();
        b.display();
        c.display();

    }
}
