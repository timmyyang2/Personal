package year2018;

public class TeamsForContest2 {

	public static void main(String[] args){
		String alpha = "12345";
		for(int i=0; i<alpha.length(); i++){
			for(int j=i+1; j<alpha.length(); j++){
				for(int k=j+1; k<alpha.length(); k++){
					System.out.print(alpha.charAt(i));
					System.out.print(alpha.charAt(j));
					System.out.print(alpha.charAt(k));
					System.out.print(" ");
				}
			}	
		}
	}
}
