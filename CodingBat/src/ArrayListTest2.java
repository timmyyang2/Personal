import java.util.ArrayList;

public class ArrayListTest2 {
	
	public static void main(String[] agrs){
		
		String S1 = "1";
		String S2 = "2";
		String S3 = "3";
		String S4 = "4";
		String S5 = "5";
		
		ArrayList<String> myLists = new ArrayList<String>();
		myLists.add(S1);
		myLists.add(S2);
		myLists.add(S3);
		myLists.add(S4);
		myLists.add(S5);
//  	myLists.add(4, "John");
		String yuhe = myLists.remove(2);
		System.out.println(yuhe);
		String yuhe1 = myLists.remove(0);
		System.out.println(yuhe1);
		String yuhe2 = myLists.remove(2);
		System.out.println(yuhe2);
//		for(int i=0; i<myLists.size(); i++){
//			System.out.println(myLists.get(i));
//		}
	}

}
