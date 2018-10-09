package proj4_6; //package project 4.6

import java.util.ArrayList; //imports ArrayList package
import java.util.Collections; //import Collections package

public class Deck { //Deck class
	private ArrayList<Card> deck = new ArrayList<Card>(); //defines an ArrayList that holds all the cards
	private String[] suits = {"hearts", "spades", "diamonds", "clubs"}; //defines all the suit values in an array
	private String[] cardValue = {"2", "3", "4", "5", "6", "7", "8", "9", 
			"10", "jack", "queen", "king", "ace"}; //defines all the card values in an array
	
	//Deck constructor
	public Deck() {
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
	
	public static void main(String[] args) {//main method
		Deck deck = new Deck(); //creates a deck instance
		deck.shuffle(); //shuffles the deck
		deck.dealRandomCards(20); //gets the first 20 cards
	}

}
