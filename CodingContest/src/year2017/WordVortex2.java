package year2017;

public class WordVortex2 {
	
	public static void printWord(String input) {
		if(input.isEmpty()){
			System.out.println("No input");
		}
		
		int count = input.length() * 2 - 1;
		int length = input.length();
		
		for(int i=1; i<length; i++){
			WordVortex2.printVortex(input, i, count);
		}
		
		System.out.println(input + reverse(input).substring(1));
		
		for(int i=length-1; i>0; i--) {
			WordVortex2.printVortex(input, i, count);
		}
	}
	
	private static void printVortex(String input, int i, int count) {
		String front = input.substring(0, i);
		String back = reverse(front);
		char middle = front.charAt(front.length()-1);
		System.out.print(front);
		for(int j=0; j<count-front.length()-back.length(); j++) {
			System.out.print(middle);
		}
		
		System.out.print(back);
		System.out.print("\n");
	}
	
	private static String reverse(String input) {
		String backward = "";
		for(int i=input.length()-1; i>=0; i--) {
			backward = backward + input.charAt(i);
		}
		return backward;
	}
	
	public static void main(String[] args){
		WordVortex2.printWord("MARK");
	}
}
