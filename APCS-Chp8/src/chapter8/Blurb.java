package chapter8;

import java.util.Scanner;
import java.util.Random;

import java.util.Random;
import java.util.Scanner;

public class Blurb { //PROJECT 8.7s
	//random numberber generator used by all functions
	public static Random r = new Random();
	  
	public static String Blurb() {
		String result = Whoozit(); //A Blurb is a Whoozit
		int number = r.nextInt(9) + 1;
		for(int i = 0; i < number; i++) {//followed by one or more Whatzits. 
			result += Whatzit();
		}
		return result;
	}

	public static String Whoozit() {
		String result = "x"; //A Whoozit is the character 'x' ...
		int number = r.nextInt(9);
		for(int i = 0; i < number; i++) {
			result += "y"; //followed by zero or more 'y's.
		}
		return result;
	}

	public static String Whatzit() {
		String result = "q"; //A Whatzit is a 'q'
		int number = r.nextInt(2);
		if(number == 0) {
			result += "z"; //followed by either a 'z' or a 'd',
		} else {//(number == 1)
			result += "d";
		}
		result += Whoozit(); //followed by a Whoozit.
		return result;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	  
		System.out.println("This program makes Blurbs.");
		System.out.println("How many blurbs do you want?");
		int n = scan.nextInt();
		while(n > 0) {
			System.out.println(Blurb());
			n--;
		}
	}
}
