/**
* This is the mage class type.
*
* @author Jake Veazey, Nick Lee
* @version Program7
*/


public class Mage extends Fighter {
/**
* This is the generic constructor
*
*/
   public Mage() {
      super();
   }
   
/**
* This is the constructor
*
* @param b Just a placeholder that designates which constuctor to use.
*  Used in AI.
*/   
   public Mage(boolean b) {
      super(100,100,0,5,7,3, new HolyStaff(0), new HealingStaff(0));
   }

   




/*
   public int basicAttack() {
      return 5;
   }

   public int strongAttack() {
      return 10;
   }

   public int specialAttack() {
      return 15;
   }
*/
}
