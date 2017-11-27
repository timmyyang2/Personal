package com.dma;

public class NthPrime {
	
	public static boolean isPrime(int n){
			if(n < 2){
			return false;
			  }
			if(n == 2){
			   return true;
			  }
			if(n % 2 == 0){
			   return false;
			  }
			 for(int i=2;i < n;i++){
			   if(n%i == 0){
			    return false;
			    }
			  }
			  return true;
			}

		int nthPrime(int n){
			int found = 0;
			int guess = 1;
			while(found < n){
			   guess++;
		if(isPrime(guess) == true){
			   found++;
			    }
			  }
			  return guess;
	}
	
	public static void main(String[] args){
		System.out.println(NthPrime.isPrime(5));
	}
}

