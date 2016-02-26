public abstract class Weapon {
   private int cost;
   private int power;

   public Weapon(int c, int p) {
      cost = c;
      power = p;
   }

   public int getCost() {
      return cost;
   }

   public int getPower() {
      return power;
   }
}
