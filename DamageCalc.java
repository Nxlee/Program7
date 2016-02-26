public class DamageCalc {
   private int damage;
   private int chanceEvasion;


   /*
      1 - basic
      2 - strong
      3 - special

      calc the amount of damage that will be put on a fighter
   */
   public void attackDamage(int attackType){
      int damage = 0;
      //int chance = 0;
      
      //ATTACK TYPE 1
      if (attackType == 1){ //damage will be 1-5
         int range = (5 - 1) + 1;
         damage = (int)(Math.random() * range) + 1; //damage wil be 1 -5
      }

      //ATTACK TYPE 2
      if (attackType == 2){ //damage will be 5-10
         int range = (10 - 5) + 1;
         damage = (int)(Math.random() * range) + 5; //damage wil be 5 - 10
      }

      //ATTACK TYPE 3
      if (attackType == 3){ //damage will be 10-15
         int range = (15 - 10) + 1;
         damage = (int)(Math.random() * range) + 10; //damage wil be 5 - 10
      }
   }

   public void evasionChance(int evasion){
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
   }

   public int totalDamage(){
      return damage * chanceEvasion;
   }
}
