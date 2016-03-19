/**
 *ElementalStaff weapon used by Mage.
 *
 *@author Nick Lee, Jake Veazey
 *@version Program7
 */
public class ElementalStaff extends Weapon {
   private DamageCalc Calc;
   //private int enemyEvasion;
   private static final int COST = 50;
   private static final int POWER = 10;

  /**
   * Constructor for an ElementalStaff weapon.
   *
   * @param enemyEvasion Initializes a weapon with specific evasion if necessary
   */
   public ElementalStaff(int enemyEvasion) {
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
