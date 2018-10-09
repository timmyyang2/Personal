package proj4_6; //package 4.6

public class Card { //Card class
	private String suit;
	private String faceValue;
	 
	public Card(String suit, String faceValue) {
		this.suit = suit;
		this.faceValue = faceValue;
	}
	
	public String getSuit() {
		return suit;
	}
	
	public String getFaceValue() {
		return faceValue;
	}
}