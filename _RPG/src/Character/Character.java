/**
 * it is the parent or the super class that will be extended by the subclasses
 */
package Character;

import Item.Dice;

 /** * The Character class models a character for a role playing game. * A character has a name and 3 stats: strength, dexterity, and intelligence, as * well as maximum allowed life points and the current value. */ 
 

public class Character{
    /** instance variable */ 
    protected String name;
    /** instance variable */ 
    protected int strength;
    /** instance variable */ 
    protected int dexterity;
     /** instance variable */ 
    protected int intelligence;
     /** instance variable */ 
    protected int currentLife;
     /** instance variable */ 
    protected int damage;
     /** instance variable */ 
    protected int lifeUp;
     /** instance variable */ 
    public final int maxLife;
    /** static variables */
    Dice dice = new Dice();
    public Character(){
        name = "";
        strength = 0;
        dexterity = 0;
        intelligence = 0;
        maxLife = dice.roll()*50;
        currentLife = maxLife;
    }
    
  /**   * Constructor takes 4 parameters: n,s,d,i and assigns them to    * instance variables name, strength, dexterity, intelligence.* Also uses the dice instance to assign a random   * number to maxLife.*currentLife is initialized to maxLife
     * @param n
     * @param s  
     * @param d  
     * @param i */  
    public Character(String n, int s, int d, int i){
        name = n;
        strength = s;
        dexterity = d;
        intelligence = i;
        maxLife = dice.roll()*50;
        currentLife = maxLife;
    }
    /**   * Returns a random die roll using the roll method in the   * Dice.java, *modified by the character's strength
     * @return  */
    public int attack(){
        damage = dice.roll()+strength;
        heal();
        return damage;
    }
    /**   * Decreases currentLife by the damage parameter
     * @param damage */
    public void wound(int damage){
        currentLife -= damage;
    }
    /**   * Increases currentLife by the heal parameter.* currentLife cannot be greater than maxLife
     * @return  */
    public int heal(){
        lifeUp = dice.roll();
        currentLife += lifeUp;
        return lifeUp;
    }
    /**   * Returns name
     * @return  */
    public String getName(){
        return name;
    }
    /**   * Returns strength
     * @return  */
    public int getStrength(){
        return strength;
    }
    /**   * Returns dexterity
     * @return  */ 
    public int getDexterity(){
        return dexterity;
    }
    /**   * Returns intelligence
     * @return  */
    public int getIntelligence(){
        return intelligence;
    }
    /**   * Returns currentLife
     * @return  */ 
    public int getCurrentLife(){
        return currentLife;
    }
    /**   * Returns maxLife
     * @return  */
    public int geMaxLife(){
    return maxLife;
    }
}