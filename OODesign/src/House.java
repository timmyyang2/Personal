
public class House {
	
	String address;
	String owner;
	int people;
	int rooms;
	int neighborhood;
	int condition;
	
	public House(){
		
	}
	
	public House(String houseAddress, String houseOwner, int housePeople, int houseRooms, int houseNumber, int houseConditions) {
		
		address = houseAddress;
		owner = houseOwner;
		people = housePeople;
		rooms = houseRooms;
		neighborhood = houseNumber;
		condition = houseConditions;
		
	}
	
	public void rent() {
		
		System.out.println("This house is being rented!");
		
	}
	
	public String getAddress() {
		
		return address;
	}
	
	public int getRooms() {
		
		return rooms;
	}
	
	public String getOwner() {
		
		return owner;
		
	}
	
	public int getPeople() {
		
		return people;
	}
	
	public int getRentalPrice() {
		
		if(rooms >= 10) {
			
			return 2000;
		} else if(rooms >= 5 && rooms <10) {
			
			return 1500;
		} else {
			
			return 1000;
		}
	}
	
	public int getNeighborhood() {
		
		if(neighborhood >= 20) {
			
			return neighborhood;
		} else {
			
			return neighborhood;
		}
		
	}
	
	public int getConditions() {
		
		if(condition <= 70) {
			
			return condition;
		} else {
			
			return condition;
		}
	}
	public static void main(String[] args) {
		
		House myHouse = new House("12 Common Street", "John Smith", 5, 10, 30, 77);
		myHouse.rent();
		System.out.println("There are a total of " + myHouse.getRooms() + " rooms in the house.");
		System.out.println("The owner is " + myHouse.getOwner() + ".");
		System.out.println("There are " + myHouse.getPeople() + " people currently living in this house.");
		System.out.println("The address of the house is " + myHouse.getAddress() + ".");
		System.out.println("The rent price is " + myHouse.getRentalPrice() + " for the house.");
		System.out.println("The neighborhood has " + myHouse.getNeighborhood() + " houses.");
		System.out.println("The condition of this house is " + myHouse.getConditions() + " out of 100.");
	}
}
