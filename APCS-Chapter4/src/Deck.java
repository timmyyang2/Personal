import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	private ArrayList<Card> deck = new ArrayList<Card>();
	private String[] suits = {"hearts", "spades", "diamonds", "clubs"};
	private String[] cardValue = {"2", "3", "4", "5", "6", "7", "8", "9", 
			"10", "jack", "queen", "king", "ace"};
	
	public Deck() {
		for (int i = 0; i < suits.length; i++) {
			for(int j = 0; j < cardValue.length; j++) {
				this.deck.add(new Card(suits[i],cardValue[j]));
			}
		}
	}
	
	public void shuffle() {
		Collections.shuffle(deck);
	}
	
	public void dealRandomCards(int num) {
		int count = 1;
		for(int i = 0; i < num; i++) {
			Card card = deck.get(i);
			System.out.println(count + ". " + card.getFaceValue() + " of " + card.getSuit());
			count++;
		}
	}
	
	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.shuffle();
		deck.dealRandomCards(20);
	}

}
