/**
* Weapon class for the other weapons to extend.
*
* @author Jake Veazey, Nick Lee
* @version Program7
*/

public abstract class Weapon {
   private int cost;
   private int power;
   private int enemyEvasion;
   private DamageCalc Calc;

/**
*Constructor of the weapon class.
*
*@param c int of the cost of the weaopon.
*
*@param p int of the power of the weapon.
*
*@param enemyEvasion int evasion of the enemy.
*/
   public Weapon(int c, int p, int enemyEvasion) {
      cost = c;
      power = p;
      this.enemyEvasion = enemyEvasion;
      Calc = new DamageCalc();
   }

/**
*Basic constructor of the weapon class.
*
*/
   public Weapon(){
      cost = 0;
      power = 0;
      enemyEvasion = 0;
   }

/**
* Gets the cost of the weapon.
*
*@return type int of the Weapon cost
*/
   public int getCost() {
      return cost;
   }

/**
* Gets the power of the weapon.
*
*@return type int of the Weapon power 
*/
   public int getPower() {
      return power;
   }

/**
*Returns the enemy's evasion on the weapon.
*
*@return type int of the enemyEvasion.
*/
   public int getEnemyEvasion(){
      return enemyEvasion;
   }

/**
* Sets the enemy's evasion onto the weapon.
*
*@param enemyEvasion type int of the enemyEvasion.
*/
   public void setEnemyEvasion(int enemyEvasion){
      this.enemyEvasion = enemyEvasion;
   }


/**
*string of the weapon's name.
*@return type string of the weapon's name
*/
   public String toString(){
      return "" + getClass().getName(); 
   }

/**
*Calculated the total damage a weapon does.
*
*@param attackType type int of the attack a fighter uses
*@return the int of the damage done
*/
   public int totalDamage(int attackType){
      double multi = (((double)power)/10);
      //System.out.println("This is multi: " + multi);
      Calc.attackDamage(attackType, multi);
      Calc.evasionChance(getEnemyEvasion());
      int damage = (Calc.totalDamage());

      //System.out.println(damage);
      return damage;
   }
}
