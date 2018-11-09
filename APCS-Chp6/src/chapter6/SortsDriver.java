package chapter6;

import java.util.Random;

public class SortsDriver { //PROJECT 6.3
	
   private static int number = 50, max = 100;
   
   public static void main(String args[]) {
      Random rand = new Random();
      int[] num = new int[number];

      for (int i=0; i<number; i++) {
         num[i] = rand.nextInt(number) + 1;
      }
      
      Sorts.selectionSort(num);
      System.out.println("Selection sort: " + number + " in descending order:");
      for (int i=0; i<number; i++) {
         System.out.print(num[i] + " ");
      }
      
      for (int i=0; i<number; i++) {
         num[i] = rand.nextInt(max) + 1;
      }
      Sorts.insertionSort(num);
      System.out.println();
      System.out.println();
      System.out.println("Insertion sort: " + number + " in descending order:");
      for (int i=0; i<number; i++) {
         System.out.print(num[i] + " ");
      }
   }
}
