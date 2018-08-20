package year2009;

import java.util.Scanner;

public class DNAString {
	
	public static void dna() {
		String str = "ACGTACGTACGAGTCGTTTTCCCCGGGGACGTACGTAC";
		System.out.print("Enter substring? ");
		Scanner scannerr = new Scanner(System.in);
		String word = scannerr.nextLine();
		int count = 0;
		int index = 0;
		String meme = "";
		for(int i=0; i<word.length(); i++) {
			meme = meme + '*';
		}
		while (str.contains(word)){
			index = str.indexOf(word);
		    str = str.replaceFirst(word, meme);
		    System.out.print(index + " ");
		    count++;
		}
		System.out.println();
		System.out.print("Found = " + count);
	}
	
	public static void main(String[] args) {
		dna();
	}

}
