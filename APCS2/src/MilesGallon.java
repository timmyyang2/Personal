import java.util.Scanner;

public class MilesGallon { //project 2.11
	
	public static void mpg(float a, float b, float c) {
		float averageMPG = (b-a)/c;
		System.out.println("The mpg is " + averageMPG + " miles per gallon");
	}
	
	public static void gasDistance() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter odometer start: ");
			float input = sc.nextFloat();
			System.out.print("Enter odometer end: ");
			float input2 = sc.nextFloat();
			System.out.print("Enter total gas used: ");
			float input3 = sc.nextFloat();
			mpg(input, input2, input3);
			}catch(Exception e) {
				System.out.println("Error.");
			}
	}
	
	public static void main(String[] args) {
		gasDistance();
	}

}
