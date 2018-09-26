import java.text.NumberFormat;
import java.util.Scanner;

public class Currency { //project 2.12
	
	public static void currConverter(int a, int b, int c, int d) {
		int quart = a*25;
		int dime = b*10;
		int nick = c*5;
		int totPennies = quart + dime + nick + d;
		int dollars = totPennies/100;
		double cents = (totPennies%100.00)/100.00;
		double total = dollars + cents;
		NumberFormat money = NumberFormat.getCurrencyInstance();
		System.out.println(money.format(total));
	}
	
	public static void enterCurr() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter number of quarters: ");
			int input = sc.nextInt();
			System.out.print("Enter number of dimes: ");
			int input2 = sc.nextInt();
			System.out.print("Enter number of nickels: ");
			int input3 = sc.nextInt();
			System.out.print("Enter number of pennies: ");
			int input4 = sc.nextInt();
			currConverter(input, input2, input3, input4);
			}catch(Exception e) {
				System.out.println("Error.");
			}
	}

	public static void main(String[] args) {
		enterCurr();
	}
}
