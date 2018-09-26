import java.util.Scanner;

public class ThreeNumberAverage { //project 2.2
	
	public static void threeNumbers() {
		try {
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter first number (int or decimal): ");
		float input = sc.nextFloat();
		System.out.print("Enter second number (int or decimal): ");
		float input2 = sc.nextFloat();
		System.out.print("Enter third number (int or decimal): ");
		float input3 = sc.nextFloat();
		float average = (input + input2 + input3)/3;
		System.out.println("The average of your three numbers are " + average + ".");
		}catch(Exception e) {
			System.out.println("Error.");
		}
	}

	public static void main(String[] args) {
		threeNumbers();
		
	}
}
