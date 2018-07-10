package year2018;

import java.util.Scanner;

public class ManyTiles {
	
	public static void tile(){
		int userInput;
		int userInputt;
		System.out.print("Enter width: ");
		Scanner scanner = new Scanner(System.in);
		userInput = scanner.nextInt();
		System.out.print("Enter height: ");
		userInputt = scanner.nextInt();
		int remainder;
		int big;
		int small;
		if(userInput>userInputt){
			big = userInput;
			small = userInputt;
		}else{
			big = userInputt;
			small = userInput;
		}
		do{
			int result = big/small;
			remainder = big%small;
			System.out.println(result + "*" + small);
			big = small;
			small = remainder;
		}while(remainder != 0);
	}
	
	public static void main(String[] args){
		tile();
	}
}
