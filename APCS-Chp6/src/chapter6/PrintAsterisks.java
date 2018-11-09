package chapter6;

import java.util.Scanner;

public class PrintAsterisks { //PROJECT 6.5

   public static void main (String [] args) {
      int[] range = new int [10];
      int num;
      Scanner scan = new Scanner (System.in);
      System.out.println("Enter integers 0 to 100 (enter a number greater than 100 or less than 0 to finish): "); //asks the user to enter a number between 0 and 50
      int input = scan.nextInt ();
      while (input >= 1 && input <= 100) {
          num = (input - 1) / 10;
          range[num] ++;
          input = scan.nextInt ();
       }
      
       for(num = 0; num < 10; num++) {
          System.out.print((10 * num + 1) + "-");
          System.out.print((10 * num + 10) + "\t|");
          for (int count = 5; count <= range[num]; count+=5) {
             System.out.print ("*");
          }
          System.out.println ();
       }

    }
}
