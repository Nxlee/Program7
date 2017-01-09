/**
 *OneHandSword weapon used by Warrior.
 *
 *@author Nick Lee, Jake Veazey
 *@version Program7
 */
public class OneHandSword extends Weapon {
   private DamageCalc Calc;
   //private int enemyEvasion;
   private static final int COST = 25;
   private static final int POWER = 10;

  /**
   * Constructor for a OneHandSword weapon.
   *
   * @param enemyEvasion Initializes a weapon with specific evasion if necessary
   */
   public OneHandSword(int enemyEvasion) {
      super(COST, POWER, enemyEvasion);
      Calc = new DamageCalc();
      //this.enemyEvasion = enemyEvasion;

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
