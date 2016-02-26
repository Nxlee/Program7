public abstract class Fighter {
   private int hp;
   private int sp;
   private Potion p;

//Constructor for fighters
   public Fighter() {
      hp = 100;
      sp = 100;
      p = new Potion();
   }

//rest skip turn but gain 15 sp and hp
   public void rest() {
      if(hp >= 85) {
         hp= 100;
      } else if(hp < 85) {
         hp += 15;
      }

      if(sp >= 85) {
         sp = 100;
      } else if(sp < 85) {
         sp += 15;
      }
   }


//fighter gets hurt... value based on damagecalc class
   public void hurt(int value) {
      hp -= value;
      if(hp <= 0) {
         //GameOver
      }
   }

//recovers hp
   public void setHP(int value) {
      if(hp+value > 100) {
         hp= 100;
      } else {
         hp += value;
      }
   }
//Lowers sp based on attack
   public void useAttack(int value) {
      sp -= value;
   }
//returns number of potions
   public int getPotions() {
      return p.getItem();
   }
//returns hp
   public int getHp() {
      return hp;
   }
//returns sp
   public int getSp() {
      return sp;
   }



   public abstract int basicAttack();
   public abstract int strongAttack();
   public abstract int specialAttack();
}
