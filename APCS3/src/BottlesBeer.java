import java.util.Scanner;

public class BottlesBeer { //PROJECT 3.9
	
	public static void printBeer() {
		for(int i=100; i>=98; i--) {
		System.out.println(i + " bottles of beer on the wall");
		System.out.println(i + " bottles of beer");
		System.out.println("If one of those bottles should happen to fall");
		System.out.println(i-1 + " bottles of beer on the wall");
		}
	}

	public static void main(String[] args) {
		printBeer();
	}
}
