import java.util.Random; //imports Random package for random number generator

public class PairOfDice { //PROJECT 4.4
	
	public static void rollDice() { //rollDice method
		Random rand = new Random(); //initializes rand object
		int count = 0; //initializes int count as 0
		for(int i=0; i<=1000; i++) { //for loop to loop to 1000
			int r = rand.nextInt(6)+1; //assigns int r to random number generator
			int r1 = rand.nextInt(6)+1; //assigns int r to random number generator
			if(r==6 && r1==6) { //if both dices are 6
				count++; //increment count by 1
			}
		}
		System.out.println("Number of rolls: 1000"); //prints total rolls
		System.out.println("Number of box cars (two sixes): " + count); //prints number of box cars (two sixes)
	}
}
