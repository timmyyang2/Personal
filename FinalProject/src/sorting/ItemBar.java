package sorting;

import java.awt.Color;

public class ItemBar{

	private int height;
	private int width;
	private int gap;
	private Color color;
  
	public ItemBar(int height, int width, int gap, Color color) {
		this.height = height;
		this.width = width;
		this.gap = gap;
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}
  
	public int getHeight() {
		return height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getGap() {
		return gap;
	}
}

