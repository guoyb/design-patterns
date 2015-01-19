package dahua;

/**
 * Created by guoyibin on 15/1/4.
 *
 */
public class Person {

    public Person() {

    }

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("装扮：" + name);
    }
}
