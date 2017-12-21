import java.util.Scanner; //imports scanner to allow user input

public class Converter3 { //class
	
	static Scanner scanner = new Scanner(System.in); //creates a new scanner which allows user input
	
	private static void convert(int choice){ //convert method with parameter int choice
		int number = 0; //initiates int number as 0
		String userInput = ""; //initiates String userInput as a blank string
		do{ //start of do while loop
			try { //try doing this...
				if(choice == 1){ //if user inputs 1
					System.out.print("Enter a valid number to convert from decimal to binary: "); //asks user for a valid number
					number = scanner.nextInt(); //gets the number from the user input
					scanner.nextLine();//consumes the extra \n to  make the scanner.nextLine call pass
					System.out.println("The converted number from decimal to binary is " + Integer.toBinaryString(number) + "."); //prints out the converted number
				}
				else if(choice == 2){ //if user inputs 2
					System.out.print("Enter a valid number to convert from binary to decimal: "); //asks user for a valid number
					userInput = scanner.nextLine(); //get the user input integer value
	    			System.out.println("The converted number from binary to decimal is " + Integer.parseInt(userInput, 2) + "."); //prints out the converted number
				}
				else if(choice == 3){ //if user inputs 3
					System.out.print("Enter a valid number to convert from decimal to hex: "); //asks user for a valid number
					number = scanner.nextInt(); //gets the number from the user input
					scanner.nextLine();//consumes the extra \n to  make the scanner.nextLine call pass
	    			System.out.println("The converted number from decimal to hex is " + Integer.toHexString(number) + "."); //prints out the converted number
				}
				else if(choice == 4){ //if user inputs 4
					System.out.print("Enter a valid number to convert from hex to decimal: "); //asks user for a valid number
					userInput = scanner.nextLine(); //get the user input integer value
	    			System.out.println("The converted number from hex to decimal is " + Integer.parseInt(userInput, 16) + "."); //prints out the converted number
				}
				else if(choice == 5){ //if user inputs 5
					System.out.print("Enter a valid number to convert from binary to hex: "); //asks user for a valid number
					userInput = scanner.nextLine(); //get the user input integer value
	    			int decimal = Integer.parseInt(userInput, 2); //parseInt to change from String to int
	    			System.out.println("The converted number from binary to hex is " + Integer.toHexString(decimal) + "."); //prints out the converted number
				}
				else if(choice == 6){ //if user inputs 6
					System.out.print("Enter a valid number to convert from hex to binary: "); //asks user for a valid number
					userInput = scanner.nextLine(); //get the user input integer value
	    			int decimal = Integer.parseInt(userInput, 16); //parseInt to change from String to int
	    			System.out.println("The converted number from hex to binary is " + Integer.toBinaryString(decimal) + "."); //prints out the converted number
				}
				else{ //if user inputs none of the above
					System.out.println("Please enter a number between 1 and 6\n"); //tells user to input a number 1-6
				}
				break; //ends the program once a conversion is made
			}catch(Exception e) { //if you catch faulty input, do this...
				System.out.println("Invalid input\n"); //error message
				scanner = new Scanner(System.in); //creates a new instance of the Scanner class so that the program can keep going
			}
		}while(true); //do everything as long as it stays true
	}
	
	public static void runConverter(){ //runConverter method
		int choice = 0; //initiates int choice as 0 
		do{ //start of do while loop
			System.out.println("What conversion would you like to make?\n"
					+ "decimal to binary (1)\n"
					+ "binary to decimal (2)\n"
					+ "decimal to hex (3)\n"
					+ "hex to decimal (4)\n"
					+ "binary to hex (5)\n"
					+ "hex to binary (6)"); //asks what conversion the user would like to make
			try{ //try doing this...
				choice = scanner.nextInt(); //gets the number from the user input
				scanner.nextLine();//consumes the extra \n to  make the scanner.nextLine call pass
				Converter3.convert(choice); //runs the convert method with what the user inputed
			}catch(Exception e) { //if you catch faulty input, do this...
				System.out.println("Invalid input\n"); //error message
				scanner = new Scanner(System.in); //creates a new instance of the Scanner class so that the program can keep going
			}
		}while(choice < 1 || choice > 6); //do everything while these conditions are true
	}
	
	public static void main(String[] args){ //main method
		Converter3.runConverter(); //calls the runConverter method to run the program
	}
}
