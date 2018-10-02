import java.util.Scanner; //imports Scanner for user input

public class MilesGallon { //PROJECT 2.11
	
	public static void mpg(float a, float b, float c) { //method for calculating miles per hour with 3 parameters
		float averageMPG = (b-a)/c; //miles per hour formula (start time - end time) divided by miles
		System.out.println("The mpg is " + averageMPG + " miles per gallon"); //prints out miles per hour
	}
	
	public static void gasDistance() { //method to ask user for inputs
		try { //try-catch to catch error inputs
			Scanner sc = new Scanner(System.in); //Scanner for user input
			System.out.print("Enter start odometer: "); //asks the user for start odometer 
			float input = sc.nextFloat(); //user inputs float to answer previous question
			System.out.print("Enter end odometer: "); //asks the user for end odometer
			float input2 = sc.nextFloat(); //user inputs float to answer previous question
			
			if(input2 < input) { //if end odometer is greater than start odometer print error message
				System.out.println("Error: End odometer is smaller than Start odometer."); //error message
				return; //returns
			}
			
			System.out.print("Enter total gas used: "); //asks user for gas used
			float input3 = sc.nextFloat(); //user inputs float to answer previous question
			mpg(input, input2, input3); ///calls mpg method with user input parameters
		}catch(Exception e) { //catches error input
			System.out.println("Error."); //error message
		}
	}
	
	public static void main(String[] args) { //main method
		gasDistance(); //runs getDistance method
	}

}
