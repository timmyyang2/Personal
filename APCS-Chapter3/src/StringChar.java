import java.util.Scanner; //imports package for user input

public class StringChar { //PROJECT 3.5
	
	public static void printChar() { //method to print char one per line
		Scanner sc = new Scanner(System.in); //Scanner for user input
        System.out.print("Enter a word to be converted to chars: "); //asks user to enter a word
        String word = sc.nextLine(); //user inputs a String
        for(int i=0; i<word.length(); i++) { //loops through the word 
        	System.out.println(word.charAt(i)); //prints out the char at each index
        }
	}

	public static void main(String[] args) { //main method
		printChar(); //runs printChar method
	}
}