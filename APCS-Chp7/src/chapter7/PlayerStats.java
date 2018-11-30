package chapter7;

//PROJECT 7.4
public class PlayerStats {
	//variables relating to stats
   protected String player;
   protected String team;
   protected int score;

   //PlayerStats class constructor
   public PlayerStats(String name, String team) {
      this.player = name;
      this.team = team;
   }

   //toString method to print out stats info
   public String toString() {
      String result = "Player: " + player;
      result += "\nTeam: " + team;
      return result;
   }
}
