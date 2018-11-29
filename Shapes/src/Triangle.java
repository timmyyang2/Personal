
public class Triangle extends Shape{
	
	private double triArea; //area variable for triangle 

	//Triangle constructor
	public Triangle(int width, int height, String name) {
		super(width, height, name); //uses super call to inherit Shape class
		// TODO Auto-generated constructor stub
		this.triArea = width * height / 2;
	}
	
	//gets the area of a triangle
	public double getArea() {
		return triArea;
	}

	//main method to run program
	public static void main(String[] args) {
		Triangle triangle = new Triangle(5, 10, "triangle");
		triangle.getArea();
	}

}
