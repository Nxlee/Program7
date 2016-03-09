import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Play {
   public static void main(String[] args) {
      int gamesPlayed = 0;
      int gamesToPlay = 3;
      boolean passed;
      int playerClass = 0;
      List<Items> itemList = new ArrayList<Items>();
      List<Weapon> weaponList = new ArrayList<Weapon>();
      boolean hasW1;
      boolean hasW2;
      boolean hasW3;

     // int choice = 69;

      Scanner scan = new Scanner(System.in);
      Fighter fighter;
      Cash money = new Cash();


      while (true){ // pick a class
         //int choice = 0; 

         System.out.println("\n\n\n\nWelcome to Program 7, a turn by "
            + "turn text based game played against an AI");
         System.out.println("\nPlease select a class: \n(1) = Archer\n(2) = Warrior" 
            + "\n(3) = mage");

         playerClass = scanCheck(1, 3, scan);
         /*
            while(true) {
               if(scan.hasNextInt()) {
                  playerClass = scan.nextInt();
                  scan.nextLine();
               } else if (scan.hasNextDouble()) {
                  scan.nextLine();
                  //System.out.println("Wrong Command, Dipshit");
               } else if (scan.hasNext()) {
                  scan.nextLine();
                  //System.out.println("Wrong Command, Dipshit");
               }

               if(playerClass >= 1 && playerClass <= 3) {
                  break;
               } else {
                  System.out.println("Wrong Command, Dipshit");
               }
            }
         */

         if (playerClass == 1){
            fighter = new Archer();
            System.out.print("\nYou have chosen to be the Archer, master of the Bow" 
               + " and one with nature - like that one guy who keeps trying to get\n"
               + "you to do yoga with him because he says it makes you \"One with" 
               + " nature\" -- \"One with nature\" my ass");
         } else if (playerClass == 2){
            fighter = new Warrior();
            System.out.print("\nYou have chosen to be the Warrior, master of the Blade" 
               + " and the stronger than a sterotypical frat boy");
         } else if (playerClass == 3){
            fighter = new Mage();
            System.out.print("\nYou have chosen to be the Mage, master of the Staff" 
               + " and master of the elements; until the fire nation attacked");
         } else {
            System.out.println("I'm not saying you broke the program, but like," 
            +  " you shouldn't see this...");
         }

      break;

      }

      while(gamesPlayed < gamesToPlay) {//In game
         weaponList.clear();
         hasW1 = false;
         hasW2 = false;
         hasW3 = false;
         int choice = 0; 
         passed = false; 
         while(true) {
            //in shop. If key is pressed, break
            System.out.println("\n\nWelcome to the Shop.\nHere you can purchase"
               + " weapons and items for your fight!" );
            System.out.println("Please note: you will lose your weapons after each match,"
               + " but not items.");
            System.out.println("\nWhat would you like to do?");
            System.out.println("(1) buy or (2) exit to fight");

            choice = scanCheck(1, 2, scan);
            /*
            while(true) {
               if(scan.hasNextInt()) {
                  choice = scan.nextInt();
                  scan.nextLine();
               } else if (scan.hasNextDouble()) {
                  scan.nextLine();
                  //System.out.println("Wrong Command, Dipshit");
               } else if (scan.hasNext()) {
                  scan.nextLine();
                  //System.out.println("Wrong Command, Dipshit");
               }

               if(choice == 1 || choice == 2) {
                  break;
               } else {
                  System.out.println("Wrong Command, Dipshit");
               }
            }
            */

            while(choice == 1) {
               System.out.println("\n\nReady to buy! \nYou have " + money.getCash() + " gold\n");

               if (weaponList.size() == 0){
                  System.out.println("Your weapon inventory is currently empty");
               } else {
                  System.out.println(weaponList);
               }

               if (itemList.size() == 0){
                  System.out.println("Your item inventory is currently empty");
               } else {
                  System.out.println(itemList);
               }

               int buy = 0;
               int price1 = 0;
               int price2 = 0;
               int price3 = 0;
               int price4 = 0;
               int price5 = 0;
               int price6 = 0;


               Weapon W1 = null;
               Weapon W2 = null;
               Weapon W3 = null;

               Potion potion = new Potion();
               Elixir elixir = new Elixir();
               SmokeBomb smokeBomb = new SmokeBomb();

               System.out.println("\n");

               if (playerClass == 1){ //archer
                  W1 = new ShortBow(0);
                  W2 = new LongBow(0);
                  W3 = new Wolf(0);

                  System.out.println("Chose what you would like to buy: \nWeapons:");

                     System.out.println("\t(1) Short Bow (Power: " + W1.getPower() + ")"
                        + " -- PRICE: " + W1.getCost());

                     System.out.println("\t(2) Long Bow (Power: " + W2.getPower() + ")"
                        + " -- PRICE: " + W2.getCost());

                     System.out.println("\t(3) Wolf (Power: " + W3.getPower() + ")"
                        + " -- PRICE: " + W3.getCost());


                  System.out.println("Items:");

                     System.out.println("\t(4) Potion -- PRICE: " + potion.getCost() 
                        + "\t\tHeals " + potion.does() + " HP (Hit Points)");
                     System.out.println("\t(5) Elixir -- PRICE: " + elixir.getCost()
                        + "\t\tRestores " + elixir.does() + " SP (Skill Points)");
                     System.out.println("\t(6) SmokeBomb -- PRICE: " + smokeBomb.getCost()
                        + "\tIncreases Evasion by " + smokeBomb.does());
               }

               else if (playerClass == 2){ //warrior
                  W1 = new OneHandSword(0);
                  W2 = new TwoHandSword(0);
                  W3 = new Shield(0);

                  System.out.println("Chose what you would like to buy: \nWeapons:");

                     System.out.println("\t(1) One Hand Sword (Power: " + W1.getPower() + ")"
                        + " -- PRICE: " + W1.getCost());

                     System.out.println("\t(2) Two Hand Sword (Power: " + W2.getPower() + ")"
                        + " -- PRICE: " + W2.getCost());

                     System.out.println("\t(3) Shield (Power: " + W3.getPower() + ")"
                        + " -- PRICE: " + W3.getCost());


                  System.out.println("Items:");

                     System.out.println("\t(4) Potion -- PRICE: " + potion.getCost() 
                        + "\t\tHeals " + potion.does() + " HP (Hit Points)");
                     System.out.println("\t(5) Elixir -- PRICE: " + elixir.getCost()
                        + "\t\tRestores " + elixir.does() + " SP (Skill Points)");
                     System.out.println("\t(6) SmokeBomb -- PRICE: " + smokeBomb.getCost()
                        + "\tIncreases Evasion by " + smokeBomb.does());
               }


               else if (playerClass == 3){ //mage
                  W1 = new ElementalStaff(0);
                  W2 = new HolyStaff(0);
                  W3 = new HealingStaff(0);

                  System.out.println("Chose what you would like to buy: \nWeapons:");

                     System.out.println("\t(1) Elemental Staff (Power: " + W1.getPower() + ")"
                        + " -- PRICE: " + W1.getCost());

                     System.out.println("\t(2) Holy Staff (Power: " + W2.getPower() + ")"
                        + " -- PRICE: " + W2.getCost());

                     System.out.println("\t(3) Healing Staff (Power: " + W3.getPower() + ")"
                        + " -- PRICE: " + W3.getCost());


                  System.out.println("Items:");

                     System.out.println("\t(4) Potion -- PRICE: " + potion.getCost() 
                        + "\t\tHeals " + potion.does() + " HP (Hit Points)");
                     System.out.println("\t(5) Elixir -- PRICE: " + elixir.getCost()
                        + "\t\tRestores " + elixir.does() + " SP (Skill Points)");
                     System.out.println("\t(6) SmokeBomb -- PRICE: " + smokeBomb.getCost()
                        + "\tIncreases Evasion by " + smokeBomb.does());
               }

               System.out.println("(7) exit");//option to exit

               buy = scanCheck(1,7,scan); //checks the input

               price1 = W1.getCost(); //gets the cost of the class's weapons
               price2 = W2.getCost();
               price3 = W3.getCost();

               price4 = potion.getCost();
               price5 = elixir.getCost();
               price6 = smokeBomb.getCost();


               if (buy == 1){ //weapon 1. works for all classes
                  if (money.getCash() < price1){
                     System.out.println("You do not have enough gold to buy this!");
                  }
                  if(hasW1 == false && hasW2 == false) {
                     money.buyWeapon(W1);
                     System.out.println("\nRemaining balance: " + money.getCash());
                     weaponList.add(W1);
                     hasW1 = true;
                  } else {
                     System.out.println("You already have a weapon!");
                  }
               }

               else if (buy == 2){ //weapon 2. works for all classes
                  if (money.getCash() < price2){
                     System.out.println("You do not have enough gold to buy this!");
                  }
                  if(hasW1 == false && hasW2 == false) {
                     money.buyWeapon(W2);
                     System.out.println("\nRemaining balance: " + money.getCash());
                     weaponList.add(W2);
                     hasW2 = true;
                  } else {
                     System.out.println("You already have a weapon!");
                  }
               }

               else if (buy == 3){ //weapon 3. works for all classes
                  if (money.getCash() < price3){
                     System.out.println("You do not have enough gold to buy this!");
                  }
                  if(hasW3 == false) {
                     money.buyWeapon(W3);
                     System.out.println("\nRemaining balance: " + money.getCash());
                     weaponList.add(W3);
                     hasW3 = true;
                  } else {
                     System.out.println("You already have this special weapon!");
                  }
               }

               else if (buy == 4){ //weapon 4. works for all classes
                  if (money.getCash() < price4){
                     System.out.println("You do not have enough gold to buy this!");
                  } else {
                     money.buyItem(potion);
                     System.out.println("\nRemaining balance: " + money.getCash());
                     itemList.add(potion);
                  }
               }

               else if (buy == 5){ //weapon 5. works for all classes
                  if (money.getCash() < price5){
                     System.out.println("You do not have enough gold to buy this!");
                  } else {
                     money.buyItem(elixir);
                     System.out.println("\nRemaining balance: " + money.getCash());
                     itemList.add(elixir);
                  }
               }

               else if (buy == 6){ //weapon 6. works for all classes
                  if (money.getCash() < price6){
                     System.out.println("You do not have enough gold to buy this!");
                  } else {
                     money.buyItem(smokeBomb);
                     System.out.println("\nRemaining balance: " + money.getCash());
                     itemList.add(smokeBomb);
                  }
               }

               else if (buy == 7){
                  choice = 2;
               }



            }

               //money.buyWeapon(new LongBow(10));
               //System.out.println("After buy: " +money.getCash());

         //}
         if(choice == 2) {
            System.out.println("Ready to fight");
            break;
         }
         break;
         }
         while(!passed) {
            //play against AI, once you win, passed = true.
         }
      }
   }

   public static int scanCheck(int min, int max, Scanner scan){
      int innerChoice = 0;
      while(true) {
         if(scan.hasNextInt()) {
            innerChoice = scan.nextInt();
            scan.nextLine();
         } else if (scan.hasNextDouble()) {
            scan.nextLine();
            //System.out.println("Wrong Command, Dipshit");
         } else if (scan.hasNext()) {
            scan.nextLine();
            //System.out.println("Wrong Command, Dipshit");
         }

         if(innerChoice >= min && innerChoice <= max) {
            System.out.println("=====================");
            return innerChoice;
         } else {
            System.out.println("Wrong Command, Dipshit");
         }
      }
   }

}
