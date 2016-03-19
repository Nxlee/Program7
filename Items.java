/**
 * Interface that describes Item behavior.
 *
 *@author Nick Lee, Jake Veazey
 *@version Program7
 */
public interface Items {
  /**
   * Applies the effect of the item to the fighter.
   *
   * @param fighter Designates which fighter object to apply the effect to
   */
   public void boost(Fighter fighter); //Specified in class. Could increase HP or SP
  /**
   * Gives a description of what the item does.
   *
   * @return The effect of the item in type String
   */
   public String getAbility(); // String of what the specific item does
  /**
   * Gives the quantity of the item.
   *
   * @return The quantity of the designated item of type int
   */
   public int getItem(); // returns the
  /**
   * Gives the cost of the item.
   *
   * @return How much the item costs in the shop of type int
   */
   public int getCost(); // returns the cost of the item
  /**
   * Increments the amount of items you have by the amount they bought.
   *
   * @param amount Amount of item in which the player gains
   *
   */
   public void buy(int amount); //increments the amount by the amount they bought
   //public void use(int amount); //decrements the amount by the amount they used
  /**
   * Overwritten toString method displays the item's name.
   *
   * @return The name of the item of type String
   */
   public String toString();
  /**
   * Gives the value of what the item does.
   *
   * @return The value of the item of type int
   */
   public int does();
}
