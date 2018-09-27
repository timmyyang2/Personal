import java.util.Scanner;

public class OddEvenZero { //PROJECT 3.6 NOT DONE
	
	public static void numberInput() {
		int odd = 0;
		int even = 0;
		int zero = 0;
		Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        String n = String.valueOf(num);
        for(int i=0; i<n.length(); i++) {
        	if(Integer.parseInt(n, i)==0) {
        		zero++;
        	}else {
        	if(Integer.parseInt(n, i)%2!=0) {
        		odd++;
        	}else {
        	if(Integer.parseInt(n, i)%2==0) {
        		even++;
        	}
        	}	
        	}
        }
        System.out.println("Odd: " + odd);
        System.out.println("Even: " + even);
        System.out.println("Zero: " + zero);
	}

	public static void main(String[] args) {
		numberInput();
	}
}
