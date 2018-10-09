package proj4_5;

import java.util.Scanner;

public class PigPlayer{
   public final static int ASK = -1;  // prompt for round termination
   private int total;  // total points accumulated in game
   private int round;  // points accumulated in current round
   private int limit;  // pass tolerance
   private static PairOfDice dice = new PairOfDice();

   public PigPlayer (int max){
      total = 0;
      round = 0;
      limit = max;
   }

   public boolean roll (PairOfDice dice, int goal){
      boolean rollAgain = true;
      Scanner scan = new Scanner (System.in);
      dice.roll();
      int die1 = dice.getDie1();
      int die2 = dice.getDie2();
      System.out.println ();
      System.out.println ("Dice: " + die1 + " + " + die2 +
                          " = " + (die1+die2));
      if (die1 == 1 || die2 == 1){
         System.out.println ("Busted!!!");
         rollAgain = false;
         round = 0;
         if (die1 == 1 && die2 == 1) {
            total = 0;
         }
      }else{
         round += die1 + die2;
         System.out.println ("Current Round: " + round);
         System.out.println ("Potential Total: " + (total+round));
         if ((total+round) >= goal) {
            rollAgain = false;
         }else if (limit == ASK){
               System.out.print ("Take another turn (y/n)? ");
               String again = scan.nextLine();
               rollAgain = again.equalsIgnoreCase("y");
            }else if (round >= limit) {
                  rollAgain = false;
            }
         if (! rollAgain){
            total += round;
            round = 0;
         }
      }
      return rollAgain;
   }
   
   public int getPoints(){
	   return total;
   }
}
