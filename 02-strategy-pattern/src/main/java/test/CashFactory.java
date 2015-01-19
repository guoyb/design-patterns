package test;

import dahua.cashSuperImpl.CashNormal;
import dahua.cashSuperImpl.CashRebate;
import dahua.cashSuperImpl.CashReturn;
import dahua.CashSuper;

/**
 * Created by guoyibin on 14/12/26.
 *
 */
public class CashFactory {


    /**
     *
     * @param type 运行模式
     * @param price 单价
     * @param num 数量
     * */
    public double doMoney(String type, double price, int num) {
        CashSuper cs = null;
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
        return cs.acceptCash(price,num);
    }
}
