
public class Rational implements Comparable { //PROJECT 5.2
	
   private int numerator, denominator; //private ints numerator and denominator
   private final double toler = 0.0001; //constant tolerance as 0.0001

   public Rational (int numer, int denom) { //rational method with 2 parameters
      if (denom == 0) //if denom is equal to 0
         denom = 1; //set denom to 1
      if (denom < 0) { //if denom is less than 0
         numer = numer * -1; //mult numer by -1
         denom = denom * -1; //mult denom by -1
      }
      numerator = numer; //assigns numer to numerator
      denominator = denom; //assigns denom to denominator
      reduce(); //runs reduce method
   }

   public int getNumerator () { //getNumerator method
      return numerator; //returns numerator
   }

   public int getDenominator () { //getDenominator method
      return denominator; //returns denominator
   }

   public Rational reciprocal () { //reciprocal method
      return new Rational (denominator, numerator); //returns new Rational object
   }
   
   public Rational add (Rational op2) { //new Rational method add
      int commonDenominator = denominator * op2.getDenominator(); //assigns the calculation to commonDenominator
      int numerator1 = numerator * op2.getDenominator(); //assigns the calculation to numerator1
      int numerator2 = op2.getNumerator() * denominator; //assigns the calculation to numerator2
      int sum = numerator1 + numerator2; //assigns the calculation to sum
      return new Rational (sum, commonDenominator); //returns new Rational object
   }

   public Rational subtract (Rational op2) { //new Rational method subtract
      int commonDenominator = denominator * op2.getDenominator(); //assigns the calculation to commonDenominator
      int numerator1 = numerator * op2.getDenominator(); //assigns the calculation to numerator1
      int numerator2 = op2.getNumerator() * denominator; //assigns the calculation to numerator2
      int difference = numerator1 - numerator2; //assigns the calculation to difference
      return new Rational (difference, commonDenominator); //returns new Rational object
   }

  public Rational multiply (Rational op2) { //new Rational method multiply
     int numer = numerator * op2.getNumerator(); //numerator multiply
     int denom = denominator * op2.getDenominator(); //denominator multiply
     return new Rational (numer, denom); //returns new Rational object
  }

  public Rational divide (Rational op2) { //new Rational method divide
     return multiply (op2.reciprocal()); //returns multiply
  }

  public boolean equals (Rational op2) { //boolean method equals
     return ( numerator == op2.getNumerator() &&
              denominator == op2.getDenominator() ); //returns if numerator and denominator are equal
  }

  public String toString () { //toString method
     String result; //String result

     if (numerator == 0) //if numerator is 0
        result = "0"; //result is "0"
     else
        if (denominator == 1) //else if denominator is 1
           result = numerator + ""; //assigns result as numerator + empty string
        else
           result = numerator + "/" + denominator; //assigns result as numerator + "/" + denominator

     return result; //return result
  }

  private void reduce () { //reduce method
     if (numerator != 0) { //if numerator is not equal to 0
        int common = gcd (Math.abs(numerator), denominator); //assigns gcd to int common
        numerator = numerator / common; //assigns dividing numerator by common to numerator
        denominator = denominator / common; //assigns dividing denominator by common to denominator
     }
  }

  private int gcd (int num1, int num2) { //int gcd method
     while (num1 != num2) //while num1 does not equal num2
        if (num1 > num2) //if num1 is greater than num2
           num1 = num1 - num2; //assigns num1-num2 result to num1
        else //else
           num2 = num2 - num1; //assigns num2-num1 result to num2
     return num1; //returns num1
  }
  
  public int compareTo(Object rational) { //implements comparable interface
	     Rational r = (Rational)rational; //assigns r to (Rational)rational
	     double thisValue = (double)numerator / denominator; //creates double thisValue as numerator/denominator casted by double
	     double otherValue = (double)r.numerator / r.denominator; //creates double otherValue as r.numerator/r.denominator casted by double
	     if (Math.abs(thisValue - otherValue) < toler) { //if thisValue-otherValue is less than toler
	        return 0; //return 0
	     }else if (thisValue > otherValue) { //else if thisValue is greater than otherValue
	           return 1; //return 1
	     }else { //else
	           return -1; //return -1
	     }
	  }
}
