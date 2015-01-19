package dahua.test4;

/**
 * Created by guoyibin on 15/1/5.
 */
public class Resume implements Cloneable {
    private String name;
    private String sex;
    private String age;

    private WorkExperience workExperience;

    public Resume(String name) {
        this.name = name;
        workExperience = new WorkExperience();
    }

    public Resume(WorkExperience workExperience) {
        this.workExperience = workExperience;
    }

    public void setPersonalInfo(String sex, String age){
        this.age = age;
        this.sex = sex;
    }

    public void setWordExperience(String timeArea, String company){
        workExperience.setCompany(company);
        workExperience.setWorkDate(timeArea);
    }

    public void display(){
        System.out.println(name + " " + sex + " " + age);
        System.out.println("工作经历："+workExperience.getWorkDate() + " " + workExperience.getCompany());
    }

    public Resume clone(WorkExperience workExperience){
        Resume resume = new Resume(workExperience);
        resume.setName(name);
        resume.setSex(sex);
        resume.setAge(age);
        return resume;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }


}
