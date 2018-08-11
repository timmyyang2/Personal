package year2010;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class NameNumber {
	
	public static void name() {
		ArrayList<String> array = new ArrayList<String>();
		Random rand = new Random();
		System.out.print("How many names? ");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		for(int i=0; i<input; i++) {
		System.out.print("Enter name? ");
		Scanner scannerr = new Scanner(System.in);
		String number = scannerr.nextLine();
		array.add(number);
		}
		System.out.print("Enter size of random group? ");
		Scanner scannerrr = new Scanner(System.in);
		int inputt = scanner.nextInt();
		for(int j=0; j<inputt; j++) {
			String random = array.get(rand.nextInt(array.size()));
			System.out.print(random + " ");
		}
	}
	
	public static void main(String[] args) {
		name();
	}

}
