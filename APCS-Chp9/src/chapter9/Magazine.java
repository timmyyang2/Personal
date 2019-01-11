package chapter9;

public class Magazine implements Comparable { //PROJECT 9.2
	
	private String title;
	
	public Magazine (String newTitle) { //Magazine constructor that initializes title
		title = newTitle;
	}
	
	public String toString () { //toString method to return String
		return title;
	}

	public int compareTo(Object o) { //compareTo method
		Magazine magazine = (Magazine)o;
		return this.toString().compareTo(magazine.toString());
	}
}