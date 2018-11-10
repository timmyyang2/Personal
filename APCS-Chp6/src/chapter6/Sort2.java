package chapter6;

public class Sort2 {
	
   public static void selectionSort(Comparable[] num) {
      int min;
      Comparable temp;

      for(int i = 0; i < num.length-1; i++) {
         min = i;
         for(int j = i+1; j < num.length; j++) {
            if(num[j].compareTo(num[min]) < 0) {
               min = j;
            }
         }
         temp = num[min];
         num[min] = num[i];
         num[i] = temp;
      }
   }
   
   public static void insertionSort(Comparable[] num) {
      for(int i = 1; i < num.length; i++) {
         Comparable key = num[i];
         int position = i;
         while(position > 0 && num[position-1].compareTo(key) > 0) {
            num[position] = num[position-1];
            position--;
         }
         num[position] = key;
      }
   }
}
