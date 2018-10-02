import java.util.Scanner; //imports package for user input

public class OddEvenZero { //PROJECT 3.6
	
	public static void numberInput() { //method to process integer input
		int odd = 0; //defines and initializes odd count as 0
		int even = 0; //defines and initializes even count as 0
		int zero = 0; //defines and initializes digit 0 count as 0
		Scanner sc = new Scanner(System.in); //Scanner for user input
       
        System.out.print("Enter a number: "); //asks user to enter a number
        int num = sc.nextInt(); //user inputs an integer
        String n = Integer.toString(num); //converts the input integer to a string 
        for(int i=0; i<n.length(); i++) { //loops through the converted string
        	if(n.charAt(i) == '0') { //if the digit is 0
        		zero++; //increments zero by 1
        	}
        	
        	if((i+1) % 2 == 0){ //if the index+1 (since index starts from 0) is divisible by 2
        		even++; //increments even by 1
        	}else { //otherwise
        		odd++; //increments odd by 1
        	}
        }
        System.out.println("Odd: " + odd); //prints out odd count
        System.out.println("Even: " + even); //prints out even count
        System.out.println("Zero: " + zero); //prints out zero count
	}

	public static void main(String[] args) { //main method
		numberInput(); //runs numberInput method
	}
}