/*
* Version: 2
*/

public class DamageCalc {
   private int damage;
   private int chanceEvasion;


   /*
      1 - basic
      2 - strong
      3 - special

      calc the amount of damage that will be put on a fighter
   */
   public void attackDamage(int attackType, double multi){
      //int damage = 0;
      //int chance = 0;
      
      //ATTACK TYPE 1
      if (attackType == 1){ //damage will be 1-5
         if (
            int range = (int)((5*(multi) - 1) + 1); //multi = .5, range = 3
         damage = -1 * ((int)(Math.random() * range) + 1);//damage wil be 1 -5
      }

      //ATTACK TYPE 2
      if (attackType == 2){ //damage will be 5-10
         if (multi < 1){
            int range = (int)((10*(multi) - 5*(multi)) + 1); //range = 2
            damage = -1 * ((int)(Math.random() * range) + 3);
         } else {
            int range = (int)((10*(multi) - 5) + 1);
            damage = -1 * ((int)(Math.random() * range) + 5); //damage wil be 5 - 10
         }
      }

      //ATTACK TYPE 3
      if (attackType == 3){ //damage will be 10-15

         if (multi < 1){
            int range = (int)((15*(multi) -1) + 1);
            damage = -1 * ((int)(Math.random() * range) + 3); 
         } else {
            int range = (int)((15*(multi) - 10) + 1);
            damage = -1 * ((int)(Math.random() * range) + 10); //damage wil be 5 - 10
         }
      }
      //System.out.println(damage);
      //damage = 5; //testing
   }

   public void evasionChance(int evasion){
      chanceEvasion = 1;
      int chance = 0;
      if (evasion == 0){ // miss chance = 1 in 50
         chance = (int)(Math.random() * 50) + 1;
         if (chance == 1)
            chanceEvasion = 0;
      }
      if (evasion >= 1 && evasion < 25){ // miss chance = 1 in 20
         chance = (int)(Math.random() * 20) + 1;
         if (chance == 1)
            chanceEvasion = 0; 
         
      }
      if (evasion >= 25 && evasion < 50){ // miss chance = 1 in 15
         chance = (int)(Math.random() * 15) + 1;
         if (chance == 1)
            chanceEvasion = 0;
         
      }
      if (evasion >= 50 && evasion < 75){ // miss chance = 1 in 10
         chance = (int)(Math.random() * 10) + 1;
         if (chance == 1)
            chanceEvasion = 0;
      
      }
      if (evasion >= 75 && evasion < 100){ // miss chance = 1 in 5
         chance = (int)(Math.random() * 5) + 1;
         if (chance == 1)
            chanceEvasion = 0;
      
      }
      if (evasion == 100){ // miss chnace = 1 in 1
         chanceEvasion = 0;
      }
      //System.out.println(chanceEvasion);
      //chanceEvasion = 1; //testing
   }

   public int totalDamage(){
      //System.out.println( damage + " " + chanceEvasion);
      return damage * chanceEvasion;
   }
}
