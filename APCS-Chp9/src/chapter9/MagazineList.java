package chapter9;

public class MagazineList { //PROJECT 9.2
	
	private MagazineNode list;
	
	 public MagazineList() {
		 list = null;
	 }

	 public void add (Magazine mag) {
		 MagazineNode node = new MagazineNode (mag);
		 MagazineNode current;
		 if (list == null)
			 list = node;
		 else {
			 current = list;
			 while (current.next != null)
				 current = current.next;
			 	 current.next = node;
		 }
	 }

	 public String toString () {
		 String result = "";
		 MagazineNode current = list;
		 while (current != null) {
			 result += current.magazine + "\n";
			 current = current.next;
		 }
		 return result;
	 }
	 
	 public void insert() {

	 }
	 
	 public void delete() {
		 
	 }

	 private class MagazineNode {
		 public Magazine magazine;
		 public MagazineNode next;

		 public MagazineNode (Magazine mag) {
			 magazine = mag;
			 next = null;
		 }
	 }
}