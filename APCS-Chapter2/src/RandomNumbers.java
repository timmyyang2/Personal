import java.util.Random; //imports Random for number generator

public class RandomNumbers { //PROJECT 2.13
	
	public static void main(String[] args) { //main method
		int num1; //defines int num1
		double num2; //defines int num2
		
		//Math.random returns a value between 0 and 1
		num1 = (int) (Math.random()*10); //generates random int between 0-9
		System.out.println("From 0 to 9: " + num1); //prints out the random int
		
		num1 = (int) (Math.random()*10+1); //generates random int between 1-10
		System.out.println("From 1 to 10: " + num1); //prints out the random int
		
		num1 = (int) (Math.random()*15+20); //generates random int between 20-34
		System.out.println("From 20 to 34: " + num1); //prints out the random int
		
		num1 = (int) (Math.random()*20-10); //generates random int between -10-9
		System.out.println("From -10 to 9: " + num1); //prints out the random int
		
		num2 = Math.random()*1; //generates random double between 0-1
		System.out.println("A random double [between 0-1]: " + num2); //prints out the random double
		
		num2 = Math.random()*6; //generates random double 1-6
		num1 = (int) num2 + 1; //converts random double to int
		System.out.println("From 1 to 6: " + num1); //prints out the random int
		
	}

}
