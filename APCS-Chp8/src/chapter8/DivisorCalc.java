package chapter8;

public class DivisorCalc { //PROJECT 8.2
	
    public static int gcd(int num1, int num2) { //gcd method with int parameters
        if(num2 % num1 == 0) {
           return num1;
        }else {
           return gcd(num2, num1 % num2); //recrusively calls gcd method to find gcd
        }
    }
}
