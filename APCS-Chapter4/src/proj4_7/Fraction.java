package proj4_7; //package project 4.7

import java.util.Scanner; //imports Scanner package

public class Fraction { //Fraction class
	//defines the private variables for Fraction class
	private int numer; //numerator
	private int denom; //denominator

	//Fraction constructor w/ parameters num and den
	public Fraction(int num, int den) { 
		numer = num; //assigns num to numer
	    denom = den; //assigns den to denom
	}
	 
	public int getNumer() { //getNumer method
		return numer; //returns numer
	}

	public int getDenom() { //getDenom method
		return denom; //returns denom
	}
	
	Fraction add(Fraction x) { //add method with a parameter of Fraction
		Fraction answer; //defines answer as the result of addition of two Fractions
        if(denom == x.denom){ //if denom from each Fraction is the same
        	answer = new Fraction(x.numer + numer, denom); //creates a new Fraction by adding the two numers and keep the same denom
        }else{ //else
        	int den = denom * x.getDenom(); //calculates den
        	int num = numer * x.getDenom() + x.getNumer() * denom; //calculates num 
        	answer = new Fraction(num, den); //creates a new Fraction with the result
        }
        return answer; //returns Fraction answer
    }
	
    Fraction subtract(Fraction x) { //subtract method with a parameter of Fraction
        Fraction answer; //defines answer as the result of subtraction of two Fractions
        if(x.denom == denom){ //if denom from each Fraction is the same
            answer = new Fraction(numer - x.numer, denom); //creates a new Fraction by subtracting the second numers from the first one and keep the same denom
        }else{ //else
        	int den = denom * x.getDenom(); //calculates den
        	int num = numer * x.getDenom() - x.getNumer() * denom; //calculates num 
            answer = new Fraction(num, den); //creates a new Fraction with the result
        }
        return answer; //returns Fraction answer
    }
    
    Fraction multiply(Fraction x) { //multiply method with a parameter of Fraction
        Fraction answer; //defines answer as the result of multiplication of two Fractions
        int num = x.numer * numer; //calculates num
        int den = x.denom * denom; //calculates den
        answer = new Fraction(num, den); //creates a new Fraction with the result
        return answer; //returns Fraction answer
    }

    Fraction divide(Fraction x) { //divide method with a parameter of Fraction
		Fraction answer; //defines answer as the result of division of two Fractions
	    int num = numer * x.denom; //calculates num
	    int den = denom * x.numer; //calculates den
	    answer = new Fraction(num, den); //creates a new Fraction with the result
	    return answer; //returns Fraction answer
    }

    public String toString() {
    	return (Integer.toString(numer) + "/" + Integer.toString(denom));
    }

    public static void main(String[]args) {
		 Scanner sc = new Scanner(System.in); 
		 System.out.print("Enter first fraction separated by /: ");
		 String frac1 = sc.nextLine();
		 String[] fraction1 = frac1.split("/");
		 Fraction frac = new Fraction(Integer.parseInt(fraction1[0]), Integer.parseInt(fraction1[1]));
		 System.out.print("Enter second fraction separated by /: ");
		 String frac2 = sc.nextLine();
		 String[] fraction2 = frac2.split("/");
		 Fraction fracc = new Fraction(Integer.parseInt(fraction2[0]), Integer.parseInt(fraction2[1]));
		 System.out.println("Add: " + frac.add(fracc));
		 System.out.println("Subtract: " + frac.subtract(fracc));
		 System.out.println("Multiply: " + frac.multiply(fracc));
		 System.out.println("Divide: " + frac.divide(fracc));
    }
}