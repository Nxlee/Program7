/**
 * Potion item
 *
 * @author Nick Lee, Jake Veazey
 * @version Program7
 */
public class Potion implements Items{

   private static final int HP = 25;
   private static final int COST = 50;
   private int amount;

  /**
   * Constructs a potion object with a default quantity of 0.
   *
   */
   public Potion(){ //Default c
      amount = 0;
   }

  /**
   * Constructs a potion object with the quantity specified.
   *
   * @param amount The quanity of potions in which the player starts with
   */
   public Potion(int amount) {
      this.amount = amount;
   }


  /**
   * Applies the effect of the potion to a fighter.
   *
   * @param fighter Designates which fighter to apply the effect to
   */
   public void boost(Fighter fighter){ //Specified in class. Could increase HP or SP
      if (amount != 0){
         amount--;
         fighter.setHP(HP);
      }
   }

  /**
   * Gives a description of what the potion does.
   *
   * @return A String description of what the potion does
   *
   */
   public String getAbility(){ // String of what the specific item does
      return "This is a potion which will increase your HP by " + HP + " HP.";
   }

  /**
   * Gives the quantity of potions a player has.
   *
   * @return The quantiy of potions a player has of type int
   */
   public int getItem(){
      return amount;
   }

  /**
   * Gives the cost of the potion in the shop.
   *
   * @return The cost of the potion in the shop of type int
   */
   public int getCost(){ // returns the cost of the item
      return COST;
   }

  /**
   * Adds to the quantity of potions you have based on how many you buy.
   *
   * @param amount The amount of potions to increment the quantity by
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
      return "" + getClass().getName(); // + ": " + amount + " remaining";
   }

  /**
   * Gives the value of what the potion does.
   *
   * @return The amount of HP the potion heals
   */
   public int does(){
      return HP;
   }
}
