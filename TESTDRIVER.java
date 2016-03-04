/*
* Version: 1
*/

public class TESTDRIVER{

   public static void main (String[] args){
      testWeapons();

   }

   public static void testWeapons(){
      System.out.println("Warrior:");

      TwoHandSword TwoHand = new TwoHandSword(30);
      System.out.println("\nTwo Hand Sword Tests:");
      System.out.println("\tDamage attack 1: " + TwoHand.totalDamage(1));
      System.out.println("\tDamage attack 2: " + TwoHand.totalDamage(2));
      System.out.println("\tDamage attack 3: " + TwoHand.totalDamage(3));
      System.out.println("\tCost: " + TwoHand.getCost() + " || Power: " + TwoHand.getPower() + " || Evasion: " + TwoHand.getEnemyEvasion() + "\n\n");


      OneHandSword OneHand = new OneHandSword(30);
      System.out.println("\nOne Hand Sword Tests:");
      System.out.println("\tDamage attack 1: " + OneHand.totalDamage(1));
      System.out.println("\tDamage attack 2: " + OneHand.totalDamage(2));
      System.out.println("\tDamage attack 3: " + OneHand.totalDamage(3));
      System.out.println("\tCost: " + OneHand.getCost() + " || Power: " + OneHand.getPower() + " || Evasion: " + OneHand.getEnemyEvasion() + "\n\n");


      Shield shield = new Shield(30);
      System.out.println("\nShield Tests:");
      System.out.println("\tDamage attack 1: " + shield.totalDamage(1));
      System.out.println("\tDamage attack 2: " + shield.totalDamage(2));
      System.out.println("\tDamage attack 3: " + shield.totalDamage(3));
      System.out.println("\tCost: " + shield.getCost() + " || Power: " + shield.getPower() + " || Evasion: " + shield.getEnemyEvasion() + "\n\n");

      System.out.println("Mage:");

      ElementalStaff elementalStaff = new ElementalStaff(30);
      System.out.println("\nElementalStaff Tests:");
      System.out.println("\tDamage attack 1: " + elementalStaff.totalDamage(1));
      System.out.println("\tDamage attack 2: " + elementalStaff.totalDamage(2));
      System.out.println("\tDamage attack 3: " + elementalStaff.totalDamage(3));
      System.out.println("\tCost: " + elementalStaff.getCost() + " || Power: " + elementalStaff.getPower() + " || Evasion: " + elementalStaff.getEnemyEvasion() + "\n\n");

      HolyStaff holyStaff = new HolyStaff(30);
      System.out.println("\nHolyStaff Tests:");
      System.out.println("\tDamage attack 1: " + holyStaff.totalDamage(1));
      System.out.println("\tDamage attack 2: " + holyStaff.totalDamage(2));
      System.out.println("\tDamage attack 3: " + holyStaff.totalDamage(3));
      System.out.println("\tCost: " + holyStaff.getCost() + " || Power: " + holyStaff.getPower() + " || Evasion: " + holyStaff.getEnemyEvasion() + "\n\n");

      HealingStaff healingStaff = new HealingStaff(30);
      System.out.println("\nHealingStaff Tests:");
      System.out.println("\tDamage attack 1: " + healingStaff.totalDamage(1));
      System.out.println("\tDamage attack 2: " + healingStaff.totalDamage(2));
      System.out.println("\tDamage attack 3: " + healingStaff.totalDamage(3));
      System.out.println("\tCost: " + healingStaff.getCost() + " || Power: " + healingStaff.getPower() + " || Evasion: " + healingStaff.getEnemyEvasion() + "\n\n");


      System.out.println("Archer:");

      LongBow longBow = new LongBow(30);
      System.out.println("\nLongBow Tests:");
      System.out.println("\tDamage attack 1: " + longBow.totalDamage(1));
      System.out.println("\tDamage attack 2: " + longBow.totalDamage(2));
      System.out.println("\tDamage attack 3: " + longBow.totalDamage(3));
      System.out.println("\tCost: " + longBow.getCost() + " || Power: " + longBow.getPower() + " || Evasion: " + longBow.getEnemyEvasion() + "\n\n");

      ShortBow shortBow = new ShortBow(30);
      System.out.println("\nShortBow Tests:");
      System.out.println("\tDamage attack 1: " + shortBow.totalDamage(1));
      System.out.println("\tDamage attack 2: " + shortBow.totalDamage(2));
      System.out.println("\tDamage attack 3: " + shortBow.totalDamage(3));
      System.out.println("\tCost: " + shortBow.getCost() + " || Power: " + shortBow.getPower() + " || Evasion: " + shortBow.getEnemyEvasion() + "\n\n");

      Wolf wolf = new Wolf(30);
      System.out.println("\nWolf Tests:");
      System.out.println("\tDamage attack 1: " + wolf.totalDamage(1));
      System.out.println("\tDamage attack 2: " + wolf.totalDamage(2));
      System.out.println("\tDamage attack 3: " + wolf.totalDamage(3));
      System.out.println("\tCost: " + wolf.getCost() + " || Power: " + wolf.getPower() + " || Evasion: " + wolf.getEnemyEvasion() + "\n\n");


   }



}
