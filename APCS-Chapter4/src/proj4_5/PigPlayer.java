package proj4_5; //project 4.5

import java.util.Scanner; //imports Scanner for uer input

public class PigPlayer {
	//assigns and initializes private variables
   public final static int end = 1;
   private int total;
   private int round;
   private int limit;

   public PigPlayer(int limit) { //PigPlayer constructor
      this.total = 0; //sets total to 0
      this.round = 0; //sets round to 0
      this.limit = limit; //sets limit to limit
   }

   public boolean roll (PairOfDice dice, int goal) { //boolean method roll w/ parameters dice and goal
      boolean rollAgain = true; //boolean rollAgain set to true
      Scanner scan = new Scanner (System.in); //Scanner for user input
      dice.roll(); //rolls dice
      int die1 = dice.getDie1(); //sets die1
      int die2 = dice.getDie2(); //sets die2
      System.out.println(); //space
      System.out.println("Dice: " + die1 + " + " + die2 +
                          " = " + (die1+die2)); //prints out
      if (die1 == 1 || die2 == 1) {
         System.out.println("Rolled one!"); //prints out what you rolled
         rollAgain = false; //sets rollAgain to false
         round = 0; //sets round to 0
         if (die1 == 1 && die2 == 1) { //if both die equal 1
            total = 0; //sets total to 0
         }
      }else{ //else
         round += die1 + die2; //adds die values
         System.out.println ("Current Round: " + round); //prints current round value
 
         if ((total+round) >= goal) { //if points >= goal
            rollAgain = false; //rollAgain is false
         }else{ //else
            if (limit == end){
               System.out.print ("Another roll? (y/n)? "); //ask user to take another turn
               String again = scan.nextLine(); //user input next line
               rollAgain = again.equalsIgnoreCase("y"); //sets rollAgainto user input
            }else { //else
               if(round >= limit){ //if round >= limit
                  rollAgain = false; //rollAgain is false
            }
         if(!rollAgain){ //if not rollAgain
            total += round; //add round to total
            round = 0; //set round to 0
         }
      }
         }
      }
      return rollAgain; //return rollAgain
      
   }

   public int getPoints() { //getPoints method
      return total; //returns total
   }
}
