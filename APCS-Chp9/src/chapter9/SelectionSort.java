package chapter9;

//PROJECT 9.3

class Node{
	public int value;
	public Node next;
	public Node(int give){
		value = give;
	}
}

class List{
	private int length;
	private Node begin;
	private Node end;
	public void addList(int value){
		Node node = new Node(value);
		if(length ==0){
			node.next = null;
		}else{
			node.next = begin;
		}
		begin = node;
		length++;
	}

	public void printList(){
		Node node = begin;
		while(node != null){
			System.out.print(node.value + " ");
			node = node.next;
		}
	}
	
	public void selectionSort(){
		for(Node node = begin; node!=null; node = node.next){
			Node min = node;
			for(Node node1 = node; node1!=null; node1 = node1.next){
				if(min.value > node1.value){
					min = node1;
				}

			}
			Node temp = new Node(node.value);
			node.value = min.value;
			min.value = temp.value;
		}
	}
	
	public static void main(String[] args) {
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

