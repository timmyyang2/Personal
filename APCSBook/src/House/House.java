package House;

public class House {
	
	private Room room;
	private Furniture furniture;
	private Person person;
	
	public House(Room room, Furniture furniture, Person person) {
		this.room = room;
		this.furniture = furniture;
		this.person = person;
	}
	
	public void study() {
		furniture.use();
	}
	
	public void sleep() {
		room.use();
	}

	public void setPer() {
		person.live();
	}
	
	public static void main(String[] args) {
		Room room = new Room(10, "bedroom");
		Furniture furniture = new Furniture(5, 2018, "desk");
		Person person = new Person("Timmy", "kid");
		House house = new House(room, furniture, person);
		house.sleep();
		house.study();
		house.setPer();
	}
}
