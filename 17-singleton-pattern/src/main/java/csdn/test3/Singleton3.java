package csdn.test3;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by guoyibin on 15/1/16.
 */

//登记式单例类.
//类似Spring里面的方法，将类名注册，下次从里面直接获取。
public class Singleton3 {
    private static Map<String,Singleton3> map = new HashMap<String,Singleton3>();
    static{
        Singleton3 single = new Singleton3();
        map.put(single.getClass().getName(), single);
    }
    //保护的默认构造子
    protected Singleton3(){}
    //静态工厂方法,返还此类惟一的实例
    public static Singleton3 getInstance(String name) {
        if(name == null) {
            name = Singleton3.class.getName();
            System.out.println("name == null"+"--->name="+name);
        }
        if(map.get(name) == null) {
            try {
                map.put(name, (Singleton3) Class.forName(name).newInstance());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return map.get(name);
    }
    //一个示意性的商业方法
    public String about() {
        return "Hello, I am RegSingleton.";
    }
    public static void main(String[] args) {
        Singleton3 single3 = Singleton3.getInstance(null);
        System.out.println(single3.about());
    }
}
