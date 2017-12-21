public class Converter {

	public static String convert(int choice, String input){	
		try { 
			if(choice == 1){ //Converts a decimal to binary string
				int decimal = Integer.parseInt(input);
				return Integer.toBinaryString(decimal);
			}
			else if(choice == 2){
				//Converts a binary to decimal: ");
				int decimal = Integer.parseInt(input, 2);
				return String.valueOf(decimal);
			}
			else if(choice == 3){
				//Converts a decimal to hex: ");
				int decimal = Integer.parseInt(input);
				return Integer.toHexString(decimal);
			}
			else if(choice == 4){
				//Converts a hex to decimal: ");
				int decimal = Integer.parseInt(input, 16);
				return String.valueOf(decimal);
			}
			else if(choice == 5){
				//Converts a binary to hex
    			int decimal = Integer.parseInt(input, 2);
    			return Integer.toHexString(decimal);
			}
			else if(choice == 6){
				//Convert a hex to binary: ");
    			int decimal = Integer.parseInt(input, 16);
    			return Integer.toBinaryString(decimal);
			}
			else{
				return "Please enter a number between 1 and 6";
			}
		}catch(Exception e) { //if you catch faulty input, do this...
			return "Invalid input!";
		}
	}
}

