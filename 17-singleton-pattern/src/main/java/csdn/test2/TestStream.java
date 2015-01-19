package csdn.test2;

/**
 * Created by guoyibin on 15/1/16.
 */
public class TestStream {
    String name = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private TestStream() {
    }

    private static TestStream ts1 = null;

    public static TestStream getTest() {
        if (ts1 == null) {
            ts1 = new TestStream();
        }
        return ts1;
    }

    public void printInfo() {
        System.out.println("the name is " + name);
    }
}
