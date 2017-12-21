import java.util.Scanner;

public class Converter1 {
	
	static Scanner scanner = new Scanner(System.in); //creates a new scanner which allows user input

	public static String decimalToBinary(int num){
		String output = "";
		int result = num;
		while(true){
			int remainder = result%2;
			output = remainder + output;
			result = result/2;
			if(result == 0){
				break;
			}
		}
		return output;
	}
	
	public static String decimalToHex(int num){
		String output = "";
		int result = num;
		while(true){
			int remainder = result%16;
			if(remainder == 10){
				output = "A" + output;
			}
			else if(remainder == 11){
				output = "B" + output;
			}
			else if(remainder == 12){
				output = "C" + output;
			}
			else if(remainder == 13){
				output = "D" + output;
			}
			else if(remainder == 14){
				output = "E" + output;
			}
			else if(remainder == 15){
				output = "F" + output;
			}
			else{
				output = remainder + output;
			}
			result = result/16;
			if(result == 0){
				break;
			}
		}
		return output;
	}
	
	public static String binaryToHex(String binaryString){
		String output = "";
		int index = binaryString.length()-1;
		while(true){
			int value = 0;
			int first = Character.getNumericValue(binaryString.charAt(index--));
			value += first;
			
			if(index >= 0){
				int second = Character.getNumericValue(binaryString.charAt(index--));
				value += second*2;
			}
			if(index >= 0){
				int third = Character.getNumericValue(binaryString.charAt(index--));
				value += third*4;
			}
			if(index >= 0){
				int four = Character.getNumericValue(binaryString.charAt(index--));
				value += four*8;
			}
			
			if(value == 10){
				output = "A" + output;
			}
			else if(value == 11){
				output = "B" + output;
			}
			else if(value == 12){
				output = "C" + output;
			}
			else if(value == 13){
				output = "D" + output;
			}
			else if(value == 14){
				output = "E" + output;
			}
			else if(value == 15){
				output = "F" + output;
			}
			else{
				output = value  + output;
			}
			if(index < 0){
				break;
			}
		}
		return output;
	}
	
	public static int binaryToDecimal(String binaryInput){
		int decimal = 0;
		int power = 0;
		for(int i=binaryInput.length()-1; i>=0; i--){
			int index = Character.getNumericValue(binaryInput.charAt(i));
			decimal += index * Math.pow(2, power);
			power++;
		}
		return decimal;
	}
	public static boolean isValidBinaryString(String userInput){
		for(int i=0; i<userInput.length(); i++){
			if(userInput.charAt(i) != '0' && userInput.charAt(i) != '1'){
				System.out.println(userInput + " is invaild.");
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args){
		String choice1 = "";
		String choice2 = "";
		while(true) { //makes sure the user input is a positive number
    		try { //try doing this...
    			//number = scanner.nextInt(); //gets the number from the user input
    			System.out.print("Please enter 1st binary number: ");
    			choice1 = scanner.nextLine(); //gets the number from the user input
    			System.out.print("Please enter 2nd binary number: ");
    			choice2 = scanner.nextLine(); //gets the number from the user input
    			if(Converter1.isValidBinaryString(choice1) && Converter1.isValidBinaryString(choice2)){
    				int d1 = Converter1.binaryToDecimal(choice1);
        			int d2 = Converter1.binaryToDecimal(choice2);
        			int value = d1 + d2;
        			String sum = Converter1.decimalToBinary(value);
        			System.out.println(sum);
    				break;	
    			}
    		}catch(Exception e) { //if you catch faulty input, do this...
    			System.out.println("Error: " + e.getMessage());
               scanner = new Scanner(System.in); //creates a new instance of the Scanner class so that the program can keep going
    		}
        }
	}
}