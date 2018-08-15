package year2008;

import java.util.ArrayList;
import java.util.Scanner;

public class WordRow {

	public static void printWord() {
		System.out.print("Enter word? ");
		Scanner scanner = new Scanner(System.in);
		String userInput = scanner.nextLine();
		int count = 1;
		for(int i=0; i<count; i++) {
			System.out.println(userInput.charAt(i));
			count++;
		}
	}
	public static void main(String[] args) {
		printWord();
	}
}
