import java.util.Scanner; //import scanner package to allow user input

public class DateChecker {
	
	public static void dateChecker() { //dateChecker method to check if dates are valid
		System.out.print("Check to see if your date is valid in 2018: ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		boolean validDate = false; //boolean variable for evaluating the validInputs method
		
		validDate = validInputs(input.split(" ")) || //these three lines checks to see if input using split is true or false
				    validInputs(input.split("/")) || 
				    validInputs(input.split("-"));
		if(validDate) { //if validDate is true then the date is valid
			System.out.println("Your date is valid in 2018.");
		}else { //if validDate is false then the date is NOT valid
			System.out.println("Your date is NOT valid in 2018.");
		}
	}

	private static boolean validInputs(String[] inputs) { //validInputs method with an array parameter called inputs
		if(inputs.length != 3) { //checks if inputs length is not 3 because a date would have 3 (month, day, year)
			return false; //if the length is not three then return false
		}
		
		String month = inputs[0]; //initialize String month
		String day = inputs[1]; //initialize String day
		String year = inputs[2]; //initialize String year
		
		if(!year.equals("18") && !year.equals("2018")) { //checks if year is valid
			return false; //if year is not valid return false
		}
		
		try { //try catch to evaluate invalid inputs
			int monthVal = Integer.valueOf(month); //initializes int monthVal which takes the numeric value of String month
			if(monthVal > 12 || monthVal < 1) { //checks invalid month inputs
				return false;
			}
			
			int dayVal = Integer.valueOf(day); //initializes int dayVal which takes the numeric value of String day
			if(dayVal > 31 || dayVal < 1) { //checks invalid day inputs
				return false;
			}
			
			if(monthVal == 4 || monthVal == 6 || monthVal == 9 || monthVal == 11) { //checks months with 30 days
				if(dayVal == 31) { //checks invalid day value for the months 4, 6, 9, and 11
					return false;
				}
			}
			
			if(monthVal == 2 && dayVal > 28) { //checks month and day for February
				return false;
			}
		}catch(Exception e) { //catches invalid inputs
			return false; //returns false if there is exception
		}
		return true; //return true if everything is satisfied
	}
	
	public static void main(String[] args) { //main method
		dateChecker(); //runs dateChecker method
	}
}
