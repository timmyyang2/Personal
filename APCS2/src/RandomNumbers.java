import java.util.Random;

public class RandomNumbers { //project 2.13
	
	public static void main(String[] args) {
		double rand = Math.random(); 
		int num1;
		double num2;
		
		num1 = (int) (Math.random()*10);
		System.out.println("From 0 to 9: " + num1);
		
		num1 = (int) (Math.random()*10+1);
		System.out.println("From 1 to 10: " + num1);
		
		num1 = (int) (Math.random()*15+20);
		System.out.println("From 20 to 34: " + num1);
		
		num1 = (int) (Math.random()*20-10);
		System.out.println("From -10 to 9: " + num1);
		
		num2 = Math.random()*1;
		System.out.println("A random double [between 0-1]: " + num2);
		
		num2 = Math.random()*6;
		num1 = (int) num2 + 1;
		System.out.println("From 1 to 6: " + num1);
		
	}

}
