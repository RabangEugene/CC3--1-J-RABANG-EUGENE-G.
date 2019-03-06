package Character;


import Item.Armor;
import Item.Weapon;
/**  * The Wizard class extends Character, adding two new instance    * variables: maxMagic, and currentMagic, as well as the  * castLightningBolt() and castHeal() methods, which represent   * casting magic spells.  */
public class Wizard extends Character implements Armor,Weapon{
    /** instance variables */ 
    protected int currentMagic;
    final protected int maxMagic;
    /**   * The Wizard(String,int,int,int) constructor overrides the    * constructor with the same signature in Character.It first    * calls that constructor using the super keyword, then     * initializes maxMagic to a value, and sets currentMagic to   * the same value, similar to Health.
     * @param n  
     * @param s  
     * @param d  
     * @param i  
     * @param m */  
    public Wizard(String n, int s, int d, int i, int m){
        super(n, s, d, i);
        maxMagic = m;
        currentMagic = maxMagic;
    }
    /**   * castLightningBolt() represents casting a magic spell.The   * method first checks that currentMagic is greater than/equal  * to 5. If it is, currentMagic is reduced by 5 and a random   * number is returned using the dice inherited from Character,   * modified by the character's intelligence.   * Otherwise, returns 0.
     * @return  */  
    public int castLightningBolt(){
        if(currentMagic > 5){
            currentMagic -= 5;
            damage = dice.roll() + intelligence; 
            heal();
            return damage;
        }
        else{
            return 0;
        }
    }
    /**  * castHeal() represents casting a magic spell.The method first  * checks that currentMagic is greater than/equal to 8. If it   * is, currentMagic is reduced by 8 and the character's heal()   * method is called with a random number, modified by the  * character's intelligence score. The amount healed is also  * returned by the method.
     * @return  */  
    public int castHeal(){
        if(currentMagic > 8){
            currentMagic -= 8;
            return heal() + intelligence*5;
        }
        else{
            return 0;
        }
    }
    /**   * Returns maxMagic
     * @return  */
   public int getMaxMagic(){
   return maxMagic;
   }
   /**   * Returns currentMagic
     * @return  */
    public int getCurrentMagic(){
        return currentMagic;
    }
   /**   * a special Attribute added to defend enemies attack
     * @return  */
    @ Override
    public int useArmor(){
    int value = dice.roll()*strength;
    heal ();
    return value;
                    
    
    }
     /**   * a special Attribute added to the strength of the character
     * @return  */
    @Override
    public int useWeapon(){
    return dice.roll()*strength;
    
    }
}