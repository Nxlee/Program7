/**
 * Cash class for the game's currency.
 *
 * @author Nick Lee, Jake Veazey
 * @version Program7
 */
public class Cash{

   private int cashAmount;
   private static final int startAmount = 700;

  /**
   * Creates a cash object with its default starting amount.
   *
   */
   public Cash(){
      cashAmount = startAmount;
   }

  /**
   * Action of buying a weapon subtracts the cost from the player's total money.
   *
   * @param weapon The weapon the player is buying
   * @return The amount of money the player has left after purchasing the weapon
   */
   public int buyWeapon(Weapon weapon){
      cashAmount = cashAmount - weapon.getCost();
      return cashAmount;
   }

  /**
   * Action of buying an item subtracts the cost from the player's total money.
   *
   * @param item The item the player is buying
   * @return The amount of money the player has left after purchasing the item
   */
   public int buyItem(Items item){
      cashAmount = cashAmount - item.getCost();
      return cashAmount;
   }

  /**
   * Gives the amount of money a player has.
   *
   * @return The amount of money a player has of type int
   */
   public int getCash(){
      return cashAmount;
   }

  /**
   * Sets the amount of money a player has.
   *
   * @param cashAmount The amount of money the player will have
   * @return The new value of money that was set
   */
   public int setCash(int cashAmount){
      this.cashAmount = cashAmount;
      return this.cashAmount;
   }

}
