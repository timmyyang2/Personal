package proj4_6; //package project 4.6

public class Card { //Card class
	//assigns and initializes private variables
	private String suit; //suit 
	private String faceValue; //face value
	 
    //Card constructor w/ parameters suit and faceValue
	public Card(String suit, String faceValue) { 
		this.suit = suit; //assigns suit to this suit variable
		this.faceValue = faceValue; //assigns faceValue to this faceValue
	}
	
	//getSuit method
	public String getSuit() {
		return suit; //returns suit
	}
	
	//getFaceValue method
	public String getFaceValue() {
		return faceValue; //returns faceValue
	}
}