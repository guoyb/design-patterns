package dahua.cashSuperImpl;

import dahua.CashSuper;

/**
 * Created by guoyibin on 14/12/26.
 *
 * 8折优惠
 */
public class CashRebate extends CashSuper {


    public double acceptCash(double price, int num) {
        return num * price * 0.8;
    }

}
