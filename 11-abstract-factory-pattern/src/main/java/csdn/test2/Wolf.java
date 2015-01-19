package csdn.test2;

/**
 * Created by guoyibin on 15/1/8.
 */
public class Wolf extends Carnivore {
    @Override
    public void eat(Herbivore h) {
        System.out.println("Wolf eat "+ h);
    }
}
