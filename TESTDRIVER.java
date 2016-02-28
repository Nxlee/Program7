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
      System.out.println(TwoHand.totalDamage(2));
      System.out.println(TwoHand.totalDamage(3));
      System.out.println(TwoHand.getCost());

      //System.out.println("hello");

      OneHandSword OneHand = new OneHandSword(30);
      System.out.println(OneHand.totalDamage(1));
      System.out.println(OneHand.totalDamage(2));
      System.out.println(OneHand.totalDamage(3));




   }



}
