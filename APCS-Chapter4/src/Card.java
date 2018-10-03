import java.util.Random; //imports Random package for random number generator

public class Card { //PROJECT 4.6
	
	public static void deck() { //deck method
		String[] face = new String[13]; //string array called face to hold face values
		face[0] = "2"; //defines element of array
		face[1] = "3"; //defines element of array
		face[2] = "4"; //defines element of array
		face[3] = "5"; //defines element of array
		face[4] = "6"; //defines element of array
		face[5] = "7"; //defines element of array
		face[6] = "8"; //defines element of array
		face[7] = "9"; //defines element of array
		face[8] = "10"; //defines element of array
		face[9] = "jack"; //defines element of array
		face[10] = "queen"; //defines element of array
		face[11] = "king"; //defines element of array
		face[12] = "ace"; //defines element of array
		
		String[] suits = new String[4]; //string array called face to hold suit values
		suits[0] = "hearts"; //defines element of array
		suits[1] = "diamonds"; //defines element of array
		suits[2] = "spades"; //defines element of array
		suits[3] = "clubs"; //defines element of array
		
		for(int i=0; i<20; i++) { //for loop to loop through array
		int rf = new Random().nextInt(face.length); //randomly generates face
		int rs = new Random().nextInt(suits.length); //randomly generates suit
		System.out.println(face[rf] + " of " + suits[rs]); //prints out face and suit
		}
	}
	        
	public static void main(String[] args) { //main method
		deck(); //runs deck method
	}

}
