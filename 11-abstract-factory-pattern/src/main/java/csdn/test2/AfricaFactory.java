package csdn.test2;

/**
 * Created by guoyibin on 15/1/8.
 */
public class AfricaFactory extends ContinentFactory {
    @Override
    public Herbivore createHerbivore() {
        return new Wildebeest();
    }

    @Override
    public Carnivore createCarnivore() {
        return new Lion();
    }
}
