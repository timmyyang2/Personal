package House;

public class Furniture {

	private int size;
	private int year;
	private String type;

	public Furniture(int size, int year, String type) {
		this.size = size;
		this.year = year;
		this.type = type;
	}
	
	public int getSize() {
		return size;
	}
	
	public int getYear() {
		return year;
	}
	
	public String getType() {
		return type;
	}
	
	public void use() {
		System.out.println("The " + type + " is in use.");
	}
}
