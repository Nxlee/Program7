/**
* Holy Staff  weapon for mages.i
*
* @author Jake Veazey, Nick Lee
* @version Program7
*/


public class HolyStaff extends Weapon {
   private DamageCalc Calc;
   private static final int COST = 50;
   private static final int POWER = 20;
   //private int enemyEvasion;
 
/**
*This is the constructor for the class.
*
*@param enemyEvasion This is the enemy's evasion level. Used in DamageCalc.
*     Set this to 0 when initializing, can be changed in Items
*/
  
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
