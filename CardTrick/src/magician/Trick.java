package magician;

import java.util.Scanner;

public class Trick {
	
	public static void main(String[] args) {
		Deck deck = new Deck(); //creates new Deck object
		
		Scanner scan = new Scanner(System.in);
		
		//shuffle the cards first
		System.out.println("Shuffling all cards ... ");
		deck.shuffle();
		
		//choose a card print it out for future check
		deck.chooseCard();
		deck.printChosenCard();
		
		//asks the user to continue
		System.out.println("Press any key to continue");
		String input = scan.nextLine();
		
		//sort the cards using insertion sort
		System.out.println("\nSort the cards using insertion sort.");
		deck.insertionSort();
		
		//find the card using linear search
		System.out.println("Find the card using linear search.");
		Card card2 = deck.linearSearch();
		if(card2 != null) {
			System.out.println("Congrats! We found your card after the trick! It is " + card2.getSuit()+" "+card2.getFaceValue() +".");
		}
	}
}
