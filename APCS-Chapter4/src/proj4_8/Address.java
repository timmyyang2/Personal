package proj4_8;

public class Address {
	private String streetAddress, city, state;
	private String zipCode;
	
	public Address (String street, String town, String st, String zip) {
		streetAddress = street;
		city = town;
		state = st;
		zipCode = zip;
	}
	
	public String toString() {
		String result;
		result = streetAddress + "\n";
		result += city + ", " + state + " " + zipCode;
		return result;
	}
}