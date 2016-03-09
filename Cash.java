public class Cash{

   private int cashAmount;
   private static final int startAmount = 500;

   public Cash(){
      cashAmount = startAmount;
   }

   public int buyWeapon(Weapon weapon){
      cashAmount = cashAmount - weapon.getCost();
      return cashAmount;
   }

   public int buyItem(Items item){
      return cashAmount - item.getCost();
   }

   public int getCash(){
      return cashAmount;
   }

   public int setCash(int cashAmount){
      this.cashAmount = cashAmount;
      return this.cashAmount;
   }

}
