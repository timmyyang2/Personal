package proj4_3; //package project 4.3

import java.util.Random; //Random package for number generator
import java.util.Scanner; //Scanner package for user input

public class Die { //Die class
	//assigns and initializes private variables
	private final int MIN_FACES = 4; //minimum amount of die faces
	private static Random generator = new Random(); //random number generator
	private int numFaces; //number of faces
	private int faceValue; //face value
	 
	public Die() { //Die constructor
		numFaces = 6; //die faces is 6 by default
		faceValue = 1; //face value is 1 by default
	}
	 
	public Die(int faces) { //Die constructor w/ parameter faces
		if(faces < MIN_FACES) { //if faces < MIN_FACES
		numFaces = 6; //numFaces is 6
		}else { //else
			numFaces = faces; //faces is assigned to numFaces
		}
		faceValue = 1; //sets faceValue to 1
	 }
	 
	 public int roll() { //roll method
		 faceValue = generator.nextInt(numFaces) + 1; //generators random number for roll
		 return faceValue; //returns faceValue
	 }
	 
	 public int getFaceValue() { //getFaceValue method
		 return faceValue; //returns faceValue
	 }
	 
	 public void setFaces(int numFaces) { //setFaces method w/ parameter numFaces
		this.numFaces = numFaces; //sets numFaces to numFaces
	 }
	 
	 public static void main(String[] args) { //main method
		 Die myDie = new Die(); //new Die object
		 Scanner sc = new Scanner(System.in); //Scanner for user input 
		 System.out.print("Enter any number of sides of a die: "); //asks user for input
		 int numFaces = sc.nextInt(); //user input line
		 myDie.setFaces(numFaces); //calls setFaces method
		 System.out.println("Your roll is a " + myDie.roll() + "."); //prints result
	 }
	 
}
