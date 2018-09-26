import java.util.Random;

public class RandomPhone { //project 2.14
	
	public static void phone() {
		Random rand = new Random();
	
		int first = (rand.nextInt(7) + 1) * 100 + (rand.nextInt(8) * 10) + rand.nextInt(8);
		int second = rand.nextInt(743)+100;
		int third = rand.nextInt(10000)+1000;
		System.out.print(first + " - " + second + " - " + third);
	}
	
	public static void main(String[] args) {
		phone();
	}

}
