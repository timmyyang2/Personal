package chapter7;

//PROJECT 7.5
public class Athlete extends Person { //Athlete class inherits Person class
	//String variables that relate with athlete
	private String sport;
	private String team;
	
	//Athlete class constructor
	public Athlete(String name, int age, String nationality, 
			String occupation, double income, String sport, String team) {
      super(name, age, nationality, occupation, income);
      this.sport = sport;
      this.team = team;
   }

	//toString method to print out sport and team
   public String toString() {
      return super.toString() + "\nSport: " + sport + "\nTeam: " + team;
   }
}
