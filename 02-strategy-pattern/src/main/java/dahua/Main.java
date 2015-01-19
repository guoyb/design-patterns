package dahua;

/**
 * Created by guoyibin on 14/12/26.
 *
 * 客户端
 */
public class Main {
    public static void main(String[] args) {
        double total = getMoney("打8折", 6, 6.0);
        System.out.println(total);
    }

    public static double getMoney(String type, int num, double price){
        CashContext cc = new CashContext(type);
        return cc.getResult(price, num);
    }
}
