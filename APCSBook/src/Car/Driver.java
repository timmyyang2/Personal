package Car;

public class Driver {

	private String name;
	private int id;
	private int exp;
	
	public Driver(String name, int id, int exp) {
		this.name = name;
		this.id = id;
		this.exp = exp;
	}
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	public int getExp() {
		return exp;
	}
	
	public void drive() {
		System.out.println("Driving.");
	}
}
