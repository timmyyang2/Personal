package chapter7;

//PROJECT 7.4
public class BasketballStats extends PlayerStats { //BasketballStats class inherits PlayerStats class
	//ints that relate with basketball stats
   protected int makes;
   protected int fouls;
   protected int score;
   
   //BasketballStats class constructor
   public BasketballStats(String player, String team) {
      super(player, team);
      this.makes = 0;
      this.fouls = 0;
      this.score = 0;
   }

   //method that adds 1 to int make
   public void makes() {
      makes += 1;
   }
   
   //method that adds 1 to int foul
   public void fouls() {
	   fouls += 1;
   }
   
   //method that adds num to score
   public void score(int num) {
	   score += num;
   }
   
   //getter method to get int makes
   public int getMakes() {
	   return makes;
   }
   
   //getter method to get int fouls
   public int getFouls() {
	   return fouls;
   }
   
   //getter method to get int score
   public int getScore() {
	   return score;
   }
   
   //toString method to print out makes and fouls
   public String toString() {
      String stats = super.toString();
      stats += "\nMakes: " + makes;
      stats += "\nFouls: " + fouls;
      return stats;
   }
}


