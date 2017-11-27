import java.util.ArrayList;

public class ArrayListTest {
	
	public static void main(String[] args) {

		String S1 = "Timothy";
		String S2 = "Yichong";
		String S3 = "Shulan";
		String S4 = "Biru";
	
		ArrayList<String> myList = new ArrayList<String>();
		myList.add(S1);
		myList.add(S2);
		myList.add(S3);
		myList.add(S4);
		
		for(String name : myList){
			System.out.println(name);
		}
		for(int i=0; i<myList.size(); i++){
			System.out.println(myList.get(i));
	
		}
		
		
		
	}
}