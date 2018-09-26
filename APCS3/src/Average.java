import java.text.DecimalFormat; //imports package for decimal format
import java.util.Scanner; //imports package for user input

public class Average { //PROJECT 3.1

	public static void main(String[] args) { //main method
		int sum = 0, value, count = 0; //initializes sum, value, count
		double average; //initializes double variable
		
		try { //try-catch to catch error inputs
		Scanner scan = new Scanner(System.in); //Scanner for user input
		
		System.out.print("Enter an integer (0 to quit): "); //asks user to enter an integer
		value = scan.nextInt(); //user inputs int
		
		while(value != 0) { //while value doesn't equal 0
			count++; //increment count by 1
			sum += value; //add value to sum
			System.out.println("The sum so far is " + sum); //prints sum so far
			
			System.out.print("Enter an integer (0 to quit): "); //asks user to enter an integer
			value = scan.nextInt(); //user inputs int
		}
//		if(value == 0) { //if value = 0
//			System.out.println("Program over."); //prints program is over
//			System.exit(1); //exits program
//		}
		System.out.println(); //space
		System.out.println("Number of values entered: " + count); //prints number of values entered
		
		average = (double)sum/count; //finds average
		
		DecimalFormat fmt = new DecimalFormat("0.###"); //changes to decimal format
		
		System.out.println("The average is " + fmt.format(average)); //prints the average
		}catch(Exception e) { //catches error inputs
			System.out.println("Error."); ///prints error message
		}
	}
}