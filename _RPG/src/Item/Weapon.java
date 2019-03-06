package Item;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
/**   * an interface to symbolize the Armor (the character can use this to initiate an attack (normal attacks))*/
public interface Weapon {
    /**
    * useArmor to be overrides by the subclasses
     * @return 
    */
    public int useWeapon();
    
}
