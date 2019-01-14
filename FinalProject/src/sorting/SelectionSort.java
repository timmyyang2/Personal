package sorting;

public class SelectionSort extends Sort {	

	private int next;
	
	public SelectionSort(int itemCount) {
		super(itemCount);
		next = index+1;
	}

	//Overrides the parent class method to do the selection sort
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
 		
  		comps += 1;
  		
  		int min = index;
  		
  		if (itemBarArr[next].getHeight() > itemBarArr[(min)].getHeight()) {
  			//min = next;
  			swap(min, next);
  			this.swaps += 1;
  		}
  		
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
//		   public static void selectionSort (int[] numbers)
//		   { //selectionSort method
//		      int min, temp; //integer min and temp
//
//		      for (int i = 0; i < numbers.length-1; i++)
//		      { //loops through numbers until the last element
//		         min = i; //assigns i to min
//		         for (int j = i+1; j < numbers.length; j++) { //loops through numbers until the last element from i + 1
//		            if (numbers[j] > numbers[min])
//		               min = j;
//		      }
//		         temp = numbers[min];
//		         numbers[min] = numbers[i];
//		         numbers[i] = temp;
//		      }
//		   }
}