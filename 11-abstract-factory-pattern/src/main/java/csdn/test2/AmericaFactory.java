package csdn.test2;

/**
 * Created by guoyibin on 15/1/8.
 */
public class AmericaFactory extends ContinentFactory {
    @Override
    public Herbivore createHerbivore() {
        return new Bison();
    }

    @Override
    public Carnivore createCarnivore() {
        return new Wolf();
    }
}
