package dahua;

import dahua.cashSuperImpl.CashNormal;
import dahua.cashSuperImpl.CashRebate;
import dahua.cashSuperImpl.CashReturn;

/**
 * Created by guoyibin on 14/12/26.
 *
 * 付款策略
 */
public class CashContext {

    private CashSuper cs;

    public CashContext(String type) {
        switch (type){
            case "正常收费":
                cs = new CashNormal();
                break;
            case "满300返100":
                cs = new CashReturn();
                break;
            case "打8折":
                cs = new CashRebate();
                break;
        }
    }

    public double getResult(double price, int num){
        return cs.acceptCash(price, num);
    }
}
