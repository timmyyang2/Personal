package chapter9;

//PROJECT 9.3

class Node{ //helper class that defines the node
	public int value;
	public Node next;
	public Node(int give){
		value = give;
	}
}

class List{ //helper class that checks the values in the list
	private int length; //variables to element locations
	private Node begin;
	private Node end;
	
	public void addList(int value){ //checks to make sure list is legit
		Node node = new Node(value);
		if(length ==0){ //if list has no elements
			node.next = null; //assign the next element as null
		}else{ //else
			node.next = begin; //begin at the first element
		}
		begin = node;
		length++;
	}

	public void printList(){ //method that prints the elements in the list
		Node node = begin;
		while(node != null){ //while there is an element
			System.out.print(node.value + " "); //print out the value
			node = node.next; //assigns the next element to node
		}
	}
	
	public void selectionSort(){ //method that does selection sort using nodes
		//node starts at begin and if there is an element assign node to min and go to the next element
		for(Node node = begin; node!=null; node = node.next){
			Node min = node;
			//node starts at begin and if there is an element assign node to min and go to the next element
			for(Node node1 = node; node1!=null; node1 = node1.next){
				if(min.value > node1.value){ //if min is greater than node1
					min = node1; //assign node1 to min to make it the new min value
				}

			}
			Node temp = new Node(node.value); //swaps elements after looping
			node.value = min.value;
			min.value = temp.value;
		}
	}
	
	public static void main(String[] args) { //main method to test and print out the elements after sorting
		List list = new List();
		list.addList(154);
		list.addList(2234);
		list.addList(32);
		list.addList(41);
		list.addList(534);
		System.out.println("Before sorting:");
		list.printList();
		list.selectionSort();
		System.out.println();
		System.out.println();
		System.out.println("After sorting:");
		list.printList();
	}
}