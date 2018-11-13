package chapter6;

public class CardDriver { //PROJECT 6.8

	public static void main(String[] args) {//main method
		DeckOfCards deck = new DeckOfCards(); //creates a deck instance
		deck.shuffle(); //shuffles the deck
		deck.dealRandomCards(52); //gets the first 20 cards
	}
	
}
