package dahua.cashSuperImpl;

import dahua.CashSuper;

/**
 * Created by guoyibin on 14/12/26.
 *
 * 满300返100
 */
public class CashReturn extends CashSuper {

    public double acceptCash(double price, int num) {
        double money = price * num;
        if (money > 300) {
            return money - (money/300)*100;
        } else{
            return money;
        }
    }
}
