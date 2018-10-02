import java.util.Random; //imports Random for random number generator

public class RandomPhone { //PROJECT 2.14
	
	public static void phone() { //method to generate random phone number based on requirements
		Random rand = new Random(); //initializes rand for random number generator
	
		int first = (rand.nextInt(7)+1)*100 + (rand.nextInt(8)*10) + rand.nextInt(8); //checks for 8 or 9 in first three digits
		int second = rand.nextInt(743) + 100; //second 3 digits are less than 743
		int third = rand.nextInt(10000) + 1000; //any four digit number for last four digits
		System.out.print(first + "-" + second + "-" + third); //prints out phone number
	}
	
	public static void main(String[] args) { //main method
		phone(); //runs phone method
	}

}
