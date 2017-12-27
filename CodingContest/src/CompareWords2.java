import java.util.ArrayList;

public class CompareWords2 {
	
	public static boolean sameLetters1(String input, String input1) {
		if(input.length() != input1.length()){
			return false;
		}
		ArrayList<Character> charList = new ArrayList<Character>();
		for(int i=0; i<input.length(); i++){
			charList.add(input.charAt(i));
		}
		for(int j=0; j<input1.length(); j++){
			Character charObj = new Character(input1.charAt(j));
			charList.remove(charObj);
		}
		return charList.isEmpty();
	
	}

	public static void main(String[] args){
		System.out.println(CompareWords2.sameLetters1("apple", "papel"));
	}
}
