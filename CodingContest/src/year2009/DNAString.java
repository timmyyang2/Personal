package year2009;

import java.util.Scanner;

public class DNAString {
	
	public static void dna() {
		String str = "ACGTACGTACGAGTCGTTTTCCCCGGGGACGTACGTAC";
		System.out.print("Enter substring? ");
		Scanner scannerr = new Scanner(System.in);
		String word = scannerr.nextLine();
		int count = 0;
		while (str.contains(word)){
		    str = str.replaceFirst(word, " ");
		    count++;
		}
		System.out.println();
		System.out.print("Found = " + count);
	}
	
	public static void main(String[] args) {
		dna();
	}

}
