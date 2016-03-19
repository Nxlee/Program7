/**
 * Fighter class for the player
 *
 * @author Nick Lee, Jake Veazey
 * @version Program7
 */
public class Fighter {
   private int hp;
   private int sp;
   private int evasion;
   private static final int STARTHP = 100;
   private static final int STARTSP = 100;
   private static final int STARTEVASION = 0;
   private Potion p;
   private Elixir e;
   private SmokeBomb s;
   private Weapon normalWeapon;
   private Weapon specialWeapon;
   private static final int BASICSP = 0;
   private static final int STRONGSP = -10;
   private static final int SPECIALSP = -20;

//Constructor for fighters
  /**
   * Constructor for a default fighter (player).
   *
   */
   public Fighter() {
      hp = STARTHP;
      sp = STARTSP;
      evasion = 0;
      p = new Potion();
      e = new Elixir();
      s = new SmokeBomb();
      normalWeapon = new Fist(0);
      specialWeapon = null;
   }
  /**
   * Constructor for the AI fighter.
   *
   * @param hp Initial HP of the AI fighter
   * @param sp Initial SP of the AI fighter
   * @param evasion Initial evasion of the AI fighter
   * @param potions Initial number of potions the AI fighter has
   * @param elixirs Initial number of elixirs the AI fighter has
   * @param bombs Initial number of smokebombs the AI fighter has
   * @param nWeap The basic weapon the AI fighter has
   * @param sWeap The special weapon the AI fighter has
   */
   public Fighter(int hp, int sp, int evasion, int potions, 
            int elixirs, int bombs, Weapon nWeap, Weapon sWeap) {
      this.hp = hp;
      this.sp = sp;
      this.evasion = evasion;
      p = new Potion(potions);
      e = new Elixir(elixirs);
      s = new SmokeBomb(bombs);
      normalWeapon = nWeap;
      specialWeapon = sWeap;
   }

//rest skip turn but gain 15 sp and hp
  /**
   * Rest command for the fighter.
   * Resting will increase hp by 2 and SP by 10.
   *
   */
   public void rest() {
      if(hp >= 98) {
         hp= 100;
      } else if(hp < 98) {
         hp += 2;
      }

      if(sp >= 90) {
         sp = 100;
      } else if(sp < 90) {
         sp += 10;
      }
   }

//Method to set HP
  /**
   * Increases or decreases HP.
   *
   * @param value The amount in which HP will either be increase(+) or decrease(-)
   */
   public void setHP(int value) {
      if(hp + value > 100) {
         hp= 100;
      } else {
         hp += value;
      }
   }

//Method to set SP
  /**
   * Increases or decreases SP.
   *
   * @param value The amount in which SP will either increase(+) or decrase(-)
   */
   public void setSP(int value) {
      if(sp + value > 100) {
         sp = 100;
      } else {
         sp += value;
      }
   }

//Method to set evasion
  /**
   * Increases or decrases evasion.
   *
   * @param value the amount in which evasion will either increase(+) or decrease(-)
   */
   public void setEvasion(int value) {
      if(evasion + value > 100) {
         evasion = 100;
      } else if (evasion + value < 0){
         evasion = 0;
      } else {
         evasion += value;
      }
   }

//returns number of potions
  /**
   * Returns the number of potions a fighter has.
   *
   * @return The amount of potions a fighter has
   */
   public int getPotions() {
      return p.getItem();
   }

//adds potion to count
  /**
   * Adds a potion to the amount a fighter has.
   *
   */
   public void addPotion(){
      p.buy(1);
   }

//returns number of potions
 /**
  * Returns the number of elixirs a fighter has.
  *
  * @return The amount of elixirs a fighter has
  */
   public int getElixir() {
      return e.getItem();
   }

//adds potion to count
  /**
   * Adds an elixir to the amount a fighter has.
   *
   */
   public void addElixir(){
      e.buy(1);
   }


//returns number of potions
  /**
   * Returns the number of smokebombs a fighter has.
   *
   * @return the amount of smokebombs a fighter has
   */
   public int getSmokeBomb() {
      return s.getItem();
   }

//adds potion to count
  /**
   * Adds a smokebomb to the amount a fighter has.
   *
   */
   public void addSmokeBomb(){
      s.buy(1);
   }

  /**
   * Makes the fighter use a potion and recieve its effects.
   *
   */
   public void usePotion(){
      p.boost(this);
   }

  /**
   * Makes the fighter use an elixir and recieve its effects.
   *
   */
   public void useElixir(){
      e.boost(this);
   }

  /**
   * Makes the fighter use a smokebomb and recieve its effects.
   *
   */
   public void useSmokeBomb(){
      s.boost(this);
   }

  /**
   * Gives the fighter's starting hp.
   *
   * @return The fighter's initial starting hp of type int
   */
   public int getStartHP(){
      return STARTHP;
   }

  /**
   * Gives the fighter's starting sp.
   *
   * @return The fighter's initial starting sp of type int.
   */
   public int getStartSP(){
      return STARTSP;
   }

/**
*Get the HP value of the fighter.
*
*@return int value of the fighter's HP
*/
   public int getHp() {
      return hp;
   }

/**
*Get the SP value of the fighter.
*
*@return int value of the fighter's SP
*/
   public int getSp() {
      return sp;
   }

/**
*Get the evasion value of the fighter.
*
*@return int value of the fighter's evasion
*/
   public int getEvasion(){
      return evasion;
   }

/**
*Sets the evasion of the enemy to the weapons of the fighter.
*
*@param evasionVal int value of the enemy
*/
   public void setEvasions(int evasionVal){
      normalWeapon.setEnemyEvasion(evasionVal);
      //specialWeapon.setEnemyEvasion(evasionVal);
   }

/**
* Rests the data of the fighter after each round. Resets the HP, SP, Evasions
* and each weapon.
*/
   public void reset(){
      hp = STARTHP;
      sp = STARTSP;
      evasion = STARTEVASION;
      normalWeapon = new Fist(0);
      specialWeapon = null;
   }

/**
* add the normal  weapon to the fighter.
*
* @param weapon of type Weapon that is the normal weapon to add to the fighter.
*/
   public void addWeapon1(Weapon weapon){
      normalWeapon = weapon;
   }
/**
* add the special weapon to the fighter.
*
* @param weapon of type Weapon that is the special weapon to add to the fighter.
*/
   public void addWeapon2(Weapon weapon){
      specialWeapon = weapon;
   }

/**
* the name if the fighter's normal weapon.
*
* @return the name of the normal wepon.
*/
   public String getWeapon1Name(){
      return normalWeapon.toString();
   }

/**
* the name if the fighter's special weapon.
*
* @return the name of the special weapon.
*/
   public String getWeapon2Name(){
      return specialWeapon.toString();
   }

/**
* SP for a basic attack.
*
* @return the int amnount of SP for a basic attack.
*/
   public int basicSP(){
      return BASICSP;
   }

/**
* SP for a strong attack.
*
* @return the int amnount of SP for a strong attack.
*/
   public int strongSP(){
      return STRONGSP;
   }

/**
* SP for a special attack.
*
* @return the int amnount of SP for a special attack.
*/
   public int specialSP(){
      return SPECIALSP;
   }

/**
* Fighter uses the basic Attack.
*
* @return the damage done by a basic attack.
*/
   public int basicAttack(){
      return normalWeapon.totalDamage(1);
   }

/**
* Fighter uses the Strong Attack.
*
* @return the damage done by a strong attack.
*/
   public int strongAttack(){
      return normalWeapon.totalDamage(2);
   }

/**
* Fighter uses the Special Attack.
*
* @return the damage done by a special attack.
*/
   public int specialAttack(){
      return normalWeapon.totalDamage(3);
   }

/**
* Fighter to use the special weapon in the way that their class uses it.
*
* @param hasW3 Boolean value to check if the player has a special weapon
*/
   public int useSpecialWeapon(boolean hasW3){
      if (!hasW3){
         return 0;
      } else {
         return 5;
      }
   }

}
