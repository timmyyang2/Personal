package chapter9; //package name

public class MagazineRack { //PROJECT 9.2

	public static void main (String[] args) { //main method to test sort and delete
		MagazineList rack = new MagazineList();
		
		System.out.println ("--- Test Add Unsorted ---");
		rack.add (new Magazine("Time"));
		rack.add (new Magazine("Nat Geo"));
		rack.add (new Magazine("ESPN"));
		rack.add (new Magazine("Sports Illustrated"));
		rack.add (new Magazine("GQ"));
		System.out.println (rack); //unsorted results
		
		System.out.println ("--- Test Insert Sorted after Reset ---");
		rack.reset();
		rack.add (new Magazine("Time"));
		rack.add (new Magazine("Nat Geo"));
		rack.add (new Magazine("ESPN"));
		rack.add (new Magazine("Sports Illustrated"));
		rack.add (new Magazine("GQ"));
		System.out.println (rack); //sorted results
		
		System.out.println ("--- Test Delete ---");
		rack.delete(new Magazine("Nat Geo"));
		System.out.println (rack); //post-deletion results
	}
}