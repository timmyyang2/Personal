import java.util.Scanner;

public class StringChar { //PROJECT 3.5
	
	public static void printChar() {
		Scanner sc = new Scanner(System.in);
        String word;
        System.out.print("Enter a word to be converted to chars: ");
        word = sc.nextLine();
        for(int i=0; i<word.length(); i++) {
        	System.out.println(word.charAt(i));
        }
	}

	public static void main(String[] args) {
		printChar();
	}
}
