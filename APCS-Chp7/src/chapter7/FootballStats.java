package chapter7;

//PROJECT 7.4
public class FootballStats extends PlayerStats { //FootballStats class inherits PlayerStats
   protected int yards; //int variable yards

   //FootballStats class constructor
   public FootballStats(String player, String team) {
      super(player, team);
      this.yards = 0;
   }

   //yards method to add num to yards
   public void yards(int num) {
       yards += num;
   }
   
   //getter method to get int yards
   public int getYards() {
      return yards;
   }

   //toString method to print out football stats info
   public String toString() {
      String result = super.toString();
      result += "\nTotal yards: " + yards;
      return result;
   }
}
