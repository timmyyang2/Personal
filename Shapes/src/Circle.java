
public class Circle extends Shape{
	
	//private variables for Circle
	private double radius;
	private double cirArea;

	public Circle(int width, int height, String name) {
		super(width, height, name); //uses super call to inherit Shape class
		// TODO Auto-generated constructor stub
		this.radius = radius;
		this.cirArea = 3.14 * (radius * radius);
	}
	
	//gets the radius of a circle
	public double getRadius() {
		return radius;
	}
	
	//gets the area of a circle
	public double getArea() {
		return cirArea;
	}
	
	//main method to run program
	public static void main(String[] args) {
		Circle circle = new Circle(0, 0, "circle");
		circle.getArea();
	}

}
