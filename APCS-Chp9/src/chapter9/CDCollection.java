package chapter9;

public class CDCollection { //PROJECT 9.1
	
	private CDNode list;
	
	public CDCollection() {
		list = null;
	}
	
	public void add(CD cd) {
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
	
	public String toString() {
		String result = "";
		CDNode current = list;
		
		while(current != null) {
			result += current.cd + "\n";
			current = current.next;
		}
		return result;
	}
	
	private class CDNode {
		public CD cd;
		public CDNode next;
		
		public CDNode(CD cd) {
			this.cd = cd;
			next = null;
		}
	}
	
	public static void main(String[] args) {
		CDCollection cd = new CDCollection();
		cd.add(new CD("cd1"));
		cd.add(new CD("cd2"));
		cd.add(new CD("cd3"));
		System.out.println(cd);
	}
}

