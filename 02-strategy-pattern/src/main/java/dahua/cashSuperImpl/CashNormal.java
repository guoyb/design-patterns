package dahua.cashSuperImpl;

import dahua.CashSuper;

/**
 * Created by guoyibin on 14/12/26.
 *
 * 正常收费
 */
public class CashNormal extends CashSuper {

    public double acceptCash(double price, int num) {
        return price * num;
    }
}
