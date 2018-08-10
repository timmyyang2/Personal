package year2010;

import java.util.ArrayList;
import java.util.Scanner;

public class RotateIntegers {
	
	public static void rotateInt() {
		System.out.print("How many integers? ");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		System.out.print("Input " + input + " integers?");
		Scanner scannerr = new Scanner(System.in);
		String number = scannerr.nextLine();
		System.out.println(number);
		int count = 1;
		for(int j=0; j<input-1; j++) {
			number = number + number.charAt(j);
			System.out.println(number.substring(count, number.length()));
			count++;
		}
	}

	public static void main(String[] args) {
		rotateInt();
	}
}
