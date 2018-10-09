package proj4_4; //project 4.4

import proj4_3.Die; //imports dice class

public class PairOfDice { //class
	private Die die = new Die(6); //die 1 with 6 sides
	private Die die2 = new Die(6); //die 2 with 6 sides
	 
	public PairOfDice() { //empty constructor
	}
	 
	 public int roll() { //roll method
		return die.roll() + die2.roll(); //returns rolls
	 }
}