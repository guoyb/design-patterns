package test;

/**
 * Created by guoyibin on 14/12/26.
 */
public class Cash {


    /**
     *
     * @param num 商品数量
     * @param price 单价
     * @param type 计算方式
     * */
    public void cashMoney(int num, double price, String type){
        double total = 0;
        switch (type){
            case "正常收费" :
                total = num * price;
                break;
            case "满300返100":
                double prices = num * price;
                if (prices > 300){
                    total = prices - ((price/300)*100);
                }else{
                    total = prices;
                }
                break;
            case "打8折":
                total = num * price * 0.8;
                break;
        }

        System.out.println("总收费是："+total);
    }
}
