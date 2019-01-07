package chapter8;

import java.util.Scanner;
import java.util.Random;

import java.util.Random;
import java.util.Scanner;

public class Blurb { //PROJECT 8.7
	//random numberber generator used by all functions
	public static Random r = new Random();
	  
	//method to print out blurb
	public static String Blurb() {
		String result = Whoozit();
		int number = r.nextInt(9) + 1;
		for(int i = 0; i < number; i++) {
			result += Whatzit();
		}
		return result;
	}

	public static String Whoozit() {
		String result = "x"; //sets result as x
		int number = r.nextInt(9);
		for(int i = 0; i < number; i++) {
			result += "y"; //loops through and adds y to result
		}
		return result;
	}

	public static String Whatzit() {
		String result = "q"; //sets result to q
		int number = r.nextInt(2);
		if(number == 0) { //if number is equal to 0
			result += "z"; //add z to result
		} else {
			result += "d"; //else add d to result
		}
		result += Whoozit(); //adds Whoozit to result
		return result;
	}

	//main method to test program
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many blurbs do you want?");
		int n = scan.nextInt();
		while(n > 0) {
			System.out.println(Blurb());
			n--;
		}
	}
}
