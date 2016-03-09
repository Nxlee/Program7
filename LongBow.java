public class LongBow extends Weapon {
   private DamageCalc Calc;
   //private int enemyEvasion;
   private static final int COST = 50;
   private static final int POWER = 25;

   public LongBow(int enemyEvasion) {
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


   public int getCost(){
      return COST;
   }
}
