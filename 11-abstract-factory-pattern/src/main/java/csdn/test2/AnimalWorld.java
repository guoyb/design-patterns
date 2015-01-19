package csdn.test2;

/**
 * Created by guoyibin on 15/1/8.
 */
public class AnimalWorld {
    // Fields
    private Herbivore herbivore;
    private Carnivore carnivore;

    // Constructors
    public AnimalWorld( ContinentFactory factory ){
        carnivore = factory.createCarnivore();
        herbivore = factory.createHerbivore();
    }

    // Methods
    public void runFoodChain(){
        carnivore.eat(herbivore);
    }
}
