package year2014;

public class WordTriangle {
	
	public static void printWord(int n){
		String word = "TURING";
		String word1 = "";
		int result = n/word.length();
		int remainder = n%word.length();
		for(int k=0; k<result; k++){
		for(int i=0; i<word.length(); i++){
			word1 = word1+word.charAt(i);
			System.out.println(word1);
		}
		}
		for(int j=0; j<remainder; j++){
			word1 = word1+word.charAt(j);
			System.out.println(word1);
		}
	}

	public static void main(String[] args){
		printWord(20);
	}
}
