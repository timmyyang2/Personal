import java.util.Scanner; 
import java.util.Random; 

public class RockPaperScissors {
	
	public static void playRPS() {
		String per = "";
		String comp = "";
		int compGen = 0;
		int count = 1;
		int win = 0;
		int lose = 0;
		int tie = 0;
		boolean playing = true;
	   
	    while(count!=0) {
	    	Scanner scan = new Scanner(System.in); 
		    Random generator = new Random(); 
	    System.out.println("Let's play rock, paper, scissors!\n" + 
		                       "Enter a move using the following rules.\n" + "Rock = R, Paper" + 
		                       "= P, and Scissors = S.");
		    compGen = generator.nextInt(3)+1; 
		    if (compGen==1) { 
		       comp = "R"; 
		    }else if (compGen==2) {
		       comp = "P"; 
		    }else if (compGen == 3) {
		       comp = "S"; 
		    }
		    per = scan.nextLine();
		    per = per.toUpperCase();

		    if(per.equals(comp)) {
		    	System.out.println("You: " + per + " Computer: " + comp);
		    	System.out.println("You tie!"); 
		    	tie++;
		    }else if(per.equals("R") && comp.equals("S") || per.equals("S") && comp.equals("P")
		    		|| per.equals("P") && comp.equals("R")) {
		    	System.out.println("You: " + per + " Computer: " + comp);
		    	System.out.println("You win!");
		    	win++;
		    }else {
		    	System.out.println("You: " + per + "\nComputer: " + comp);
		    	System.out.println("You lose!");
		    	lose++;	
		    }
		    System.out.println("Do you wish to play again? Press Y for yes, N for no.");
			String answer = scan.nextLine();
			answer.toUpperCase();
		    if(answer.equals("N")) {
		    System.out.println("Wins: " + win + " Loses: " + lose + " Ties: " + tie);
		    System.exit(1);
		    count = 0;
		    }else if(answer.equals("Y")){
		    	continue;
		    }
		}    
	}
	
	public static void main(String[] args) {
		playRPS();
	}
}