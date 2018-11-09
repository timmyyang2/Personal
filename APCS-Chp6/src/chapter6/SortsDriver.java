package chapter6;

import java.util.Random;

public class SortsDriver
{ //PROJECT 6.3
   private static final int NUM = 50,
                            MAX = 100;

   //-----------------------------------------------------------------
   //  Demonstrates the descending sorts
   //-----------------------------------------------------------------
   public static void main (String args[])
   {
      Random gen = new Random();

      int[] numbers = new int[NUM];
      Integer[] objects = new Integer[NUM];

      // create random numbers
      for (int i=0; i<NUM; i++)
         numbers[i] = gen.nextInt(MAX) + 1;

      Sorts.selectionSort(numbers);

      System.out.println("Selection sort of " + NUM + " random numbers in descending order:");
      for (int i=0; i<NUM; i++)
         System.out.print(numbers[i] + " ");

      // create new set of random numbers
      for (int i=0; i<NUM; i++)
         numbers[i] = gen.nextInt(MAX) + 1;

      Sorts.insertionSort(numbers);

      System.out.println("\n\nInsertion sort of " + NUM + " random numbers in descending order:");
      for (int i=0; i<NUM; i++)
         System.out.print(numbers[i] + " ");

   }
}
