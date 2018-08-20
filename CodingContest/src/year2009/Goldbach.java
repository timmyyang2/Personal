package year2009;

import java.util.Scanner;

public class Goldbach {
	
	private static boolean isPrime(int n){
		if(n==2) {
			return true;
		}
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
	
	public static void plusPrime() {
		int sum = 0;
		System.out.print("Enter number? ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		for(int i=0; i<num; i++) {
			for(int j=i+1; j<num; j++) {
				if(isPrime(i) && isPrime(j)) {
				sum = i+j;
				if(num == sum) {
					System.out.println(num + " = " + i + " + " + j);
				}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		plusPrime();
	}

}
