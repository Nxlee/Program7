import java.util.Scanner;
public class Play {
   public static void main(String[] args) {
      int gamesPlayed = 0;
      int gamesToPlay = 3;
      boolean passed;
      while(gamesPlayed < gamesToPlay) {
         passed = false;
         while(true) {
            //in shop. If key is pressed, break
            System.out.println("Welcome to the Shop.");
            System.out.println("What would you like to do? Buy or Exit");
            break;
         }
         while(!passed) {
            //play against AI, once you win, passed = true.
         }
      }
   }
}
