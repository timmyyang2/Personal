package proj4_5;

public class Pig{
   private int target;
   private PairOfDice dice;
   private Player computer;
   private Player user;
   private Player current;
   
   public Pig(int target){
      this.target = target;
      this.dice = new PairOfDice();
      this.computer = new Player(20);
      this.user = new Player(Player.ASK);
   }

   public void game(){
      boolean win = true;
      current = computer;
      do{
         takeTurn();
         if(current.getPoints() >= target) {
            win = false;
         }else if (current == computer) {
               current = user;
         }else {
               current = computer;
         }
      }
      while (win == true);

      winner();
   }

   private void takeTurn (){
      boolean stillRolling = true;
      System.out.println ("____________________");
      System.out.println ("Current Results:");
      System.out.println ("Computer: " + computer.getPoints());
      System.out.println ("You: " + user.getPoints());
      while (stillRolling) {
         stillRolling = current.roll (dice, target);
      }
   }

   private void winner (){
      System.out.println();
      if (current == computer) {
         System.out.println ("Computer wins!");
      }else {
         System.out.println ("You win!");
      }
      System.out.println();
      System.out.println ("Computer's score: " + computer.getPoints());
      System.out.println ("Your score: " + user.getPoints());
   }
   
   public static void main (String[] args){
      Pig pig = new Pig(100);
      pig.game();
   }
}
