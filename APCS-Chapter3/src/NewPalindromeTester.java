import java.util.Scanner; //imports package for user input

public class NewPalindromeTester { //PROJECT 3.11
	
	public static void main (String[] args) { //main method from listing 3.9
		String str, another = "y"; //defines string variable for str and another and initializes another as "y"
	    int left, right; //defines the left and right positions as integers
	    Scanner scan = new Scanner (System.in); //Scanner for user input
	    
	    while (another.equalsIgnoreCase("y")) { // allows y or Y 
	        System.out.println ("Enter a potential palindrome: "); //asks the user to enter a string
	        str = scan.nextLine(); //user inputs a string
	        
	        //////////// This is the only line that is added to the code of listing 3.9 ////////// 
	        str = processedString(str); //re-assigns the processed string to itself for evaluation
	        //////////////////////////////////////////////////////////////////////////////////////
	        
	        left = 0; //initializes left as 0
	        right = str.length() - 1; //initializes right of the input length-1
	        
	        while(str.charAt(left) == str.charAt(right) && left < right) { //if they are symmetrically equal
	        	left++; //increments left by 1
	        	right--; //decrements right by 1
	        }
	        
	        System.out.println(); //provides a new line
	        
	        if (left < right) { //check if left < right, not symmetrically equal
	            System.out.println ("That string is NOT a palindrome."); //prints NOT a palindrome
	        } else { //else symmetrically equal
	            System.out.println ("That string IS a palindrome."); //prints IS a palindrome
	        }

	        System.out.println(); //provides a new line
	        System.out.print ("Test another palindrome (y/n)? "); //asks user if they want to test another one
	        another = scan.nextLine(); //user inputs a new string
	    }
	}
	
	private static String processedString(String input) { //method to process the input string
		String processedInput = ""; //defines and initializes the processedInput String variable
		
		for(int i=0; i<input.length(); i++) { //loops through the original input string
			char c = input.charAt(i); //gets each char to evaluate
			if(c != ' '  &&  /*checks space to meet requirement 1*/
			   c != '.'  &&  /*checks common punctuation below to meet requirement 2*/
			   c != ','  &&  
			   c != ':'  &&
			   c != ';'  &&
			   c != '!'  &&
			   c != '?'  &&
			   c != '\'' &&
			   c != '\"') {
				processedInput += c; //appends the processed char to the processed input
			}
		}
		
		processedInput = processedInput.toLowerCase(); //converts the processed string to lower case to meeting requirement 3
		return processedInput; //returns the processed input so that space, punctuation and case will not be considered  
	}
}
