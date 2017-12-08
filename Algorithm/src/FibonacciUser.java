import java.util.Scanner; //import Scanner package to allow user input
import java.util.InputMismatchException; //import Random package for generating random numbers

public class FibonacciUser { //class
    
	static long start = 0; //defines a start count for the fibonacci sequence
    
    public static long fibRecursive(long count) { //method taking the count as an input
        if (count == start-1 || count == start) {
            return count; //for the first two numbers, return count
        }else {
            return fibRecursive(count-1) + fibRecursive(count-2); //recursively calls this method to calculate the value
        }
    }
    
    public static long fibIterative(long count) { //method taking the count as an input
        if (count == 0) { // special processing for 0, 1 and 2
            return 0;
        }else if (count == 1 || count == 2) {
            return 1;
        }

        long sum = start;
        long prev = start - 1;
        long curr = start;

        for (long i = start; i < count; i++) { // iteration that makes the sum of the previous two numbers
            sum = prev + curr;
            prev = curr;
            curr = sum;
        }

        return sum;
    }
    
    public static void runFibRecursive() {
    	Scanner user_input = new Scanner(System.in); //creates a new instance of the Scanner class to take the user input
    	while(start <= 0) { //makes sure the user input is a positive number
    		System.out.print("Please enter a starting number: ");
    		try { //try doing this...
    			start = user_input.nextLong(); //gets the number from the user input
    		}catch(InputMismatchException e) { //if you catch faulty input, do this...
               user_input = new Scanner(System.in); //creates a new instance of the Scanner class so that the program can keep going
    		}
        }
        long count = start; //count starts from the user input
        long value = fibRecursive(count); //calls the recursive method to get the fibonacci value in the sequence
        while(value < 999999999999999999L) { //if the value has less than 18 digits, keep going
         	value = fibRecursive(count); //reassigns fibonacci result to value
         	System.out.println(count + ": " + value); //prints out the value
            count++; //increments count by 1
        }
        System.out.println("Program is done with recursion."); //prints out the program ending message
    }
    
    public static void runFibIterative() {
    	Scanner user_input = new Scanner(System.in); //creates a new instance of the Scanner class to take the user input
    	while(start <= 0) { //makes sure the user input is a positive number
    		System.out.print("Please enter a positive starting number: ");
    		try { //try doing this...
    			start = user_input.nextLong(); //gets the number from the user input
    		}catch(InputMismatchException e) { //if you catch faulty input, do this...
               user_input = new Scanner(System.in); //creates a new instance of the Scanner class so that the program can keep going
    		}
        }
        long count = start; //count starts from the user input
        long value = fibIterative(count); //calls the iterative method to get the fibonacci value in the sequence
        while(value < 999999999999999999L) { //if the value has less than 18 digits, keep going
         	value = fibIterative(count); //reassigns fibonacci result to value
         	System.out.println(count + ": " + value); //prints out the value
            count++; //increments count by 1
        }
        System.out.println("Program is done with iteration.\n"); //prints out the program ending message
    }
    
    
    public static void main(String[] args) { //main method
    	FibonacciUser.runFibIterative();  //calls the runFibIterative method to run the program (very fast)
    	FibonacciUser.runFibRecursive();  //calls the runFibRecursive method to run the program (a lot slower)
    }
}
