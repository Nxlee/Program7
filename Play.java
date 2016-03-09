import java.util.Scanner;
public class Play {
   public static void main(String[] args) {
      int gamesPlayed = 0;
      int gamesToPlay = 3;
      boolean passed;
      int choice = 69;

      Scanner scan = new Scanner(System.in);
      Cash money = new Cash();

      while(gamesPlayed < gamesToPlay) {
         passed = false;
         while(true) {
            //in shop. If key is pressed, break
            System.out.println("Welcome to the Shop.");
            System.out.println("What would you like to do?");
            System.out.println("(1) buy or (2) exit");
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

            if(choice == 1) {
               System.out.println("Ready to buy! Money: " + money.getCash());
               money.buyWeapon(new LongBow(10));
               System.out.println("After buy: " +money.getCash());

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
}
