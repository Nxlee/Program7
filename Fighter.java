public abstract class Fighter {
   private int hp;
   private int sp;

//Constructor for fighters
   public Fighter() {
      hp = 100;
      sp = 100;
   }
//returns hp
   public int getHp() {
      return hp;
   }
//returns sp
   public int getSp() {
      return sp;
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

   public abstract int basicAttack();
   public abstract int strongAttack();
   public abstract int specialAttack();
}
