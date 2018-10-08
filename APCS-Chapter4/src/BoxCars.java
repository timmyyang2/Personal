
public class BoxCars {
	
	public static void main(String[] args) {
		PairOfDice pairOfDice = new PairOfDice();
		int count = 0;
		for(int i=0; i<1000; i++) {
			if(pairOfDice.roll() == 12) {
				count++;
			}
		}
		System.out.println("Out of 1000 rolls, there were " + count + " box car rolls (two sixes).");
	}
}