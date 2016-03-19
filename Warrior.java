/**
 *Warrior class in which player can play as
 *
 *@author Nick Lee, Jake Veazey
 *@version Program7
 */
public class Warrior extends Fighter{

  /**
   * Constructs a default warrior with 100 hp/sp
   *
   */
   public Warrior() {
      super();
   }

  /**
   * Constructs a warrior with 100 hp/sp, 2 potions, 3 elixirs, 1 smokebomb, and
   * a OneHandSword for the AI.
   *
   * @param b A arbitrary boolean value for this overloaded constructor
   */
   public Warrior(boolean b) {
      super(100,100,0,2,3,1, new OneHandSword(0), null);
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
