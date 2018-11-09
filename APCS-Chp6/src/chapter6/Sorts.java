package chapter6; //package name

public class Sorts { //PROJECT 6.3
   
	   public static void selectionSort (int[] numbers)
	   { //selectionSort method
	      int min, temp; //integer min and temp

	      for (int index = 0; index < numbers.length-1; index++)
	      { //loops through numbers until the last element
	         min = index; //assigns index to min
	         for (int scan = index+1; scan < numbers.length; scan++) //loops through numbers until the last element from index + 1
	            if (numbers[scan] > numbers[min])
	               min = scan;

	         temp = numbers[min];
	         numbers[min] = numbers[index];
	         numbers[index] = temp;
	      }
	   }
	   
	   public static void insertionSort(int[] numbers)
	   {
	      for (int index = 1; index < numbers.length; index++)
	      {
	         int key = numbers[index];
	         int position = index;

	         while (position > 0 && numbers[position-1] < key)
	         {
	            numbers[position] = numbers[position-1];
	            position--;
	         }
	         numbers[position] = key;
	      }
	   }


}
