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
         
         int choice = 0; 
         passed = false; 
         while(true) {
            //in shop. If key is pressed, break
            System.out.println("\n\nWelcome to the Shop.\n Here you can purchase"
               + " weapons and items for your fight!" );
            System.out.println("Please note: you will lose your weapons after each match,"
               + " but not items.");
            System.out.println("\nWhat would you like to do?");
            System.out.println("(1) buy or (2) exit");
            
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

            if(choice == 1) {
               System.out.println("\n\nReady to buy! \nYou have " + money.getCash() + " gold\n");
               
               Potion potion = new Potion();
               Elixir elixir = new Elixir();
               SmokeBomb smokeBomb = new SmokeBomb();
               
               if (playerClass == 1){ //archer
                  Weapon shortBow = new ShortBow(0);
                  Weapon longBow = new LongBow(0);
                  Weapon wolf = new Wolf(0);
                  
                  System.out.println("Chose what you would like to buy: \nWeapons:");

                     System.out.println("\t(1) Short Bow (Power: " + shortBow.getPower() + ")"
                        + " -- PRICE: " + shortBow.getCost());

                     System.out.println("\t(2) Long Bow (Power: " + longBow.getPower() + ")"
                        + " -- PRICE: " + longBow.getCost());

                     System.out.println("\t(3) Wolf (Power: " + wolf.getPower() + ")"
                        + " -- PRICE: " + wolf.getCost());

                  System.out.println("Items:");
                     
                     System.out.println("\t(4) Potion -- PRICE: " + potion.getCost() 
                        + "\t\tHeals " + potion.does() + " HP (Hit Points)");
                     System.out.println("\t(5) Elixir -- PRICE: " + elixir.getCost()
                        + "\t\tRestores " + elixir.does() + " SP (Skill Points)");
                     System.out.println("\t(6) SmokeBomb -- PRICE: " + smokeBomb.getCost()
                        + "\tIncreases Evasion by " + smokeBomb.does());
               }

               if (playerClass == 2){ //warrior
                  Weapon oneHandSword = new OneHandSword(0);
                  Weapon twoHandSword = new TwoHandSword(0);
                  Weapon shield = new Shield(0);
                  
                  System.out.println("Chose what you would like to buy: \nWeapons:");

                     System.out.println("\t(1) One Hand Sword (Power: " + oneHandSword.getPower() + ")"
                        + " -- PRICE: " + oneHandSword.getCost());

                     System.out.println("\t(2) Two Hand Sword (Power: " + twoHandSword.getPower() + ")"
                        + " -- PRICE: " + twoHandSword.getCost());

                     System.out.println("\t(3) Shield (Power: " + shield.getPower() + ")"
                        + " -- PRICE: " + shield.getCost());

                  System.out.println("Items:");
                     
                     System.out.println("\t(4) Potion -- PRICE: " + potion.getCost() 
                        + "\t\tHeals " + potion.does() + " HP (Hit Points)");
                     System.out.println("\t(5) Elixir -- PRICE: " + elixir.getCost()
                        + "\t\tRestores " + elixir.does() + " SP (Skill Points)");
                     System.out.println("\t(6) SmokeBomb -- PRICE: " + smokeBomb.getCost()
                        + "\tIncreases Evasion by " + smokeBomb.does());
               }


               if (playerClass == 3){ //mage
                  Weapon elementalStaff = new ElementalStaff(0);
                  Weapon holyStaff = new HolyStaff(0);
                  Weapon healingStaff = new HealingStaff(0);
                  
                  System.out.println("Chose what you would like to buy: \nWeapons:");

                     System.out.println("\t(1) Elemental Staff (Power: " + elementalStaff.getPower() + ")"
                        + " -- PRICE: " + elementalStaff.getCost());

                     System.out.println("\t(2) Holy Staff (Power: " + holyStaff.getPower() + ")"
                        + " -- PRICE: " + holyStaff.getCost());

                     System.out.println("\t(3) Healing Staff (Power: " + healingStaff.getPower() + ")"
                        + " -- PRICE: " + healingStaff.getCost());

                  System.out.println("Items:");
                     
                     System.out.println("\t(4) Potion -- PRICE: " + potion.getCost() 
                        + "\t\tHeals " + potion.does() + " HP (Hit Points)");
                     System.out.println("\t(5) Elixir -- PRICE: " + elixir.getCost()
                        + "\t\tRestores " + elixir.does() + " SP (Skill Points)");
                     System.out.println("\t(6) SmokeBomb -- PRICE: " + smokeBomb.getCost()
                        + "\tIncreases Evasion by " + smokeBomb.does());
               }



               //money.buyWeapon(new LongBow(10));
               //System.out.println("After buy: " +money.getCash());

            }
            if(choice == 2) {
               System.out.println("Bye bye, gayboiisssss");
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
            return innerChoice;
         } else {
            System.out.println("Wrong Command, Dipshit");
         }
      }
   }

}
