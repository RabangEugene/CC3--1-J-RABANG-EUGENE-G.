package Character;


import Item.Armor;
import Item.Weapon;

/**  * The Hopia class extends Character, adding two new instance    * variables: maxCritchance, and currentCritchance, as well as the  * HopiaStrike()and currentCritchance()  methods, which represent   * casting HopiaStrike.  */
public class Hopia extends Character implements Armor,Weapon{
    /** instance variables */ 
    protected int currentCritchance;
    final protected int maxCritchance;
    /**   * The Hopia(String,int,int,int) constructor overrides the    * constructor with the same signature in Character.It first    * calls that constructor using the super keyword, then     * initializes maxCritchance to a value, and sets currentCritchance to   * the same value, similar to Health.
     * @param n  
     * @param s  
     * @param d  
     * @param i  
     * @param a */  
    public Hopia(String n, int s, int d, int i, int a){
        super(n, s, d, i);
        maxCritchance = a;
        currentCritchance = maxCritchance;
    }
    /**   * HopiaStrike() represents casting HopiaStrike.The   * method first checks that currentCritchance is greater than  *  5. If it is, currentCritchance is reduced by 5 and a random   * number is returned using the dice inherited from Character,   * modified by the character's dexterity.   * Otherwise, returns 0.
     * @return  */  
    public int HopiaStrike(){
        if(currentCritchance > 5){
            currentCritchance -= 5;
            damage = dice.roll() * dexterity;
            heal();
            return damage;
        }
        else{
            return 0;
        }
    }
    /**   * Returns maxCritchance   */
    public int getMaxCritchance(){
    return maxCritchance;
    }
    /**   * Returns currentCritchance   */
    public int getCurrentCritchance(){
        return currentCritchance;
    }  
     /**   * a special Attribute added to defend enemies attack  */
    @Override
     public int useArmor(){
    int value = dice.roll()*strength;
    heal ();
    return value;
                    
    
    }
     /**   * a special Attribute added to the strength of the character  */
    @Override
    public int useWeapon(){
    return dice.roll()*strength;
    
    }
 
   
    
}