package year2010;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RotateIntegers {
	
	public static void rotateInt() {
		System.out.print("How many integers? ");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		System.out.print("Input " + input + " integers?");
		Scanner scannerr = new Scanner(System.in);
		String number = scannerr.nextLine();
		String[] arr = number.split(" ");
		ArrayList<String> array = new ArrayList<String>();
		System.out.println(number);
		for(int i=0; i<arr.length; i++) {
			array.add(arr[i]);
		}
		for(int i=0; i<arr.length-1; i++) {
			array.remove(array.get(0));
			array.add(arr[i]);
			for(int j=0; j<array.size(); j++) {
				System.out.print(array.get(j) + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		rotateInt();
	}
}
