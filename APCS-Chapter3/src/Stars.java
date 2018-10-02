
public class Stars { //PROJECT 3.12
	
	private static final int ROW = 10; //defines a constant ROW as 10
	
	public static void printStarA() { //prints start A pattern
		for (int i = ROW; i >= 1; i--) { //first loop starts from ROW to 1, decremented by 1
			for (int j = 1; j <= i; j++) { //second loop
				System.out.print("*"); //prints * from 1 to the current index of the first loop, incremented by 1
	        }
	        System.out.println(); //prints a new line
	    }
	}
	
	public static void printStarB() { //prints start B pattern
        for (int i = 1; i <= ROW; i++) { //first loop starts from 1 to ROW, incremented by 1
        	for (int j = 1; j <= ROW - i; j++) { //second loop
        		System.out.print(" "); //prints space from 1 to ROW - i, incremented by 1
	        }
        	 
            for (int k = i; k >= 1; k--) { //third loop
                System.out.print("*"); //prints * from the current index of the first loop to 1, decremented by 1
            }
            System.out.println(); //prints a new line
        }
	}
	
	public static void printStarC() { //prints start C pattern
        for (int i = 1; i <= ROW; i++) { //first loop starts from 1 to ROW, incremented by 1
            for (int j = 2; j <= i; j++) { //second loop 
                System.out.print(" "); //prints leading space from 2 to the current index of the first loop, incremented by 1
            }

            for (int k = i; k <= ROW; k++) {//third loop
                System.out.print("*"); //prints * from the current index of the first loop to ROW, incremented by 1
            }
            System.out.println(""); //prints a new line
        }
  	}
      
	public static void printStarD() { //prints start D pattern
		int number = ROW/2; //divides ROW by 2
		int count = number - 1; //defines and initializes the count 
		for (int k = 1; k <= number; k++) { //first loop starts from 1 to number defined above, incremented by 1
			for (int i = 1; i <= count; i++) { //second loop
				System.out.print(" "); //prints the space from 1 to count, incremented by 1
			}
			count--; //decrement count by 1
        
			for (int i = 1; i <= 2 * k - 1; i++) { //third loop
				System.out.print("*"); //prints * from 1 to 2*(current index of the second loop), incremented by 1
			}
        	System.out.println(); //prints a new line
		}
		
	    count = 1; //increment count by 1
	    for (int k = 1; k <= number - 1; k++) { //first loop starts from 1 to number defined above, incremented by 1
	    	for (int i = 1; i <= count; i++) { //second loop
	    		System.out.print(" "); //prints the space from 1 to count, incremented by 1
	        }
	        count++; //increment count by 1
	        for (int i = 1; i <= 2 * (number - k) - 1; i++) { //third loop
	        	System.out.print("*"); //prints * from 1 to 2*(number - current index of the second loop), incremented by 1
	        }
	        System.out.println(); //prints a new line
	    }
  	}

	public static void main(String[] args) { //main method
		System.out.println("\nPrint star pattern a"); //prints start A pattern
		printStarA(); //runs printStarA method
		
		System.out.println("\nPrint star pattern b"); //prints start B pattern
		printStarB(); //runs printStarB method
		
		System.out.println("\nPrint star pattern c"); //prints start C pattern
		printStarC(); //runs printStarC method
		
		System.out.println("\nPrint star pattern d"); //prints start D pattern
		printStarD(); //runs printStarD method
	}
}