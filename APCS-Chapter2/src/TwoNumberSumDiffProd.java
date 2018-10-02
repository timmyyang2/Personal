import java.util.Scanner; //imports Scanner for user input

public class TwoNumberSumDiffProd { //PROJECT 2.3
	
	public static void sum(float n, float k) { //method for finding sum with 2 parameters
		float sum = n + k; //adds up n and k
		System.out.println("The sum: " + sum); //prints out sum
	}
	
	public static void diff(float n, float k) { //method for finding difference with 2 parameters
		float diff1 = n - k; //first num - second num
		float diff2 = k - n; //second num - first num
		System.out.println("The difference (first number - second number): " + diff1); //prints out first result
		System.out.println("The difference (second number - first number): " + diff2); //prints out second result
	}
	
	public static void product(float n, float k) { //method for finding product with 2 parameters
		float prod = n*k; //finds product by multiplying n and k
		System.out.println("The product: " + prod); //prints out product
	}

	public static void enterNumbers() { //method asking user for number inputs
		Scanner sc = new Scanner(System.in); //Scanner for user input
		try { //try-catch to check for error inputs
			System.out.print("Enter first number (int or decimal): "); //asks user for first number
			float input = sc.nextFloat(); //user inputs float to answer previous question
			System.out.print("Enter second number (int or decimal): "); //asks user for second number
			float input2 = sc.nextFloat(); //user inputs float to answer previous question
			sum(input, input2); //calls sum method with user inputs as parameters
			diff(input, input2); //calls diff method with user inputs as parameters
			product(input, input2); //calls product method with user inputs as parameters
		}catch(Exception e) { //catches error inputs
			System.out.println("Error."); //error message
		}
	}
	
	public static void main(String[] args) { //main method
		enterNumbers(); //runs enterNUmbers method
	}
}
