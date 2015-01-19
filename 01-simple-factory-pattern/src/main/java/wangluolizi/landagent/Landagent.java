package wangluolizi.landagent;

import wangluolizi.home.Home;
import wangluolizi.house.HouseA;
import wangluolizi.house.HouseB;
import wangluolizi.house.HouseC;

/**
 * Created by guoyibin on 14/12/25.
 *
 * /房地产开发商.
 */
public class Landagent {

    //根据消费者的选择，建造不同的房子。
    public Home BuildHouse(String houseKind) {
        if (houseKind.equals("House A")) {
            //建造A型房子。
            return new HouseA();
        } else if (houseKind.equals("House B")) {
            //建造B型房子。
            return new HouseB();
        } else if (houseKind.equals("House C")) {
            //建造C型房子。
            return new HouseC();
        } else {
            return null;
        }
    }
}
