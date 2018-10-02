import java.util.Scanner; //imports package for user input

public class BottlesBeer { //PROJECT 3.9
	
	public static void printBeer() { //method to print out the beer verses
		int verseCount = 0; //defines and initializes verseCount variable
		
		while(verseCount < 1) { //checks the input to make sure it is greater than 0
			try { //try-catch to catch error inputs
				System.out.print("Enter a positive verse count: "); //asks user to enter a positive integer
				Scanner scan = new Scanner(System.in); //Scanner for user input
				verseCount = scan.nextInt(); //user inputs an integer;
			}catch(Exception e) { //catches Exception
				System.out.println("Error."); //prints Error message
			}
		}
		
		for(int i=verseCount; i>=1; i--) { //loops through the verse count decremented by 1 to generate all verses
			System.out.println(i + " bottles of beer on the wall"); //prints the first line
			System.out.println(i + " bottles of beer"); //prints the second line
			System.out.println("If one of those bottles should happen to fall"); //prints the third line
			System.out.println(i-1 + " bottles of beer on the wall"); //prints the fourth line
		}
	}

	public static void main(String[] args) { //main method
		printBeer(); //runs printBeer method
	}
}