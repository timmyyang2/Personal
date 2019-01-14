package sorting;

public class InsertionSort extends Sort {
	
	private int next;

	public InsertionSort(int itemCount) {
		super(itemCount);
		next = index + 1;
	}
	
	//Overrides the parent class method to do the insertion sort
	@Override
	public void doSort() {	
		super.doSort();

		if(getItemCount() == 1) {
			done = true;
			return;
		}

 		if (done) {
  			return;
  		}
 		
 		int key = itemBarArr[index + 1].getHeight();
 		int pos = index + 1;
 		
 		while(itemBarArr[pos].getHeight() > 0 && itemBarArr[pos - 1].getHeight() < key) {
  			itemBarArr[pos] = itemBarArr[pos - 1];
  			pos--;
  			this.swaps += 1;
  		}
 		itemBarArr[pos] = itemBarArr[index + 1];
  		
  		next += 1;
  		
  		if (next > lastElement) {
  			index += 1;
  			next = index + 1;
  		}
  		
  		if (index > lastElement - 1) {
  			index = 0;
  			lastElement -= 1;
  			done = true;
  		}
	}
//	  public static void insertionSort(int[] numbers)
//	   {
//	      for (int i = 1; i < numbers.length; i++)
//	      {
//	         int key = numbers[i];
//	         int position = i;
//
//	         while (position > 0 && numbers[position-1] < key)
//	         {
//	            numbers[position] = numbers[position-1];
//	            position--;
//	         }
//	         numbers[position] = key;
//	      }
//	   }
}