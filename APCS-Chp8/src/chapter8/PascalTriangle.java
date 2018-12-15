package chapter8;

import java.util.Scanner;

public class PascalTriangle {

	//method that loops through twice and prints Pascal's triangle
	public static void print(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				if(i==n-1) {
				System.out.print(pascal(i, j) + " ");
				}
			}
		}
	}

	//method to find Pascal's triangle
	public static int pascal(int i, int j) {
		if (j == 0) {
			return 1;
		} else if (j == i) {
			return 1;
		} else {
			return pascal(i - 1, j - 1) + pascal(i - 1, j); //recursively calls method
		}
	}

	//main method to test program
   	public static void main(String[] args) {
   		Scanner scanner = new Scanner(System.in);
   		System.out.print("Enter the row number that you want printed: ");
   		int row = scanner.nextInt();
   		print(row);
   	}
}