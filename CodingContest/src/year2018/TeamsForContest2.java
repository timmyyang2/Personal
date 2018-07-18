package year2018;

public class TeamsForContest2 {

	public static void main(String[] args){
		String alpha = "abcdefg";
		for(int i=0; i<alpha.length(); i++){
			System.out.print(alpha.charAt(i));
			for(int j=i; j<alpha.length(); j++){
				System.out.print(alpha.charAt(j));
				for(int k=j; k<alpha.length(); k++){
					System.out.print(alpha.charAt(k));
				}
			}
			System.out.print(" ");
		}
	}
}
