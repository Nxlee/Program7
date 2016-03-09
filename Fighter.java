public class Fighter {
   private int hp;
   private int sp;
   private int evasion;
   private Potion p;
   private Elixir e;
   private SmokeBomb s;
   private Weapon normalWeapon;
   private Weapon specialWeapon;

//Constructor for fighters
   public Fighter() {
      hp = 80;
      sp = 80;
      evasion = 0;
      p = new Potion();
      e = new Elixir();
      s = new SmokeBomb();
      normalWeapon = null;
      specialWeapon = null;
   }

   public Fighter(int hp, int sp, int evasion, int potions, 
            int elixirs, int bombs) {
      this.hp = hp;
      this.sp = sp;
      this.evasion = evasion;
      p = new Potion(potions);
      e = new Elixir(elixirs);
      s = new SmokeBomb(bombs);
   }

//rest skip turn but gain 15 sp and hp
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
   public void setHP(int value) {
      if(hp + value > 100) {
         hp= 100;
      } else {
         hp += value;
      }
   }

//Method to set SP
   public void setSP(int value) {
      if(sp + value > 100) {
         sp = 100;
      } else {
         sp += value;
      }
   }

//Method to set evasion
   public void setEvasion(int value) {
      if(evasion + value > 100) {
         evasion = 100;
      } else {
         evasion += value;
      }
   }

//returns number of potions
   public int getPotions() {
      return p.getItem();
   }

//adds potion to count
   public void addPotion(){
      p.buy(1);
   }

//returns number of potions
   public int getElixir() {
      return e.getItem();
   }

//adds potion to count
   public void addElixir(){
      e.buy(1);
   }


//returns number of potions
   public int getSmokeBomb() {
      return s.getItem();
   }

//adds potion to count
   public void addSmokeBomb(){
      s.buy(1);
   }

   public void usePotion(){
      p.boost(this);
   }

   public void useElixir(){
      e.boost(this);
   }

   public void useSmokeBomb(){
      s.boost(this);
   }




//returns hp
   public int getHp() {
      return hp;
   }
//returns sp
   public int getSp() {
      return sp;
   }

   public int getEvasion(){
      return evasion;
   }



   public void addWeapon1(Weapon weapon){
      normalWeapon = weapon;
   }

   public void addWeapon2(Weapon weapon){
      specialWeapon = weapon;
   }

//

   public int basicAttack(){
      return normalWeapon.totalDamage(1);
   }

   public int strongAttack(){
      return normalWeapon.totalDamage(2);
   }

   public int specialAttack(){
      return normalWeapon.totalDamage(3);
   }
}
