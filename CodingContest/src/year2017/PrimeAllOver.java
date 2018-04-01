package year2017;

public class PrimeAllOver {

	private static boolean isPrime(int n){
		if(n < 2 || n % 2 == 0){
			return false;
		}else{
			for(int i=2; i<n; i++){
				if(n % i == 0){
					return false;
				}
			}
		}
		return true;
	}
	
	private static void largestPrime(){
		String greatestValue = "";
		for(int i=0; i<=9999999; i++){
			String stringValue = Integer.toString(i);
			boolean prime = true;
			for(int j=0; j<stringValue.length(); j++){
				if(!isPrime(Integer.parseInt(stringValue.substring(0, j+1)))){
					prime = false;
					break;
				}
			}
			if(prime){
				greatestValue = stringValue;
			}
		}
		for(int k=0; k<greatestValue.length(); k++){
			System.out.println(greatestValue.substring(0, k+1) + " is prime.");
		}
	}
	
	public static void main(String[] args){
		PrimeAllOver.largestPrime();
	}
}
