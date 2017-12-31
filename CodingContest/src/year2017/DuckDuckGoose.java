package year2017;
import java.util.ArrayList;

public class DuckDuckGoose {
	
	public static ArrayList<Integer> ddgList(int n, int k){
		ArrayList<Integer> inputList = new ArrayList<Integer>();
		ArrayList<Integer> outputList = new ArrayList<Integer>();
		
		for(int j=0; j<n*n; j++) {
			for(int i=1; i<=n; i++) {
				inputList.add(i);
			}
			if(j==0) {
				System.out.println("InputList: "+inputList);
			}
		}
		
		int currIndex = k-1;
		
		while(true) {
			int value = inputList.get(currIndex);
			outputList.add(value);
			System.out.println("=== OutputList: "+outputList);
			
			if(outputList.size() < n) {
				int move = 1;
				int skip = 0;
				int nextIndex = currIndex+1;
				while(true){
					int valueChecked = inputList.get(nextIndex++);
					if(outputList.contains(valueChecked)) {
						skip++;
					}else {
						move++;
					}
					if(move >= k) {
						currIndex = currIndex + skip + k;
						while(outputList.contains(inputList.get(currIndex))) {
							currIndex++;
						}					
						break;
					}
				}
			}else {
				break;
			}
		}
		return outputList;
	}
	
	public static void main(String[] args){
		System.out.println("OutputList: "+ddgList(5, 3));
	}
}
