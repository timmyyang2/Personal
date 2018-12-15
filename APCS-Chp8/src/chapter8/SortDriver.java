package chapter8;

public class SortDriver {
  
   public static void main(String[] args) { //main method to sort prices
      double[] prices = {1.00, 302.00, 123.00, 4.00, 100.12, 50.95, 29.87}; //array of prices
      Sort.quickSort(prices); //sort the prices using quick sort
      for(int i = 0; i < prices.length; i++)
    	  System.out.print(prices[i] + "  "); //print out the sorted order
      System.out.println();
    }
 }