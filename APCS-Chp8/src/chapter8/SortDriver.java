package chapter8;

public class SortDriver {
  
   public static void main(String[] args) {
      double[] prices = {1.00, 302.00, 123.00, 4.00, 100.12, 50.95, 29.87};
      Sort.quickSort(prices);
      for(int i = 0; i < prices.length; i++)
    	  System.out.print(prices[i] + "  ");
      System.out.println();
    }
 }