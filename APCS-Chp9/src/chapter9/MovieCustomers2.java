package chapter9; //package name

public class MovieCustomers2 { //PROJECT 9.6
	
	final int NUM_OF_QUEUES = 4; //defines the number of queues as 4 per requirement

	//declares 4 CustomerQueue variables for selling the tickets
	private CustomerQueue[] customerQueues = new CustomerQueue[NUM_OF_QUEUES];

	//constructor with 4 empty customer queue 
	public MovieCustomers2() {
		for(int i=0; i<NUM_OF_QUEUES; i++) {
			customerQueues[i] = new CustomerQueue();
		}
	}
	
	//method to find the queue that has the shortest length
	private CustomerQueue findShortestQueue() {
		int shortestLength = customerQueues[0].length(); //initializes the length from the first queue
		CustomerQueue shortestCustomerQueue = customerQueues[0]; //initializes the shortest queue from the first queue
		
		//loops through the the number of customers
		for(int i=0; i<customerQueues.length; i++) {
			CustomerQueue customerQueue = customerQueues[i];
			if(customerQueue.length() <= shortestLength) { //checks if the current length of the line is less then the shortLength
				shortestLength = customerQueue.length(); //if that is true, assign the current length as the shortest
				shortestCustomerQueue = customerQueue;
			}
		}

		return shortestCustomerQueue; //returns the shortest line
	}
	
	//method to find the fasted line
	public void findFastestQueue() {
		double fastestMovingRate = customerQueues[0].getMovingRate();
		int index = 0;
		
		//loops though the customer queue
		for(int i=0; i<customerQueues.length; i++) {
			double movingRate = customerQueues[i].getMovingRate(); //defines movingRate
			if(movingRate > fastestMovingRate) { //checks to see if the movingRate is greater than the fastest rate
				fastestMovingRate = movingRate; //assigns movingRate to fastestMovingRate if it is faster than the current one
				index = i;
			}
			System.out.printf("Moving rate for queue: "+i+" with moving rate: %.2f"+"/person", movingRate); //prints out moving rates
			System.out.println();
		}
		
		System.out.println("The fastest queue: "+index); //prints out the fastest queue
	}
	
	//method to add each new customer to the shortest queue
	public void addCustomers() {
		int number = (int) (Math.random()*40+1); //randomly generates number of customers between 1 and 40
		System.out.println("Number of customers arrived: "+number); //prints out the message
		System.out.println("Added customers into the shortest queue"); //prints out the message
		for(int i=1; i<=number; i++) { //loops through the number 
			CustomerQueue customerQueue = findShortestQueue(); //finds the shortest queue to add the customer
			customerQueue.enqueue(new Object()); //adds the customer object to the shortest queue 
		}
		
		//prints out the number of customers in each of the queue
		for(int j=0; j<customerQueues.length; j++) {
			System.out.println("Current customers in queue "+j+": "+customerQueues[j].length());
		}
	}
	
	//method to remove the random number of customers from each queue
	public void removeCustomers() {
		for(int i=0; i<customerQueues.length; i++) { //loops through all the queues and removes random number of customers for each queue
			int queueLength = customerQueues[i].length();
			int number = (int) (Math.random()*queueLength); //randomly generates number of customers between 0 and length
		
			double movingRate = (double)number/queueLength; //calculates the the movingRate
			customerQueues[i].setMovingRate(movingRate); //sets the movingRate
			
			//loops through and removes customers
			for(int j=0; j<number; j++) {
				customerQueues[i].dequeue();
			}
			
			System.out.println("Customers removed from queue "+i+": "+number); //prints out the customers removed
		}
	}

	public static void main(String[] args) {
		
		MovieCustomers2 movieCustomers2 = new MovieCustomers2();
		
		//adds customers to the shortest queue
		System.out.println("Customers arrived to buy tickets: ");
		movieCustomers2.addCustomers();
		
		//removes the customers from each queue
		movieCustomers2.removeCustomers();
		
		//finds the fastest customer queue based upon the above test
		movieCustomers2.findFastestQueue();
	}
}