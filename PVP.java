import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class PVP {
   private static int playerClass1;
   private static int playerClass2;
   private static Fighter fighter2 = null;
   private static Fighter fighter = null;
   private static int turnCount;
   private static int totalCount;
   private static String player1;
   private static String player2;
   private static Scanner scan = new Scanner(System.in);
   private static int fighter1GamesWon = 0;
   private static int fighter2GamesWon = 0;

   private static int gamesPlayed = 0;
   private static int gamesToPlay = 3;
   private static boolean passed;

   private static List<Items> itemList1 = new ArrayList<Items>();
   private static List<Weapon> weaponList1 = new ArrayList<Weapon>();
   private static List<Items> itemList2 = new ArrayList<Items>();
   private static List<Weapon> weaponList2 = new ArrayList<Weapon>();
   private static Weapon W1;
   private static Weapon W2;
   private static Weapon W3;
   private static boolean has1W1;
   private static boolean has1W2;
   private static boolean has1W3;
   private static boolean usedItem1 = false;
   private static Cash money1 = new Cash();

   private static Weapon W12;
   private static Weapon W22;
   private static Weapon W32;
   private static boolean has2W1;
   private static boolean has2W2;
   private static boolean has2W3;
   private static boolean usedItem2 = false;
   private static Cash money2 = new Cash();;

   private static Potion potion = new Potion();
   private static Elixir elixir = new Elixir();
   private static SmokeBomb smokeBomb = new SmokeBomb();




   public static void playPVP() {
      fighter1GamesWon = 0;
      fighter1GamesWon = 0;
      
      PlayerSelection();
      ShopPhase();
      Battle();
   }




















   /*
      int gamesPlayed = 0;
      int gamesToPlay = 3;
      boolean passed;
      int playerClass1 = 0;
      int playerClass2 = 0;
      List<Items> itemList1 = new ArrayList<Items>();
      List<Weapon> weaponList1 = new ArrayList<Weapon>();
      List<Items> itemList2 = new ArrayList<Items>();
      List<Weapon> weaponList2 = new ArrayList<Weapon>();
      boolean has1W1;
      boolean has1W2;
      boolean has1W3;
      boolean usedItem1 = false;

      boolean has2W1;
      boolean has2W2;
      boolean has2W3;
      boolean usedItem2 = false;
      //int shieldBlock;


      Potion potion = new Potion();
      Elixir elixir = new Elixir();
      SmokeBomb smokeBomb = new SmokeBomb();



     // int choice = 69;

      Scanner scan = new Scanner(System.in);
      //Fighter fighter = null;
      //Fighter opp = null;
      Cash money1 = new Cash();
      Cash money2 = new Cash();
      //break;

      }

      while(gamesPlayed < gamesToPlay) {//In game
         weaponList1.clear(); //resets weapon list
         weaponList1.add(new Fist(0));
         //fighter.setHP(fighter.getStartHP()); //resets HP
         //fighter.setSP(fighter.getStartSP()); //resets SP
         //fighter.setEvasion(0);
         fighter.reset();
         has1W1 = false;
         has1W2 = false;
         has1W3 = false;
         int choice = 0; 
         passed = false; 

         Weapon W1 = null;
         Weapon W2 = null;
         Weapon W3 = null;

         //Potion potion = new Potion();
         //Elixir elixir = new Elixir();
         //SmokeBomb smokeBomb = new SmokeBomb();


         while(true) {
            //in shop. If key is pressed, break
            System.out.println("\n\nWelcome to the Shop.\nHere you can purchase"
               + " weapons and items for your fight!" );
            System.out.println("Please note: you will lose your weapons after each match,"
               + " but not items.");
            System.out.println("\nWhat would you like to do?");
            System.out.println("(1) Go to the store \n(2) Exit to fight");

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
/*
            while(choice == 1) {
               System.out.println("\n\nReady to buy! \nYou have " + money1.getCash() + " gold\n");

               if (weaponList1.size() == 0){
                  System.out.println("Your weapon inventory is currently empty");
               } else if (weaponList1.get(0).getClass().getName().equals("Fist") &&
                     weaponList1.size() == 1){
                  System.out.println("Your only weapons are your bare hands!");
               } else {
                  System.out.println(weaponList1);
               }

               if (itemList1.size() == 0){
                  System.out.println("Your item inventory is currently empty");
               } else {
                  System.out.println(itemList1);
               }

               int buy = 0;
               int price1 = 0;
               int price2 = 0;
               int price3 = 0;
               int price4 = 0;
               int price5 = 0;
               int price6 = 0;

/*
               Weapon W1 = null;
               Weapon W2 = null;
               Weapon W3 = null;

               Potion potion = new Potion();
               Elixir elixir = new Elixir();
               SmokeBomb smokeBomb = new SmokeBomb();
*/
/*               System.out.println("\n");

               if (playerClass1 == 1){ //archer
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

               else if (playerClass1 == 2){ //warrior
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


               else if (playerClass1 == 3){ //mage
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
                  if (money1.getCash() < price1){
                     System.out.println("You do not have enough gold to buy this!");
                  }
                  if(has1W1 == false && has1W2 == false) {
                     money1.buyWeapon(W1);
                     System.out.println("\nRemaining balance: " + money1.getCash());
                     weaponList1.set(0, W1);
                     fighter.addWeapon1(W1);
                     has1W1 = true;
                  } else {
                     System.out.println("You already have a weapon!");
                  }
               }

               else if (buy == 2){ //weapon 2. works for all classes
                  if (money1.getCash() < price2){
                     System.out.println("You do not have enough gold to buy this!");
                  }
                  if(has1W1 == false && has1W2 == false) {
                     money1.buyWeapon(W2);
                     System.out.println("\nRemaining balance: " + money1.getCash());
                     weaponList1.set(0, W2);
                     fighter.addWeapon1(W2);
                     has1W2 = true;
                  } else {
                     System.out.println("You already have a weapon!");
                  }
               }

               else if (buy == 3){ //weapon 3. works for all classes
                  if (money1.getCash() < price3){
                     System.out.println("You do not have enough gold to buy this!");
                  }
                  if(has1W3 == false) {
                     money1.buyWeapon(W3);
                     System.out.println("\nRemaining balance: " + money1.getCash());
                     weaponList1.add(W3);
                     fighter.addWeapon2(W3);
                     has1W3 = true;
                  } else {
                     System.out.println("You already have this special weapon!");
                  }
               }

               else if (buy == 4){ //weapon 4. works for all classes
                  if (money1.getCash() < price4){
                     System.out.println("You do not have enough gold to buy this!");
                  } else {
                     money1.buyItem(potion);
                     System.out.println("\nRemaining balance: " + money1.getCash());
                     itemList1.add(potion);
                     fighter.addPotion();
                  }
               }

               else if (buy == 5){ //weapon 5. works for all classes
                  if (money1.getCash() < price5){
                     System.out.println("You do not have enough gold to buy this!");
                  } else {
                     money1.buyItem(elixir);
                     System.out.println("\nRemaining balance: " + money1.getCash());
                     itemList1.add(elixir);
                     fighter.addElixir();
                  }
               }

               else if (buy == 6){ //weapon 6. works for all classes
                  if (money1.getCash() < price6){
                     System.out.println("You do not have enough gold to buy this!");
                  } else {
                     money1.buyItem(smokeBomb);
                     System.out.println("\nRemaining balance: " + money1.getCash());
                     itemList1.add(smokeBomb);
                     fighter.addSmokeBomb();
                  }
               }

               else if (buy == 7){
                  choice = 2;
               }

               

            }

               //money1.buyWeapon(new LongBow(10));
               //System.out.println("After buy: " +money1.getCash());

         //}
         if(choice == 2) {
            System.out.println("Ready to fight");
            break; //start fight
         }
 


         break;
         }
         //TO DO: Create a new constructor for fighter for enemies
         if(gamesPlayed == 0) {
            opp = new Warrior(true);
            //opp = new Mage(true);
         }
         if(gamesPlayed == 1) {
            opp = new Archer(true);
         }
         if(gamesPlayed == 2) {
            opp = new Mage(true);
         }

         turnCount = 1;
         while(!passed && gamesPlayed < 3) { //Fight time, once you win, passed = true;
            //boolean trueVal = true;

            fighter.setEvasions(opp.getEvasion());
            //W1.setEnemyEvasion(opp.getEvasion());
            //W2.setEnemyEvasion(opp.getEvasion());
            //W3.setEnemyEvasion(opp.getEvasion());
            boolean hasEvasion = false;
            int trackSmoke = 0;
            boolean win = false;
            boolean playerTurn = true;
            while(playerTurn) { //player turn

               System.out.println("\nTurn: " + turnCount);
               System.out.println("\nYou:\t\tHP: " + fighter.getHp() + "/100"
                  + "\tSP: " + fighter.getSp() + "/100" + "\tEvasion: " 
                  + fighter.getEvasion());
               System.out.println("Opponent:\tHP: " + opp.getHp() + "/100"
                  + "\tSP: " + opp.getSp() + "/100");
               System.out.println("\nWhat would you like to do?");
               
               int damageDone;
               int attackType;


               int Command = 0;
               if(usedItem1 == false) {
               
                  System.out.println("(1) Fight   (2) Use Item   (3) Rest");
                  Command = scanCheck(1,3,scan);
                  if(Command == 2) {
                     if (itemList1.size() == 0){
                        System.out.println("You have no items to use!");
                     } else {
                        int use = 0;
                        System.out.println("Items: " + itemList1);
                        //List options for items and use item
                        System.out.println("What would you like to use?" 
                           + "\n(1) Potion \n(2) Elixir\n(3) SmokeBomb\n"
                           + "(4) No Item");

                        boolean toUse = true;

                        while(toUse){
                           use = scanCheck(1,4,scan);
                           
                           if (use == 1){ //Potion
                              if (fighter.getPotions() == 0){
                                 System.out.println("You do not have any potions!");
                                 System.out.println("What would you like to use?" 
                                    + "\n(1) Potion \n(2) Elixir\n(3) SmokeBomb\n"
                                    + "(4) No Item");
                              } else {
                                 fighter.usePotion();
                                 System.out.println("Potions left: " + fighter.getPotions());
                                 toUse = false;
                                 usedItem1 = true;
                                 itemList1.remove(potion);
                              }
                           }

                           if (use == 2){ //elixir
                              if (fighter.getElixir() == 0){
                                 System.out.println("You do not have any elixirs!");
                                 System.out.println("What would you like to use?" 
                                    + "\n(1) Potion \n(2) Elixir\n(3) SmokeBomb\n"
                                    + "(4) No Item");
                              } else {
                                 fighter.useElixir();
                                 System.out.println("Elixirs left: " + fighter.getElixir());
                                 toUse = false;
                                 usedItem1 = true;
                                 itemList1.remove(elixir);
                              }
                           }

                           if (use == 3){ //smokeBomb
                              if (fighter.getSmokeBomb() == 0){
                                 System.out.println("You do not have any smoke bombs!");
                                 System.out.println("What would you like to use?" 
                                    + "\n(1) Potion \n(2) Elixir\n(3) SmokeBomb\n"
                                    + "(4) No Item");
                              } else {
                                 fighter.useSmokeBomb();
                                 System.out.println("Smoke Bombs left: " + fighter.getSmokeBomb());
                                 toUse = false;
                                 usedItem1 = true;
                                 itemList1.remove(smokeBomb);
                              }
                           }



                           if (use ==4){
                              toUse = false;
                           }

                        }

                     }
                        //usedItem1 = true;
                     
                  }

                  //while(true){
                     if (Command == 1){//Chose to fight //ADD AMOUNT OF SP FOR EACH ATTACK
                        System.out.println("Choose an attack:");
                        System.out.println("(1) Basic Attack -- SP: " + fighter.basicSP() + "\n" 
                           + "(2) Strong Attack -- SP: " + fighter.strongSP() + "\n"
                           + "(3) Special Attack -- SP: " + fighter.specialSP() + "\n"
                           + "(4) Return to previous menu");

                        damageDone = 0;
                        attackType = 0;
                        attackType = scanCheck(1,4,scan);

                        if(attackType == 1){//uses BasicAttack

                           damageDone = fighter.basicAttack();
                           playerMove = 1;
                           System.out.println("You issued " + damageDone + " damage with " 
                              + fighter.getWeapon1Name() + "'s Basic attack!");

                           opp.setHP(damageDone);
                           playerTurn = false;
                           //break;
                        }

                        if(attackType == 2){//Uses Strong attack
                           if(fighter.getSp() + fighter.strongSP() >= 0) {
                              damageDone = fighter.strongAttack();

                              System.out.println("You issued " + damageDone + " damage with " 
                                 + fighter.getWeapon1Name() + "'s Strong attack!");

                              fighter.setSP(fighter.strongSP());
                              playerMove = 2;
                              opp.setHP(damageDone);
                              playerTurn = false;
                              //break;
                           } else {
                              System.out.println("You don't have enough SP to use this move!");
                           }
                           //trueVal = false;

                        }

                        if(attackType == 3){//Uses Special Attack
                           if(fighter.getSp() + fighter.specialSP() >= 0) {
                              damageDone = fighter.specialAttack();

                              System.out.println("You issued " + damageDone + " damage with " 
                                 + fighter.getWeapon1Name() + "'s Special attack!");


                              //trueVal = false;
                              playerMove = 3;
                              fighter.setSP(fighter.specialSP());
                              opp.setHP(damageDone);
                              playerTurn = false;
                              //break;
                           } else {
                              System.out.println("You don't have enough SP to use this move!");
                           }
                        }

                        if(attackType == 4){
                        
                        }
                     }

                     if (opp.getHp() <= 0){
                        passed = true;
                        win = true;
                        break;
                     }

                  //}

                  if (Command == 3){
                     System.out.println("You feel rested!");
                     fighter.rest();
                     playerMove = 0;
                     playerTurn = false;
                     //break;
                  }
                  //}

            //}





               } else {
                  boolean holder = true;
                  while(holder == true){
                     System.out.println("(1) Fight   (2) Rest");
                     Command = scanCheck(1,2,scan);
                  

                     if (Command == 1){//Chose to fight //ADD AMOUNT OF SP FOR EACH ATTACK
                        System.out.println("Choose an attack:");
                        System.out.println("(1) Basic Attack -- SP: " + fighter.basicSP() + "\n" 
                           + "(2) Strong Attack -- SP: " + fighter.strongSP() + "\n"
                           + "(3) Special Attack -- SP: " + fighter.specialSP() + "\n"
                           + "(4) Return to previous menu");
                        damageDone = 0;
                        attackType = 0;
                        attackType = scanCheck(1,4,scan);

                        if(attackType == 1){//uses BasicAttack
                           damageDone = fighter.basicAttack();
                           
                           System.out.println("You issued " + damageDone + " damage with " 
                              + fighter.getWeapon1Name() + "'s Basic attack!");
                           playerMove = 1;
                           opp.setHP(damageDone);
                           holder = false;
                           playerTurn = false;
                        }

                        if(attackType == 2){//Uses Strong attack
                           if(fighter.getSp() + fighter.strongSP() >= 0) {
                              damageDone = fighter.strongAttack();
                              
                              System.out.println("You issued " + damageDone + " damage with " 
                                 + fighter.getWeapon1Name() + "'s Strong attack!");
                              playerMove = 2;

                              fighter.setSP(fighter.strongSP());
                              opp.setHP(damageDone);
                              holder = false;
                              playerTurn = false;
                           } else {
                              System.out.println("You don't have enough SP to use this move!");
                           }
                        }

                        if(attackType == 3){//Uses Special Attack
                           if(fighter.getSp() + fighter.specialSP() >= 0) {
                              damageDone = fighter.specialAttack();
                              
                              System.out.println("You issued " + damageDone + " damage with " 
                                 + fighter.getWeapon1Name() + "'s Special attack!");

                              fighter.setSP(fighter.specialSP());
                              opp.setHP(damageDone);
                              playerMove = 3;
                              holder = false;
                              playerTurn = false;

                           } else {
                              System.out.println("You don't have enough SP to use this move!");
                           }
                        }

                        if(attackType == 4){
                           
                        }

                        if (opp.getHp() <= 0){
                           passed = true;
                           win = true;
                           break;
                        }
                     }

                     if (Command == 2){
                        System.out.println("You feel rested!");
                        fighter.rest();
                        playerMove = 0;
                        holder = false;
                        playerTurn = false;
                     }
                  usedItem1 = false;
                  }
                  if (opp.getHp() <= 0){
                     passed = true;
                     win = true;
                     break;
                  }

               }

            //turnCount++;


            }
            int useSpecial = fighter.useSpecialWeapon(has1W3);
            int shieldBlock = 0;
            if (!win){
               if (playerClass1 == 2 && has1W3){
                  shieldBlock = useSpecial;
                  //System.out.println("Your Shield blocked 5 damage!");
               } else if (playerClass1 == 1 && has1W3){
                  opp.setHP((-1) * useSpecial);
                  System.out.println("Your wolf companion totally fucked that guy's face up!"
                     + " He lost like 5 damage!");
               } else if (playerClass1 == 3){
                  //fighter.setHP(useSpecial);
                  //System.out.println("Your Healing Staff healed you by 5 HP!");
               }
            }
            
            if (fighter.getEvasion() > 0 && !hasEvasion){
               trackSmoke = turnCount;
               hasEvasion = true;
            } else if (fighter.getEvasion() == 0){
               hasEvasion = false;
               trackSmoke = 0;
            }
            System.out.println(turnCount % 2);
            if (trackSmoke > 0){
               if (turnCount % trackSmoke == 2){
                  fighter.setEvasion(-5);
               }
            }
            
            turnCount++;
            totalCount++;




            if (opp.getHp() <= 0){
               passed = true;
               win = true;
               //break;
            }


            if (win){
               System.out.println ("Congratulations! You won game number: " + (gamesPlayed + 1));
               gamesPlayed++;
            } else {


            opp.setEvasions(fighter.getEvasion());

         



            //THE ENEMY's shit needs to go here in a while loop!
             





               //MAGE HEALINGSTAFF
               if (playerClass1 == 3 && has1W3){
                  fighter.setHP(useSpecial);
                  System.out.println("Your Healing Staff healed you by 5 HP!");
               }


            }

         //System.out.println("Your weapons inventory has been wiped clean");
            if(lost == true) {
               break;
            }
         }//passed while loop
            if(lost == true) {
               break;
            }

      }//end in game
      if(lost == true) {
         System.out.println("\n\nGG no re.");
      } 
   }//end main
*/

   public static void PlayerSelection() {

      while (true) { // pick a class

         System.out.println("\n\n\n\nWelcome to Program 7, a turn by "
            + "turn text based game played against your friend");

         System.out.println("What is your name, young Hero 1?");
         player1 = scan.nextLine();


         System.out.println("\nPlease select a class: \n(1) = Archer\n(2) = Warrior" 
            + "\n(3) = Mage \n(4) - Game Instructions");

         playerClass1 = scanCheck(1, 4, scan);

         if (playerClass1 == 1){
            fighter = new Archer();
            System.out.print("\nYou have chosen to be the Archer, master of the Bow" 
               + " and one with nature - like that one guy who keeps trying to get\n"
               + "you to do yoga with him because he says it makes you \"One with" 
               + " nature\" -- \"One with nature\" my ass");
            break;
         } else if (playerClass1 == 2){
            fighter = new Warrior();
            System.out.print("\nYou have chosen to be the Warrior, master of the Blade" 
               + " and the stronger than a sterotypical frat boy");
            break;
         } else if (playerClass1 == 3){
            fighter = new Mage();
            System.out.print("\nYou have chosen to be the Mage, master of the Staff" 
               + " and master of the elements; until the fire nation attacked");
            break;
         } else if (playerClass1 == 4){ 
            System.out.println("This is how to play Program 7:\n"
               + "After leaving these instructions, you will be asked to chose a class:\n"
               + "\tArcher \n\tWarrior \n\tMage \n\nEach class has its own stregths and"
               + " perks, so choose wisely and experiment! \n\nAfter you choose a class"
               + ", you will be brought to the Shop where you can purchase weapons and "
               + "items for your battles.\nWhile in the shop, you have access to "
               + money1.getCash() + " gold, but be warned, this is a set amount and it" 
               + "must last you through all three (3) roounds!\n\nAfter each round, your"
               + " weapons inventory gets reset, so you must either buy another weapon or"
               + " use the default Fist, which is the weakest in the game, but free. \n"
               + "Your items inventory, however, does not reset after each round!\n\n"
               + "The game has 3 rounds to it, each harder than before, that you must" 
               + " survive in to win.\n\nThe entire game uses numbers to select options."
               + "\n\nGood Luck!"); 
         } 
   }

      while (true) { // pick a class

         System.out.println("\n\n\n\nWelcome to Program 7, a turn by "
            + "turn text based game played against your friend");

         System.out.println("What is your name, young Hero 2?");
         player2 = scan.nextLine();

         System.out.println("\nPlease select a class: \n(1) = Archer\n(2) = Warrior" 
            + "\n(3) = Mage \n(4) - Game Instructions");

         playerClass2 = scanCheck(1, 4, scan);

         if (playerClass2 == 1){
            fighter2 = new Archer();
            System.out.print("\nYou have chosen to be the Archer, master of the Bow" 
               + " and one with nature - like that one guy who keeps trying to get\n"
               + "you to do yoga with him because he says it makes you \"One with" 
               + " nature\" -- \"One with nature\" my ass");
            break;
         } else if (playerClass2 == 2){
            fighter2 = new Warrior();
            System.out.print("\nYou have chosen to be the Warrior, master of the Blade" 
               + " and the stronger than a sterotypical frat boy");
            break;
         } else if (playerClass2 == 3){
            fighter2 = new Mage();
            System.out.print("\nYou have chosen to be the Mage, master of the Staff" 
               + " and master of the elements; until the fire nation attacked");
            break;
         } else if (playerClass2 == 4){ 
            System.out.println("This is how to play Program 7:\n"
               + "After leaving these instructions, you will be asked to chose a class:\n"
               + "\tArcher \n\tWarrior \n\tMage \n\nEach class has its own stregths and"
               + " perks, so choose wisely and experiment! \n\nAfter you choose a class"
               + ", you will be brought to the Shop where you can purchase weapons and "
               + "items for your battles.\nWhile in the shop, you have access to "
               + money1.getCash() + " gold, but be warned, this is a set amount and it" 
               + "must last you through all three (3) roounds!\n\nAfter each round, your"
               + " weapons inventory gets reset, so you must either buy another weapon or"
               + " use the default Fist, which is the weakest in the game, but free. \n"
               + "Your items inventory, however, does not reset after each round!\n\n"
               + "The game has 3 rounds to it, each harder than before, that you must" 
               + " survive in to win.\n\nThe entire game uses numbers to select options."
               + "\n\nGood Luck!"); 
         } 
      }
   }

   public static void ShopPhase() {
      weaponList1.clear(); //resets weapon list
         weaponList1.add(new Fist(0));
         fighter.reset();
         has1W1 = false;
         has1W2 = false;
         has1W3 = false;
         int choice = 0; 
         passed = false; 

         W1 = null;
         W2 = null;
         W3 = null;

         //Potion potion = new Potion();
         //Elixir elixir = new Elixir();
         //SmokeBomb smokeBomb = new SmokeBomb();


         while(true) {
            //in shop. If key is pressed, break
            System.out.println("\n\nWelcome to the Shop, " + player1 +"\nHere you can purchase"
               + " weapons and items for your fight!" );
            System.out.println("Please note: you will lose your weapons after each match,"
               + " but not items.");
            System.out.println("\nWhat would you like to do?");
            System.out.println("(1) Go to the store \n(2) Exit to fight");

            choice = scanCheck(1, 2, scan);
            while(choice == 1) {
               System.out.println("\n\nReady to buy! \nYou have " + money1.getCash() + " gold\n");

               if (weaponList1.size() == 0){
                  System.out.println("Your weapon inventory is currently empty");
               } else if (weaponList1.get(0).getClass().getName().equals("Fist") &&
                     weaponList1.size() == 1){
                  System.out.println("Your only weapons are your bare hands!");
               } else {
                  System.out.println(weaponList1);
               }

               if (itemList1.size() == 0){
                  System.out.println("Your item inventory is currently empty");
               } else {
                  System.out.println(itemList1);
               }

               int buy = 0;
               int price1 = 0;
               int price2 = 0;
               int price3 = 0;
               int price4 = 0;
               int price5 = 0;
               int price6 = 0;


               W1 = null;
               W2 = null;
               W3 = null;

               //Potion potion = new Potion();
               //Elixir elixir = new Elixir();
               //SmokeBomb smokeBomb = new SmokeBomb();

               System.out.println("\n");

               if (playerClass1 == 1){ //archer
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

               else if (playerClass1 == 2){ //warrior
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


               else if (playerClass1 == 3){ //mage
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
                  if (money1.getCash() < price1){
                     System.out.println("You do not have enough gold to buy this!");
                  }
                  if(has1W1 == false && has1W2 == false) {
                     money1.buyWeapon(W1);
                     System.out.println("\nRemaining balance: " + money1.getCash());
                     weaponList1.set(0, W1);
                     fighter.addWeapon1(W1);
                     has1W1 = true;
                  } else {
                     System.out.println("You already have a weapon!");
                  }
               }

               else if (buy == 2){ //weapon 2. works for all classes
                  if (money1.getCash() < price2){
                     System.out.println("You do not have enough gold to buy this!");
                  }
                  if(has1W1 == false && has1W2 == false) {
                     money1.buyWeapon(W2);
                     System.out.println("\nRemaining balance: " + money1.getCash());
                     weaponList1.set(0, W2);
                     fighter.addWeapon1(W2);
                     has1W2 = true;
                  } else {
                     System.out.println("You already have a weapon!");
                  }
               }

               else if (buy == 3){ //weapon 3. works for all classes
                  if (money1.getCash() < price3){
                     System.out.println("You do not have enough gold to buy this!");
                  }
                  if(has1W3 == false) {
                     money1.buyWeapon(W3);
                     System.out.println("\nRemaining balance: " + money1.getCash());
                     weaponList1.add(W3);
                     fighter.addWeapon2(W3);
                     has1W3 = true;
                  } else {
                     System.out.println("You already have this special weapon!");
                  }
               }

               else if (buy == 4){ //weapon 4. works for all classes
                  if (money1.getCash() < price4){
                     System.out.println("You do not have enough gold to buy this!");
                  } else {
                     money1.buyItem(potion);
                     System.out.println("\nRemaining balance: " + money1.getCash());
                     itemList1.add(potion);
                     fighter.addPotion();
                  }
               }

               else if (buy == 5){ //weapon 5. works for all classes
                  if (money1.getCash() < price5){
                     System.out.println("You do not have enough gold to buy this!");
                  } else {
                     money1.buyItem(elixir);
                     System.out.println("\nRemaining balance: " + money1.getCash());
                     itemList1.add(elixir);
                     fighter.addElixir();
                  }
               }

               else if (buy == 6){ //weapon 6. works for all classes
                  if (money1.getCash() < price6){
                     System.out.println("You do not have enough gold to buy this!");
                  } else {
                     money1.buyItem(smokeBomb);
                     System.out.println("\nRemaining balance: " + money1.getCash());
                     itemList1.add(smokeBomb);
                     fighter.addSmokeBomb();
                  }
               }

               else if (buy == 7){
                  choice = 2;
               }


            }
         if(choice == 2) {
            System.out.println("Ready to fight");
            break; //To Player 2
         }
      }
      weaponList2.clear(); //resets weapon list
         weaponList2.add(new Fist(0));
         fighter.reset();
         has2W1 = false;
         has2W2 = false;
         has2W3 = false;
         int choice2 = 0; 
         passed = false; 

         W12 = null;
         W22 = null;
         W32 = null;

         //Potion potion = new Potion();
         //Elixir elixir = new Elixir();
         //SmokeBomb smokeBomb = new SmokeBomb();


         while(true) {
            //in shop. If key is pressed, break
            System.out.println("\n\nWelcome to the Shop, " + player2 + "\nHere you can purchase"
               + " weapons and items for your fight!" );
            System.out.println("Please note: you will lose your weapons after each match,"
               + " but not items.");
            System.out.println("\nWhat would you like to do?");
            System.out.println("(1) Go to the store \n(2) Exit to fight");

            choice2 = scanCheck(1, 2, scan);
            while(choice2 == 1) {
               System.out.println("\n\nReady to buy! \nYou have " + money2.getCash() + " gold\n");

               if (weaponList2.size() == 0){
                  System.out.println("Your weapon inventory is currently empty");
               } else if (weaponList2.get(0).getClass().getName().equals("Fist") &&
                     weaponList2.size() == 1){
                  System.out.println("Your only weapons are your bare hands!");
               } else {
                  System.out.println(weaponList2);
               }

               if (itemList2.size() == 0){
                  System.out.println("Your item inventory is currently empty");
               } else {
                  System.out.println(itemList2);
               }

               int buy = 0;
               int price1 = 0;
               int price2 = 0;
               int price3 = 0;
               int price4 = 0;
               int price5 = 0;
               int price6 = 0;


               W12 = null;
               W22 = null;
               W32 = null;

               //Potion potion = new Potion();
               //Elixir elixir = new Elixir();
               //SmokeBomb smokeBomb = new SmokeBomb();

               System.out.println("\n");

               if (playerClass2 == 1){ //archer
                  W12 = new ShortBow(0);
                  W22 = new LongBow(0);
                  W32 = new Wolf(0);

                  System.out.println("Chose what you would like to buy: \nWeapons:");

                     System.out.println("\t(1) Short Bow (Power: " + W12.getPower() + ")"
                        + " -- PRICE: " + W12.getCost());

                     System.out.println("\t(2) Long Bow (Power: " + W22.getPower() + ")"
                        + " -- PRICE: " + W22.getCost());

                     System.out.println("\t(3) Wolf (Power: " + W32.getPower() + ")"
                        + " -- PRICE: " + W32.getCost());


                  System.out.println("Items:");

                     System.out.println("\t(4) Potion -- PRICE: " + potion.getCost() 
                        + "\t\tHeals " + potion.does() + " HP (Hit Points)");
                     System.out.println("\t(5) Elixir -- PRICE: " + elixir.getCost()
                        + "\t\tRestores " + elixir.does() + " SP (Skill Points)");
                     System.out.println("\t(6) SmokeBomb -- PRICE: " + smokeBomb.getCost()
                        + "\tIncreases Evasion by " + smokeBomb.does());
               }

               else if (playerClass2 == 2){ //warrior
                  W12 = new OneHandSword(0);
                  W22 = new TwoHandSword(0);
                  W32 = new Shield(0);

                  System.out.println("Chose what you would like to buy: \nWeapons:");

                     System.out.println("\t(1) One Hand Sword (Power: " + W12.getPower() + ")"
                        + " -- PRICE: " + W12.getCost());

                     System.out.println("\t(2) Two Hand Sword (Power: " + W22.getPower() + ")"
                        + " -- PRICE: " + W22.getCost());

                     System.out.println("\t(3) Shield (Power: " + W32.getPower() + ")"
                        + " -- PRICE: " + W32.getCost());


                  System.out.println("Items:");

                     System.out.println("\t(4) Potion -- PRICE: " + potion.getCost() 
                        + "\t\tHeals " + potion.does() + " HP (Hit Points)");
                     System.out.println("\t(5) Elixir -- PRICE: " + elixir.getCost()
                        + "\t\tRestores " + elixir.does() + " SP (Skill Points)");
                     System.out.println("\t(6) SmokeBomb -- PRICE: " + smokeBomb.getCost()
                        + "\tIncreases Evasion by " + smokeBomb.does());
               }


               else if (playerClass2 == 3){ //mage
                  W12 = new ElementalStaff(0);
                  W22 = new HolyStaff(0);
                  W32 = new HealingStaff(0);

                  System.out.println("Chose what you would like to buy: \nWeapons:");

                     System.out.println("\t(1) Elemental Staff (Power: " + W12.getPower() + ")"
                        + " -- PRICE: " + W12.getCost());

                     System.out.println("\t(2) Holy Staff (Power: " + W22.getPower() + ")"
                        + " -- PRICE: " + W22.getCost());

                     System.out.println("\t(3) Healing Staff (Power: " + W32.getPower() + ")"
                        + " -- PRICE: " + W32.getCost());


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

               price1 = W12.getCost(); //gets the cost of the class's weapons
               price2 = W22.getCost();
               price3 = W32.getCost();

               price4 = potion.getCost();
               price5 = elixir.getCost();
               price6 = smokeBomb.getCost();


               if (buy == 1){ //weapon 1. works for all classes
                  if (money2.getCash() < price1){
                     System.out.println("You do not have enough gold to buy this!");
                  }
                  if(has2W1 == false && has2W2 == false) {
                     money2.buyWeapon(W12);
                     System.out.println("\nRemaining balance: " + money2.getCash());
                     weaponList2.set(0, W12);
                     fighter2.addWeapon1(W12);
                     has2W1 = true;
                  } else {
                     System.out.println("You already have a weapon!");
                  }
               }

               else if (buy == 2){ //weapon 2. works for all classes
                  if (money2.getCash() < price2){
                     System.out.println("You do not have enough gold to buy this!");
                  }
                  if(has2W1 == false && has2W2 == false) {
                     money2.buyWeapon(W22);
                     System.out.println("\nRemaining balance: " + money2.getCash());
                     weaponList2.set(0, W22);
                     fighter2.addWeapon1(W22);
                     has2W2 = true;
                  } else {
                     System.out.println("You already have a weapon!");
                  }
               }

               else if (buy == 3){ //weapon 3. works for all classes
                  if (money2.getCash() < price3){
                     System.out.println("You do not have enough gold to buy this!");
                  }
                  if(has2W3 == false) {
                     money2.buyWeapon(W32);
                     System.out.println("\nRemaining balance: " + money2.getCash());
                     weaponList2.add(W32);
                     fighter2.addWeapon2(W32);
                     has2W3 = true;
                  } else {
                     System.out.println("You already have this special weapon!");
                  }
               }

               else if (buy == 4){ //weapon 4. works for all classes
                  if (money2.getCash() < price4){
                     System.out.println("You do not have enough gold to buy this!");
                  } else {
                     money2.buyItem(potion);
                     System.out.println("\nRemaining balance: " + money2.getCash());
                     itemList2.add(potion);
                     fighter2.addPotion();
                  }
               }

               else if (buy == 5){ //weapon 5. works for all classes
                  if (money2.getCash() < price5){
                     System.out.println("You do not have enough gold to buy this!");
                  } else {
                     money2.buyItem(elixir);
                     System.out.println("\nRemaining balance: " + money2.getCash());
                     itemList2.add(elixir);
                     fighter2.addElixir();
                  }
               }

               else if (buy == 6){ //weapon 6. works for all classes
                  if (money2.getCash() < price6){
                     System.out.println("You do not have enough gold to buy this!");
                  } else {
                     money2.buyItem(smokeBomb);
                     System.out.println("\nRemaining balance: " + money2.getCash());
                     itemList2.add(smokeBomb);
                     fighter2.addSmokeBomb();
                  }
               }

               else if (buy == 7){
                  choice2 = 2;
               }


            }
         if(choice2 == 2) {
            System.out.println("Ready to fight");
            break; //To Player 2
         }
         }
 
   }


   public static void Battle() {

      turnCount = 1;
      
      
      while(!passed && gamesPlayed < 3) { //Fight time, once you win, passed = true;
         //boolean trueVal = true;

         fighter.setEvasions(fighter2.getEvasion());
         //W1.setEnemyEvasion(fighter2.getEvasion());
         //W2.setEnemyEvasion(fighter2.getEvasion());
         //W3.setEnemyEvasion(fighter2.getEvasion());


         boolean win1 = false;
         boolean win2 = false;
         int playerTurn = 1;





         while(playerTurn == 1) { //player turn

            usedItem1 = false;
            System.out.println(weaponList1);

            System.out.println(player1 + "'s Turn!");
            System.out.println("\nTurn: " + turnCount);
            System.out.println("\n" + player1 + ":\t\tHP: " + fighter.getHp() + "/100"
               + "\tSP: " + fighter.getSp() + "/100" + "\tEvasion: " 
               + fighter.getEvasion());
            System.out.println(player2 + ":\t\tHP: " + fighter2.getHp() + "/100"
               + "\tSP: " + fighter2.getSp() + "/100");
            System.out.println("\nWhat would you like to do?");
            
            int damageDone = 0;
            int attackType;


            int Command = 0;
            boolean hold = true;
            while(hold){
               if(usedItem1 == false) {
               
                  System.out.println("(1) Fight   (2) Use Item   (3) Rest");
                  Command = scanCheck(1,3,scan);
                  if(Command == 2) {
                     if (itemList1.size() == 0){
                        System.out.println("You have no items to use!");
                     } else {
                        int use = 0;
                        System.out.println("Items: " + itemList1);
                        //List options for items and use item
                        System.out.println("What would you like to use?" 
                           + "\n(1) Potion \n(2) Elixir\n(3) SmokeBomb\n"
                           + "(4) No Item");

                        boolean toUse = true;

                        while(toUse){
                           use = scanCheck(1,4,scan);
                           
                           if (use == 1){ //Potion
                              if (fighter.getPotions() == 0){
                                 System.out.println("You do not have any potions!");
                                 System.out.println("What would you like to use?" 
                                    + "\n(1) Potion \n(2) Elixir\n(3) SmokeBomb\n"
                                    + "(4) No Item");
                              } else {
                                 fighter.usePotion();
                                 System.out.println("Potions left: " + fighter.getPotions());
                                 toUse = false;
                                 usedItem1 = true;
                                 hold = false;
                                 itemList1.remove(potion);
                              }
                           }

                           if (use == 2){ //elixir
                              if (fighter.getElixir() == 0){
                                 System.out.println("You do not have any elixirs!");
                                 System.out.println("What would you like to use?" 
                                    + "\n(1) Potion \n(2) Elixir\n(3) SmokeBomb\n"
                                    + "(4) No Item");
                              } else {
                                 fighter.useElixir();
                                 System.out.println("Elixirs left: " + fighter.getElixir());
                                 toUse = false;
                                 usedItem1 = true;
                                 hold = false;
                                 itemList1.remove(elixir);
                              }
                           }

                           if (use == 3){ //smokeBomb
                              if (fighter.getSmokeBomb() == 0){
                                 System.out.println("You do not have any smoke bombs!");
                                 System.out.println("What would you like to use?" 
                                    + "\n(1) Potion \n(2) Elixir\n(3) SmokeBomb\n"
                                    + "(4) No Item");
                              } else {
                                 fighter.useSmokeBomb();
                                 System.out.println("Smoke Bombs left: " + fighter.getSmokeBomb());
                                 toUse = false;
                                 usedItem1 = true;
                                 hold = false;
                                 itemList1.remove(smokeBomb);
                              }
                           }



                           if (use ==4){
                              toUse = false;
                           }

                        }

                     }
                        //usedItem1 = true;
                  //hold = false;   
                  }


                     if (Command == 1){//Chose to fight //ADD AMOUNT OF SP FOR EACH ATTACK
                        System.out.println("Choose an attack:");
                        System.out.println("(1) Basic Attack -- SP: " + fighter.basicSP() + "\n" 
                           + "(2) Strong Attack -- SP: " + fighter.strongSP() + "\n"
                           + "(3) Special Attack -- SP: " + fighter.specialSP() + "\n"
                           + "(4) Return to previous menu");

                        damageDone = 0;
                        attackType = 0;
                        attackType = scanCheck(1,4,scan);

                        if(attackType == 1){//uses BasicAttack

                           damageDone = fighter.basicAttack();
                           System.out.println("You issued " + damageDone + " damage with " 
                              + fighter.getWeapon1Name() + "'s Basic attack!");

                           fighter2.setHP(damageDone);
                           hold = false;
                           playerTurn = 2;
                           //break;
                        }

                        if(attackType == 2){//Uses Strong attack
                           if(fighter.getSp() + fighter.strongSP() >= 0) {
                              damageDone = fighter.strongAttack();

                              System.out.println("You issued " + damageDone + " damage with " 
                                 + fighter.getWeapon1Name() + "'s Strong attack!");

                              fighter.setSP(fighter.strongSP());
                              fighter2.setHP(damageDone);
                              hold = false;
                              playerTurn = 2;
                              //break;
                           } else {
                              System.out.println("You don't have enough SP to use this move!");
                           }
                           //trueVal = false;

                        }

                        if(attackType == 3){//Uses Special Attack
                           if(fighter.getSp() + fighter.specialSP() >= 0) {
                              damageDone = fighter.specialAttack();

                              System.out.println("You issued " + damageDone + " damage with " 
                                 + fighter.getWeapon1Name() + "'s Special attack!");


                              //trueVal = false;
                              fighter.setSP(fighter.specialSP());
                              fighter2.setHP(damageDone);
                              hold = false;
                              playerTurn = 2;
                              //break;
                           } else {
                              System.out.println("You don't have enough SP to use this move!");
                           }
                        }

                        if(attackType == 4){
                        
                        }
                     }

                     if (fighter2.getHp() <= 0){
                        passed = true;
                        win1 = true;
                        break;
                     }

                  if (Command == 3){
                     System.out.println("You feel rested!");
                     fighter.rest();
                     playerTurn = 2;
                     hold = false;
                     //break;
                  }


               }
            } 

            if (usedItem1 == true){
            //boolean hold = true;
            //while (hold){

               System.out.println("\n" + player1 + ":\t\tHP: " + fighter.getHp() + "/100"
                  + "\tSP: " + fighter.getSp() + "/100" + "\tEvasion: " 
                  + fighter.getEvasion());
               System.out.println(player2 + ":\t\tHP: " + fighter2.getHp() + "/100"
                  + "\tSP: " + fighter2.getSp() + "/100");
               System.out.println("\nWhat would you like to do?");

               
               
               boolean holder = true;
               while(holder == true){
                  System.out.println("(1) Fight   (2) Rest");
                  Command = scanCheck(1,2,scan);
               

                  if (Command == 1){//Chose to fight //ADD AMOUNT OF SP FOR EACH ATTACK
                     System.out.println("Choose an attack:");
                     System.out.println("(1) Basic Attack -- SP: " + fighter.basicSP() + "\n" 
                        + "(2) Strong Attack -- SP: " + fighter.strongSP() + "\n"
                        + "(3) Special Attack -- SP: " + fighter.specialSP() + "\n"
                        + "(4) Return to previous menu");
                     damageDone = 0;
                     attackType = 0;
                     attackType = scanCheck(1,4,scan);

                     if(attackType == 1){//uses BasicAttack
                        damageDone = fighter.basicAttack();
                        
                        System.out.println("You issued " + damageDone + " damage with " 
                           + fighter.getWeapon1Name() + "'s Basic attack!");
                        fighter2.setHP(damageDone);
                        holder = false;
                        playerTurn = 2;
                     }

                     if(attackType == 2){//Uses Strong attack
                        if(fighter.getSp() + fighter.strongSP() >= 0) {
                           damageDone = fighter.strongAttack();
                           
                           System.out.println("You issued " + damageDone + " damage with " 
                              + fighter.getWeapon1Name() + "'s Strong attack!");

                           fighter.setSP(fighter.strongSP());
                           fighter2.setHP(damageDone);
                           holder = false;
                           playerTurn = 2;
                        } else {
                           System.out.println("You don't have enough SP to use this move!");
                        }
                     }

                     if(attackType == 3){//Uses Special Attack
                        if(fighter.getSp() + fighter.specialSP() >= 0) {
                           damageDone = fighter.specialAttack();
                           
                           System.out.println("You issued " + damageDone + " damage with " 
                              + fighter.getWeapon1Name() + "'s Special attack!");

                           fighter.setSP(fighter.specialSP());
                           fighter2.setHP(damageDone);
                           holder = false;
                           playerTurn = 2;

                        } else {
                           System.out.println("You don't have enough SP to use this move!");
                        }
                     }

                     if(attackType == 4){
                        
                     }

                     if (fighter2.getHp() <= 0){
                        passed = true;
                        win1 = true;
                        break;
                     }
                  }

                  if (Command == 2){
                     System.out.println("You feel rested!");
                     fighter.rest();
                     holder = false;
                     playerTurn = 2;
                  }
               usedItem1 = false;
               }
               if (fighter2.getHp() <= 0){
                  passed = true;
                  win1 = true;
                  break;
               }

            }
         //}
         //turnCount++;


         


            int useSpecial = fighter.useSpecialWeapon(has1W3);
            int shieldBlock1 = 0;
            if (!win1){
               if (playerClass2 == 2 && has2W3){
                  shieldBlock1 = useSpecial;
                  if (damageDone < shieldBlock1 * -1){
                     fighter2.setHP(shieldBlock1);
                  } else {
                     fighter2.setHP(damageDone * (-1));
                  }
                  System.out.println(player2 + "'s Shield blocked 5 damage!");
               } else if (playerClass1 == 1 && has1W3){
                  fighter2.setHP((-1) * useSpecial);
                  System.out.println("Your wolf companion totally fucked that guy's face up!"
                     + " He lost like 5 damage!");
               } else if (playerClass1 == 3){
                  //fighter.setHP(useSpecial);
                  //System.out.println("Your Healing Staff healed you by 5 HP!");
               }
            }
            
                     
         playerTurn = 2;
         }

         //MAGE HEALINGSTAFF
         if (playerClass2 == 3 && has2W3){
            int useSpecial = fighter2.useSpecialWeapon(has2W3); 
            fighter2.setHP(useSpecial);
            System.out.println(player2 + "'s Healing Staff healed them by 5 HP!");
         }


         if (win1){
            System.out.println ("Congratulations!" + player1 + "  won game number: " + (gamesPlayed + 1));
            gamesPlayed++;
            playerTurn = 0;
         } 
         if (win2){
            System.out.println ("Congratulations!" + player2 + " won game number: " + (gamesPlayed + 1));
            gamesPlayed++;
            playerTurn = 0;
         }













         while(playerTurn == 2) { //player turn
            usedItem2 = false;
            System.out.println(player2 + "'s Turn!");
            System.out.println("\nTurn: " + turnCount);
            System.out.println("\n" + player1 + "\t\tHP: " + fighter.getHp() + "/100"
               + "\tSP: " + fighter.getSp() + "/100" + "\tEvasion: " 
               + fighter2.getEvasion());
            System.out.println(player2 + ":\t\tHP: " + fighter2.getHp() + "/100"
               + "\tSP: " + fighter2.getSp() + "/100");
            System.out.println("\nWhat would you like to do?");
            
            int damageDone = 0;
            int attackType;


            int Command = 0;
            boolean hold = true;
            while (hold){
               if(usedItem2 == false) {
               
                  System.out.println("(1) Fight   (2) Use Item   (3) Rest");
                  Command = scanCheck(1,3,scan);
                  if(Command == 2) {
                     if (itemList2.size() == 0){
                        System.out.println("You have no items to use!");
                     } else {
                        int use = 0;
                        System.out.println("Items: " + itemList2);
                        //List options for items and use item
                        System.out.println("What would you like to use?" 
                           + "\n(1) Potion \n(2) Elixir\n(3) SmokeBomb\n"
                           + "(4) No Item");

                        boolean toUse = true;

                        while(toUse){
                           use = scanCheck(1,4,scan);
                           
                           if (use == 1){ //Potion
                              if (fighter2.getPotions() == 0){
                                 System.out.println("You do not have any potions!");
                                 System.out.println("What would you like to use?" 
                                    + "\n(1) Potion \n(2) Elixir\n(3) SmokeBomb\n"
                                    + "(4) No Item");
                              } else {
                                 fighter2.usePotion();
                                 System.out.println("Potions left: " + fighter2.getPotions());
                                 toUse = false;
                                 hold = false;
                                 usedItem2 = true;
                                 itemList2.remove(potion);
                              }
                           }

                           if (use == 2){ //elixir
                              if (fighter2.getElixir() == 0){
                                 System.out.println("You do not have any elixirs!");
                                 System.out.println("What would you like to use?" 
                                    + "\n(1) Potion \n(2) Elixir\n(3) SmokeBomb\n"
                                    + "(4) No Item");
                              } else {
                                 fighter2.useElixir();
                                 System.out.println("Elixirs left: " + fighter2.getElixir());
                                 toUse = false;
                                 hold = false;
                                 usedItem2 = true;
                                 itemList2.remove(elixir);
                              }
                           }

                           if (use == 3){ //smokeBomb
                              if (fighter2.getSmokeBomb() == 0){
                                 System.out.println("You do not have any smoke bombs!");
                                 System.out.println("What would you like to use?" 
                                    + "\n(1) Potion \n(2) Elixir\n(3) SmokeBomb\n"
                                    + "(4) No Item");
                              } else {
                                 fighter2.useSmokeBomb();
                                 System.out.println("Smoke Bombs left: " + fighter2.getSmokeBomb());
                                 toUse = false;
                                 hold = false;
                                 usedItem2 = true;
                                 itemList2.remove(smokeBomb);
                              }
                           }



                           if (use ==4){
                              toUse = false;
                           }

                        }

                     }
                        //usedItem2 = true;
                     
                  }

                     if (Command == 1){//Chose to fight //ADD AMOUNT OF SP FOR EACH ATTACK
                        System.out.println("Choose an attack:");
                        System.out.println("(1) Basic Attack -- SP: " + fighter2.basicSP() + "\n" 
                           + "(2) Strong Attack -- SP: " + fighter2.strongSP() + "\n"
                           + "(3) Special Attack -- SP: " + fighter2.specialSP() + "\n"
                           + "(4) Return to previous menu");

                        damageDone = 0;
                        attackType = 0;
                        attackType = scanCheck(1,4,scan);

                        if(attackType == 1){//uses BasicAttack

                           damageDone = fighter2.basicAttack();
                           System.out.println("You issued " + damageDone + " damage with " 
                              + fighter2.getWeapon1Name() + "'s Basic attack!");

                           fighter.setHP(damageDone);
                           playerTurn = 1;
                           hold = false;
                           //break;
                        }

                        if(attackType == 2){//Uses Strong attack
                           if(fighter2.getSp() + fighter.strongSP() >= 0) {
                              damageDone = fighter2.strongAttack();

                              System.out.println("You issued " + damageDone + " damage with " 
                                 + fighter2.getWeapon1Name() + "'s Strong attack!");

                              fighter2.setSP(fighter.strongSP());
                              fighter.setHP(damageDone);
                              playerTurn = 1;
                              hold = false;
                              //break;
                           } else {
                              System.out.println("You don't have enough SP to use this move!");
                           }
                           //trueVal = false;

                        }

                        if(attackType == 3){//Uses Special Attack
                           if(fighter2.getSp() + fighter.specialSP() >= 0) {
                              damageDone = fighter2.specialAttack();

                              System.out.println("You issued " + damageDone + " damage with " 
                                 + fighter2.getWeapon1Name() + "'s Special attack!");


                              //trueVal = false;
                              fighter2.setSP(fighter.specialSP());
                              fighter.setHP(damageDone);
                              playerTurn = 1;
                              hold = false;
                              //break;
                           } else {
                              System.out.println("You don't have enough SP to use this move!");
                           }
                        }

                        if(attackType == 4){
                        
                        }
                     }

                     if (fighter.getHp() <= 0){
                        passed = true;
                        win2 = true;
                        break;
                     }

                  if (Command == 3){
                     System.out.println("You feel rested!");
                     fighter2.rest();
                     playerTurn = 1;
                     //break;
                  }


               
               }
               
            
            } 
            if (usedItem2 == true){
               System.out.println("\n" + player1 + ":\t\tHP: " + fighter.getHp() + "/100"
                  + "\tSP: " + fighter.getSp() + "/100" + "\tEvasion: " 
                  + fighter.getEvasion());
               System.out.println(player2 + ":\t\tHP: " + fighter2.getHp() + "/100"
                  + "\tSP: " + fighter2.getSp() + "/100");
               System.out.println("\nWhat would you like to do?");
               boolean holder = true;
               while(holder == true){
                  System.out.println("(1) Fight   (2) Rest");
                  Command = scanCheck(1,2,scan);
               

                  if (Command == 1){//Chose to fight //ADD AMOUNT OF SP FOR EACH ATTACK
                     System.out.println("Choose an attack:");
                     System.out.println("(1) Basic Attack -- SP: " + fighter2.basicSP() + "\n" 
                        + "(2) Strong Attack -- SP: " + fighter2.strongSP() + "\n"
                        + "(3) Special Attack -- SP: " + fighter2.specialSP() + "\n"
                        + "(4) Return to previous menu");
                     damageDone = 0;
                     attackType = 0;
                     attackType = scanCheck(1,4,scan);

                     if(attackType == 1){//uses BasicAttack
                        damageDone = fighter2.basicAttack();
                        
                        System.out.println("You issued " + damageDone + " damage with " 
                           + fighter2.getWeapon1Name() + "'s Basic attack!");
                        fighter.setHP(damageDone);
                        holder = false;
                        playerTurn = 1;
                     }

                     if(attackType == 2){//Uses Strong attack
                        if(fighter2.getSp() + fighter.strongSP() >= 0) {
                           damageDone = fighter2.strongAttack();
                           
                           System.out.println("You issued " + damageDone + " damage with " 
                              + fighter2.getWeapon1Name() + "'s Strong attack!");

                           fighter2.setSP(fighter.strongSP());
                           fighter.setHP(damageDone);
                           holder = false;
                           playerTurn = 1;
                        } else {
                           System.out.println("You don't have enough SP to use this move!");
                        }
                     }

                     if(attackType == 3){//Uses Special Attack
                        if(fighter2.getSp() + fighter.specialSP() >= 0) {
                           damageDone = fighter2.specialAttack();
                           
                           System.out.println("You issued " + damageDone + " damage with " 
                              + fighter2.getWeapon1Name() + "'s Special attack!");

                           fighter2.setSP(fighter.specialSP());
                           fighter.setHP(damageDone);
                           holder = false;
                           playerTurn = 1;

                        } else {
                           System.out.println("You don't have enough SP to use this move!");
                        }
                     }

                     if(attackType == 4){
                        
                     }

                     if (fighter.getHp() <= 0){
                        passed = true;
                        win2 = true;
                        break;
                     }
                  }

                  if (Command == 2){
                     System.out.println("You feel rested!");
                     fighter2.rest();
                     holder = false;
                     playerTurn = 1;
                  }
               usedItem2 = false;
               }
               if (fighter.getHp() <= 0){
                  passed = true;
                  win2 = true;
                  break;
               }

            }

         //turnCount++;


         


            int useSpecial = fighter2.useSpecialWeapon(has1W3);
            int shieldBlock1 = 0;
            if (!win2){
               if (playerClass1 == 2 && has1W3){
                  shieldBlock1 = useSpecial;
                  if (damageDone < shieldBlock1 * -1){
                     fighter.setHP(shieldBlock1);
                  } else {
                     fighter.setHP(damageDone * -1);
                  }
                  System.out.println(player1 + "'s Shield blocked 5 damage!");
               } else if (playerClass2 == 1 && has2W3){
                  fighter.setHP((-1) * useSpecial);
                  System.out.println("Your wolf companion totally fucked that guy's face up!"
                     + " He lost like 5 damage!");
               } else if (playerClass2 == 3){
                  //fighter2.setHP(useSpecial);
                  //System.out.println("Your Healing Staff healed you by 5 HP!");
               }
            }
           
         
         playerTurn = 1;
         }





         turnCount++;





         if (fighter2.getHp() <= 0){
            passed = true;
            win1 = true;
            //break;
         }
         if (fighter.getHp() <= 0){
            passed = true;
            win2 = true;
            //break;
         }




         if (win1){
            System.out.println ("Congratulations!" + player1 + "  won game number: " + (gamesPlayed + 1));
            gamesPlayed++;
         } 
         if (win2){
            System.out.println ("Congratulations!" + player2 + " won game number: " + (gamesPlayed + 1));
            gamesPlayed++;
         }else {


            //MAGE HEALINGSTAFF
            if (playerClass1 == 3 && has1W3){
               int useSpecial = fighter.useSpecialWeapon(has1W3); 
               fighter.setHP(useSpecial);
               System.out.println(player1 + "'s Healing Staff healed them by 5 HP!");
            }


         }

      }//passed while loop

      if (fighter1GamesWon > fighter1GamesWon){
         System.out.println(player1 + " beat " + player2 + "!");
      } else {
         System.out.println(player2 + " beat " + player1 + "!");
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
            /*
            try {
               Thread.sleep(200);
            } catch (Exception e){
               Thread.currentThread().interrupt();
            }
            */
            return innerChoice;
         } else {
            System.out.println("Wrong Command, Dipshit");
         }
      }
   }

}
