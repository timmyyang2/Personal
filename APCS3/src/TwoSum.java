import java.util.Scanner;

public class TwoSum { //PROJECT 3.4
	
	public static void sum() {
		int num;
		Scanner scan = new Scanner(System.in); //Scanner for user input
		System.out.print("Enter an integer >= 2: ");
		num = scan.nextInt(); //user inputs int
		if(num < 2) {
			System.out.println("All values have to be greater than 2.");
			System.exit(1);
		}else {
		int count = 0;
		for(int i=2; i<num; i++) {
			if(i%2==0) {
				count = count + i;
			}
		}
		System.out.println("Sum: " + count);
		}
	}
	
	public static void main(String[] args) {
		sum();
	}

}
