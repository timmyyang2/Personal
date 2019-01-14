package sorting;

import java.awt.Color;
import java.util.ArrayList;

public class Sort {

	public static int BAR_SPAN = 32; //includes the width and gap
	public static int REF_BAR_NUM = 10; //ideal number of bars
	public static int REF_BAR_WIDTH = 22; //ideal width for 10 bars
	public static int REF_BAR_GAP = 10; //ideal gap for 10 bars
	
	protected ItemBar[] itemBarArr;
	protected ItemBar[] backupItemBarArr;
	
	protected int lastElement;
	protected int index;
	protected boolean done;
	protected boolean restored;
	protected int comps;
	protected int swaps;
	
	public Sort(int itemCount) {
		
		itemBarArr = new ItemBar[itemCount];
		backupItemBarArr =  new ItemBar[itemCount];
		lastElement = (itemCount - 1);
		index = 0;
		comps = 0;
		swaps = 0;
		done = false;

		int barWidth = (BAR_SPAN * REF_BAR_WIDTH / BAR_SPAN) * REF_BAR_NUM / itemCount;
		int barGap = (BAR_SPAN*REF_BAR_NUM / BAR_SPAN) * REF_BAR_NUM / itemCount;
		
		int barHeight;
		for (int i = 0; i < itemCount; i++) {
			barHeight = (int)(Math.random() * 200.0); //random init bar height is not over 170 to control the UI display
			itemBarArr[i] = new ItemBar(barHeight, barWidth, barGap, Color.black); //width is set to 22, gap is set to 10, and color is set to black
			backupItemBarArr[i] = new ItemBar(barHeight, barWidth, barGap, Color.black); //creates a backup one for restoration
		}
	}
	
	public void resetItemBars(ArrayList<Integer> numbers) {
		int size = numbers.size();

		itemBarArr = new ItemBar[size];
		backupItemBarArr =  new ItemBar[size];
		lastElement = (size - 1);
		index = 0;
		comps = 0;
		swaps = 0;
		done = false;

		int barWidth = (BAR_SPAN * REF_BAR_WIDTH / BAR_SPAN) * REF_BAR_NUM / size;
		int barGap = (BAR_SPAN*REF_BAR_NUM / BAR_SPAN) * REF_BAR_NUM / size;
		
		for(int i=0; i<size; i++) {
			itemBarArr[i] = new ItemBar(numbers.get(i), barWidth, barGap, Color.black);
			backupItemBarArr[i] = new ItemBar(numbers.get(i), barWidth, barGap, Color.black);
		}
	}
	 	
  	public void restoreItemBars() {
  		for(int i=0; i<backupItemBarArr.length; i++) {
  			itemBarArr[i] = backupItemBarArr[i];
  		}
  		restored = true;

		lastElement = (itemBarArr.length - 1);
		index = 0;
		comps = 0;
		swaps = 0;
		done = false;
  	}
  	
  	public ItemBar[] getItemBarArr() {
  		return itemBarArr;
  	}
  	
  	public void setItemBarArr(ItemBar[] itemBarArr) {
  		this.itemBarArr = itemBarArr;
  	}
  	
  	public ItemBar[] getBackItemBarArr() {
  		return backupItemBarArr;
  	}
  	
  	public void setBackupItemBarArr(ItemBar[] backupItemBarArr) {
  		this.backupItemBarArr = backupItemBarArr;
  	}
  	
  	public int getItemCount() {
  		return itemBarArr.length;
  	}
  	
  	public ItemBar getIndexedItem(int index) {
  		return itemBarArr[index];
  	}
  	
  	public int getComps() {
  		return comps;
  	}
  	
  	public int getSwaps() {
  		return swaps;
  	}
  	
  	public boolean isDone() {
  		return done;
  	}
  	
  	public boolean isRestored() {
  		return restored;
  	}
  	
  	public void setRestored(boolean restored) {
  		this.restored = restored;
  	}
  	
  	//Overridden by its child classes
  	public void doSort() {
  		restored = false;
  	}
  	
	protected void swap(int item1, int item2) {
  		ItemBar itemBar = itemBarArr[item1];
  		itemBarArr[item1] = itemBarArr[item2];
  		itemBarArr[item2] = itemBar;
  	}
}
