import java.util.Scanner;

public class TwoNumberSumDiffProd { //project 2.3
	
	public static void sum(float n, float k) {
		float sum = n + k;
		System.out.println("The sum: " + sum);
	}
	
	public static void diff(float n, float k) {
		float diff1 = n - k;
		float diff2 = k - n;
		System.out.println("The difference (first number - second number): " + diff1);
		System.out.println("The difference (second number - first number): " + diff2);
	}
	
	public static void product(float n, float k) {
		float prod = n*k;
		System.out.println("The product: " + prod);
	}

	public static void enterNumbers() {
		Scanner sc = new Scanner(System.in);
		try { 
		System.out.print("Enter first number (int or decimal): ");
		float input = sc.nextFloat();
		System.out.print("Enter second number (int or decimal): ");
		float input2 = sc.nextFloat();
		sum(input, input2);
		diff(input, input2);
		product(input, input2);
		}catch(Exception e) {
			System.out.println("Error.");
		}
	}
	
	public static void main(String[] args) {
		enterNumbers();
	}
}
