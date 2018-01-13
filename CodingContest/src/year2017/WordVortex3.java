package year2017;

public class WordVortex3 {

	public static void output(String input){
		if(input.isEmpty()){
			System.out.println("Empty string");
		}
		
		int count = input.length() * 2 - 1;
		int length = input.length();
		
		for(int i=1; i<length; i++){
			getStrings(input, i, count);
		}
		
		System.out.println(input + reverseWord(input).substring(1));
		
		for(int i=length-1; i>0; i--){
			getStrings(input, i, count);
		}
	}
	
	private static void getStrings(String input, int i, int count){
		String begin = input.substring(0, i);
		String end = reverseWord(begin);
		char mid = begin.charAt(begin.length()-1);
		System.out.print(begin);
		for(int j=0; j<count-begin.length()-end.length(); j++){
			System.out.print(mid);
		}
		System.out.print(end);
		System.out.print("\n");
	}
	
	private static String reverseWord(String input){
		String flip = "";
		for(int i=input.length()-1; i>=0; i--){
			flip = flip + input.charAt(i);
		}
		return flip;
	}
	
	public static void main(String[] args){
		WordVortex3.output("MARK");
	}
}
