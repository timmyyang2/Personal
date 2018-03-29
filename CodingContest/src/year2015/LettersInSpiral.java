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
		for(int k=end-2; k>start-1; k--){
			System.out.print(matrix[end-1][k] + " ");
		}
		for(int h=end-2; h>start; h--){
			System.out.print(matrix[h][start] + " ");
		}
		printSpiral(start+1,end-1);
	}
	
	public static void main(String[] args){
		printSpiral(0,matrix.length);
	}
}
