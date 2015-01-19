package cnbolg.test1;

/**
 * Created by guoyibin on 15/1/19.
 */
public class Mozi {
    public void ride(Horse h){
        System.out.println("骑马");
    }
    public void ride(WhiteHorse wh){
        System.out.println("骑白马");
    }
    public void ride(BlackHorse bh){
        System.out.println("骑黑马");
    }
    public static void main(String[] args) {
        Horse wh = new WhiteHorse();
        Horse bh = new BlackHorse();
        Mozi mozi = new Mozi();
        mozi.ride(wh);
        mozi.ride(bh);
    }
}
