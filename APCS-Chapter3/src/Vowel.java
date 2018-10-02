import java.util.Scanner; //imports package for user input

public class Vowel { //PROJECT 3.13
	
	public static void printVowels() { //method to print number of vowels etc
		int a = 0;	//defines count for vowel a and initializes it as 0
		int e = 0; //defines count for vowel e and initializes it as 0
		int i = 0; //defines count for vowel i and initializes it as 0
		int o = 0; //defines count for vowel o and initializes it as 0
		int u = 0; //defines count for vowel u and initializes it as 0
		int con = 0; //defines count for consonant and initializes it as 0
		int spa = 0; //defines count for space and initializes it as 0
		int pun = 0; //defines count for punctuation and initializes it as 0
		
		Scanner scan = new Scanner(System.in); //Scanner for user input
		System.out.print("Enter string: "); //asks the user to input a string
		String text = scan.nextLine(); //user inputs a string
		
		for (int j = 0; j < text.length(); j++) { //loops through the input text
			char c = text.charAt(j); //gets char for each index
			
			if (c=='a'){ //checks a
			    a++; //increments by 1 if it matches
			}else if (c=='e'){ //checks e
			    e++; //increments by 1 if it matches
			}else if (c=='i'){ //checks i
			    i++; //increments by 1 if it matches
			}else if (c=='o'){ //checks o
			    o++; //increments by 1 if it matches
			}else if (c=='u'){ //checks u
				u++; //increments by 1 if it matches
			}else if (Character.isLetter(c) && c!='a' && c!='e' && c!='i' && c!='o' && c!='u'){ //checks letters for consonants
				con++; //increments by 1 if it matches
			}else if (c==' '){ //checks space 
				spa++; //increments by 1 if it matches
			}else if (c=='.' || c==',' || c==':' || c==';' || c=='!' || c=='?' || c=='\'' || c=='\"'){ //check common punctuation
				pun++; //increments by 1 if it matches
			}else{ //does nothing
			} 
		}
		  System.out.println("a: " + a + "\n" +
				    "e: " + e + "\n" +
				    "i: " + i + "\n" +
				    "o: " + o + "\n" +
				    "u: " + u + "\n" +
				    "consonants: " + con + "\n" +
				    "spaces: " + spa + "\n" +
				    "punctuation marks: " + pun + "\n"); //prints out all the counts

	}
	
    public static void main(String args []){ //main method
    	printVowels(); //runs printVowel method
    }       
}