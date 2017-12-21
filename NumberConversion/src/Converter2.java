import java.util.Scanner;

public class Converter2 {
	
	static Scanner scanner = new Scanner(System.in); //creates a new scanner which allows user input
	
	public static void decimalToBinary(){
		while(true) { //makes sure the user input is a positive number
			System.out.print("Enter a valid number to convert from decimal to binary: ");
    		try { //try doing this...
    			int userInput = scanner.nextInt(); //get the user input integer value
    			System.out.println("The converted number from decimal to binary is " + Integer.toBinaryString(userInput) + ".");
    			break;
    		}catch(Exception e) { //if you catch faulty input, do this...
               scanner = new Scanner(System.in); //creates a new instance of the Scanner class so that the program can keep going
    		}
        }
	}
	
	public static void binaryToDecimal(){
		while(true) { //makes sure the user input is a positive number
			System.out.print("Enter a valid number to convert from binary to decimal: ");
    		try { //try doing this...
    			String userInput = scanner.nextLine(); //get the user input integer value
    			System.out.println("The converted number from binary to decimal is " + Integer.parseInt(userInput, 2) + ".");
    			break;
    		}catch(Exception e) { //if you catch faulty input, do this...
               scanner = new Scanner(System.in); //creates a new instance of the Scanner class so that the program can keep going
    		}
        }
	}

	public static void decimalToHex(){
		while(true) { //makes sure the user input is a positive number
			System.out.print("Enter a valid number to convert from decimal to hex: ");
    		try { //try doing this...
    			int userInput = scanner.nextInt(); //get the user input integer value
    			System.out.println("The converted number from decimal to hex is " + Integer.toHexString(userInput) + ".");
    			break;
    		}catch(Exception e) { //if you catch faulty input, do this...
               scanner = new Scanner(System.in); //creates a new instance of the Scanner class so that the program can keep going
    		}
        }
		
	}
	
	public static void hexToDecimal(){
		while(true) { //makes sure the user input is a positive number
			System.out.print("Enter a valid number to convert from hex to decimal: ");
    		try { //try doing this...
    			String userInput = scanner.nextLine(); //get the user input integer value
    			System.out.println("The converted number from hex to decimal is " + Integer.parseInt(userInput, 16) + ".");
    			break;
    		}catch(Exception e) { //if you catch faulty input, do this...
               scanner = new Scanner(System.in); //creates a new instance of the Scanner class so that the program can keep going
    		}
        }
	}
	
	public static void binaryToHex(){
		while(true) { //makes sure the user input is a positive number
			System.out.print("Enter a valid number to convert from binary to hex: ");
    		try { //try doing this...
    			String userInput = scanner.nextLine(); //get the user input integer value
    			int decimal = Integer.parseInt(userInput, 2);
    			System.out.println("The converted number from binary to hex is " + Integer.toHexString(decimal) + ".");
    			break;
    		}catch(Exception e) { //if you catch faulty input, do this...
               scanner = new Scanner(System.in); //creates a new instance of the Scanner class so that the program can keep going
    		}
        }		
	}
	
	public static void hexToBinary(){
		while(true) { //makes sure the user input is a positive number
			System.out.print("Enter a valid number to convert from hex to binary: ");
    		try { //try doing this...
    			String userInput = scanner.nextLine(); //get the user input integer value
    			int decimal = Integer.parseInt(userInput, 16);
    			System.out.println("The converted number from hex to binary is " + Integer.toBinaryString(decimal) + ".");
    			break;
    		}catch(Exception e) { //if you catch faulty input, do this...
               scanner = new Scanner(System.in); //creates a new instance of the Scanner class so that the program can keep going
    		}
        }			
	}
	
	public static void main(String[] args){
		int count = 0;
		int number = 0;
		do{
			System.out.println("What conversion would you like to make?\n"
					+ "decimal to binary (1)\n"
					+ "binary to decimal (2)\n"
					+ "decimal to hex (3)\n"
					+ "hex to decimal (4)\n"
					+ "binary to hex (5)\n"
					+ "hex to binary (6)");
			try { //try doing this...
				number = scanner.nextInt(); //gets the number from the user input
				scanner.nextLine();//consumes the extra \n to  make the scanner.nextLine call pass
				if(number == 1){
					Converter2.decimalToBinary();
					count++;
				}
				else if(number == 2){
					Converter2.binaryToDecimal();
					count++;
				}
				else if(number == 3){
					Converter2.decimalToHex();
					count++;
				}
				else if(number == 4){
					Converter2.hexToDecimal();
					count++;
				}
				else if(number == 5){
					Converter2.binaryToHex();
					count++;
				}
				else if(number == 6){
					Converter2.hexToBinary();
					count++;
				}
				else{
					System.out.println("Please enter a number between 1 and 6\n");
				}
			}catch(Exception e) { //if you catch faulty input, do this...
				System.out.println("Invalid input\n");
				scanner = new Scanner(System.in); //creates a new instance of the Scanner class so that the program can keep going
			}
		}while(count<1);
	}
}
