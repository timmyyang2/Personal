import java.util.ArrayList; //imports ArrayList package
import java.util.Collections; //import Collections package

public class Deck { //Deck class
	//defines and initializes the private variables
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
			System.out.println(card.getFaceValue() + " of " + card.getSuit()); //prints out all card info
		}
	}
	
	public static void selectionSort (int[] numbers) { 
		int min, temp; //declares min and temp as integers

		for (int i = 0; i < numbers.length-1; i++) { //loops through the numbers array starting from index 0
			min = i; //starts from 0 and assigns i to min
	        for (int j = i+1; j < numbers.length; j++) //loops through the numbers array starting from index 1
	        	if (numbers[j] > numbers[min]) //if numbers[j] is greater than numbers[min]
	        		min = j; //assigns index j to min
	        
	        //swaps the element values with index i and index min
	       	temp = numbers[min]; //assigns numbers[min] to temp 
	       	numbers[min] = numbers[i]; //assigns numbers[i] to numbers[min]
	       	numbers[i] = temp; //assigns temp to numbers[i]
	    }
	}
	
	//insertionSort method in descending order with int[] parameter
	public static void insertionSort(int[] numbers) { 
		for (int i = 1; i < numbers.length; i++) { //loops through the numbers array starting from index 1
			int key = numbers[i]; //assigns numbers[i] to key
			int position = i; //assigns index i to position

			while (position > 0 && numbers[position-1] < key) { //while position is greater than 0 and numbers[position-1] is smaller than key
				numbers[position] = numbers[position-1]; //assigns the number[position-1] to number[position]
	            position--; //decrements position by 1
	        }
	        numbers[position] = key; //assigns key to numbers[position]
		}
	}
	 
	public int binarySearch(int arr[], int l, int r, int x) { 
        if (r>=l) { 
            int mid = l + (r - l)/2; 
            if(arr[mid] == x) {
               return mid; 
        }
            if(arr[mid] > x) {
               return binarySearch(arr, l, mid-1, x); 
        }
            return binarySearch(arr, mid+1, r, x); 
        } 
        return -1; 
    } 
	
	public int linearSearch(int[] cards, int x) {
		for(int i = 0; i < cards.length; i++) { 
            if(cards[i] == x) {
                return i; 
            }
        } 
        return -1; 
    } 
}
