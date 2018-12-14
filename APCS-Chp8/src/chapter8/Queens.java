package chapter8;

public class Queens { //PROJECT 8.6

    int[] queens;
	final int num = 8;
	
	//class constructor
	public Queens() {
		this.queens = new int[num];
	}
	
	public boolean spot(int number, int column) {
		for(int i = 0; i < number; i++) {
			if(queens[i] == column) {
				return false;
			}
			if(Math.abs(queens[i]-column) == Math.abs(i-number)) {
				return false;
			}
		}
		return true;
	}
	
	public void solve(int number) {
		for(int i = 0; i < num; i++) {
			if(spot(number, i)) {
				queens[number] = i;
			if(number + 1 >= num) {
				printQueens();
			}else {
				solve(number + 1);
			}
			}
		}
	}

	//runs the program
	public void runs() {
		solve(0);
	}

	//prints out the location of all the queens using 2 for loops
	private void printQueens() {
	    int column;
	    for(int i=0; i<num; i++) {
	        for(int j = 0; j<num; j++)
	            if(queens[i] == j)
	                System.out.print(" -"); //represents queen location
	            else 
	                System.out.print(" 0");
	        System.out.print("\n");
	    }
	    System.out.println("________________");
	
	}
	
	//main method to test program
	public static void main(String args[]) {
		//new Queen object
		Queens queens = new Queens();
		queens.runs();
	}
	
}
	
