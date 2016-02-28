/*
* Version: 1
*/

public class TESTDRIVER{

   public static void main (String[] args){
      testWeapons();

   }

   public static void testWeapons(){
      TwoHandSword TwoHand = new TwoHandSword(30);
      System.out.println(TwoHand.totalDamage(1));
      //System.out.println("hello");
   }



}
