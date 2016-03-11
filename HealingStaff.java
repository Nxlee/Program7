public class HealingStaff extends Weapon {
   private DamageCalc Calc;
   //private int enemyEvasion;
   private static final int COST = 50;
   private static final int POWER = 30;

   public HealingStaff(int enemyEvasion) {
      super(COST, POWER, enemyEvasion);
      Calc = new DamageCalc();
   }

   public int totalDamage(int attackType){
      return 5;
   }
}
