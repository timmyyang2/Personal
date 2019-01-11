package chapter9; //package name

public class MagazineList { //PROJECT 9.2
	
	//declares both head and tail to keep track of the head and tail of the list
	private MagazineNode head;
	private MagazineNode tail;
	
	//Constructor that initializes both head and tail as null to begin with
	public MagazineList() {
		head = null;
		tail = null;
	}

	//method to add the node to the end and set it as a new tail
	public void add(Magazine mag) {
		MagazineNode node = new MagazineNode (mag); // creates a new node 
		if (head == null) { //if nothing in the list
			head = node; //starts with the new node
			tail = node; //ends at the new node
		} else { //else
			tail.next = node; //makes the next of tail link to this new node
			tail = node; //sets this new node as a new tail
		}
	}
	 	
	//method to link the node to the previous one and the next one at the position where it is smaller than the current node
	public void insert(Magazine mag) {
		MagazineNode node = new MagazineNode (mag); //creates an inserted MagazineNode  
		if (head == null) { //if the list is empty
			head = node; //makes this node as head
 			tail = node; //makes this node as tail 
		} else {
			MagazineNode current = head; //initializes the current node with head
			MagazineNode previous = head; //initializes the previous node with head
			
			//keeps comparing the inserted node with the current node and if the inserted node is bigger than the current one
			while (current.next != null && current.magazine.compareTo(mag) < 0) {   
				previous = current; //moves the previous node to the current one
				current = current.next; //moves the current node to the next one
			}
			
			if(current == head) { //if the inserted node smaller than head
				head = node; //makes it as head
			}else { //else
				previous.next = node; //makes the previous node link to this node
			}
			node.next = current; //makes this node link to the next node so that this node is inserted
			
			if(current.next == null) { //if the current node links to null, meaning it is the end
				tail = current; //makes this node as a new tail
			}
		}
	}
	
	//method to loop through the list and unlinks the node if it is found 
	public void delete(Magazine mag) {
		//sets all MagazineNode variables to head
		MagazineNode current = head;
		MagazineNode previous = head;
		MagazineNode next = head;

		//while there is a next element and they are not equal
		while (current.next != null && current.magazine.compareTo(mag) != 0) {
			//if previous condition is true do these assignments
			previous = current;
			current = current.next;
			next = current.next;
		}
		//once condition above is not met do these assignments
		previous.next = next;
		current = null;
	}

	//method to make head and tail link to null so that the list starts all over
	public void reset() {
		head = null;
		tail = null;
	}
	
	//method to print out the list info
	public String toString() {
		String result = "";
		MagazineNode current = head;
		while (current != null) {
			result += current.magazine + "\n";
			current = current.next;
		}
		return result;
	}
	
	//class that defines MagazineNode 
	private class MagazineNode {
		//declares the Magazine variable and the next MagazineNode
		private Magazine magazine;
		private MagazineNode next;

		//constructor with the Magazine parameter
		public MagazineNode(Magazine mag) {
			magazine = mag;
			next = null;
		}
	}
}
