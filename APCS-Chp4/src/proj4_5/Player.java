package proj4_5; //project package 4.5

import java.util.Scanner; //Scanner for user input

public class Player{ //class
   public final static int END = -1;  //for round termination
   private int total;  //points in total
   private int round;  //points in current round
   private int max;  //variable for max score in each round
   private static PairOfDice dice = new PairOfDice();

   public Player (int roundMax){ //constructor to define total, round, and max
      total = 0; //sets total to 0 to start
      round = 0; //sets round to 0 to start
      max = roundMax; //sets max as the roundMax which is 20
   }

   public boolean roll (PairOfDice dice, int goal){ //boolean roll method
      boolean contRoll = true; //continue rolling boolean variable
      Scanner scan = new Scanner(System.in); //Scanner for user input
      dice.roll(); //run the roll method
      int die1 = dice.getDie1(); //get die1 value
      int die2 = dice.getDie2(); //get die2 value
      System.out.println(); //space
      System.out.println("Dice roll result: " + die1 + " + " + die2 + " = " + (die1+die2)); //prints out roll results
      if (die1 == 1 || die2 == 1){ //if either die is 1
         System.out.println("HA ROLLED ONE!!"); //message
         contRoll = false; //roll stops and die goes to opponent
         round = 0; //sets round to 0 because round is over
         if (die1 == 1 && die2 == 1) { //if both die are 1
            total = 0; //total score is 0
         }
      }else{ //else
         round += die1 + die2; //add die score to round score
         System.out.println("Current Round: " + round); //print out round score
         if ((total+round) >= goal) { //if total + round is greater than 100
            contRoll = false; //continue roll is false
         }else if (max == END){ //else if max round score is reached
               System.out.print ("Roll again? (y for yes/n for no)? "); //asks user if they want to roll again
               String sc = scan.nextLine(); //user input
               contRoll = sc.equalsIgnoreCase("y"); //user inputs y for yes
            }else if (round >= max) { //if the round score is greater than 20
                  contRoll = false; //continue roll is false
            }
         if (contRoll == false){ //if continue roll is false
            total += round; //add round to total
            round = 0; //set round to 0
         }
      }
      return contRoll; //return contRoll
   }
   
   public int getPoints(){ //getPoints method
	   return total; //returns total
   }
}
