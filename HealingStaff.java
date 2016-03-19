/**
 *Healingstaff "Special" weapon used by Mage
 *
 *@author Nick Lee, Jake Veazey
 *@version Program7
 */
public class HealingStaff extends Weapon {
   private DamageCalc Calc;
   //private int enemyEvasion;
   private static final int COST = 50;
   private static final int POWER = 30;



  /**
   * Constructor for a HealingStaff weapon.
   *
   * @param enemyEvasion Initializes a weapon with specific evasion if necessary
   */
   public HealingStaff(int enemyEvasion) {
      super(COST, POWER, enemyEvasion);
      Calc = new DamageCalc();
   }

   public int totalDamage(int attackType){
      return 5;
   }
}
