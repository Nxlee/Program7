/**
* Fist weapon, when the plater did not buy a weapon.
*
* @author Jake Veazey, Nick Lee
* @version Program7
*/
public class Fist extends Weapon {
   private DamageCalc Calc;
   //private int enemyEvasion;
   private static final int COST = 0;
   private static final int POWER = 5;

/**
*This is the constructor for the class.
*
*@param enemyEvasion This is the enemy's evasion level. Used in DamageCalc.
*     Set this to 0 when initializing, can be changed in Items
*/
   public Fist(int enemyEvasion) {
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

   //public int getCost(){
   //   return COST;
   //}
}
