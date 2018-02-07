
public class PascalsTriangle {
	
	public static void triangle(int rows){
		int[] arr1 = {1};
		int[] arr2 = {1,1};
		int[] prev = arr2;
		printArray(arr1);
		printArray(arr2);
		for(int i=0; i<rows-2; i++){
			int[] curr = new int[prev.length+1];
			curr[0] = 1;
			curr[curr.length-1] = 1;
			for(int j=1; j<curr.length-1; j++) {
				 curr[j] = prev[j-1] + prev[j];
			}
			printArray(curr);
			prev = curr;
		}
	}
	
	public static void printArray(int[] arr){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}
	
	public static void main(String[] args){
		triangle(8);

	}
}