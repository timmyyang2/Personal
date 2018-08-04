package year2011;

import java.util.Scanner;

public class EraseBlanks {

	public static void spaces() {
		System.out.print("Enter sentence? ");
		Scanner scanner = new Scanner(System.in);
		String userInput = scanner.nextLine();
		System.out.println(userInput.replaceAll("\\s+", " "));
	}
	
	public static void main(String[] args) {
		spaces();
	}
}
