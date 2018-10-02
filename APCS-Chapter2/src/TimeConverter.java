import java.util.Scanner; //imports Scanner for user input

public class TimeConverter { //PROJECT 2.7
	
	public static void timeConversions(int n) { //method for time conversions with 1 parameter
		int hours = n/60/60; //converts seconds to hours
		int minutes = (n/60)%60; //converts seconds to minutes
		int seconds = n%60; //gets remainder for remaining seconds
		System.out.println(n + " seconds is equal to " + hours + " hours, " + minutes + " minutes, and " 
		+ seconds + " seconds."); //prints out conversions
	}
	
	public static void timeEnter() { //method for asking user for number of seconds
		try { //try-catch to check for error inputs
			Scanner sc = new Scanner(System.in); //Scanner for user input
			System.out.print("Enter number of seconds: "); //asks user for number of seconds
			int input = sc.nextInt(); //user inputs int to answer previous question
			timeConversions(input); //calls timeConversions method with user input as parameter
		}catch(Exception e) { //catches error input
			System.out.println("Error."); //error message
		} 
	}

	public static void main(String[] args) { //main method
		timeEnter(); //runs timeEnter method
	}
}
