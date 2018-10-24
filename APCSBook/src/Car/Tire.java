package Car;

public class Tire {

	private String name;
	private String model;
	private int year;
	
	public Tire(String name, String model, int year) {
		this.name = name;
		this.model = model;
		this.year = year;
	}
	
	public String getName() {
		return name;
	}
	
	public String getMod() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
	
	public void move() {
		System.out.println("The " + name + " tire is moving.");
	}
}
