import java.util.Scanner; //imports Scanner for user input

public class MileConverter { //PROJECT 2.5

	public static void mile() { //method for mile to kilo conversion
		try { //try-catch to check for error inputs
			Scanner sc = new Scanner(System.in); //Scanner for user input
			System.out.print("Enter a number of miles to convert to kilometers: "); //asks user for miles
			float input = sc.nextFloat(); //user inputs float to answer previous question
			float convert = (float) (input * 1.60935); //mile to kilo conversion formula
			System.out.println("The conversion from miles to kilometers: " + convert); //prints out conversion from miles to kilo
		}catch(Exception e) { //catches error inputs
			System.out.println("Error."); //error message
		}
	}
	
	public static void main(String[] args) { //main method
		mile(); //runs mile method
	}
}
