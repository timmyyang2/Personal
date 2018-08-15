package year2010;

import java.util.Scanner;

public class PerfectCubes {
	
	public static void cube() {
		System.out.print("Enter a integer? (1-100): ");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		for(int i=0; i<input; i++) {
			for(int j=i+1; j<input; j++) {
				for(int l=j+1; l<input; l++) {
					int cubeSum = (i*i*i) + (j*j*j) + (l*l*l);
					if(cubeSum == input*input*input) {
						System.out.println(input + " (" + i + " " + j + " " + l + ")");
					}
				}
			}
			
		}
		
	}

	public static void main(String[] args) {
		cube();
	}
}
