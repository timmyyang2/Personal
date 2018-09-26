import java.util.Scanner;

public class SecondsConverter { //project 2.6
	
	public static void timeConversions(int n, int k, int j) {
		int hour = n*60*60;
		int min = k*60;
		int total = hour + min + j;
		System.out.println("Total number of seconds: " + total);
		
	}
	
	public static void timeEnter() {
		try {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter hours: ");
		int input = sc.nextInt();
		System.out.print("Enter minutes: ");
		int input2 = sc.nextInt();
		System.out.print("Enter seconds: ");
		int input3 = sc.nextInt();
		timeConversions(input, input2, input3);
		}catch(Exception e) {
			System.out.println("Error.");
		}
	}

	public static void main(String[] args) {
		timeEnter();
	}
}
