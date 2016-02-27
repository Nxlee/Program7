public class TwoHandSword extends Weapon {
   private DamageCalc Calc = new DamageCalc();
   
   public TwoHandSword() {
      super(50, 20);
   }



   public int totalDamage(int attackType){
      Calc.attackDamage(attackType);
      return -1;
   }



/*
   public int totalDamage(int attackType){
      Calc.totalDamage(attackType

   }

*/

}
