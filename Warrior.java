public class Warrior extends Fighter{

   //constructs warrior with 100 hp/sp
   public Warrior() {
      super();
   }
   public Warrior(boolean b) {
      super(100,100,0,5,5,2, new OneHandSword(0), new Shield(0));
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
