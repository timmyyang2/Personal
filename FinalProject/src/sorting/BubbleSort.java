package sorting;

public class BubbleSort extends Sort {
	
	public BubbleSort(int itemCount) {
		super(itemCount);
	}
	
	//Overrides the parent class method to do the bubble sort
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
  		
  		if (itemBarArr[index].getHeight() > itemBarArr[(index + 1)].getHeight()) {
  			swap(index, index + 1);
  			this.swaps += 1;
  		}

  		index += 1;
  		if (index > lastElement - 1) {
  			index = 0;
  			lastElement -= 1;
  			if (lastElement == 0) {
  				done = true;
  			}
  		}
  	}
}
