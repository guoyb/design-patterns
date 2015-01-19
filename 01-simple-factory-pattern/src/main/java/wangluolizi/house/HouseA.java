package wangluolizi.house;

import wangluolizi.fitment.Fitment;
import wangluolizi.home.Home;

/**
 * Created by guoyibin on 14/12/25.
 *
 * //A型住宅.
 */
public class HouseA extends Home implements Fitment {

    public void Parlor() {
        System.out.println("This is parlor of House A.");
    };

    public void Bedroom() {
        System.out.println("This is bedroom of House A.");
    };

    public void Kitchen() {
        System.out.println("This is kitchen of House A.");
    };

    public void Toilet() {
        System.out.println("This is toilet of House A.");
    };

    public void ParlorFitment() {
        System.out.println("This is wangluolizi.fitment of parlor.");
    }

    public void BedroomFitment() {
        System.out.println("This is wangluolizi.fitment of bedroom.");
    }

    public void KitchenFitment() {
        System.out.println("This is wangluolizi.fitment of kitchen.");
    }

    public void ToiletFitment() {
        System.out.println("This is wangluolizi.fitment of toilet.");
    }
}
