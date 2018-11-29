
public class Square extends Shape{

	private double area; //area variable for square
	
	//Square constructor
	public Square(int width, int height, String name) {
		super(width, height, name); //uses super call to inherit Shape class
		// TODO Auto-generated constructor stub
		this.area = width * height;
	}
	
	//gets the area of a square
	public double getArea() {
		return area;
	}
	
	//main method to run program
	public static void main(String[] args) {
		Square square = new Square(5, 10, "square");
		square.getArea();
	}

}
