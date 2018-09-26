import java.util.Scanner;

public class TempConverter { //project 2.4

	public static void temp() {
		   float celsius;
		   float fahrenheit;
	        try {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter temperature in Fahrenheit: ");
	        fahrenheit = sc.nextFloat();
	        celsius = (float) ((fahrenheit-32)*(0.5556));
	        System.out.println("Temperature in Celsius: "+ celsius);
	        }catch(Exception e) {
	        	System.out.println("Error.");
	        }
	}
	public static void main(String[] args) {
		temp();
	}
}
