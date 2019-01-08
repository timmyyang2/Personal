package chapter9;

public class Magazine implements Comparable { //PROJECT 9.2
	
	private String title;
	
	public Magazine (String newTitle) {
		title = newTitle;
	}
	
	public String toString () {
		return title;
	}

	public int compareTo(Object o) {
		return 0;
	}
}
