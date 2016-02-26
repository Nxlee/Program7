public interface Items {

   public void boost(); //Specified in class. Could increase HP or SP
   public String getAbility(); // String of what the specific item does
   public int getCost(); // returns the cost of the item
   public void buy(int amount); //increments the amount by the amount they bought
   public void use(int amount); //decrements the amount by the amount they used

}
