package dahua;

/**
 * Created by guoyibin on 15/1/4.
 */
public class Finery extends Person {

    Person person;

    public void decorate(Person person){
        this.person = person;
    }

    public void show(){
        if (person!=null){
            person.show();
        }
    }

}
