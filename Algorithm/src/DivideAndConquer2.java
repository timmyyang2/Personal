
public class DivideAndConquer2 {
	
	public static boolean isEvenNumber (int number){
		if(number % 2 == 0) {
			return true;
		}else{
			return false;
		}
	}
	
	public static int findEvenNumberMin (int number) {
		int result = number/2;
		
		for(int i=2; i<=result; i++){
			boolean done = !isEvenNumber(result);
			if(done) {
				return i;
			}else{
				result = result/2;
			}
		}
		 
		return -1;
	}
	
	public static int findEvenNumberMax (int number) {
		int result = number/2;
	
		for(int i=2; i<=number/2; i++){
			if(result <= 2) {
				return i;
			}else{
				result = result/2;
			}	
		}
	 
		return -1;	
	}
	
	
	public static int findOddNumberMin (int number) {
		return 1;
	}
		
	public static int findOddNumberMax (int number) {
		int maxEven = findEvenNumberMax(number - 1);
		return maxEven;
	}
	
	public static void main(String[] args) {
		int myNumber = 97;
		
		if(myNumber < 2) {
			System.out.println("Number should be greater than 1!");
			return;
		}
		
		if(isEvenNumber(myNumber)){
			System.out.println("Min: " + findEvenNumberMin(myNumber) );
			System.out.println("Max: " + findEvenNumberMax(myNumber) );
		}else{
			System.out.println("Min: " + findOddNumberMin(myNumber) );
			System.out.println("Max: " + findOddNumberMax(myNumber) );
		}
		
	}
}
