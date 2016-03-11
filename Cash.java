public class Cash{

   private int cashAmount;
   private static final int startAmount = 700;

   public Cash(){
      cashAmount = startAmount;
   }

   public int buyWeapon(Weapon weapon){
      cashAmount = cashAmount - weapon.getCost();
      return cashAmount;
   }

   public int buyItem(Items item){
      cashAmount = cashAmount - item.getCost();
      return cashAmount;
   }

   public int getCash(){
      return cashAmount;
   }

   public int setCash(int cashAmount){
      this.cashAmount = cashAmount;
      return this.cashAmount;
   }

}
