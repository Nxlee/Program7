/**
 *Shield "special" weapon used by Warrior.
 *
 *@author Nick Lee, Jake Veazey
 *@version Program7
 */
public class Shield extends Weapon {
   private DamageCalc Calc;
   //private int enemyEvasion;
   private static final int COST = 75;
   private static final int POWER = 3;



  /**
   * Constructor for a Shield weaponn
   *
   * @param enemyEvasion Initializes a weapon with specific evasion if necessary
   */
   public Shield(int enemyEvasion) {
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
