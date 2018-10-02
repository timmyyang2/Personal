
public class MultiplicationTable { //PROJECT 3.7
	
	public static void timesTable() { //method to show times table
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}; //number array that holds 1 to 12
		
		System.out.print("\t"); //first line starting with a tab
		for(int i=0; i<numbers.length; i++) { //prints out all 12 numbers 
			System.out.print(numbers[i]+"\t"); //in one line separated by tabs
		}
		System.out.println(); //change a new line
		
		for(int i=0; i<numbers.length; i++) { //loops through all numbers 
			System.out.println(numbers[i] + paddingSpace(i) + numbers[i]*numbers[i]); //multiplies by themselves and prints them in one line
		}
	}

	private static String paddingSpace(int count) { // method to get the corresponding number of spaces for padding
		String spaces = "\t"; //starts from tab
		for(int i=0; i<count; i++) { //loops through the count 
			spaces += "\t"; //keeps adding tabs
		}
		return spaces; //return the padding space
	}
	
	public static void main(String[] args) { //main method
		timesTable(); //runs timeTable method
	}
}
