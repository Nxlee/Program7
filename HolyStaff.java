public class HolyStaff extends Weapon {
   private DamageCalc Calc;
   private static final int COST = 50;
   private static final int POWER = 20;
   //private int enemyEvasion;
   
   public HolyStaff(int enemyEvasion) {
      super(COST, POWER, enemyEvasion);
      Calc = new DamageCalc();
   }
/*
   public int totalDamage(int attackType){
      Calc.attackDamage(attackType);
      Calc.evasionChance(getEnemyEvasion());
      int damage = Calc.totalDamage();
      //System.out.println(damage);
      return damage;
   }
*/
}
