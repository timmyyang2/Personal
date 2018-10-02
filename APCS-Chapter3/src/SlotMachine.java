import java.util.Scanner; //imports package for user input

public class SlotMachine { //PROJECT 3.15
	
	public static void number() { //method to show random numbers
		Scanner scan = new Scanner(System.in); //Scanner for user input 
		int first = 0; //defines and initializes the variable for the first number
		int second = 0; //defines and initializes the variable for the first number
		int third = 0; //defines and initializes the variable for the first number
		
		while(true) { //keep running
			first = (int) (Math.random()*10); //randomly generates a number between 0 and 9, and assigns it to the first one
			second = (int) (Math.random()*10); //randomly generates a number between 0 and 9, and assigns it to the second one
			third = (int) (Math.random()*10); //randomly generates a number between 0 and 9, and assigns it to the third one
			System.out.println(first + " " + second + " " + third); //prints out the three numbers
			
			if(first == second && second == third) { //if all three are equal
				System.out.println("All numbers are the same."); //prints out they are the same
			}else if(first == second && first != third  || 
					 first == third  && first != second || 
					 second == third && second != first) { //if any two of them are equal
				System.out.println("Two numbers are the same."); //prints out two of them are the same
			}
			
			System.out.println("Press 1 to stop or 2 to keep going: "); //ask user whether they want to keep going
			int value = scan.nextInt(); //user inputs an integer 
			if(value == 1) { //if user inputs 1
				return; //then program exits
			}
		}
	}

	public static void main(String[] args) { //main method
		number(); //runs number method
	}
}