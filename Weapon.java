public abstract class Weapon {
   private int cost;
   private int power;
   private int enemyEvasion;

   public Weapon(int c, int p, int enemeyEvasion) {
      cost = c;
      power = p;
      this.enemyEvasion = enemyEvasion;
   }

   public int getCost() {
      return cost;
   }

   public int getPower() {
      return power;
   }

   public int getEnemyEvasion(){
      return enemyEvasion;
   }

   public void setEnemyEvasion(int enemyEvasion){
      this.enemyEvasion = enemyEvasion;
   }
}
