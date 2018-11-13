package chapter6;

import java.text.NumberFormat;

public class CDCollection {
	
   private CD[] collection;
   private int count;
   private double totalValue;
   private int currentSize;

   public CDCollection ()
   {
      currentSize = 100;
      collection = new CD[currentSize];
      count = 0;
      totalValue = 0.0;
   }
   
   public void addCD (String title, String artist, double value,
                      int tracks)
   {
      if (count == currentSize)
         increaseSize();

      collection[count] = new CD(title, artist, value, tracks);
      count++;

      totalValue += value;
   }

   public String toString()
   {
      sortCD();

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
   
   private void increaseSize ()
   {
      currentSize *= 2;

      CD[] cd = new CD[currentSize];

      for (int i = 0; i < collection.length; i++)
         cd[i] = collection[i];

      collection = cd;
   }

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

