package chapter6; //package name

import java.util.Scanner; //import Scanner for user input

public class ReadIntegers { //PROJECT 6.1

   public static void main(String [] args) { //main method
	  int [] numbers = new int[51]; //new int array with length of 50
      Scanner scan = new Scanner(System.in); //Scanner for user input
      System.out.println("Enter integers 0 to 50 (enter a number greater than 50 or less than 0 to finish): "); //asks the user to enter a number between 0 and 50
      int input = scan.nextInt(); //user input
      while(input >= 0 && input <= 50) { //while user input is in between 0 and 50 inclusive
         numbers[input]++; //increment numbers
         input = scan.nextInt(); //user input
      }
      
      System.out.println("Number\tTimes"); //prints number and times
      for(int i = 0; i <= 50; i++) { //for loop from 0 to 50
         if(numbers[i] >= 1) { //if numbers is greater than 1
            System.out.println (i + "\t" + numbers[i]); //print out the number and number of times it occurs
         }
      }
   }

}
