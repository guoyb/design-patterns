package dahua.test2;

/**
 * Created by guoyibin on 15/1/5.
 */
public class Resume implements Cloneable {
    private String name;
    private String sex;
    private String age;
    private String timeArea;
    private String company;

    public Resume(String name) {
        this.name = name;
    }

    public void setPersonalInfo(String sex, String age){
        this.age = age;
        this.sex = sex;
    }

    public void setWordExperience(String timeArea, String company){
        this.timeArea = timeArea;
        this.company = company;
    }

    public void display(){
        System.out.println(name + " " + sex + " " + age);
        System.out.println("工作经历："+timeArea + " " + company);
    }

    public Resume clone(){
        Resume resume = null;
        try{
            resume = (Resume)super.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return resume;
    }

}
