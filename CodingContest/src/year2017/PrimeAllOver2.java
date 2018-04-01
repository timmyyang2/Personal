package year2017;

public class PrimeAllOver2 {
	
	public static boolean isPrime(int n){
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
	
	public static void largePrime(){
		String largePrime = "";
		for(int i=0; i<9999999; i++){
			String value = Integer.toString(i);
			boolean prime = true;
			for(int j=0; j<value.length(); j++){
				if(!isPrime(Integer.parseInt(value.substring(0,j+1)))){
					prime = false;
					break;
				}
			}
			if(prime==true){
				largePrime = value;
			}
		}
		for(int k=0; k<largePrime.length(); k++){
			System.out.println(largePrime.substring(0,k+1) + " is prime.");
		}
	}
	
	public static void main(String[] args){
		largePrime();
	}

}
