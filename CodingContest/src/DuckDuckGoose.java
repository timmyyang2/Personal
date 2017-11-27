import java.util.ArrayList;

public class DuckDuckGoose {
	
	public static void main(String[] args){
		
		String S1 = "1";
		String S2 = "2";
		String S3 = "3";
		String S4 = "4";
		String S5 = "5";
		String S6 = "6";
		String S7 = "7";
		
		ArrayList<String> myList = new ArrayList<String>();
		myList.add(S1);
		myList.add(S2);
		myList.add(S3);
		myList.add(S4);
		myList.add(S5);
		myList.add(S6);
		myList.add(S7);
		
		int k = 3;
		for(int i = 0; i<(k-1); i++){
			String e = myList.remove(0);
			myList.add(e);
		}
		
	}
}
