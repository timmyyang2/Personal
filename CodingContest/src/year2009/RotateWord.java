package year2009;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RotateWord {
	
	public static void rotateStr() {
		System.out.print("Enter word? ");
		Scanner scannerr = new Scanner(System.in);
		String word = scannerr.nextLine();
		ArrayList<Character> array = new ArrayList<Character>();
		for(int i=0; i<word.length(); i++) {
			System.out.print(word.charAt(i) + " ");
		}
		System.out.println();
		for(int i=0; i<word.length(); i++) {
			array.add(word.charAt(i));
		}
		for(int i=0; i<word.length()-1; i++) {
			array.remove(array.get(0));
			array.add(word.charAt(i));
			for(int j=0; j<array.size(); j++) {
				System.out.print(array.get(j) + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		rotateStr();
	}
}
