import java.util.Scanner; //imports Scanner for user input

public class ReadRadius { //PROJECT 2.9
	
	public static void radCalc(int r) { //method for volume and surface area calculations with 1 parameter
		double volume = (4.0/3) * Math.PI * Math.pow(r, 3); //volume formula
		double surfArea = 4 * Math.PI * Math.pow(r, 2); //surface area formula
		System.out.print("Volume = "); //prints volume
		System.out.printf("%.4f", volume); //prints the volume value up to 4 decimals
		System.out.println(); //space
		System.out.print("Surface Area = "); //prints surface area
		System.out.printf("%.4f", surfArea); //prints the surface area value up to 4 decimals
	}
	
	public static void radius() { //method to ask user for radius value
		try { //try-catch to catch error inputs
			Scanner sc = new Scanner(System.in); //Scanner for user input
			System.out.print("Enter radius: "); //asks user for radius value
			int input = sc.nextInt(); //user inputs int to answer previous question
			radCalc(input); //calls radCalc with user input as the parameter
		}catch(Exception e) { //catches error input
			System.out.println("Error."); //error message
		}
	}
	
	public static void main(String[] args) { //main method
		radius(); //runs radius method
	}

}
