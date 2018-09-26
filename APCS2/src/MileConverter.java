import java.util.Scanner;

public class MileConverter { //project 2.5

	public static void mile() {
		try {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number of miles to convert to kilometers: ");
		float input = sc.nextFloat();
		int convert = (int) (input * 1.60935);
		System.out.println("The conversion from miles to kilometers: " + convert);
		}catch(Exception e) {
			System.out.println("Error.");
		}
	}
	
	public static void main(String[] args) {
		mile();
	}
}
