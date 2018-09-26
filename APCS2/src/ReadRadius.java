import java.util.Scanner;

public class ReadRadius { //project 2.9
	
	public static void radCalc(int r) {
		double volume = (4.0/3) * Math.PI * Math.pow(r, 3);
		double surfArea = 4 * Math.PI * Math.pow(r, 2);
		System.out.print("Volume = ");
		System.out.printf("%.4f", volume);
		System.out.println();
		System.out.print("Surface Area = ");
		System.out.printf("%.4f", surfArea);
	}
	
	public static void radius() {
		try {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius: ");
		int input = sc.nextInt();
		radCalc(input);
		}catch(Exception e) {
			System.out.println("Error.");
		}
	}
	
	public static void main(String[] args) {
		radius();
	}

}
