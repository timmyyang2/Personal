
public class Shape {
	
	//variables of a shape
	private int width;
	private int height;
	private String name;
	
	//Shape constructor
	public Shape(int width, int height, String name) {
		this.width = width;
		this.height = height;
		this.name = name;
	}
	
	//gets the width of the shape
	public int getWidth() {
		return width;
	}
	
	//gets the height of the shape
	public int getHeight() {
		return height;
	}
	
	//gets the name of the shape
	public String getName() {
		return name;
	}

}
