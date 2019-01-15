package sorting;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;

public class Animation {
		
	public static final int WIDTH = 400;
	public static final int HEIGHT = 350;
	public static final Color bgColor = new Color(255, 255, 215); //light yellow
	//public static final Color bgColor = new Color(176, 224, 230);
	public static final Color barColor = new Color(0, 130, 255); //light blue
	public static final Color barValueColor = new Color(51, 51, 51); //light black
	public static final Font barTextFont = new Font("Times New Romans", Font.PLAIN, 12);
	
	private Sort sort;
	
	public Animation(int itemCount, int type) {
		if(type == 0) {
			sort = new BubbleSort(itemCount);
		}else if(type == 1) {
			sort = new SelectionSort(itemCount);
		}else if(type == 2) {
			sort = new InsertionSort(itemCount);
		}
	}
	 
	public boolean isDone() {
		return sort.isDone();
	}
	
	public void restore() {
		sort.restoreItemBars();
	}
   
	public void resetNumbers(ArrayList<Integer> numbers) {
		sort.resetItemBars(numbers);
	}
	
	public void resetSort(Sort sort) {
		this.sort = sort;
	}
	
	public Sort getSort() {
		return sort;
	}
	
	//draws the item bar with the height on top of it
	private void drawOneItemBar(Graphics graphics, int index) {
		ItemBar itemBar = sort.getIndexedItem(index);
		int barHeight = itemBar.getHeight();
		int pos_x = 20 + index * (itemBar.getWidth() + itemBar.getGap());
		int pos_y = 265 - barHeight;
		graphics.setColor(barValueColor);
		graphics.setFont(barTextFont); //sets font for the following text strings 
		graphics.drawString(Integer.toString(barHeight), pos_x+2, pos_y - 5); //puts the int value on top of each item bar
		graphics.setColor(barColor);
		graphics.fill3DRect(pos_x, pos_y, itemBar.getWidth(), barHeight, true);
	}
  
	public void drawItemBars(Graphics graphics) {
		graphics.setColor(bgColor);
		graphics.fillRect(0, 0, 500, 500); //fills in the background rect with this color
		for (int i = 0; i < sort.getItemCount(); i++) { 
			drawOneItemBar(graphics, i);
		}
		 
		graphics.setColor(Color.black); //sets font color for the following text strings
		graphics.setFont(SortingUI.generalTextFont); //sets font for the following text strings 
		if(sort.isDone()) {
			graphics.drawString("Done Sorting. Total Comps: " + sort.getComps() + "  Swaps: " + sort.getSwaps(), 20, 35);
		}else {
			graphics.setColor(Color.black);
			if(!sort.isRestored()) {
				graphics.drawString("Comps: " + sort.getComps() + "  Swaps: " + sort.getSwaps(), 20, 35);
			}else {
				graphics.drawString("Comps: 0" + "  Swaps: 0", 20, 35);
			}
		}		
	}
  
  	public void doSort() {
  		sort.doSort();
  	}
}
