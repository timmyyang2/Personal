package chapter9;

public class CDCollection { //PROJECT 9.1
	
	private CDNode list;
	
	public CDCollection() { //constructor that initializes list variable
		list = null;
	}
	
	public void add(CD cd) { //add method which adds node into the list
		CDNode node = new CDNode(cd);
		CDNode current;
		if(list == null)
			list = node;
		else {
			current = list;
			while(current.next != null)
				current = current.next;
			current.next = node;
		}
	}
	
	public String toString() { //toString method which prints out the list
		String result = "";
		CDNode current = list;
		
		while(current != null) {
			result += current.cd + "\n";
			current = current.next;
		}
		return result;
	}
	
	private class CDNode { //class inside a class as a helper class
		public CD cd;
		public CDNode next;
		
		public CDNode(CD cd) {
			this.cd = cd;
			next = null;
		}
	}
	
	public static void main(String[] args) { //main method to print test and print out cd list
		CDCollection cd = new CDCollection();
		cd.add(new CD("cd1"));
		cd.add(new CD("cd2"));
		cd.add(new CD("cd3"));
		System.out.println(cd);
	}
}