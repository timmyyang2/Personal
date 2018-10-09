package proj4_8;

public class Student {
	private String firstName, lastName;
	private Address homeAddress, schoolAddress;
	private int testScore1;
	private int testScore2;
	private int testScore3;
	
	public Student (String first, String last, Address home, Address school) {
		firstName = first;
		lastName = last;
		homeAddress = home;
		schoolAddress = school;
	}
	
	public Student(String first, String last) {
		firstName = first;
		lastName = last;
		testScore1 = 0;
		testScore2 = 0;
		testScore3 = 0;
	}
	
	public void setTestScore(int testNum, int score) {
		if(testNum == 1) {
			testScore1 = score;
		}else if(testNum == 2) {
			testScore2 = score;
		}else if(testNum == 3) {
			testScore3 = score;
		}
	}
	
	public int getTestScore(int testNum) {
		int testScore = 0;
		if(testNum == 1) {
			testScore = testScore1;
		}else if(testNum == 2) {
			testScore = testScore2;
		}else if(testNum == 3) {
			testScore = testScore3;
		}
		return testScore;
	}
	
	public double average() {
		double average = (double) (testScore1 + testScore2 + testScore3)/3;
		return average;
	}
	
	public String toString() {
		String result;
		result = firstName + " " + lastName + "\n";
		result += "Home Address: " + homeAddress + "\n";
		result += "School Address: " + schoolAddress + "\n";
		result += "Test score 1: " + testScore1 + "\n";
		result += "Test score 2: " + testScore2 + "\n";
		result += "Test score 3: " + testScore3 + "\n";
		result += "Average test score: " + average();
		return result;
	}
	
	public static void main(String[] args) {
		Address homeAdd = new Address("TChalla", "Wakanda", "South Africa", "0000");
		Address schoolAdd = new Address("32 Riverside Drive", "Nashua", "NH" , "03062");
		Student student = new Student("John", "Appleseed", homeAdd, schoolAdd);
		student.setTestScore(1, 98);
		student.setTestScore(2, 99);
		student.setTestScore(3, 100);
		System.out.println(student.toString());
	}
}