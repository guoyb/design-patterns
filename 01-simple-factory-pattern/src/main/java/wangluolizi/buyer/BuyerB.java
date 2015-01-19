package wangluolizi.buyer;

import wangluolizi.home.Home;
import wangluolizi.landagent.Landagent;

/**
 * Created by guoyibin on 14/12/25.
 *
 * //消费者B.
 */
public class BuyerB {
    public static void main(String[] args) {
        //找到房地产商，并告诉他，我要B型的房子。
        Landagent landagent = new Landagent();
        Home houseB = landagent.BuildHouse("House B");

        //房子盖好后，参观房内的卧室，客厅，厨房，卫生间。
        houseB.Bedroom();
        houseB.Kitchen();
        houseB.Parlor();
        houseB.Toilet();
    }
}
