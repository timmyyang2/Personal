package proj4_8; //package project 4.8

public class Address {//Address class
	//assigns and initializes private variables
	private String streetAddress, city, state; //street address, city and state
	private String zipCode; //zip code
	 
	//Address constructor w/ parameters street, town, st and zip
	public Address (String street, String town, String st, String zip) {
		streetAddress = street; //assigns street to streetAddress
		city = town; //assigns town to city
		state = st; //assigns st to state
		zipCode = zip; //assigns zip to zipCode
	}
	
	public String toString() { //toString method for description
		String result; //defines description result
		result = streetAddress + "\n"; //includes street address
		result += city + ", " + state + " " + zipCode; //includes city, state and zipCode
		return result; //returns result as description 
	}
}