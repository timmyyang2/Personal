
public class Card {
	
	//defines private variables
	private String suit;
	private String faceValue;

    //Card constructor w/ parameters suit and faceValue
	public Card(String suit, String faceValue) { 
		this.suit = suit;
		this.faceValue = faceValue;
	}
	
	//getSuit method
	public String getSuit() {
		return suit;
	}
	
	//getFaceValue method to return an integer value according to its string value
	public String getFaceValue() {
		return faceValue;
	}
	
	//method to get suit value
	private int getSuitValue(String suit, int value) {
		int totalValue = value;
		if(suit.equalsIgnoreCase("clubs")) {
			totalValue = value + 1;
		}else if(suit.equalsIgnoreCase("diamonds")) {
			totalValue = value + 2;
		}else if(suit.equalsIgnoreCase("hearts")) {
			totalValue = value + 3;
		}else if(suit.equalsIgnoreCase("spades")) {
			totalValue = value + 4;
		}
		return totalValue;
	}
	
	//getValue method for sorting
	public int getValue() {
		int value = 0;
		if(faceValue.equals("2") || faceValue.equals("3") || faceValue.equals("4") || faceValue.equals("5") || faceValue.equals("6")
								 || faceValue.equals("7") || faceValue.equals("8") || faceValue.equals("9") || faceValue.equals("10")) {
			value = Integer.valueOf(faceValue)*10; //times by 10 so there is no overlap
			return getSuitValue(suit, value);
		}

		if(faceValue.equalsIgnoreCase("jack")) {
			return getSuitValue(suit, 200); //sets as 200 so there will not be any overlap
		}
		
		if(faceValue.equalsIgnoreCase("queen")) {
			return getSuitValue(suit, 300); //sets as 300 so there will not be any overlap
		}
		
		if(faceValue.equalsIgnoreCase("king")) {
			return getSuitValue(suit, 400); //etc
		}
		
		if(faceValue.equalsIgnoreCase("ace")) {
			return getSuitValue(suit, 500);
		}
		
		return value;
	}
}