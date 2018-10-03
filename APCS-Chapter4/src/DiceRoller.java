import java.util.Random; //imports Random package for random number generator
import java.util.Scanner; //imports Scanner package for user input

public class DiceRoller { //PROJECT 4.3
	
	public static void rollDice() { //rollDice method
		try { //try-catch to catch error inputs
			Scanner sc = new Scanner(System.in); //Scanner for user input
			System.out.print("Enter any number of sides on a die: "); //asks user to enter a number of sides
			int num = sc.nextInt(); //user input will be an integer
			
			Random rand = new Random(); //initializes rand object
			int r = rand.nextInt(num)+1; //assigns int r to random number generator
			System.out.println("Your roll was " + r + "!"); //prints out randomly generated roll
		}catch(Exception e) { //catches exception inputs
			System.out.println("Error."); //prints out error message
		}
	}
	
	public static void main(String[]args) { //main method
		rollDice(); //runs rollDice method
	}

}
