public class School {
	
	String school;
	int students;
	int rooms;
	int time;
	
	public School(String schoolName, int numberStudents, int numberRooms, int schoolTime) {
		
		school = schoolName;
		students = numberStudents;
		rooms = numberRooms;
		time = schoolTime;
		
	}
	
	public void open() {
		
		System.out.println("This is a high school!");
		
	}
	
	public String getSchool() {
		
		return school;
	}
	
	public int getRooms() {
		
		return rooms;
	}
	
	public int getStudents() {
		
		return students;
		
	}
	
	
	public static void main(String[] args) {
		
		School mySchool = new School("Nashua High School South", 2412, 100, 823);
		mySchool.open();
		System.out.println("The school name is " + mySchool.getSchool() + ".");
		System.out.println("There are " + mySchool.getStudents() + " students enrolled in the school.");
		
		
	}
}
