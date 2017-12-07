
public class NumberConverter {
	
	public static String decimalToBinary(int decimal) {
		String binaryString = "";
		int result = decimal;
		while(true){
			int remainder = result%2;
			binaryString = remainder + binaryString;
			result = result/2;
			if(result == 0){
				break;
			}
		}
		return binaryString;
	}
	
	public static int binaryToDecimal(String binaryString) {
		int value = 0;
		for(int i=binaryString.length()-1; i>=0; i--) {
			int digit = Character.getNumericValue(binaryString.charAt(i));
			int power = binaryString.length() - 1 - i;
			if(digit > 0) {
				int tempVal = 1;
				for(int j=1; j<=power; j++) {
					tempVal = tempVal*2;
				}
				value += tempVal*digit;
//				value += Math.pow(2, power);
			}
		}
		return value;
	}
	
	
	public static String decimalToHex(int decimal) {
		String hexString = "";
		int result = decimal;
		while(true){
			int remainder = result%16;
			if(remainder == 10){
				hexString = "A" + hexString;
			}
			else if(remainder == 11){
				hexString = "B" + hexString;
			}
			else if(remainder == 12){
				hexString = "C" + hexString;
			}
			else if(remainder == 13){
				hexString = "D" + hexString;
			}
			else if(remainder == 14){
				hexString = "E" + hexString;
			}
			else if(remainder == 15){
				hexString = "F" + hexString;
			}
			else{
				hexString = remainder + hexString;
			}
			result = result/16;
			if(result == 0){
				break;
			}
		}
		return hexString;
	}
	
	public static int hexToDecimal(String hexString) {
		int value = 0;
		for(int i=hexString.length()-1; i>=0; i--) {
			int digit = 0;
			if(hexString.charAt(i) == 'A' || hexString.charAt(i) == 'a') {
				digit = 10;
			}else if(hexString.charAt(i) == 'B' || hexString.charAt(i) == 'b') {
				digit = 11;
			}else if(hexString.charAt(i) == 'C' || hexString.charAt(i) == 'c') {
				digit = 12;
			}else if(hexString.charAt(i) == 'D' || hexString.charAt(i) == 'd') {
				digit = 13;
			}else if(hexString.charAt(i) == 'E' || hexString.charAt(i) == 'e') {
				digit = 14;
			}else if(hexString.charAt(i) == 'F' || hexString.charAt(i) == 'f') {
				digit = 15;
			}else {
				digit = Character.getNumericValue(hexString.charAt(i));
			}
				
			int power = hexString.length() - 1 - i;
			if(digit > 0) {
				int tempVal = 1;
				for(int j=1; j<=power; j++) {
					tempVal = tempVal*16;
				}
				value += tempVal*digit;
			}
		}
		return value;
	}

	
	public static String binaryToHex(String binaryString) {
		String hexString = "";
		int index = binaryString.length()-1;
		while(index >= 0) {
			int value = 0;
			int first =  Character.getNumericValue(binaryString.charAt(index--));
			value += first;
			
			if(index >= 0) {
				int second = Character.getNumericValue(binaryString.charAt(index--));
				value += second * 2;
			}

			if(index >= 0) {
				int third = Character.getNumericValue(binaryString.charAt(index--));
				value += third * 4;
			}
		
			if(index >= 0) {
				int fourth = Character.getNumericValue(binaryString.charAt(index--));
				value += fourth * 8;
			}
			
			if(value == 10) {
				hexString = "A" + hexString;
			}else if(value == 11) {
				hexString = "B" + hexString;
			}else if(value == 12) {
				hexString = "C" + hexString;
			}else if(value == 13) {
				hexString = "D" + hexString;
			}else if(value == 14) {
				hexString = "E" + hexString;
			}else if(value == 15) {
				hexString = "F" + hexString;
			}else {
				hexString = value + hexString;
			}
		}
		return hexString;
	}
	
	public static String hexToBinary(String hexString) {
		int decimal = hexToDecimal(hexString);
		String binary = decimalToBinary(decimal);
		return binary;
	}
	
	public static void main(String[] args) {
		int decimal = 20959;
		String binaryString = decimalToBinary(decimal);
		String hexString = decimalToHex(decimal);
		
		System.out.println("The input decimal: " + decimal);
		System.out.println("------------------------------------");
		System.out.println("Decimal to binary: " + binaryString);
		System.out.println("Decimal to hex: "+ hexString);
		System.out.println("Binary to hex: "+ binaryToHex(binaryString));
		System.out.println("------------------------------------");
		System.out.println("Binary to decimal: " + binaryToDecimal(binaryString));
		System.out.println("Hex to decimal: "+ hexToDecimal(hexString));
		System.out.println("Hex to binary: "+ hexToBinary(hexString));
		System.out.println("------------------------------------");
		
		System.out.println("Decimal -> Binary: "+Integer.toBinaryString(20959));
		System.out.println("Binary -> Decimal: "+Integer.parseInt("101000111011111", 2));
		
		System.out.println("Decimal -> Hex: "+Integer.toHexString(20959));
		System.out.println("Hex -> Decimal:" + Integer.parseInt("51DF", 16));
		
		System.out.println("Binary -> Hex: "+ Integer.toHexString(Integer.parseInt("101000111011111", 2)));
		System.out.println("Hex -> Binary: "+ Integer.toBinaryString(Integer.parseInt("51DF", 16)));
	}
}
