/**
 * Potion item
 *
 * @author Nick Lee, Jake Veazey
 * @version Program7
 */

public class SmokeBomb implements Items{
   
   private static final int EVASION = 10;
   private static final int COST = 50;
   private int amount;

/**
* Constructs a smoke bomb object with a default quantity of 0.
*
*/
   public SmokeBomb(){ //Default c
      amount = 0;
   }


  /**
   * Constructs a smoke bomb object with the quantity specified.
   *
   * @param amount The quanity of smoke bombs in which the player starts with
   */
   public SmokeBomb(int amount){
      this.amount = amount;
   }


  /**
   * Applies the effect of the smoke bomb to a fighter.
   *
   * @param fighter Designates which fighter to apply the effect to
   */

   public void boost(Fighter fighter){ //Specified in class. Could increase HP or SP
      if (amount != 0){
         amount--;
         fighter.setEvasion(EVASION);
      }
   }

  /**
   * To be used to remove evasion after a set amount of turns.
   * Not incorporated currently.
   *
   *@param fighter of Type Fighter
   */
   public void end(Fighter fighter){ // to be called after a turn when it should be removed from play
      fighter.setEvasion((-1) * EVASION);
   }

  /**
   * Gives a description of what the smoke bomb does.
   *
   * @return A String description of what the smoke bomb does
   *
   */
   public String getAbility(){ // String of what the specific item does
      return "This is a SmokeBomb  which will increase your Evasion  by " + EVASION + " Evasion.";
   }

  /**
   * Gives the quantity of smoke bombs a player has.
   *
   * @return The quantiy of smoke bombs a player has of type int
   */
   public int getItem(){
      return amount;
   }

  /**
   * Gives the cost of the smoke bomb in the shop.
   *
   * @return The cost of the smoke bomb in the shop of type int
   */
   public int getCost(){ // returns the cost of the item
      return COST;
   }

  /**
   * Adds to the quantity of smoke bombs you have based on how many you buy.
   *
   * @param amount The amount of smoke bombs to increment the quantity by
   */
   public void buy(int amount){ //increments the amount by the amount they bought
      this.amount = this.amount + amount;
   }

  /**
   * Displays the name.
   *
   * @return The name of the class
   */
   public String toString(){
      return "" + getClass().getName();// + ": " + amount + " remaining";
   }

  /**
   * Gives the value of what the smoke bomb does.
   *
   * @return The amount of Evasion the smoke bomb heals
   */
   public int does(){
      return EVASION;
   }
}
