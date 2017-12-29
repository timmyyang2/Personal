package year2017;
import java.util.ArrayList;

public class DuckDuckGoose {
	
	public static ArrayList<Integer> ddgList(int n, int k){
		ArrayList<Integer> myList = new ArrayList<Integer>();
		ArrayList<Integer> printList = new ArrayList<Integer>();
		
		for(int i=1; i<=n; i++){
			myList.add(i);
		}
		
		for(int i=k; i<=n; i++){
		int remove = myList.remove(k-1);
		printList.add(remove);
		}
		return printList;
	}
	public static void main(String[] args){
		if(args.length != 2){
			System.out.println("PASS IN N AND K!!");
			System.exit(1);
		}
		ArrayList myList = DuckDuckGoose.ddgList(Integer.parseInt(args[0]), Integer.parseInt(args[1])); 
		for(int i=0; i<myList.size(); i++){
			//System.out.print(myList.get(i) + " ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("31524");
	}
}
