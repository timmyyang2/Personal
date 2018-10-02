import java.util.Scanner; //imports package for user input
import java.util.Random; //imports package for generating random numbers

public class GuessingGame { //PROJECT 3.10

	private static void playGame() { //method to play guessing game
		final int MAX = 100; //defines the constant MAS as 100
		int answer = 0; //defines answer as an integer and initializes it as 0
		int guess = 0; //defines guess as an integer and initializes it as 0
		int count = 0; //defines count as an integer and initializes it as 0
		
		Scanner scan = new Scanner(System.in); //Scanner for user input 
		Random generator = new Random(); //Defines and initializes a Random object
		
		while(true) { //keep running
			try {
				answer = generator.nextInt(MAX) + 1; //randomly generates a number between 0 and 100, inclusive
				
				System.out.println("Guess the number between 1 and 100 (enter -1 to terminate): "); //ask user to guess the number
				guess = scan.nextInt(); //user inputs an integer
				if(guess == -1) { //uses sentinel value to terminate the program
					break; //breaks the loop
				}
				count++; //increments count by 1 after each guess
			}catch(Exception e) { //catches Exception
				System.out.println("Error"); //prints Error message
				scan = new Scanner(System.in); //creates a new Scanner to reset it for user input
			}
			
			if(answer == guess) { //if guess is equal to answer
				System.out.println("You got it after "+count+" guesses!"); //prints out the message
				break; //and then breaks the loop to quit
			}else {
				System.out.println("Incorrect. The correct answer is " + answer + "."); //prints the Incorrect message and goes back to the beginning again
			}
		}
	}
	
	public static void main(String[] args) { //main method
		playGame(); //runs playGame method
	}
}
