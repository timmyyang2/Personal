
public class PairOfDice {
	private Die die = new Die(6);
	private Die die2 = new Die(6);
	 
	public PairOfDice() {
	}
	 
	 public int roll() {
		return die.roll() + die2.roll();
	 }
}