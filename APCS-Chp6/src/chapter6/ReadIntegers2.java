package chapter6; //package name

import java.util.Scanner; //import Scanner for user input

public class ReadIntegers2 { //PROJECT 6.2

	public static void main(String [] args) { //main method
      int [] numbers = new int[51]; //new int array with length of 50
      Scanner scan = new Scanner(System.in); //Scanner for user input
      System.out.println("Enter integers -25 to 25 (enter a number greater than -25 or less than 25 to finish): "); //asks the user to enter a number between -25 and 25
      int input = scan.nextInt(); //user input
      while(input >= -25 && input <= 25) { //while user input is in between -25 and 25 inclusive
         numbers[input+25]++; //increment numbers
         input = scan.nextInt(); //user input
      }
      
      System.out.println("Number\tTimes"); //prints number and times
      for(int i = -25; i <= 25; i++) { //for loop from -25 to 25
         if(numbers[i+25] >= 1) { //if numbers is greater than 1
            System.out.println(i + "\t" + numbers[i+25]); //prints out the number and number of times it occurs
         }
      }
   }
}
