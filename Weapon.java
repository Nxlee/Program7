public abstract class Weapon {
   private int cost;
   private int power;
   private int enemyEvasion;

   public Weapon(int c, int p, int enemyEvasion) {
      cost = c;
      power = p;
      this.enemyEvasion = enemyEvasion;
   }

   public Weapon(){
      cost = 0;
      power = 0;
      enemyEvasion = 0;
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

   public String toString(){
      return "" + getClass().getName(); 
   }
}
