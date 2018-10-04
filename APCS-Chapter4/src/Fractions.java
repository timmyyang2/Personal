import java.util.Scanner;

public class Fractions { //PROJECT 4.7 (DRAFT NOT DONE YET)
	
	public static void add(String array, String array2, String array3, String array4) {
		
	}
	public static void sub(String array, String array2, String array3, String array4) {
			
	}
	public static void mult(String array, String array2, String array3, String array4) {
		int numMult = Integer.parseInt(array) * Integer.parseInt(array3);
		int denMult = Integer.parseInt(array2) * Integer.parseInt(array4);
		System.out.println("Multiplication: " + numMult + "/" + denMult);
	}
	public static void divide(String array, String array2, String array3, String array4) {
		int numDiv = Integer.parseInt(array) * Integer.parseInt(array4);
		int denDiv = Integer.parseInt(array2) * Integer.parseInt(array3);
		System.out.println("Multiplication: " + numDiv + "/" + denDiv);
	}

	public static void enterFractions() {
		Scanner sc = new Scanner(System.in); //Scanner for user input
		System.out.print("Enter a fraction in this format (x/y): "); //asks user to enter a number of sides
		String num = sc.nextLine(); //user input will be an integer
		String[] array = num.split("/");
		System.out.print("Enter a second fraction in this format (x/y): "); //asks user to enter a number of sides
		String num1 = sc.nextLine(); //user input will be an integer
		String[] array1 = num1.split("/");
		add(array[0], array[1], array1[0], array1[1]);
		sub(array[0], array[1], array1[0], array1[1]);
		mult(array[0], array[1], array1[0], array1[1]);
		divide(array[0], array[1], array1[0], array1[1]);
	}
	
	public static void main(String[] args) {
		enterFractions();
	}
}
