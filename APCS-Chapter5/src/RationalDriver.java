
public class RationalDriver { //PROJECT 5.2

   public static void main (String[] args) { //main method
      Rational r1 = new Rational (6, 8); //new Rational object r1 with parameters 6,8
      Rational r2 = new Rational (1, 3); //new Rational object r2 with parameters 1,3
      Rational r3, r4, r5, r6, r7; //Rational variables
      System.out.println ("First rational number: " + r1); //prints first rational number
      System.out.println ("Second rational number: " + r2); //prints second rational number
      int compare = r1.compareTo(r2); //assigns r1 r2 comparison to int compare
      if (compare == 0) { //if compare is 0
         System.out.println ("r1 and r2 are equal."); //prints that both are equal
      }else if (compare < 0) { //if compare is less than 0
            System.out.println ("r1 is less than r2"); //prints that r1 is less than r2
      }else { //else
            System.out.println("r1 is greater than r2"); //prints r1 is greater than r2
      }

      r3 = r1.reciprocal(); //assigns r1.reciprocal to r3
      System.out.println ("\nThe reciprocal of r1 is: " + r3); //prints the reciproal of r1

      r4 = r1.add(r2); //add r1 and r2
      r5 = r1.subtract(r2); //subtract r1 and r2
      r6 = r1.multiply(r2); //multiply r1 by r2
      r7 = r1.divide(r2); //divide r1 by r2

      System.out.println ("r1 + r2: " + r4); //prints out calculation
      System.out.println ("r1 - r2: " + r5); //prints out calculation
      System.out.println ("r1 * r2: " + r6); //prints out calculation
      System.out.println ("r1 / r2: " + r7); //prints out calculation
   }
}