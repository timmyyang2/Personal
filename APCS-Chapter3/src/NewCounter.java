
public class NewCounter { //PROJECT 3.8
	
	public static void main(String[] args) { //main method from the original listing 3.5
		final int LIMIT = 5; //defines limit number for printing as a constant
		int count = 0; //defines and initializes count as 0
		
		while(count < LIMIT) { //count is < LIMIT instead of <= LIMIT to avoid printing a number over LIMIT due to the increment occurs ahead
			count = count + 1; //increments the count by 1 before printing per requirement
			System.out.println(count); //prints the count
		}
		
		System.out.println("Done"); //prints Done and makes the output the same as listing 3.5
	}
}
