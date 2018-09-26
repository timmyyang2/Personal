import java.util.Scanner;

public class LeapYear { //PROJECT 3.2
	
	public static void leap() {
		int year;
		Scanner scan = new Scanner(System.in); //Scanner for user input
		System.out.print("Enter year to check if leap year: ");
		year = scan.nextInt(); //user inputs int
		if(year < 1582) {
			System.out.println("Only years over 1582 are valid.");
			System.exit(1);
		}else {
			boolean isLeapYear = false;
	        isLeapYear = (year % 4 == 0);
	        isLeapYear = isLeapYear && (year % 100 != 0);
	        isLeapYear = isLeapYear || (year % 400 == 0);

	        System.out.println("Is " + year + " a leap year? " + isLeapYear);
		}
	}
	public static void main(String[] args) {
		leap();
	}

}