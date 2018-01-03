package year2017;

import java.util.ArrayList;

public class PeopleOnBoat {

	public static void transport(int n, int k) {	 
		if (n <= 0 || n < k) {
			System.out.println("Invalid inputs!");
			System.exit(1);
		}
	 
		ArrayList<Integer> result = new ArrayList<Integer>();
		combinePeople(n, k, 1, result); // because it need to begin from 1
	}

	private static void combinePeople(int n, int k, int startPos, ArrayList<Integer> result) {
		if (result.size() == k) {
			for(int i=0; i<result.size(); i++) {
				System.out.print(result.get(i));
			}
			System.out.print(" ");
			return;
		}
	 
		for (int i=startPos; i<=n; i++) {
			result.add(i);
			combinePeople(n, k, i+1, result);
			result.remove(result.size() - 1);
		}
	}

	public static void main(String[] args) {
		transport(5, 3);
	}
}
