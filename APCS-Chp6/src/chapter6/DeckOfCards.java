package chapter6;

import java.util.ArrayList;
import java.util.Collections;

public class DeckOfCards { //PROJECT 6.8
	
	//defines and initializes the private variables
	private ArrayList<Card> deck = new ArrayList<Card>(); //defines an ArrayList that holds all the cards
	private String[] suits = {"hearts", "spades", "diamonds", "clubs"}; //defines all the suit values in an array
	private String[] cardValue = {"2", "3", "4", "5", "6", "7", "8", "9", 
			"10", "jack", "queen", "king", "ace"}; //defines all the card values in an array
	
	//Deck constructor
	public DeckOfCards() {
		for (int i = 0; i < suits.length; i++) { //loops through all the suits
			for(int j = 0; j < cardValue.length; j++) { //loops through all the card values
				this.deck.add(new Card(suits[i],cardValue[j])); //adds each card to the ArrayList
			}
		}
	}
	
	public void shuffle() { //shuffle method
		Collections.shuffle(deck); //calls the shuffle method from Collections
	}
	
	public void dealRandomCards(int num) { //method to deal the random cards caused by shuffling
		for(int i = 0; i < num; i++) { //loops through number of cars
			Card card = deck.get(i); //gets the indexed card
			System.out.println((i+1) + ". " + card.getFaceValue() + " of " + card.getSuit()); //prints out all card info
		}
	}
}
