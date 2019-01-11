package chapter9;

//PROJECT 9.4

class Node2 { //helper class that defines the node
	int val;
	Node2 next;
	Node2(int x) {
		val = x;
		next = null;
	}
}

public class InsertionSort { //method that does insertion sort using nodes
	public static Node2 insertionSortList(Node2 begin) {
		if (begin == null || begin.next == null)
			return begin;
 
		Node2 newBegin = new Node2(begin.val);
		Node2 node = begin.next;

		while (node != null) {
			Node2 node1 = newBegin;
			Node2 next = node.next;
			
			if (node.val <= newBegin.val) {
				Node2 oldbegin = newBegin;
				newBegin = node;
				newBegin.next = oldbegin;
			} else {
				while (node1.next != null) {
					if (node.val > node1.val && node.val <= node1.next.val) {
						Node2 oldNext = node1.next;
						node1.next = node;
						node.next = oldNext;
					}
					node1 = node1.next;
				}
				if (node1.next == null && node.val > node1.val) {
					node1.next = node;
					node.next = null;
				}
			}
			node = next;
		}
 
		return newBegin;
	}
	
	public static void printList(Node2 x) { //prints the list of elements
		if(x != null){
			System.out.print(x.val + " ");
			while (x.next != null) {
				System.out.print(x.next.val + " ");
				x = x.next;
			}
			System.out.println();
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