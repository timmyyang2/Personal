import java.util.Scanner;

public class TriangleArea { //project 2.10
	
	public static void triangle(float a, float b, float c) {
		float s = (a+b+c)/2 + (a+b+c)%2;
		float area = (float) Math.sqrt(s * (s-a) * (s-b) * (s-c));
		System.out.println("Area = " + area);
	}
	
	public static void triLengths() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter side length a: ");
			float input = sc.nextFloat();
			System.out.print("Enter side length b: ");
			float input2 = sc.nextFloat();
			System.out.print("Enter side length c: ");
			float input3 = sc.nextFloat();
			triangle(input, input2, input3);
			}catch(Exception e) {
				System.out.println("Error.");
			}
	}
	
	public static void main(String[] args) {
		triLengths();
	}

}
