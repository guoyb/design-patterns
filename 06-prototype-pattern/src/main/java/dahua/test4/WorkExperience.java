package dahua.test4;

/**
 * Created by guoyibin on 15/1/6.
 *
 */
public class WorkExperience implements Cloneable {
    private String workDate;

    private String company;

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public WorkExperience clone(){
        WorkExperience workExperience = null;
        try{
            workExperience = (WorkExperience)super.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return workExperience;
    }
}
