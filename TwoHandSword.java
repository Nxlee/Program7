/*
* Version: 2
*/

public class TwoHandSword extends Weapon {
   private DamageCalc Calc;
   private int enemyEvasion;
   private static final int COST = 50;
   private static final int POWER = 20;

   public TwoHandSword(int enemyEvasion) {
      super(COST, POWER);
      Calc = new DamageCalc();
      this.enemyEvasion = enemyEvasion;

   }

   public int totalDamage(int attackType){
      Calc.attackDamage(attackType);
      Calc.evasionChance(enemyEvasion);
      int damage = Calc.totalDamage();
      //System.out.println(damage);
      return damage;
   }   

}
