import java.text.NumberFormat; //imports NumberFormat for currency format
import java.util.Scanner; //imports Scanner for userInput

public class Currency { //PROJECT 2.12
	
	public static void currConverter(int a, int b, int c, int d) { //method to calculate the values of the coins with 4 parameters
		int quart = a*25; //quarter calculation
		int dime = b*10; //dime calculation
		int nick = c*5; //nickel calculation
		int totPennies = quart + dime + nick + d; //total values in pennies
		double total =  totPennies/100.0; //finding dollar value
		NumberFormat money = NumberFormat.getCurrencyInstance(); //currency formatter to change to currency form
		System.out.println(money.format(total)); //prints out dollars and cents in currency form
	}
	
	public static void enterCurr() { //user input method
		try { //try-catch to check for error inputs
			Scanner sc = new Scanner(System.in); //scanner for user input
			System.out.print("Enter number of quarters: "); //asks user for number of quarters
			int input = sc.nextInt(); //user inputs int to answer previous question
			System.out.print("Enter number of dimes: "); //asks user for number of dimes
			int input2 = sc.nextInt(); //user inputs int to answer previous question
			System.out.print("Enter number of nickels: "); //asks user for number of nickels
			int input3 = sc.nextInt(); //user inputs int to answer previous question
			System.out.print("Enter number of pennies: "); //asks user for number of pennies
			int input4 = sc.nextInt(); //user inputs int to answer previous question
			currConverter(input, input2, input3, input4); //calls currConverter method with user input as parameters
		}catch(Exception e) { //catches error inputs
			System.out.println("Error."); //error message
		}
	}

	public static void main(String[] args) { //main method
		enterCurr(); //runs enterCurr method
	}
}
