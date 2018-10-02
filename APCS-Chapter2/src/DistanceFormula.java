import java.util.Scanner; //imports Scanner for user input

public class DistanceFormula { //PROJECT 2.8
	
	public static void distance(float x, float y, float x2, float y2) { //method solving for distnace using distance formula with 4 parameters
		double dist = Math.sqrt((x-x2)*(x-x2) + (y-y2)*(y-y2)); //(wrong formula in the textbook) uses math sqaure root function and formula to find distance
		System.out.println("Distance: " + dist); //prints out distance
		System.out.printf("Distance w/ 2 decimal points: %.2f", dist); //prints out the distance value with 2 decimal places
	}
	
	public static void coordinates() { //method for user to input coordinates
		try { //try-catch to check for error inputs
			Scanner sc = new Scanner(System.in); //Scanner for user input
			System.out.print("Enter first x coordinate: "); //asks user for first x coordinate
			float input = sc.nextFloat(); //user inputs float to answer previous question
			System.out.print("Enter first y coordinate: "); //asks user for first y coordinate
			float input2 = sc.nextFloat(); //user inputs float to answer previous question
			System.out.print("Enter second x coordinate: "); //asks user for second x coordinate
			float input3 = sc.nextFloat(); //user inputs float to answer previous question
			System.out.print("Enter second y coordinate: "); //asks user for second y coordinate
			float input4 = sc.nextFloat(); //user inputs float to answer previous question
			distance(input, input2, input3, input4); //calls distance methods with user inputs as parameters
		}catch(Exception e) { //catches error inputs
			System.out.println("Error."); //error message
		}
	}
	
	public static void main(String[] args) { //main method
		coordinates(); //runs coordinates method
	}

}
