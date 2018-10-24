package House;

public class Room {
	
	private int size;
	private String name;
	
	public Room(int size, String name) {
		this.size = size;
		this.name = name;
	}
	
	public int getSize() {
		return size;
	}
	
	public String getName() {
		return name;
	}

	public void use() {
		System.out.println("The " + name + " room is in use.");
	}
}
