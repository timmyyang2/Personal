package year2016;
import java.util.Arrays;

public class CompareWords {
	
	public static boolean sameLetters(String input, String input1) {
		if(input.length() == 0 || input1.length() == 0){
			return false;
		}
		  char[] word = input.toCharArray();
		  char[] word1 = input1.toCharArray();
		  Arrays.sort(word);
		  Arrays.sort(word1);
		  return Arrays.equals(word, word1);
		}

	public static void main(String[] args){
		System.out.println(CompareWords.sameLetters("people", "lepoee"));
	}
}
