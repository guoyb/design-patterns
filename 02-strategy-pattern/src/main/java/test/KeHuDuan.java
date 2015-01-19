package test;

/**
 * Created by guoyibin on 14/12/26.
 */
public class KeHuDuan {



    /**
     *
     * @param num 商品数量
     * @param price 单价
     * @param type 计算方式
     * */
    public void cashMoney(int num, double price, String type){
        CashContext cashContext = new CashContext(type);
        double total = cashContext.getResult(price, num);
        System.out.println("总收费："+total);
    }


}
