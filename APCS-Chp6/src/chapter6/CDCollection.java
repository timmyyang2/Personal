package chapter6; //package name

import java.text.NumberFormat; //import number format package

public class CDCollection { //class
	
   //defines variables
	private CD[] collection;
   private int count;
   private double totalValue;
   private int currentSize;

   //class constructor to initialize variables
   public CDCollection ()
   {
      currentSize = 100;
      collection = new CD[currentSize];
      count = 0;
      totalValue = 0.0;
   }
   
   //addCD method that creates new cds with the titel artist value and tracks
   public void addCD (String title, String artist, double value,
                      int tracks)
   {
      if (count == currentSize)
         increaseSize();

      collection[count] = new CD(title, artist, value, tracks);
      count++;

      totalValue += value;
   }

   //toString method that prints out cd information
   public String toString()
   {
      sortCD(); //sorts CDs in order

      NumberFormat fmt = NumberFormat.getCurrencyInstance();

      String report = "*****************************************\n";
      report += "My CD Collection\n\n";

      report += "Number of CDs: " + count + "\n";
      report += "Total value: " + fmt.format(totalValue) + "\n";
      report += "Average cost: " + fmt.format(totalValue/count);

      report += "\n\nCD List:\n\n";

      for (int cd = 0; cd < count; cd++)
         report += collection[cd].toString() + "\n";

      return report;
   }
   
   //increases the size of cds
   private void increaseSize ()
   {
      currentSize *= 2;

      CD[] cd = new CD[currentSize];

      for (int i = 0; i < collection.length; i++)
         cd[i] = collection[i];

      collection = cd;
   }

   //sorts the cds using insertion sort
   private void sortCD() {
      CD[] cd = new CD[count];
      for(int i = 0; i < count; i++) {
         cd[i] = collection[i];
      }
         Sorts.insertionSort(cd);
      for(int i = 0; i < count; i++) {
         collection[i] = cd[i];
      }
   }
}

