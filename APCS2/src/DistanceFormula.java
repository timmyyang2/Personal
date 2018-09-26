import java.util.Scanner;

public class DistanceFormula { //project 2.8
	
	public static void distance(float x, float y, float x2, float y2) {
		double dist = Math.sqrt((x-x2)*(x-x2) + (y-y2)*(y-y2));
		System.out.println("Distance: " + dist);
	}
	
	public static void coordinates() {
		try {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first x coordinate: ");
		float input = sc.nextFloat();
		System.out.print("Enter first y coordinate: ");
		float input2 = sc.nextFloat();
		System.out.print("Enter second x coordinate: ");
		float input3 = sc.nextFloat();
		System.out.print("Enter second y coordinate: ");
		float input4 = sc.nextFloat();
		distance(input, input2, input3, input4);
		}catch(Exception e) {
			System.out.println("Error.");
		}
	}
	
	public static void main(String[] args) {
		coordinates();
	}

}
