package proj4_5; //project 4.5

public class Pig { //class
	//assigns and initializes private variables
   private int total; 
   private PairOfDice dice;
   private PigPlayer computer;
   private PigPlayer user; 
   private PigPlayer currentPlayer;

   public Pig(int target) { //Pig constructor
      this.total = target; //assigns total to target
      this.dice = new PairOfDice();
      this.computer = new PigPlayer(20);
      this.user = new PigPlayer(PigPlayer.end);
   }

   public void play() { //play method
      boolean win = true; //assigns win as true
      currentPlayer = computer; //sets currentPlayer to computer
      do{ //do-while loop
         takeTurn(); //takeTurn method
         if (currentPlayer.getPoints() >= total) { //if points greater than total
            win = false; //win is false
         }else { //else
            if (currentPlayer == computer) { //if currentPlayer is computer
               currentPlayer = user; //set currentPlayer as user
            }else { //else
               currentPlayer = computer; //set currentPlayer to computer
            }
         }
      }while(win); //while win is true
      winner(); //run winner method
   }

   public void takeTurn() { //takeTurn method
      boolean roll = true; //sets roll to true
      System.out.println("ROUND OVER!"); //prints round over
      System.out.println("Computer: " + computer.getPoints()); //prints computer score
      System.out.println("You: " + user.getPoints()); //prints your score
      while(roll) { //while roll is true
         roll = currentPlayer.roll(dice, total);
      }
   }
   
   public void winner() { //winner method
      System.out.println(); //space
      if (currentPlayer == computer) { //if currentPLayer is computer
         System.out.println("The computer has won!"); //prints the computer has won
      }else { //else
         System.out.println("You have won!"); //prints you won
      }
      System.out.println(); //space
      System.out.println("Scores:"); //prints out score
      System.out.println("Computer: " + computer.getPoints()); //prints out computer score
      System.out.println("You: " + user.getPoints()); //prints out your score
   }
   
   public static void main (String[] args) { //main method
      Pig game = new Pig(100); //new Pig object
      game.play(); //plays game
   }
}

