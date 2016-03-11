public class Archer extends Fighter {
   public Archer() {
      super();
   }
   public Archer(boolean b) {
      super(100,100,0,3,3,2,new ShortBow(0), new Wolf(0));
   }

/*
   public int basicAttack() {
      return 5;
   }

   public int strongAttack() {
      return 10;
   }

   public int specialAttack() {
      return 15;
   }
*/
}
