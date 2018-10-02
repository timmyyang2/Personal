import java.util.Scanner; //imports package for user input

public class LeapYear { //PROJECT 3.2
	
	public static void leap() { //method to show if leap year
		try { //try-catch to catch error inputs
			Scanner scan = new Scanner(System.in); //Scanner for user input
			System.out.print("Enter year to check if leap year: "); //asks user to enter a year
			int year = scan.nextInt(); //user inputs an integer
			if(year < 1582) { //year must be later than 1582
				System.out.println("Only years over 1582 are valid."); //prints the message showing the invalid year input
				System.exit(1); //program exits
			}else {
				boolean isLeapYear = false; //initializes the leap year as false
		        isLeapYear = (year % 4 == 0); //leap year must be divisible by 4
		        isLeapYear = isLeapYear && (year % 100 != 0); //and leap year is not divisible by 100
		        isLeapYear = isLeapYear || (year % 400 == 0); //unless it is divisible by 400
	
		        System.out.println("Is " + year + " a leap year? " + isLeapYear); //prints if a year is leap year
			}
		}catch(Exception e) { //catches exception
			System.out.println("Error."); //prints Error message
		}
	}
	
	public static void main(String[] args) { //main method
		leap(); //runs leap method
	}
}