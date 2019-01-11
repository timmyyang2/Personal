package chapter9;

public class CDCollection { //PROJECT 9.1
	
	private CDNode list;
	
	public CDCollection() { //constructor that initializes list variable
		list = null;
	}
	
	public void add(CD cd) { //add method which adds node into the list
		CDNode node = new CDNode(cd); //creates new CDNode object
		CDNode current; //CDNode variable to keep track of current position
		if(list == null) //if list is empty
			list = node; //assign node to list
		else { //if the list contains elements
			current = list; //assign list to current
			while(current.next != null) //while there is a next element
				current = current.next; //assign the next element to current variable
			current.next = node; //assign node to current
		}
	}
	
	public String toString() { //toString method which prints out the list
		String result = ""; //empty string
		CDNode current = list;
		
		//while the current variable is not null
		while(current != null) {
			result += current.cd + "\n"; //append current.cd and a new line to result
			current = current.next; //assigns the next element to current variable
		}
		return result; //returns result
	}
	
	private class CDNode { //class inside a class as a helper class
		public CD cd; //CD variable cd
		public CDNode next; //CDNode variable next
		
		//constructor to initialize cd and next
		public CDNode(CD cd) {
			this.cd = cd;
			next = null;
		}
	}
	
	public static void main(String[] args) { //main method to print test and print out cd list
		CDCollection cd = new CDCollection(); //new CDCollection object
		cd.add(new CD("cd1")); //adding things to the list
		cd.add(new CD("cd2"));
		cd.add(new CD("cd3"));
		System.out.println(cd); //prints out the list
	}
}