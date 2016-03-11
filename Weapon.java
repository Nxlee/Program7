public abstract class Weapon {
   private int cost;
   private int power;
   private int enemyEvasion;
   private DamageCalc Calc;


   public Weapon(int c, int p, int enemyEvasion) {
      cost = c;
      power = p;
      this.enemyEvasion = enemyEvasion;
      Calc = new DamageCalc();
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


   public int totalDamage(int attackType){
      double multi = (((double)power)/10);
      //System.out.println("This is multi: " + multi);
      Calc.attackDamage(attackType, multi);
      Calc.evasionChance(getEnemyEvasion());
      int damage = (Calc.totalDamage());

      //System.out.println(damage);
      return damage;
   }
}
