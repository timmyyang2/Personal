package sorting;

public class SelectionSort extends Sort {	

	private int min;
	private int j;
	
	public SelectionSort(int itemCount) {
		super(itemCount);
		min = index;
		j = min;
	}
	
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
  		
  		if (itemBarArr[j].getHeight() < itemBarArr[(min)].getHeight()) {
  			min = j;
  		}
  	
  		j++;
  		
  		if (j > last) {
  			swap(index, min);
  			this.swaps += 1;
  			index += 1;
  			min = index;
  			j = index + 1;
  		}
  		
  		if (index > last - 1) {
  			index = 0;
  			min = index;
  			j = index+1;
  			done = true;
  		}
	}
}