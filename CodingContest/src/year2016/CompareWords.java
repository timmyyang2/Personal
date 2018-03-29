package year2016;
import java.util.Arrays;

public class CompareWords {
	
	public static boolean sameLetters(String input, String input1) {
		if(input.length() < 1 || input1.length() < 1){
			return false;
		}
		  char[] words = input.toCharArray();
		  char[] wordss = input1.toCharArray();
		  Arrays.sort(words);
		  Arrays.sort(wordss);
		  return Arrays.equals(words, wordss);
		}

	public static void main(String[] args){
		System.out.println(CompareWords.sameLetters("ruiurwe", "uiurwre"));
	}
}
