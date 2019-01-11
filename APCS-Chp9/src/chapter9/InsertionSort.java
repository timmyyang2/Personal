package chapter9;

//PROJECT 9.4

class Node2 { //helper class that defines the node
	//variables
	int val;
	Node2 next;
	Node2(int x) {
		val = x;
		next = null;
	}
}

public class InsertionSort { //method that does insertion sort using nodes
	
	public static Node2 insertionSortList(Node2 begin) { //method to do insertion sort
		if (begin == null || begin.next == null) //if the list is empty or only 1 element
			return begin; //return the list
 
		//new Node2 objects to set beginning and next variables
		Node2 newBegin = new Node2(begin.val);
		Node2 node = begin.next;

		//while there is a next element
		while (node != null) {
			Node2 node1 = newBegin; //assigns newBegin to node1
			Node2 next = node.next; //assigns next element to next
			
			//if the value of node is less then the value of newBegin
			if (node.val <= newBegin.val) {
				//then do these assignments
				Node2 oldbegin = newBegin;
				newBegin = node;
				newBegin.next = oldbegin;
			} else { //else if the conditions above are false
				//while there is a next element
				while (node1.next != null) {
					//if the nod value is greater than that of nod1 and it is less than the next node1 value
					if (node.val > node1.val && node.val <= node1.next.val) {
						//if above conditions are true do these assignments
						Node2 oldNext = node1.next; //assigns next element to oldNext
						node1.next = node; //assigns node to the next node1 element
						node.next = oldNext; //assigns oldNext to the next node element
					}
					node1 = node1.next; //assigns node1 to the next node1 element
				}
				if (node1.next == null && node.val > node1.val) { //if the next element exists and the node value is greater than node1 value
					node1.next = node; //assign node to the next node1 element
					node.next = null; //assigns null (no value) to the next node element
				}
			}
			node = next; //assigns next to node
		}
 
		return newBegin; //returns newBegin
	}
	
	public static void printList(Node2 x) { //prints the list of elements
		if(x != null){ //if there is an element at x
			System.out.print(x.val + " "); //then print out
			while (x.next != null) { //while the next element exists
				System.out.print(x.next.val + " "); //print out
				x = x.next; //assigns next element to x
			}
			System.out.println(); //adds an empty line
		}
 
	}
 
	public static void main(String[] args) { //main method to test and print out the elements after sorting
		Node2 n = new Node2(223);
		Node2 n2 = new Node2(312);
		Node2 n3 = new Node2(41);
		n.next = n2;
		n2.next = n3;
		System.out.println("Before sorting:");
		printList(n);
		System.out.println();
		System.out.println();
		System.out.println("After sorting:");
		printList(insertionSortList(n));
 
	}
}