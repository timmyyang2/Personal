package chapter9;

public class MagazineRack { //PROJECT 9.2

	public static void main(String[] args) { //main method to test and print out output
		MagazineList rack = new MagazineList();
		rack.add(new Magazine("Time"));
		rack.add(new Magazine("National Geographic"));
		rack.add(new Magazine("ESPN The Magazine"));
		rack.add(new Magazine("Sports Illustrated"));
		rack.add(new Magazine("GQ"));
		System.out.println(rack);
	}
}