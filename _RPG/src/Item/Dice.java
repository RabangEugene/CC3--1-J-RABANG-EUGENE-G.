package Item;

import java.util.Random;
/**
    * represents a real life Dice to
    * roll a random integer from 1-6
    */
public class Dice {
     /** instance variables */
    private final Random r = new Random();
    /**
    * Instantiate the object r
    */
    public Dice() {
    }
    /**
    * Returns a random integer between 1 and 6
     * @return 
    */
    public int roll() {
        return r.nextInt(6) + 1;
    }
}
