import java.util.Scanner;

public class Trick {
	
	public static void main(String[] args) {
		Deck deck = new Deck();
		Scanner scan = new Scanner(System.in);
		System.out.println("Your starting card: ");
		deck.shuffle();
		deck.dealRandomCards(1);
		System.out.println("Press C to continue");
		String input = scan.nextLine();
		if(input.equalsIgnoreCase("c")) {
		System.out.println("Lets sort the cards using insertion sort: ");
		deck.insertionSort(deck);
		System.out.println("Lets sort the cards using selection sort: ");
		deck.selectionSort(deck);
		}
		System.out.println("Press C to continue");
		if(input.equalsIgnoreCase("c")) {
		System.out.println("Lets find your card using binary search: ");
		deck.binarySearch(arr, l, r, x)(deck);
		System.out.println("Lets sort the cards using linear search: ");
		deck.linearSearch(cards, x)(deck);
	}
		System.out.println("Congrats! We found your card! It is " + );
}
