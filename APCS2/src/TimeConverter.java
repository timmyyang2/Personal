import java.util.Scanner;

public class TimeConverter { //project 2.7
	
	public static void timeConversions(int n) {
		int hours = n/60/60;
		int minutes = (n/60)%60;
		int seconds = n%60;
		System.out.println(n + " seconds is equal to " + hours + " hours, " + minutes + " minutes, and " 
		+ seconds + " seconds.");
	}
	
	public static void timeEnter() {
		try {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of seconds: ");
		int input = sc.nextInt();
		timeConversions(input);
		}catch(Exception e) {
			System.out.println("Error.");
		} 
	}

	public static void main(String[] args) {
		timeEnter();
	}
}
