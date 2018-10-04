import java.util.Random;
import java.util.Scanner;

public class Pig { //PROJECT 4.5 (DRAFT DOESNT WORK)
	
	public static void pigGame() { //rollDice method
		Scanner sc = new Scanner(System.in); //Scanner for user input
		boolean stop = false;
		int count = 0; //initializes int count as 0
		int count1 = 0;
		while(stop!=true) {
		Random rand = new Random(); //initializes rand object
		if(count >= 100 && count1 < 100) {
			System.out.println("You won! Your score: " + count);
			break;
		}else if(count<100 && count1>=100) {
			System.out.println("Computer won! It's score: " + count1);
			break;
		}
			int r = rand.nextInt(6)+1; //assigns int r to random number generator
			int r1 = rand.nextInt(6)+1; //assigns int r to random number generator
			count = count + r + r1; //increment count by 1
			System.out.println(count);
			if(r == 1 || r1 == 1) {
				count = count - r - r1;
			}else if(r == 1 && r1 == 1) {
				count = 0;
				System.out.println("Give the dice to opponent by pressing 2.");
				int num = sc.nextInt(); //user input will be an integer
			}
			System.out.println("Your roll: " + r + " " + r1);
			System.out.println("Keep rolling? Press 1. Give the dice to opponent? Press 2.");
			int num = sc.nextInt(); //user input will be an integer
			if(num == 2) {
				int count2 = 0;
				while(count2<20) {
				r = rand.nextInt(6)+1; //assigns int r to random number generator
				r1 = rand.nextInt(6)+1; //assigns int r to random number generator
				count1 = count1 + r + r1; //increment count by 1
				count2 = count2 + r + r1;
				if(r == 1 || r1 == 1) {
					count1 = count1 - r - r1;
				}else if(r == 1 && r1 == 1) {
					count1 = 0;
				}
				System.out.println("Computer roll: " + r + " " + r1);
				System.out.println(count1);
				}
			}else {
				continue;
			}
		}
	}
	
	public static void main(String[] args) {
		pigGame();
	}

}
