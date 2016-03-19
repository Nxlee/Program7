/**
* This is the archer class type.
*
* @author Jake Veazey, Nick Lee
* @version Program7
*/

public class Archer extends Fighter {
/**
* This is the generic constructor
*
*/
   public Archer() {
      super();
   }
/**
* This is the constructor
*
* @param b Just a placeholder that designates which constuctor to use.
*  Used in AI.
*/  
   public Archer(boolean b) {
      super(100,100,0,3,3,2,new ShortBow(0), new Wolf(0));
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
