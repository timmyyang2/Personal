import java.util.Scanner; //imports package for decimal format
import java.util.Random; //imports package for generating random numbers

public class RockPaperScissors { //PROJECT 3.14
	
	public static void playRPS() { //method to play the Rock, Paper and Scissors game
		String per = ""; //defines and initializes the user input
		String comp = ""; //defines and initializes the computer generated result
		int compGen = 0; //defines and initializes the computer generated result integer value
		int win = 0; //defines and initializes number of win
		int lose = 0; //defines and initializes number of lose
		int tie = 0; //defines and initializes number of tie
	   
	    while(true) { //keep running the program
	    	Scanner scan = new Scanner(System.in); //Scanner for user input 
		    Random generator = new Random();  //creates a random number generator
		    System.out.println("Let's play rock, paper, scissors!\n" + 
		                       "Enter a move using the following rules.\n" + "Rock = R, Paper" + 
		                       "= P, and Scissors = S."); //asks the user to input Rock, Paper or Scissors
		    compGen = generator.nextInt(3)+1; //randomly generates a number between 1 and 3
		    if (compGen == 1) { //assumes 1 is for R
		       comp = "R"; //assigns R to computer generated result
		    }else if (compGen == 2) { //assumes 2 is for P
		       comp = "P"; //assigns P to computer generated result
		    }else if (compGen == 3) { //assumes 2 is for S
		       comp = "S"; //assigns S to computer generated result
		    }
		    per = scan.nextLine(); //take input from the user
		    per = per.toUpperCase(); //converts it to the upper case for comparison 
		    
		    if(!per.equals("R") && !per.equals("P") && !per.equals("S")) { //if not R, P or S
		    	 System.out.println("Please enter R, P or S."); //prints out this message to prompt the user
		    	 continue; //goes back to the beginning of the loop
		    }
		    
		    if(per.equals(comp)) { //if the user input is the same the computer generated one
		    	System.out.println("You: " + per + " Computer: " + comp); //prints out the results from both
		    	System.out.println("You tie!"); //prints out you tie
		    	tie++; //increments tie count by 1
		    }else if(per.equals("R") && comp.equals("S") || per.equals("S") && comp.equals("P") 
		    		|| per.equals("P") && comp.equals("R")) { //compares the user input and the computer generated one in the winning situations
		    	System.out.println("You: " + per + " Computer: " + comp); //prints out the results from both
		    	System.out.println("You win!"); //prints out you win
		    	win++;  //increments win count by 1
		    }else { //otherwise
		    	System.out.println("You: " + per + "\nComputer: " + comp); //prints out the results from both
		    	System.out.println("You lose!"); //prints out you lose
		    	lose++;	//increments lose count by 1
		    }
		    System.out.println("Do you wish to play again? Press Y for yes, anything else for no."); //asks user for replay or not
			String answer = scan.nextLine(); //takes user input again
			answer.toUpperCase(); //converts it to upper case 
		    if(!answer.equalsIgnoreCase("Y")) { //if the input is not Y
			    System.out.println("Wins: " + win + " Loses: " + lose + " Ties: " + tie); //prints out the final game results
			    break; //breaks the loop and quits
		    }
		}    
	}
	
	public static void main(String[] args) { //main method
		playRPS(); //runs playPRS method
	}
}