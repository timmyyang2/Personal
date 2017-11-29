package com.dma;

public class Fibonacci {
	
	public static int fibonacci(int counter){

		  if(counter==0){
		    return 0;
		  }
		  else if(counter == 1){
		    return 1;
		  }
		  else{
		    return fibonacci(counter-1) + fibonacci(counter-2);
		  }
		}

		public static void main(String[] args){
			System.out.println("Starting ...");
			for(int i=0; i<=40; i++) { 
				System.out.println(i+": "+fibonacci(i));
			}
			System.out.println("Finished.");
		}

}
