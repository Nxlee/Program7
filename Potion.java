public class Potion implements Items{

   private static final int HP = 25;
   private static final int COST = 50;
   private int amount;

   public Potion(){ //Default c
      amount = 0;
   }

   public Potion(int amount) {
      this.amount = amount;
   }

   public void boost(Fighter fighter){ //Specified in class. Could increase HP or SP
      if (amount != 0){
         amount--;
         fighter.setHP(HP);
      }
   }

   public String getAbility(){ // String of what the specific item does
      return "This is a potion which will increase your HP by " + HP + " HP.";
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
      return "" + getClass().getName(); // + ": " + amount + " remaining";
   }
   
   public int does(){
      return HP;
   }
}
