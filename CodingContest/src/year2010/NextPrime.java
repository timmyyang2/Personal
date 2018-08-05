package year2010;

import java.util.Scanner;

public class NextPrime {

	private static boolean isPrime(int n){
		if(n < 2 || n % 2 == 0){
			return false;
		}else{
			for(int i=2; i<n; i++){
				if(n % i == 0){
					return false;
				}
			}
		}
		return true;
	}
	
	public static void nextNum() {
		System.out.print("Enter a positive integer?: ");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		for(int i=input; i<99999999; i++) {
			if(isPrime(i)) {
				System.out.println(i);
				break;
			}else {
				continue;
			}
		}
	}
	
	public static void main(String[] args) {
		nextNum();
	}
}
