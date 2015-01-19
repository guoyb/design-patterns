package dahua.test4;


/**
 * Created by guoyibin on 15/1/6.
 */
public class Main {
    public static void main(String[] args) {
        Resume a = new Resume("大鸟");
        a.setPersonalInfo("男","29");
        a.setWordExperience("1998-2000","xx公司");

        WorkExperience workExperience = new WorkExperience();
        workExperience.setWorkDate("1998-2006");
        workExperience.setCompany("yy企业");
        Resume b = a.clone(workExperience);


        WorkExperience workExperience1 = new WorkExperience();
        workExperience1.setWorkDate("1998-2003");
        workExperience1.setCompany("zz企业");
        Resume c = a.clone(workExperience1);

        a.display();
        b.display();
        c.display();

    }
}
