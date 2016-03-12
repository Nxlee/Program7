import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
public class Play {
   private static Fighter opp = null;
   private static boolean lost = false;
   private static int attackCount = 0;
   private static int playerMove = 0; //Keeps track of player's move for mage AI
   private static Fighter fighter = null;
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
      boolean usedItem = false;
      //int shieldBlock;


      Potion potion = new Potion();
      Elixir elixir = new Elixir();
      SmokeBomb smokeBomb = new SmokeBomb();



     // int choice = 69;

      Scanner scan = new Scanner(System.in);
      //Fighter fighter = null;
      //Fighter opp = null;
      Cash money = new Cash();


      while (true){ // pick a class
         //int choice = 0; 

         System.out.println("\n\n\n\nWelcome to Program 7, a turn by "
            + "turn text based game played against an AI");
         System.out.println("\nPlease select a class: \n(1) = Archer\n(2) = Warrior" 
            + "\n(3) = Mage \n(4) Game Instructions");

         playerClass = scanCheck(1, 4, scan);
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
            break;
         } else if (playerClass == 2){
            fighter = new Warrior();
            System.out.print("\nYou have chosen to be the Warrior, master of the Blade" 
               + " and the stronger than a sterotypical frat boy");
            break;
         } else if (playerClass == 3){
            fighter = new Mage();
            System.out.print("\nYou have chosen to be the Mage, master of the Staff" 
               + " and master of the elements; until the fire nation attacked");
            break;
         } else if (playerClass == 4){ 
            System.out.println("This is how to play Program 7:\n"
               + "After leaving these instructions, you will be asked to chose a class:\n"
               + "\tArcher \n\tWarrior \n\tMage \n\nEach class has its own stregths and"
               + " perks, so choose wisely and experiment! \n\nAfter you choose a class"
               + ", you will be brought to the Shop where you can purchase weapons and "
               + "items for your battles.\nWhile in the shop, you have access to "
               + money.getCash() + " gold, but be warned, this is a set amount and it" 
               + "must last you through all three (3) roounds!\n\nAfter each round, your"
               + " weapons inventory gets reset, so you must either buy another weapon or"
               + " use the default Fist, which is the weakest in the game, but free. \n"
               + "Your items inventory, however, does not reset after each round!\n\n"
               + "The game has 3 rounds to it, each harder than before, that you must" 
               + " survive in to win.\n\nThe entire game uses numbers to select options."
               + "\n\nGood Luck!"); 
         } else {
            System.out.println("I'm not saying you broke the program, but like," 
            +  " you shouldn't see this...");
         }

      //break;

      }

      while(gamesPlayed < gamesToPlay) {//In game
         weaponList.clear(); //resets weapon list
         weaponList.add(new Fist(0));
         //fighter.setHP(fighter.getStartHP()); //resets HP
         //fighter.setSP(fighter.getStartSP()); //resets SP
         //fighter.setEvasion(0);
         fighter.reset();
         hasW1 = false;
         hasW2 = false;
         hasW3 = false;
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

            while(choice == 1) {
               System.out.println("\n\nReady to buy! \nYou have " + money.getCash() + " gold\n");

               if (weaponList.size() == 0){
                  System.out.println("Your weapon inventory is currently empty");
               } else if (weaponList.get(0).getClass().getName().equals("Fist") &&
                     weaponList.size() == 1){
                  System.out.println("Your only weapons are your bare hands!");
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

/*
               Weapon W1 = null;
               Weapon W2 = null;
               Weapon W3 = null;

               Potion potion = new Potion();
               Elixir elixir = new Elixir();
               SmokeBomb smokeBomb = new SmokeBomb();
*/
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
                     weaponList.set(0, W1);
                     fighter.addWeapon1(W1);
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
                     weaponList.set(0, W2);
                     fighter.addWeapon1(W2);
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
                     fighter.addWeapon2(W3);
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
                     fighter.addPotion();
                  }
               }

               else if (buy == 5){ //weapon 5. works for all classes
                  if (money.getCash() < price5){
                     System.out.println("You do not have enough gold to buy this!");
                  } else {
                     money.buyItem(elixir);
                     System.out.println("\nRemaining balance: " + money.getCash());
                     itemList.add(elixir);
                     fighter.addElixir();
                  }
               }

               else if (buy == 6){ //weapon 6. works for all classes
                  if (money.getCash() < price6){
                     System.out.println("You do not have enough gold to buy this!");
                  } else {
                     money.buyItem(smokeBomb);
                     System.out.println("\nRemaining balance: " + money.getCash());
                     itemList.add(smokeBomb);
                     fighter.addSmokeBomb();
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

         int turnCount = 1;
         while(!passed && gamesPlayed < 3) { //Fight time, once you win, passed = true;
            //boolean trueVal = true;

            fighter.setEvasions(opp.getEvasion());
            //W1.setEnemyEvasion(opp.getEvasion());
            //W2.setEnemyEvasion(opp.getEvasion());
            //W3.setEnemyEvasion(opp.getEvasion());

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
               if(usedItem == false) {
               
                  System.out.println("(1) Fight   (2) Use Item   (3) Rest");
                  Command = scanCheck(1,3,scan);
                  if(Command == 2) {
                     if (itemList.size() == 0){
                        System.out.println("You have no items to use!");
                     } else {
                        int use = 0;
                        System.out.println("Items: " + itemList);
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
                                 usedItem = true;
                                 itemList.remove(potion);
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
                                 usedItem = true;
                                 itemList.remove(elixir);
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
                                 usedItem = true;
                                 itemList.remove(smokeBomb);
                              }
                           }

                           if (use ==4){
                              toUse = false;
                           }

                        }

                     }
                        //usedItem = true;
                     
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
                  usedItem = false;
                  }
                  if (opp.getHp() <= 0){
                     passed = true;
                     win = true;
                     break;
                  }

               }

            //turnCount++;


            }
            int useSpecial = fighter.useSpecialWeapon(hasW3);
            int shieldBlock = 0;
            if (!win){
               if (playerClass == 2 && hasW3){
                  shieldBlock = useSpecial;
                  //System.out.println("Your Shield blocked 5 damage!");
               } else if (playerClass == 1 && hasW3){
                  opp.setHP((-1) * useSpecial);
                  System.out.println("Your wolf companion totally fucked that guy's face up!"
                     + " He lost like 5 damage!");
               } else if (playerClass == 3){
                  //fighter.setHP(useSpecial);
                  //System.out.println("Your Healing Staff healed you by 5 HP!");
               }
            }
            turnCount++;




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
               int eMove = enemyMove(gamesPlayed);
               if(eMove == 3) {
                  System.out.println("The enemy rests.");
                  opp.rest();
               }
               if(eMove == 2) {
                  
                  int damageDone;
                  int orig;
                  int blocked = 0;

                  if (shieldBlock != 0){
                     damageDone = opp.specialAttack();
                     orig = damageDone;
                     if ((-1)*damageDone < shieldBlock){
                        blocked = (-1) * damageDone;
                        damageDone = 0;
                     } else {
                        damageDone += shieldBlock;
                        blocked = (orig - damageDone) * (-1);
                     }
                  } else {
                     damageDone = opp.specialAttack();
                     orig = damageDone;
                  }

                  System.out.println("The enemy issued " + orig + " damage with their "
                     + opp.getWeapon1Name() + "'s Special attack!");
                  if (shieldBlock != 0){
                     System.out.println("But you blocked " + blocked + " of their damage"
                        + " with your shield");
                  }


                  fighter.setHP(damageDone);
                  if(fighter.getHp() <= 0) {
                     //System.out.println("GG no re");
                     lost = true;
                  }
                  opp.setSP(-20);
               }
               if(eMove == 1) {

                  int damageDone;
                  int orig;
                  int blocked = 0;

                  if (shieldBlock != 0){
                     damageDone = opp.strongAttack();
                     orig = damageDone;
                     if ((-1)*damageDone < shieldBlock){
                        blocked = (-1) * damageDone;
                        damageDone = 0;
                     } else {
                        damageDone += shieldBlock;
                        blocked = (orig - damageDone) * (-1);
                     }
                  } else {
                     damageDone = opp.strongAttack();
                     orig = damageDone;
                  }

                  System.out.println("The enemy issued " + orig + " damage with their "
                     + opp.getWeapon1Name() + "'s Strong attack!");
                  if (shieldBlock != 0){
                     System.out.println("But you blocked " + blocked + " of their damage"
                        + " with your shield");
                  }

                  fighter.setHP(damageDone);
                  if(fighter.getHp() <= 0) {
                     //System.out.println("GG no re");
                     lost = true;
                  }
                  opp.setSP(-10);
               }
               if(eMove == 0) {


                  int damageDone;
                  int orig;
                  int blocked = 0;

                  if (shieldBlock != 0){
                     damageDone = opp.basicAttack();
                     orig = damageDone;
                     if ((-1)*damageDone < shieldBlock){
                        blocked = (-1) * damageDone;
                        damageDone = 0;
                     } else {
                        damageDone += shieldBlock;
                        blocked = (orig - damageDone) * (-1);
                     }
                  } else {
                     damageDone = opp.basicAttack();
                     orig = damageDone;
                  }

                  System.out.println("The enemy issued " + orig + " damage with their "
                     + opp.getWeapon1Name() + "'s Basic attack!");
                  if (shieldBlock != 0){
                     System.out.println("But you blocked " + blocked + " of their damage"
                        + " with your shield");
                  }

                  fighter.setHP(damageDone);
                  if(fighter.getHp() <= 0) {
                     //System.out.println("GG no re");
                     lost = true;
                  }
               }

               int oppUseSpecial = opp.useSpecialWeapon(true);
               //int shieldBlock = 0;
               //System.out.println("ENEMY SPECIAL: " + gamesPlayed);

               if (gamesPlayed == 1){
                  fighter.setHP((-1) * oppUseSpecial);
                  System.out.println("The enemy's wolf companion totally fucked your face up!"
                     + " You lost like 5 damage!");
               } else if (gamesPlayed == 2){
                  opp.setHP(oppUseSpecial);
                  System.out.println("The enemy's Healing Staff healed him by 5 HP!");
               }



               if(lost == true) {
                  break;
               }

               /*
               try {
                  boolean sleeping = true;
                  while (sleeping){
                     Thread.sleep(1000);
                     sleeping = false;
                  }
               } catch (Exception e){
                  Thread.currentThread().interrupt();
               }
               */
               





               //MAGE HEALINGSTAFF
               if (playerClass == 3 && hasW3){
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
      } else {
         System.out.println("You have bested every opponent! Now leave...\n");
      }
   }//end main

   private static int enemyMove(int level) {
      Random rand = new Random();
      //boolean usedItem = false;
      if(level == 1) { //Random AI for level 1
         while(true) {
            if(opp.getHp() <= 25 && opp.getPotions() > 0) { //use potion if hp < 25
               System.out.println("Enemy used potion!");
               opp.usePotion();
               break;
            }
            if(opp.getSp() <= (-1)*opp.specialSP() && opp.getElixir() > 0) { //"" but with elixir
               System.out.println("Enemy used elixir!");
               opp.useElixir();
               break;
            }
            break;
         }
         int n = rand.nextInt(4);
         if(n == 3) {
            if(opp.getSp() <= 30) {
               return 3;
            } else {
               n = 2;
            }
         }
         if(n == 2) {
            if(opp.getSp() >= (-1)*opp.specialSP()) {
               return 2;
            } else if (opp.getSp() >= (-1)*opp.strongSP()) {
               return 1;
            } else {
               return 0;
            }
         }

         if(n == 1) {
            if(opp.getSp() >= (-1)*opp.strongSP()) {
               return 1;
            } else {
               return 0;
            }
         }
         if(n == 0) {
            return 0;
         }

      }
      if(level == 0) {
         while(true) {
            if(opp.getHp() <= 25 && opp.getPotions() > 0) { //use potion if hp < 25
               System.out.println("Enemy used potion!");
               opp.usePotion();
               break;
            }
            if(opp.getSp() <= (-1)*opp.specialSP() && opp.getElixir() > 0) { //"" but with elixir
               System.out.println("Enemy used elixir!");
               opp.useElixir();
               break;
            }
            break;
         }
         if(attackCount == 0) {
            if(opp.getSp() >= (-1)*opp.specialSP()) {
               attackCount++;
               return 2;
            } else if(opp.getSp() >= (-1)*opp.strongSP()) {
               attackCount++;
               return 1;
            } else {
               attackCount++;
               return 0;
            }
         }
         if(attackCount == 1) {
            if(opp.getSp() >= (-1)*opp.strongSP()) {
               attackCount++;
               return 1;
            } else {
               attackCount++;
               return 0;
            }
         }
         if(attackCount < 4) {
            attackCount++;
            return 3;
         }
         attackCount = 0;
         return 0;
      }
      if(level == 2) {
         while(true) {
            if(opp.getHp() <= 65 && opp.getPotions() > 4) { //use potion if hp < 25
               System.out.println("Enemy used potion!");
               opp.usePotion();
               break;
            }
            if(opp.getHp() <= 35 && opp.getPotions() <= 4) {
               System.out.println("Enemy used potion!");
               opp.usePotion();
               break;
            }
            if(opp.getSp() <= (-1)*opp.specialSP() && opp.getElixir() > 0) { //"" but with elixir
               System.out.println("Enemy used elixir!");
               opp.useElixir();
               break;
            }
            break;
         }
         if(playerMove == 0) { //if rests, go all out unless they have more than 20hp
            if(opp.getSp() >= (-1)*opp.specialSP()) {
               return 2;
            } else if(opp.getSp() >= (-1)*opp.strongSP()) {
               return 1;
            } else if(fighter.getHp() <= 20){
               return 0;
            } else {
               return 3;
            }
         }
         if(playerMove == 1) { //basic attack, rest if Sp is less than or equal to 30
            if(opp.getSp() <= 30) {
               return 3;
            } else {
            return 2;
            }
         }
         //strong attack
         if(playerMove == 2) {
            if(opp.getHp() <=50) {
               if(opp.getSp() >= (-1)*opp.specialSP()) {
                  return 2;
               } else if (opp.getSp() >= (-1)*opp.strongSP()) {
                  return 1;
               } else {
                  return 3;
               }
            }
            if(opp.getHp() > 50) {
               if(opp.getSp() >= (-1)*opp.specialSP()) {
                  return 2;
               } else if(opp.getSp() >= (-1)*opp.strongSP()) {
                  return 1;
               } else {
                  return 0;
               }
            }
         }
         //special attack retaliate if possible, otherwise rest
         if(playerMove == 3) {
            if(opp.getSp() >= (-1)*opp.specialSP()) {
               return 2;
            } else {
               return 3;
            }
         }
      }
      return 0;
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
