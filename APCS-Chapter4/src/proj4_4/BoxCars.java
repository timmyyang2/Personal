package proj4_4; //package project 4.4

public class BoxCars { //BoxCars class
	
	public static void main(String[] args) { //main method
		PairOfDice pairOfDice = new PairOfDice(); //new PairOfDice object
		int count = 0; //sets count to 0
		for(int i=0; i<1000; i++) { //for loop for 1000 rolls
			if(pairOfDice.roll() == 12) { //if the roll is 12
				count++; //increments count
			}
		}
		System.out.println("Out of 1000 rolls, there were " + count + " box car rolls (two sixes)."); //prints result
	}
}