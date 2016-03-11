public class Warrior extends Fighter{

   //constructs warrior with 100 hp/sp
   public Warrior() {
      super();
   }
   public Warrior(boolean b) {
      super(100,100,0,3,3,1, new OneHandSword(0), null);
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
