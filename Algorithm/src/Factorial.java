
public class Factorial {

	static int getFactorial(int n){
		if(n == 1){
			return 1;
		}else{
			return(n * getFactorial(n-1));
		}
	}
	
	public static void main(String[] args){
		System.out.println("Factorial of 5 is " + getFactorial(5));
	}
}
