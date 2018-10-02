import java.util.Scanner; //imports Scanner for user inputs

public class SecondsConverter { //PROJECT 2.6
	
	public static void timeConversions(int hours, int minutes, int seconds) { //method for converting time with 3 parameters
		int hourSeconds = hours*60*60; //converts hours to seconds
		int minuteSeconds = minutes*60; //converts minutes to seconds
		int total = hourSeconds + minuteSeconds + seconds; //finds total number of seconds
		System.out.println("Total number of seconds: " + total); //prints out total number of seconds
		
	}
	
	public static void timeEnter() { //method for user to enter time values
		try { //try-catch to catch error inputs
			Scanner sc = new Scanner(System.in); //Scanner for user input
			System.out.print("Enter hours: "); //asks user for hours
			int input = sc.nextInt(); //user inputs int to answer previous question
			System.out.print("Enter minutes: "); //asks user for minutes
			int input2 = sc.nextInt(); //user inputs int to answer previous question
			System.out.print("Enter seconds: "); //asks user for seconds
			int input3 = sc.nextInt(); //user inputs int to answer previous question
			timeConversions(input, input2, input3); //calls timeConversions method with user inputs as parameters
		}catch(Exception e) { //catches error inputs
			System.out.println("Error."); //error message
		}
	}

	public static void main(String[] args) { //main method
		timeEnter(); //runs timeEnter method
	}
}
