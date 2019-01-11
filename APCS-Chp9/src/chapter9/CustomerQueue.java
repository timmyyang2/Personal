package chapter9; //package name

public class CustomerQueue {  //PROJECT 9.5 and 9.6

	//declares head and tail for this queue
	private Customer head;
	private Customer tail;
	
	//initializes the moving rate as 0
	private double movingRate = 0; 
	
	//constructor that initializes both head and tail as null to begin with
	public CustomerQueue() {
		head = null;
		tail = null;
	}
	
	//method to add a customer object to the end
	public void enqueue(Object object) {
		Customer customer = new Customer(object);
		if (head == null) { //if nothing in the list
			head = customer; //starts with the new customer
			tail = customer; //ends at the new customer
		} else { //else
			tail.next = customer; //makes the next of tail link to this new customer
			tail = customer; //sets this new customer as a new tail
		}
	}
	
	//method to remove a customer from the beginning
	public Customer dequeue() {
		if(head == null) { //if head is null
			return null; //returns null
		}
		
		Customer removedCustomer = head; //sets head as removedCustomer
		head = head.next; //sets next to head since head is removed
		return removedCustomer; //returns removedCustomer
	}
	
	//method to check the length of the queue
	public int length() {
		int length = 0; //initializes the length as 0

		if(head != null) { //if head is not null
			length++; //increments length by 1 
			Customer current = head; //sets current with head
			while(current.next != null) { //if next is not null
				current = current.next; //keeps moving
				length++; //increments length by 1
			}
		} 
		
		return length; // returns the length of the queue
	}
	
	//set method for the moving rate
	public void setMovingRate(double movingRate) {
		this.movingRate = movingRate;
	}
	
	//get method for the moving rate
	public double getMovingRate() {
		return movingRate;
	}
	
	//class definition of Customer
	public class Customer {
		private Object object;
		private Customer next;
		
		//constructor with the Object parameter
		private Customer(Object obj) {
			object = obj;
			next = null;
		}
	}
}
