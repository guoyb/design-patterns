package csdn.test1;

/**
 * Created by guoyibin on 15/1/16.
 */
public class Singleton {
    private static Singleton uniqueInstance = null;

    private Singleton() {
        // Exists only to defeat instantiation.
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
