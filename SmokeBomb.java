public class SmokeBomb implements Items{
   
   private static final int EVASION = 10;
   private static final int COST = 50;
   private int amount;

   public SmokeBomb(){ //Default c
      amount = 0;
   }

   public SmokeBomb(int amount){
      this.amount = amount;
   }

   public void boost(Fighter fighter){ //Specified in class. Could increase HP or SP
      if (amount != 0){
         amount--;
         fighter.setEvasion(EVASION);
      }
   }

   public void end(Fighter fighter){ // to be called after a turn when it should be removed from play
      fighter.setEvasion((-1) * EVASION);
   }

   public String getAbility(){ // String of what the specific item does
      return "This is a SmokeBomb  which will increase your Evasion  by " + EVASION + " Evasion.";
   }

   public int getItem(){
      return amount;
   }

   public int getCost(){ // returns the cost of the item
      return COST;
   }

   public void buy(int amount){ //increments the amount by the amount they bought
      this.amount = this.amount + amount;
   }

   public String toString(){
      return "" + getClass().getName();// + ": " + amount + " remaining";
   }

   public int does(){
      return EVASION;
   }
}
