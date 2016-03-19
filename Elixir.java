/**
 * Elixir item
 *
 * @author Nick Lee, Jake Veazey
 * @version Program7
 */
public class Elixir implements Items{

   private static final int SP = 25;
   private static final int COST = 50;
   private int amount;
  /**
   * Constructs an elixir object with a default quanitty of 0.
   *
   */
   public Elixir(){ //Default c
      amount = 0;
   }

  /**
   * Constructs an elixir object with the quantity specified.
   *
   * @param amount The quantity of elixirs in which the player starts with
   */
   public Elixir(int amount){
      this.amount = amount;
   }

  /**
   * Applies the effect of the elixir to the fighter.
   *
   * @param fighter Designates which fighter to apply the effect to
   */
   public void boost(Fighter fighter){ //Specified in class. Could increase HP or SP
      if (amount != 0){
         amount--;
         fighter.setSP(SP);
      }
   }

  /**
   * Gives a description of what the elixir does.
   *
   * @return A string description of what the elixir does
   */
   public String getAbility(){ // String of what the specific item does
      return "This is a potion which will increase your SP by " + SP + " SP.";
   }
  /**
   * Gives the quantity of elixirs a player has.
   *
   * @return The quanitty of potions a player has of type int
   */
   public int getItem(){
      return amount;
   }

  /**
   * Gives the cost of elixirs in the shop.
   *
   * @return the cost of the elixir in the shop of type int
   */
   public int getCost(){ // returns the cost of the item
      return COST;
   }
  /**
   * Adds to the quantity of elixirs you have based on how many you buy.
   *
   * @param amount The amount of elixirs to increment the quantity by
   */
   public void buy(int amount){ //increments the amount by the amount they bought
      this.amount = this.amount + amount;
   }
  /**
   * Displays the name.
   *
   * @return the name of the class
   */
   public String toString(){
      return "" + getClass().getName(); // + ": " + amount + " remaining";
   }
  /**
   * Gives the value of what the elixir does.
   *
   * @return The amount of SP the elixir gives
   */
   public int does(){
      return SP;
   }


}
