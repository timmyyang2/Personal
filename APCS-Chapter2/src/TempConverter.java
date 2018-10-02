import java.util.Scanner; //imports Scanner for user input

public class TempConverter { //PROJECT 2.4

	public static void temp() { //temp method for Fahrenheit to Celsius conversion
		float celsius; //defines float celsius variable
		float fahrenheit; //defines float fahrenheit variable
	    try { //try-catch to check for error inputs
	        Scanner sc = new Scanner(System.in); //Scanner for user input
	        System.out.print("Enter temperature in Fahrenheit: "); //asks user for temperature in Fahrenheit
	        fahrenheit = sc.nextFloat(); //assigns the user input (float) to fahrenheit variable
	        celsius = (float) ((fahrenheit-32)*(0.5556)); //converts the fahrenheit value and assigns it to celsius variable
	        System.out.printf("Temperature in Celsius:  %.2f", celsius); //prints out the conversion
	    }catch(Exception e) { //catches error input
	       	System.out.println("Error."); //error message
	    }
	}
	
	public static void main(String[] args) { //main method
		temp(); //runs temp method
	}
}
