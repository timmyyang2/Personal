import java.util.Scanner; //imports package for user input

public class TwoSum { //PROJECT 3.4
	
	public static void sumUp() { //method to sum up all the even numbers
		Scanner scan = new Scanner(System.in); //Scanner for user input
		System.out.print("Enter an integer >= 2: "); //asks the user to input a number >= 2
		int num = scan.nextInt(); //user inputs an integer
		if(num < 2) { //if the number is smaller than 2
			System.out.println("All values have to be greater than 2."); //then prompts the user the input error
			System.exit(1); //exits the program
		}else { //else sums up all the even numbers, inclusive
			int sum = 0; //defines and initializes the sum variable as 0
			for(int i=2; i<=num; i++) { //loops through all the numbers between 2 and input, inclusive
				if(i%2 == 0) { //if even number
					sum = sum + i; //adds to the sum variable
				}
			}
			System.out.println("Sum: " + sum); //prints out the result of sum
		}
	}
	
	public static void main(String[] args) { //main method
		sumUp(); //runs sumUp method
	}
}