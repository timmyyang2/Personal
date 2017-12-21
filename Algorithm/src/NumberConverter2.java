import java.util.Scanner;

public class NumberConverter2 {
	
	static Scanner scanner = new Scanner(System.in); //creates a new scanner which allows user input
	
	public static void decimalToBinary(){
		System.out.print("Enter a valid number to convert from decimal to binary: ");
		int userInput = scanner.nextInt(); //get the user input integer value
		scanner.nextLine();//consumes the extra \n to  make the scanner.nextLine call pass
		System.out.println("The converted number from decimal to binary is " + Integer.toBinaryString(userInput) + ".");
	}
	
	public static void binaryToDecimal(){
		System.out.print("Enter a valid number to convert from binary to decimal: ");
		String userInput = scanner.nextLine(); //get the user input integer value
		System.out.println("The converted number from binary to decimal is " + Integer.parseInt(userInput, 2) + ".");
	}

	public static void decimalToHex(){
		System.out.print("Enter a valid number to convert from decimal to hex: ");
		int userInput = scanner.nextInt(); //get the user input integer value
		scanner.nextLine();//consumes the extra \n to  make the scanner.nextLine call pass
		System.out.println("The converted number from decimal to binary is " + Integer.toHexString(userInput) + ".");
	}
	
	public static void hexToDecimal(){
		System.out.print("Enter a valid number to convert from hex to decimal: ");
		String userInput = scanner.nextLine(); //get the user input integer value
		System.out.println("The converted number from hex to decimal is " + Integer.parseInt(userInput, 16) + ".");
	}
	
	public static void binaryToHex(){
		System.out.println("Enter a valid number to convert from binary to hex: ");
		String userInput = scanner.nextLine(); //get the user input integer value
		int decimal = Integer.parseInt(userInput, 2);
		System.out.println("The converted number from binary to hex is " + Integer.toHexString(decimal) + ".");
		
	}
	
	public static void hexToBinary(){
		System.out.print("Enter a valid number to convert from hex to binary: ");
		String userInput = scanner.nextLine(); //get the user input integer value
		int decimal = Integer.parseInt(userInput, 16);
		System.out.println("The converted number from hex to binary is " + Integer.toBinaryString(decimal) + ".");
	}
	
	public static int inputChoice() {
		int choice = 0;
		while(choice < 1 || choice > 6) {
			System.out.println("What conversion would you like to make?\n"
					+ "decimal to binary (1)\n"
					+ "binary to decimal (2)\n"
					+ "decimal to hex (3)\n"
					+ "hex to decimal (4)\n"
					+ "binary to hex (5)\n"
					+ "hex to binary (6)");
			try {
				choice = scanner.nextInt(); //gets the number from the user input
				scanner.nextLine();//consumes the extra \n to  make the scanner.nextLine call pass
			}catch(Exception e) {
				scanner = new Scanner(System.in);
			}
		}
		return choice;
	}
	
	public static void convert(int choice) {
		boolean done = false;
		while(!done) {
			try {
				if(choice == 1) {
					decimalToBinary();
				}else if(choice == 2){
					binaryToDecimal();
				}else if(choice == 3){
					decimalToHex();
				}else if(choice == 4){
					hexToDecimal();
				}else if(choice == 5){
					binaryToHex();
				}else if(choice == 6){
					hexToBinary();
				}
				done = true;
			}catch(Exception e) { //if you catch faulty input, go to the beginning and ask again.
		         scanner = new Scanner(System.in); //creates a new instance of the Scanner class so that the program can keep going
			}
		}
	}
	
	public static void doNumberConversions() {
		do {
			int choice = inputChoice();
			convert(choice);
			System.out.println("\nDo you want to choose another option? Type 'y' or 'n': ");
			String option = scanner.nextLine();
			if(option.equals("n")) {
				System.out.println("Program is done.");
				break;
			}
		}while(true);
	}
	
	public static void main(String[] args){
		doNumberConversions();
	}
}
