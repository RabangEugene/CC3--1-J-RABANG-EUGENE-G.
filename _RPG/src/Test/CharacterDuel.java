package Test;

import Character.Wizard;
import Character.Hopia;
import java.util.Scanner;
public class CharacterDuel{
    static Wizard bob = new Wizard("Rubick", 5, 8, 10, 50);
    static Hopia joe = new Hopia("Hopia Ninja", 8, 10, 5, 50);
    static Scanner s = new Scanner(System.in);
    static char bobAttack, joeAttack;
    public static void main(String [] args){
        int i = 1;
        System.out.println("Welcome to the Grand Duel of "+bob.getName()+" vs "+joe.getName());
        System.out.println(" ");
        while((bob.getCurrentLife()>0) && (joe.getCurrentLife()>0)){
            
            System.out.println(" ");
            System.out.println(bob.getName()+" vs "+joe.getName());
            System.out.println("**********************************************");
            System.out.println("Round "+i); i++;
            System.out.println(" ");
            System.out.println(bob.getName()+":\nHealth: "+bob.getCurrentLife()+"/"+bob.maxLife+"\nMagicPower: "+bob.getCurrentMagic());
            System.out.println(" ");
            System.out.println(joe.getName()+":\nHealth: "+joe.getCurrentLife()+"/"+joe.maxLife);
            attackTypeBob();
            System.out.println(" ");
            if((bob.getCurrentLife()<=0)&&(joe.getCurrentLife()>0)) {
                System.out.println(" ");
                System.out.println(joe.getName()+" won the battle!");
                System.out.println(bob.getName()+"'s Final Health: "+bob.getCurrentLife());
                System.out.println(joe.getName()+"'s Final Health: "+joe.getCurrentLife());
                
                break;
            }
            if((bob.getCurrentLife()>0)&&(joe.getCurrentLife()<=0)){
                 System.out.println(bob.getName()+" won the battle!");
                System.out.println(bob.getName()+"'s Final Health: "+bob.getCurrentLife()+"/"+bob.maxLife);
                System.out.println(joe.getName()+"'s Final Health: "+joe.getCurrentLife()+"/"+joe.maxLife);
                
                break;
            }
            if((bob.getCurrentLife()<=0)&&(joe.getCurrentLife()<=0)){
                System.out.println(" ");
                System.out.println(bob.getName()+"'s Final Health: "+bob.getCurrentLife()+"/"+bob.maxLife);
                System.out.println(joe.getName()+"'s Final Health: "+joe.getCurrentLife()+"/"+joe.maxLife);
                System.out.println("Draw!");
                break;
            }
            attackTypeJoe();
            if((bob.getCurrentLife()<=0)&&(joe.getCurrentLife()>0)) {
                 System.out.println(joe.getName()+" won the duel!");
                System.out.println(bob.getName()+"'s Final Health: "+bob.getCurrentLife()+"/"+bob.maxLife);
                System.out.println(joe.getName()+"'s Final Health: "+joe.getCurrentLife()+"/"+joe.maxLife);
               
                break;
            }
            if((bob.getCurrentLife()>0)&&(joe.getCurrentLife()<=0)){
                System.out.println(" ");
                System.out.println(bob.getName()+" won the duel");
                System.out.println(bob.getName()+"'s Final Health: "+bob.getCurrentLife()+"/"+bob.maxLife);
                System.out.println(joe.getName()+"'s Final Health: "+joe.getCurrentLife()+"/"+joe.maxLife);
                
                break;
            }
            if((bob.getCurrentLife()<=0)&&(joe.getCurrentLife()<=0)){
                System.out.println(" ");
                System.out.println(bob.getName()+"'s Final Health: "+bob.getCurrentLife()+"/"+bob.maxLife);
                System.out.println(joe.getName()+"'s Final Health: "+joe.getCurrentLife()+"/"+joe.maxLife);
                System.out.println("Draw!");
                break;
            }
        }
    }
    static void attackTypeBob(){
        System.out.println("*************************************************");
        System.out.println("Choose attack type for "+bob.getName()+": ");
        System.out.println("[z] Lightning Bolt \n[A] Normal Attack (use Weapon) \n[C] Heal");
        bobAttack = s.next().charAt(0);
        switch (bobAttack) {
            case 'z':
            case 'Z':
                int damage = bob.castLightningBolt();
                System.out.println(bob.getName()+" summoned the Thunder Bird to casts Lightning Strike to "+joe.getName()+" right on the ass for "+damage+" damage");
                System.out.println("thats gonna leave a mark!");
                joe.wound(damage);
                break;
            case 'a':
            case 'A':
                 damage = bob.useWeapon();
                 System.out.println(bob.getName()+" uses his force staff to attack "+joe.getName()+" on the face for "+damage+" damage!");
                 joe.wound(damage);
                
                 
                 int defense = joe.useArmor();
                 System.out.println(joe.getName()+" casts an armor of griffons on his body  to gain "+defense+ " Armor to deflect "+bob.getName()+"'s damage!");
                 System.out.println(" Countered!");
                  
                
                break;
            case 'c':
            case 'C':
                System.out.println(bob.getName()+" prayed to the Gods to Heal him for "+bob.castHeal());
                break;
            default:
                System.out.println("Attack type not recognized!");
                attackTypeBob();
        }
    }
    static void attackTypeJoe(){
        System.out.println("Choose attack type for "+joe.getName()+": ");
        System.out.println("[H] Hopia Shuriken Strike \n[A] Attack(use Weapon)"); 
               
        bobAttack = s.next().charAt(0);
        switch (bobAttack) {
            case 'h':  
            case 'H':
                int damage = joe.HopiaStrike();
                System.out.println(joe.getName()+" Jumps to the skies and Throws Shuriken Hopias to "+bob.getName()+"'s face for "+damage+" damage!");
                System.out.println("Headshot!");
                bob.wound(damage);
                break;
            case 'a':
            case 'A':
                damage = joe.useWeapon();
                 System.out.println(joe.getName()+" uses his Hopia as a shuriken to attack "+bob.getName()+" on the face for "+damage+" damage!");
                 bob.wound(damage);
                
                    
                 
                 int defense = bob.useArmor();
                   System.out.println(joe.getName()+" summoned the Golem of pangasinan to gain  "+defense+" Armor to deflect "+bob.getName()+"'s damage!");
                 System.out.println(" Countered!");
                 
                
                break;
               
            default:
                System.out.println("Attack type not recognized!");
                attackTypeBob();
        }
    }
}