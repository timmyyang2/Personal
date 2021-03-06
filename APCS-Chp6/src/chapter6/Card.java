package chapter6;

public class Card { //PROJECT 6.8

	//defines private variables
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
