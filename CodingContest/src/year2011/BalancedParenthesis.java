package year2011;

import java.util.ArrayList;
import java.util.Scanner;

public class BalancedParenthesis {
	
	public static void parenInput(){
		ArrayList<String> paren = new ArrayList<String>();
		System.out.print("Enter list (q for quit): ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		if(input.equals("q")) {
			System.exit(1);
		}
		int counto = 0;
		int countc = 0;
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i)=='(') {
				paren.add("(");
				counto++;
			}
			if(input.charAt(0)!='(' || input.charAt(input.length()-1)!=')') {
				System.out.println("Incorrect");
				return;
			}
			if(input.charAt(i)==')') {
				if(paren.contains("(")) {
					paren.remove(paren.size()-1);
				}
				countc++;
			}
		}
		if(counto == countc && paren.isEmpty()) {
			System.out.println("Correct");
		}else {
			System.out.println("Incorrect");
		}
	}
	
	public static void main(String[] args){
		parenInput();
	}

}
