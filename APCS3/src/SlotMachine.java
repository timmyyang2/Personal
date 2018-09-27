import java.util.Scanner;

public class SlotMachine { //PROJECT 3.15
	
	public static void number() {
		Scanner scan = new Scanner(System.in); //Scanner for user input
		int value = 0;
		int q = 0;
		int w = 0;
		int e = 0;
		boolean stop = false;
		while(stop == false) {
			q = (int) (Math.random()*10);
			w = (int) (Math.random()*10);
			e = (int) (Math.random()*10);
			System.out.println(q + " " + w + " " + e);
			if(q==w && w==e) {
				System.out.println("All numbers are the same.");
			}else if(q==w && w!=e || w==e && e!=q || q==e && e!= w) {
				System.out.println("Two numbers are the same.");

			}
			System.out.println("Press 1 to stop or 2 to keep going: ");
			value = scan.nextInt(); //user inputs int
			if(value == 1) {
				stop = true;
			}else {
				continue;
			}
		}
	}

	public static void main(String[] args) {
		number();
	}
}
