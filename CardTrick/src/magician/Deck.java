package magician;

import java.util.Random;

public class Deck {
	//defines and initializes the private variables
	private final int NUM_OF_CARDS = 52;
	private Card[] cards = new Card[NUM_OF_CARDS];
	private String[] suits = {"hearts", "spades", "diamonds", "clubs"};
	private String[] cardValue = {"2", "3", "4", "5", "6", "7", "8", "9", 
			"10", "jack", "queen", "king", "ace"};
	private Card chosenCard = null;
	
	//Deck constructor
	public Deck() {
		int k=0;
		for (int i = 0; i < suits.length; i++) {
			for(int j = 0; j < cardValue.length; j++) {
				cards[k++] = new Card(suits[i],cardValue[j]);
			}
		}
	}
	
	//method to shuffle the cards
	public void shuffle() {
	    int index; //defines index as integer
	    Card temp; //defines temp Card for swap
	    Random random = new Random(); //creates a random number
	    for (int i = cards.length - 1; i > 0; i--) { //loops through the cards
	        index = random.nextInt(i + 1); //find the index between 0 and i+1
	        
	        //swaps the card positions for shuffling
	        temp = cards[index];
	        cards[index] = cards[i];
	        cards[i] = temp;
	    }
	}
	
	//method to pick a random card
	public void chooseCard() {
		int index = (int) (Math.random()*51); //generates random integer level between 0 and 51
		chosenCard = cards[index]; //gets the random indexed card
	}
	
	//method to print out the chosen card
	public void printChosenCard() {
		System.out.println("The card you chose is "+chosenCard.getSuit()+ " " + chosenCard.getFaceValue() + ". It is your secret, but we can find it.");
	}
	
	//selectionSort method
	public void selectionSort () { 
		Card min, temp; //declares min and temp as Card

		for (int i = 0; i < cards.length-1; i++) {
			min = cards[i];
	        for (int j = i+1; j < cards.length; j++)
	        	if (cards[j].getValue() > min.getValue())
	        		min = cards[j];
	        
	        //swaps the element values with index i and index min
	       	temp = min; 
	       	min = cards[i]; 
	       	cards[i] = temp; 
	    }
	}
	
	//insertionSort method 
	public void insertionSort() { 
		for (int i = 1; i < cards.length; i++) {
			Card key = cards[i];
			int position = i;

			while (position > 0 && cards[position-1].getValue() < key.getValue()) {
				cards[position] = cards[position-1];
	            position--;
	        }
	        cards[position] = key;
		}
	}
	 
	//binary search method 
	public Card binarySearch() { 
		int low=0, high =cards.length-1, middle=(low+high)/2;
		while(cards[middle].getValue() != chosenCard.getValue() && low <= high) {
			if(chosenCard.getValue() <= cards[middle].getValue()) {
				high = middle - 1;
			}else {
				low = middle + 1;
			}
			middle = (low+high)/2;
		}
		
		if(cards[middle].getValue() == chosenCard.getValue()) {
			return cards[middle];
		}else {
			return null;
		}
    } 
	
	//linear search method
	public Card linearSearch() {
		for(int i = 0; i < cards.length; i++) { 
            if(cards[i].getValue() == chosenCard.getValue()) {
                return cards[i]; 
            }
        } 
        return null; 
    }
}

