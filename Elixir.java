public class Elixir implements Items{

   private static final int SP = 25;
   private static final int COST = 50;
   private int amount;

   public Elixir(){ //Default c
      amount = 0;
   }

   public Elixir(int amount){
      this.amount = amount;
   }

   public void boost(Fighter fighter){ //Specified in class. Could increase HP or SP
      if (amount != 0){
         amount--;
         fighter.setSP(SP);
      }
   }

   public String getAbility(){ // String of what the specific item does
      return "This is a potion which will increase your SP by " + SP + " SP.";
   }

   public int getItem(){
      return amount;
   }

   public int getCost(){ // returns the cost of the item
      return COST;
   }

   public void buy(int amount){ //increments the amount by the amount they bought
      this.amount =+ amount;
   }

   public String toString(){
      return "" + getClass().getName() + ": " + amount + " remaining.";
   }




}
