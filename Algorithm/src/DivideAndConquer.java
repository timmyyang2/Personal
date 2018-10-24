
public class DivideAndConquer {
	
	public static void main(String[] args) {
		
		int prime = 713737773;
		
		boolean isPrimeNumber = isPrimeNumber(prime);
		if(isPrimeNumber == true) {
			System.out.println("Number " + prime + " is a prime number");
		}else{
			System.out.println("Number " + prime + " is not a prime number");
			
		}
		
		int number = 98731737;
		
		boolean isOddNumber = isOddNumber(number);
		if(isOddNumber == true) {
			System.out.println("Number " + number + " is an odd number" );	
		}else{
			System.out.println("Number " + number + " is an even number" );
		}
		
		int year = 2016;
		
		
//		boolean isLeapYear = isLeapYear(year);
//		if(isLeapYear == true) {
//			System.out.println("Year " + year + " is a leap year" );	
//		}else{
//			System.out.println("Year " + year + " is not a leap year" );
//		}
//		
	 }
	
	public static boolean isPrimeNumber(int number) {
		
		int count = 0;
		
		long t1 = System.currentTimeMillis();
		for(int i=2; i<number; i++) {
			if(number % i == 0) {
				System.out.println(number + " can be divided by " + i);
				count++;
			}
		}
		long t2 = System.currentTimeMillis();
		long delta = t2 - t1;
		
		long t3 = System.currentTimeMillis();
		for(int i=2; i<number/2; i++) {
			if(number % i == 0) {
				System.out.println(number + " can be divided by " + i);
				count++;
			}
		}
		long t4 = System.currentTimeMillis();
		long delta2 = t4 - t3;
		
		
		if(count > 0){
			System.out.println("Count: " + count + " Total time1: " + delta);
			System.out.println("Count: " + count + " Total time2: " + delta2);
			return false;
		}else{
			return true;	
		}
	}
	
	public static boolean isOddNumber(int number) {
		
		if(number % 2 == 1) {
			return true;
		}else{
			return false;
		}
	}
	
//	 public static boolean isLeapYear(int year) {
//		
//		if(year % 4 == 0) {
//			return true;
//		}else{
//			return false;
//		}
//	}
	
}

