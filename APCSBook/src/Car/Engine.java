package Car;

public class Engine {

	private String name;
	private String model;
	private int year;
	
	public Engine(String name, String model, int year) {
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
	
	public void start() {
		System.out.println("The engine is operating.");
	}
}
