package chapter9; //package name

public class MovieCustomers { //PROJECT 9.5
	 
	//declares a CustomerQueue variable for selling the tickets
	private CustomerQueue customerQueue = new CustomerQueue();
	
	//constructor with an empty customer queue 
	public MovieCustomers() {
	}
	
	//method to add customers to the queue randomly
	public int addCustomers() {
		int number = (int) (Math.random()*10+1); //randomly generates number of customers between 1 and 10
		
		for(int i=0; i<number; i++) { //loops through the number 
			customerQueue.enqueue(new Object()); //adds each of the customer object 
		}
		return number; //returns number
	}
	
	//method to remove customers from the queue
	public int removeCustomers() {
		int queueLength = customerQueue.length(); //assigns the length of the customerQueue to queueLength
		int number = (int) (Math.random()*queueLength); //randomly generates number of customers between 0 and length
		
		for(int i=0; i<number; i++) { //loops through number
			customerQueue.dequeue(); //removes the customers
		}
	
		return number; //returns number
	}
	
	//method to print out remaining number of customers
	public int remainingCustomers() {
		return customerQueue.length(); //returns the number of remaining customers
	}
	
	public static void main(String[] args) { //main method to print out and test
		
		MovieCustomers movieCustomers = new MovieCustomers();
		
		//simulates 3 times customers arrived buying tickets and left after done
		for(int i=0; i<3; i++) {
			System.out.println("+++ Customers arrived to buy tickets: "+movieCustomers.addCustomers());
			System.out.println("--- Customers left the line: "+movieCustomers.removeCustomers());
			System.out.println("");
		}
		
		System.out.println("Customers remaing in line: "+movieCustomers.remainingCustomers());
	}
}