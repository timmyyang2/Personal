package year2015;

public class LettersInSpiral {

	static char[][] matrix = {{'B','F','Q','G'},
					   {'F','L','N','H'},
					   {'X','K','M','Q'},
					   {'T','I','O','S'}};
	
	public static void printSpiral(int start, int end){
		if(start>=end){
			return;
		}
		for(int i=start; i<end; i++){
			System.out.print(matrix[start][i] + " ");
		}
		for(int j=start+1; j<end; j++){
			System.out.print(matrix[j][end-1] + " ");
		}
		for(int h=end-2; h>start-1; h--){
			System.out.print(matrix[end-1][h] + " ");
		}
		for(int k=end-2; k>start; k--){
			System.out.print(matrix[k][start] + " ");
		}
		printSpiral(start+1,end-1);
	}
	
	public static void main(String[] args){
		printSpiral(0,matrix.length);
	}
}
