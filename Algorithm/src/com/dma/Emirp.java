package com.dma;

public class Emirp {
	
	public static boolean isPrime(int number){
		  for (int i = 2; i < number; i++){
		    if (number%i == 0) {
		      return false;
		    }
		  }
		 
		  return true;
		  
		}
		public static int reverseNumber(int n) {
		  int savedN = n;
		  int reverse = 0; 
		  
		  while(savedN >0) {
		    
		   reverse = (reverse * 10) + savedN%10;
		   savedN = floor(savedN/10);
		  }
		  return reverse;
		}

		private static int floor(int i) {
			// TODO Auto-generated method stub
			return 0;
		}
		public static int nthEmirp(int n){
		  int guess = 9;
		  int found = -1;
		  while(found < n){
		    guess++;
		    if(isEmirp(guess)){
		      found++;
		    }


		    }
		   return guess;
		}
		public static boolean isEmirp(int prime){
		   if(isPrime(prime) == true && isPrime(reverseNumber(prime)) == true){
		   return true;
		   }
		   return false;
		 }
		     
		int nthPrime(int numberPrimes){
		  int foundN = 0;
		  int guesses= 2;
		  
		  while (foundN < numberPrimes) {
		    guesses++;

		    if (isPrime(guesses) == true) {
		      foundN = foundN + 1;
		    }
		   
		  }
		  
		  
		  return guesses;
		}
		
		public static void main(String[] args){
		System.out.println(nthEmirp(6));
		}
}
