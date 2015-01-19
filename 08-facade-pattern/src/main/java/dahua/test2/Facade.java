package dahua.test2;

/**
 * Created by guoyibin on 15/1/6.
 */
public class Facade {
    SubSystemOne subSystemOne;
    SubSystemTwo subSystemTwo;
    SubSystemThree subSystemThree;

    public Facade() {
        subSystemOne = new SubSystemOne();
        subSystemTwo = new SubSystemTwo();
        subSystemThree = new SubSystemThree();
    }

    public void methodA(){
        System.out.println("方法组A-------");
        subSystemOne.methodOne();
        subSystemTwo.methodTwo();
    }

    public void methodB(){
        System.out.println("方法组B-------");
        subSystemTwo.methodTwo();
        subSystemThree.methodThree();
    }
}
