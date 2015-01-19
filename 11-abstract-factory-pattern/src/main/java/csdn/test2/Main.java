package csdn.test2;

/**
 * Created by guoyibin on 15/1/8.
 */
public class Main {
    public static void main(String[] args) {
        // Create and run the Africa animal world
        ContinentFactory africa = new AfricaFactory();
        AnimalWorld world = new AnimalWorld(africa);
        world.runFoodChain();

        // Create and run the America animal world
        ContinentFactory america = new AmericaFactory();
        world = new AnimalWorld( america );
        world.runFoodChain();



    }
}
