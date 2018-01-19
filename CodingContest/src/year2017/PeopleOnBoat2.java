package year2017;
import java.util.ArrayList;

public class PeopleOnBoat2 {

	public static void input(int n, int k){
		if(n < k || n <= 0){
			System.out.println("Invalid Input!");
		}
		
		ArrayList<Integer> solved = new ArrayList<Integer>();
		solve(n,k,1,solved);
	}
	
	public static void solve(int n, int k, int begin, ArrayList<Integer> solved){
		if(k==solved.size()){
			for(int i=0; i<solved.size(); i++) {
				System.out.print(solved.get(i));
			}
			System.out.print(" ");
		}
		
		for(int i=begin; i<=n; i++){
			solved.add(i);
			solve(n,k,i+1,solved);
			solved.remove(solved.size()-1);
		}
	}
	
	public static void main(String[] args){
		input(5, 3);
	}
	
}