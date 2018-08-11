package year2010;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ConsecutiveOrder {
	
	public static void consecutive() {
		ArrayList<Integer> array = new ArrayList<Integer>();
		System.out.print("Enter 5 cards (1-13)? ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String[] arr = input.split(" ");
		for(int i=0; i<5; i++) {
			int value = Integer.parseInt(arr[i]);
			if(value>13 || value<1) {
				System.out.println("Error input.");
				System.exit(1);
			}
			array.add(value);
		}
		Collections.sort(array);
		if(array.get(0)+1==array.get(1) && array.get(1)+1==array.get(2) 
				&& array.get(2)+1==array.get(3) && array.get(3)+1==array.get(4)) {
			System.out.println("Yes. Straight.");
		}else {
			System.out.println("No.");
		}
	}

	public static void main(String[] args) {
		consecutive();
	}
}
