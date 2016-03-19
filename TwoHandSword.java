/**
* Two Hand Sword weapon for warriors.
*
* @author Jake Veazey, Nick Lee
* @version Program7
*/


public class TwoHandSword extends Weapon {
   private DamageCalc Calc;
   //private int enemyEvasion;
   private static final int COST = 50;
   private static final int POWER = 20;

/**
*This is the constructor for the class.
*
*@param enemyEvasion This is the enemy's evasion level. Used in DamageCalc.
*     Set this to 0 when initializing, can be changed in Items
*/
   public TwoHandSword(int enemyEvasion) {
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
