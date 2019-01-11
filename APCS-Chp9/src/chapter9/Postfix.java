package chapter9;

import java.util.*; //imports necessary packages

public class Postfix {

	public static int runPostFix(String input) { //method that runs PostFix
	 	Stack<Integer> post = new Stack<Integer>();
		Scanner sc = new Scanner(input); //scanner to parse expressions
		
		while(sc.hasNext()) { //while there is a next variable
			if(sc.hasNextInt()) { //while there is a next int
				post.push(sc.nextInt()); //push the value in
			}else { //else pop the value out
				int num = post.pop();
				int num1 = post.pop();
				String s = sc.next();
				
				if(s.equals("+")) { //checks what operands equal and does operation accordingly
					post.push(num1 + num);
				}else if(s.equals("-")) {
					post.push(num1 - num);
				}else if(s.equals("*")) {
					post.push(num1 * num);
				}else {
					post.push(num1 / num);
				}
			}
		}
		return post.pop(); //returns popping the values out
	}
	
	public static void main(String[] args) { //main method to test and print out post fix operations
		System.out.println(runPostFix("1 4 +"));
		System.out.println(runPostFix("1 5 * 5 +"));
		System.out.println(runPostFix("3 4 4 * +"));

	}
}