import java.util.LinkedList;

public class Deck { //Deck class

	LinkedList<Card> cards = new LinkedList<Card>(); //defines linked list
	String[] suits = {"hearts", "spades", "diamonds", "clubs"}; //suits array
	String[] cardValue = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king", "ace"}; //cardValue array
	
	public void deckOfCards() { //deckOfCards method to loop through all cards
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < cardValue.length; j++) {
				cards.add(new Card(suits[i], cardValue[j]));
			}
		}
	}

	public void printOut() { //prints out all cards
		for(int i=0; i<51; i++) {
			System.out.println(cards.get(i));
		}
    }
}

