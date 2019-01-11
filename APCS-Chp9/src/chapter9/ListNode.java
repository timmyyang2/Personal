package chapter9;

public class ListNode { //ListNode class
	
	private Object value; //private variables for linked list
	private ListNode next;
	
	public ListNode(Object initValue, ListNode initNext) { //constructor that initializes objects
		value = initValue;
		next = initNext;
	}
	
	public Object getValue() { //getter method to get the value of Object
		return value;
	}
	
	public ListNode getNext() { //getter method to get the next variable
		return next;
	}
	
	public void setValue(Object theNewValue) { //setter method to set the value of the value
		value = theNewValue;
	}
	
	public void setNext(ListNode theNewNext) { //setter method to set the value of the next element
		next = theNewNext;
	}

}