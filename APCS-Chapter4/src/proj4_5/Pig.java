package proj4_5;

public class Pig{
   private int goal;
   private PairOfDice dice;
   private PigPlayer computer, human, currentPlayer;

   public Pig(int target){
      goal = target;
      dice = new PairOfDice();
      computer = new PigPlayer (20);
      human = new PigPlayer (PigPlayer.ASK);
   }

   public void play(){
      boolean noWinnerYet = true;
      currentPlayer = computer;
      do{
         takeTurn();
         if(currentPlayer.getPoints() >= goal) {
            noWinnerYet = false;
         }else if (currentPlayer == computer) {
               currentPlayer = human;
         }else {
               currentPlayer = computer;
         }
      }
      while (noWinnerYet);

      announceWinner();
   }

   private void takeTurn (){
      boolean stillRolling = true;
      System.out.println ("____________________");
      System.out.println ("Current Status:");
      System.out.println ("   Computer: " + computer.getPoints());
      System.out.println ("   You: " + human.getPoints());
      while (stillRolling) {
         stillRolling = currentPlayer.roll (dice, goal);
      }
   }

   private void announceWinner (){
      System.out.println();
      if (currentPlayer == computer) {
         System.out.println ("The computer has won!");
      }else {
         System.out.println ("Congratulations, you have won!");
      }
      System.out.println();
      System.out.println ("Final Results:");
      System.out.println ("   Computer: " + computer.getPoints());
      System.out.println ("   You: " + human.getPoints());
   }
   
   public static void main (String[] args){
      Pig game = new Pig (100);
      game.play();
   }
}
