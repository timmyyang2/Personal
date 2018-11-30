package proj4_5; //project package 4.5

public class Pig{ //class
   private int target; //int target for target score
   private PairOfDice dice;
   private Player computer;
   private Player user;
   private Player current;
   
   public Pig(int target){ //constructor
      this.target = target;
      this.dice = new PairOfDice();
      this.computer = new Player(20);
      this.user = new Player(Player.END);
   }

   public void game(){ //game method
      boolean win = false; //boolean variable win is set as true
      current = computer; //current = computer because computer starts the game
      do{ //do while loop
         swapPlayer(); //run swapPlayer method
         if(current.getPoints() >= target) { //checks if current player points is greater than 100
            win = true; //win is set to true
         }else if (current == computer) {
               current = user;
         }else {
               current = computer;
         }
      }
      while (win == false); //run this while win is false
      winner(); //runs winner method
   }

   private void swapPlayer(){ //swapPlayer method
      boolean rolling = true; //sets rolling to true
      System.out.println("____________________"); //divider
      System.out.println("Current Results:"); //prints current results
      System.out.println("Computer: " + computer.getPoints()); //prints computer points
      System.out.println("You: " + user.getPoints()); //prints your points
      while (rolling == true) { //while rolling is true
         rolling = current.roll (dice, target); //set rolling to current.roll method
      }
   }

   private void winner(){ //winner method
      System.out.println(); //space
      if (current == computer) { //if computer is current player
         System.out.println("Computer wins!"); //computer wins message
      }else { //else
         System.out.println("You win!"); //you win message
      }
      System.out.println(); //space
      System.out.println("Computer score: " + computer.getPoints()); //prints computer points
      System.out.println("Your score: " + user.getPoints()); //prints your points
   }
   
   public static void main (String[] args){ //main method
      Pig pig = new Pig(100); //new pig object
      pig.game(); //run the game method
   }
}
