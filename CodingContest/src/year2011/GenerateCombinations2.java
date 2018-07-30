package year2011;

import java.util.Scanner;

public class GenerateCombinations2 {

	public static void comb() {
		String alpha = "";
		System.out.print("Enter n: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int l=1; l<n+1; l++) {
			alpha = alpha + l;
		}
		
		for(int i=0; i<alpha.length(); i++){
			for(int j=i+1; j<alpha.length(); j++){
				for(int k=j+1; k<alpha.length(); k++){
					System.out.print(alpha.charAt(i));
					System.out.print(alpha.charAt(j));
					System.out.print(alpha.charAt(k));
					System.out.println();
				}
			}	
		}
	}
	
	public static void main(String[] args){
		comb();
	}
}
