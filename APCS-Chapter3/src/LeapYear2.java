import java.util.Scanner; //imports package for user input

public class LeapYear2 { //PROJECT 3.3
	private static boolean leap(int year) { //method to tell if leap year
		boolean isLeapYear = false; //initializes the leap year as false
        isLeapYear = (year % 4 == 0); //leap year must be divisible by 4
        isLeapYear = isLeapYear && (year % 100 != 0); //and leap year is not divisible by 100
        isLeapYear = isLeapYear || (year % 400 == 0); //unless it is divisible by 400
        
        return isLeapYear; //returns a boolean indicating if this is leap year
	}
	
	public static void printLeapYears() { //method to print years either leap or not leap
		while(true) {
			System.out.print("Enter one or more years separated by space (enter -1 to terminate): "); //asks user to enter one or more years
			Scanner scan = new Scanner(System.in); //Scanner for user input 
			String years = scan.nextLine(); //user inputs an integer
			if(years.trim().equals("-1")) { //sentinel value 
				break; //gets out of the loop
			}
			
			try { //try-catch to catch error inputs
				String[] yearArr = years.split(" "); //splits the input years with spaces
				
				for(int i=0; i<yearArr.length; i++) { //loops through the input year array 
					int year = Integer.valueOf(yearArr[i]); //converts String to integer
					if(year < 1582) { //year must be later than 1582
						System.out.println(year+": smaller than 1582, not valid."); //prints the message showing the invalid year input
					}else {
						boolean leapYear = leap(year); //calls leap method to see if this is a leap year
						if(leapYear) { //if leap year
							System.out.println(year+": leap year"); //prints leap year
						}else { //else
							System.out.println(year+": not leap year"); //prints not leap year
						}
					}
				}
			}catch(Exception e) { //catches exception
				System.out.println("Error."); //prints Error message
			}
		}
	}
	
	public static void main(String[] args) { //main method
		printLeapYears(); //runs leap method
	}
}
