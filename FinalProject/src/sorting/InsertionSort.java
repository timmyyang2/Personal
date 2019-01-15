package sorting;

public class InsertionSort extends Sort {	
	
	private int key;
	private int pos;
	
	public InsertionSort(int itemCount) {
		super(itemCount);
		index = 1;
		pos = index-1;
		key = itemBarArr[index].getHeight();
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
 		
 		while (pos >= 0 && itemBarArr[pos].getHeight() > key) {
 			swap(pos+1, pos);
 			//itemBarArr[pos+1] = itemBarArr[pos];
  			this.swaps += 1;
            pos--;
 		}
 		itemBarArr[pos+1] = itemBarArr[index];
 		//itemBarArr[pos+1] = key;

 		index += 1;
 		if (index > last - 1) {
 			index = 0;
 			last -= 1;
 			if (last == 0) {
 				done = true;
 			}
 		}
	}
}