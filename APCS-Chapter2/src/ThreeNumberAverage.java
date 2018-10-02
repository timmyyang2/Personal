import java.util.Scanner; //imports Scanner for user input

public class ThreeNumberAverage { //PROJECT 2.2
	
	public static void threeNumbers() { //method to find average of three numbers
		try { //try-catch to catch error inputs
			Scanner sc = new Scanner(System.in); //Scanner for user input 
			System.out.print("Enter first number (int or decimal): "); //asks user for first number
			float input = sc.nextFloat(); //user inputs float to answer previous question
			System.out.print("Enter second number (int or decimal): "); //asks user for second number
			float input2 = sc.nextFloat(); //user inputs float to answer previous question
			System.out.print("Enter third number (int or decimal): "); //asks user for third number
			float input3 = sc.nextFloat(); //user inputs float to answer previous question
			float average = (input + input2 + input3)/3; //finds average by adding up all inputs and dividing by number of inputs
			System.out.println("The average of your three numbers are " + average + "."); //prints the average of the numbers
		}catch(Exception e) { //catches error inputs
			System.out.println("Error."); //error message
		}
	}

	public static void main(String[] args) { //main method
		threeNumbers(); //runs threeNumbers method
		
	}
}
