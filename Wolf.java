/**
 *Wolf "Special" weapon used by archer
 *
 *@author Nick Lee, Jake Veazey
 *@version Program7
 */

public class Wolf extends Weapon {
   private DamageCalc Calc;
   //private int enemyEvasion;
   private static final int COST = 75;
   private static final int POWER = 5;

  /**
   * Constructor for a wolf weapon.
   *
   * @param enemyEvasion Initializes a weapon with specific evasion if necessary
   */
   public Wolf(int enemyEvasion) {
      super(COST, POWER, enemyEvasion);
      Calc = new DamageCalc();
      
      //this.enemyEvasion = super.enemyEvasion;
      //setEnemyEvasion(enemyEvasion);

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
