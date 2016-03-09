public class Fist extends Weapon {
   private DamageCalc Calc;
   //private int enemyEvasion;
   private static final int COST = 0;
   private static final int POWER = 5;

   public Fist(int enemyEvasion) {
      super(COST, POWER, enemyEvasion);
      Calc = new DamageCalc();
      
      //this.enemyEvasion = super.enemyEvasion;
      //setEnemyEvasion(enemyEvasion);

   }

   public int totalDamage(int attackType){
      Calc.attackDamage(attackType);
      Calc.evasionChance(getEnemyEvasion());
      int damage = Calc.totalDamage();
      //System.out.println(damage);
      return damage;
   }


   //public int getCost(){
   //   return COST;
   //}
}
