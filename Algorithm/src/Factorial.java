import java.math.BigInteger;

public class Factorial {

	static int getFactorial(int n){
		if(n == 1){
			return 1;
		}else{
			return(n * getFactorial(n-1));
		}
	}
	
	static BigInteger getFactorial2(int n){
		 BigInteger fact = BigInteger.valueOf(1);
		 for (int i = 1; i <= n; i++) {
	        fact = fact.multiply(BigInteger.valueOf(i));
		 }
		 return fact;
	}
	
	public static void main(String[] args){
		System.out.println("Factorial of 10 is " + getFactorial(10));
	}
}
