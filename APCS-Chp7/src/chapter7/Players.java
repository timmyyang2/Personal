package chapter7;

//PROJECT 7.4
public class Players { //driver class for players

   public static void main(String [] args) {
	   //2 new objects (BasketballStats and FootballStats)
      BasketballStats lebron = new BasketballStats("LeBron", "Lakers");
      FootballStats mahomes = new FootballStats("Mahomes", "Chiefs");

      //method calls to run classes
      lebron.makes();
      lebron.fouls();
      lebron.getMakes();
      lebron.getFouls();
      mahomes.yards(554);
      mahomes.getYards();
      
      //prints out results
      System.out.println(lebron);
      System.out.println();
      System.out.println(mahomes);
   }
}
