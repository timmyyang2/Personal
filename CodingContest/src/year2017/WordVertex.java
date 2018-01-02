package year2017;

public class WordVertex {
	
	public static void printWordVertex(String inputStr) {
		int totalCount = 2 * inputStr.length() + 1;
		int length = inputStr.length();
		
		// Upper Lines
		for(int i=1; i<length; i++) {
			printCharLine(inputStr, i, totalCount);
		}
		
		// Middle Line
		System.out.println(inputStr + reverseString(inputStr).substring(1));
		
		// Lower Lines
		for(int i=length-1; i>0; i--) {
			printCharLine(inputStr, i, totalCount);
		}
	}
	
	private static void printCharLine(String inputStr, int i, int totalCount) {
		String subStrFront = inputStr.substring(0, i);
		String subStrEnd = reverseString(subStrFront);
		char paddingChar = subStrEnd.charAt(0);
		System.out.print(subStrFront);
		for(int j=0; j<totalCount-subStrFront.length()-subStrEnd.length()-2; j++) {
			System.out.print(paddingChar);
		}
		System.out.print(subStrEnd);
		System.out.print("\n");
	}
	
	private static String reverseString(String inputStr) {
		String reversedStr = "";
		for(int i=inputStr.length()-1; i>=0; i--) {
			reversedStr += inputStr.charAt(i);
		}
		return reversedStr;
	}
	
	public static void main(String[] argd) {
		printWordVertex(new String("JOE").toUpperCase());
	}
}
