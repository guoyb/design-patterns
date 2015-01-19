package wangluolizi.buyer;

import wangluolizi.house.HouseA;
import wangluolizi.landagent.Landagent;

/**
 * Created by guoyibin on 14/12/25.
 *
 * //消费者A.
 */
public class BuyerA {
    public static void main(String[] args) {

        //找到房地产商，并告诉他，我要A型的房子。
        Landagent landagent = new Landagent();
        HouseA houseA = (HouseA)landagent.BuildHouse("House A");

        //房子盖好后，参观房内的卧室，客厅，厨房，卫生间。
        houseA.Bedroom();
        houseA.Kitchen();
        houseA.Parlor();
        houseA.Toilet();

        //察看房子的装修。
        houseA.BedroomFitment();
        houseA.KitchenFitment();
        houseA.ParlorFitment();
        houseA.ToiletFitment();    }
}
