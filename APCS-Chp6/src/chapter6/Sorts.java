package chapter6; //package name

public class Sorts { //PROJECT 6.3
   
	   public static void selectionSort (int[] numbers)
	   { //selectionSort method
	      int min, temp; //integer min and temp

	      for (int i = 0; i < numbers.length-1; i++)
	      { //loops through numbers until the last element
	         min = i; //assigns i to min
	         for (int j = i+1; j < numbers.length; j++) //loops through numbers until the last element from i + 1
	            if (numbers[j] > numbers[min])
	               min = j;

	         temp = numbers[min];
	         numbers[min] = numbers[i];
	         numbers[i] = temp;
	      }
	   }
	   
	   public static void insertionSort(int[] numbers)
	   {
	      for (int i = 1; i < numbers.length; i++)
	      {
	         int key = numbers[i];
	         int position = i;

	         while (position > 0 && numbers[position-1] < key)
	         {
	            numbers[position] = numbers[position-1];
	            position--;
	         }
	         numbers[position] = key;
	      }
	   }
}
