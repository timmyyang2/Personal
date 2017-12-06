
public class BinaryToHex {

	public static void main(String[] args) {
		String numberStr = "101000111011111";
		String output = "";
		
		int index = numberStr.length()-1;
		
		while(index >= 0) {
			int value = 0;
			int first =  Character.getNumericValue(numberStr.charAt(index--));
			value += first;
			
			if(index >= 0) {
				int second = Character.getNumericValue(numberStr.charAt(index--));
				value += second * 2;
			}

			if(index >= 0) {
				int third = Character.getNumericValue(numberStr.charAt(index--));
				value += third * 4;
			}
		
			if(index >= 0) {
				int fourth = Character.getNumericValue(numberStr.charAt(index--));
				value += fourth * 8;
			}
			
			if(value == 10) {
				output = "A" + output;
			}else if(value == 11) {
				output = "B" + output;
			}else if(value == 12) {
				output = "C" + output;
			}else if(value == 13) {
				output = "D" + output;
			}else if(value == 14) {
				output = "E" + output;
			}else if(value == 15) {
				output = "F" + output;
			}else {
				output = value + output;
			}
		}
		
		System.out.println(output);
	}
}
