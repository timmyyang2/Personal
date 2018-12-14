package chapter8;

public class Sort {
  
   public static void quickSort(double[] numbers) {
      quickSort(numbers,0,numbers.length-1);
   }
   
   private static void quickSort(double[] numbers,int start,int end) {
      if(start < end) {
          int middle = divide(numbers,start,end);
          quickSort(numbers,start,middle);
          quickSort(numbers,middle+1,end);
       }
    }

    private static int divide(double[] numbers,int start,int end) {
       double piv = numbers[(start+end)/2];
       int i = start-1;
       int j = end+1;

       while(true) {
          i = i+1;
          while(numbers[i] < piv)
             i = i+1;
          	j = j-1;
          while(numbers[j] > piv)
             j = j-1;

          if(i < j) {
             double temp = numbers[i];
             numbers[i] = numbers[j];
             numbers[j] = temp;
          }
          else return j;
       }
    }
 }
