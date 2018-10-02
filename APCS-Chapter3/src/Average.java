import java.text.DecimalFormat; //imports package for decimal format
import java.util.InputMismatchException; //imports package for InputMismatchException
import java.util.Scanner; //imports package for user input

public class Average { //PROJECT 3.1

	public static void main(String[] args) { //main method from the original listing 3.6
		int sum = 0, value, count = 0; //initializes sum, value, count
		double average; //initializes double variable
		
		try { //try-catch to catch error inputs
			Scanner scan = new Scanner(System.in); //Scanner for user input
			
			System.out.print("Enter an integer (0 to quit): "); //asks user to enter an integer
			value = scan.nextInt(); //user inputs an integer
			
			while(value != 0) { //while value doesn't equal 0
				count++; //increment count by 1
				sum += value; //add value to sum
				System.out.println("The sum so far is " + sum); //prints sum so far
				
				System.out.print("Enter an integer (0 to quit): "); //asks user to enter an integer
				value = scan.nextInt(); //user inputs integer
			}
			System.out.println(); //provides a new line
			System.out.println("Number of values entered: " + count); //prints number of values entered
			
			average = (double)sum/count; //finds average
			
			DecimalFormat fmt = new DecimalFormat("0.###"); //changes to decimal format
			
			System.out.println("The average is " + fmt.format(average)); //prints the average
		}catch(InputMismatchException e) { //catches InputMismatchException
			System.out.println("Input mismatch."); //prints error message
		}catch(Exception e) { //catches Exception
			System.out.println("Error."); //prints Error message
		}
	}
}