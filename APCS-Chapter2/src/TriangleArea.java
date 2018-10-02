import java.util.Scanner; //imports Scanner for user input

public class TriangleArea { //PROJECT 2.10
	
	public static void triangle(float a, float b, float c) { //method for triangle area with 3 parameters
		float s = (a+b+c)/2; //calculates half of the perimeter
		float area = (float) Math.sqrt(s * (s-a) * (s-b) * (s-c)); //Heron's area formula
		System.out.printf("Area =  %.3f", + area); //prints out triangle area
	}
	
	public static void triLengths() { //method for asking user for side lengths
		try { //try-catch for checking error inputs
			Scanner sc = new Scanner(System.in); //Scanner for user input
			System.out.print("Enter side length a: "); //asks user for side length a
			float input = sc.nextFloat(); //user inputs float to answer previous question
			System.out.print("Enter side length b: "); //asks user for side length b
			float input2 = sc.nextFloat(); //user inputs float to answer previous question
			System.out.print("Enter side length c: "); //asks user for side length c
			float input3 = sc.nextFloat(); //user inputs float to answer previous question
			triangle(input, input2, input3); //calls triangle method with user input as parameters
		}catch(Exception e) { //catches error inputs
			System.out.println("Error."); //error message
		}
	}
	
	public static void main(String[] args) { //main method
		triLengths(); //runs trilengths method
	}

}
