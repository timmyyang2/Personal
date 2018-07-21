package year2018;

import java.util.Scanner;

public class ReorderedPrimes {
	
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
	
	private static boolean flipPrime(int n) {
		String str = "";
         if(isPrime(n)) {
        	 str = Integer.toString(n);
        	 str = str.charAt(str.length()-1) + str.substring(1, str.length() - 1) + str.charAt(0);
         }
         int temp = Integer.parseInt(str);
         if(isPrime(temp)) {
        	 return true;
         }
         return false;
	}
	
	private static boolean checkDup(int n) {
		String str = Integer.toString(n);
		int count = 0;
		 for(int i=0;i<str.length();i++){
			 count = 0;
		     for(int j=0;j<str.length();j++) {
		    	 if(str.charAt(i)==str.charAt(j)) {
		    		 count++;
		    		 if(count==2) {
		    			 return false;
		    		 }
		    	 }
		     }
		 }
		return true;
	}
	
	private static void printPrime(){
		System.out.print("How many digits (2-7): ");
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		int n = 0;
		if(k==2) {
			k = 99;
			n = 10;
		}
		if(k==3) {
			k = 999;
			n = 100;
		}
		if(k==4) {
			k = 9999;
			n = 1000;
		}
		if(k==5) {
			k = 99999;
			n = 10000;
		}
		if(k==6) {
			k = 999999;
			n = 100000;
		}
		if(k==7) {
			k = 9999999;
			n = 1000000;
		}
		int count = 0;
		for(int i=n; i<=k; i++) {
			if(isPrime(i) && flipPrime(i) && checkDup(i)) {
				System.out.print(i + " ");
				count++;
			}else {
				continue;
			}
		}
		System.out.print(" Many= " + count);
	}

	public static void main (String[] args) {
		printPrime();
	}
}
