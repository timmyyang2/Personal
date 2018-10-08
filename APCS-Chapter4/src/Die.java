import java.util.Random;
import java.util.Scanner;

public class Die { //PROJECT 4.3
	private final int MIN_FACES = 4;
	private static Random generator = new Random();
	private int numFaces;
	private int faceValue;
	 
	public Die() {
		numFaces = 6;
		faceValue = 1;
	}
	 
	public Die(int faces) {
		if(faces < MIN_FACES) {
		numFaces = 6;
		}else {
			numFaces = faces;
		}
		faceValue = 1;
	 }
	 
	 public int roll() {
		 faceValue = generator.nextInt(numFaces) + 1;
		 return faceValue;
	 }
	 
	 public int getFaceValue() {
		 return faceValue;
	 }
	 
	 public void setFaces(int numFaces) {
		this.numFaces = numFaces;
	 }
	 
	 public static void main(String[] args) {
		 Die myDie = new Die();
		 Scanner sc = new Scanner(System.in); 
		 System.out.print("Enter any number of sides of a die: ");
		 int numFaces = sc.nextInt();
		 myDie.setFaces(numFaces);
		 System.out.println("Your roll is a " + myDie.roll() + ".");
	 }
	 
}
