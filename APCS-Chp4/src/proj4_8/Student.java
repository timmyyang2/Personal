package proj4_8; //package project 4.8

public class Student {//Student class
	//assigns and initializes private variables
	private String firstName, lastName; //first and last names
	private Address homeAddress, schoolAddress; //home and school addresses
	private int testScore1; //test score 1
	private int testScore2; //test score 2
	private int testScore3; //test score 3
	
	//Student constructor w/ parameters first, last, home and school
	public Student (String first, String last, Address home, Address school) {
		firstName = first; //assigns first to firstName
		lastName = last; //assigns last to lastName
		homeAddress = home; //assigns home to homeAddress
		schoolAddress = school; //assigns school to schoolAddress
	}
	
	//Student constructor w/ parameters first, last
	public Student(String first, String last) {
		firstName = first; //assigns first to firstName
		lastName = last; //assigns last to lastName
		testScore1 = 0; //initializes test score 1 as 0
		testScore2 = 0; //initializes test score 2 as 0
		testScore3 = 0; //initializes test score 3 as 0
	}

	public void setTestScore(int testNum, int score) { //setTestScore method with test number and its score
		if(testNum == 1) { //if testNum is 1
			testScore1 = score; //assigns the score to test 1
		}else if(testNum == 2) { //if testNum is 2
			testScore2 = score; //assigns the score to test 2
		}else if(testNum == 3) { //if testNum is 3
			testScore3 = score; //assigns the score to test 3
		}
	}
	
	public int getTestScore(int testNum) { //getTestScore method according to the test number
		int testScore = 0; //defines and initializes the test score
		if(testNum == 1) { //if testNum is 1
			testScore = testScore1; //assigns testScore1 to testScore
		}else if(testNum == 2) { //else  if testNum is 2
			testScore = testScore2; //assigns testScore2 to testScore
		}else if(testNum == 3) { //else if testNum is 3
			testScore = testScore3; //assigns testScore3 to testScore
		}
		return testScore; //returns testScore as a result according to the test number
	}
	
	public double average() { //average method
		double average = (double) (testScore1 + testScore2 + testScore3)/3; //calculates the average value of three test scores
		return average; //returns average value as the result
	}
	
	public String toString() { //toString method to give the description of the student
		String result; //defines description result
		result = firstName + " " + lastName + "\n"; //includes first and last names
		result += "Home Address: " + homeAddress + "\n"; //includes home address
		result += "School Address: " + schoolAddress + "\n"; //includes school address
		result += "Test score 1: " + testScore1 + "\n"; //includes test score 1
		result += "Test score 2: " + testScore2 + "\n"; //includes test score 2 
		result += "Test score 3: " + testScore3 + "\n"; //includes test score 3
		result += "Average test score: " + average(); //includes average test score
		return result; //returns result as description
	}
	
	public static void main(String[] args) { //main method
		Address homeAdd = new Address("TChalla", "Wakanda", "South Africa", "0000"); //creates an instance of Address called homeAdd
		Address schoolAdd = new Address("32 Riverside Drive", "Nashua", "NH" , "03062"); //creates an instance of Address called schoolAdd
		Student student = new Student("John", "Appleseed", homeAdd, schoolAdd); //creates an instance of Student called student
		student.setTestScore(1, 98); //sets the first test score as 98
		student.setTestScore(2, 99); //sets the second test score as 99
		student.setTestScore(3, 100); //sets the third test score as 100
		System.out.println(student.toString()); //prints out the description of the student
	}
}