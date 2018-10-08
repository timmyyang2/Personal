import java.util.Scanner;

public class Fraction {
	private int numer;
	private int denom;
	private Fraction answer;
	
	public Fraction(int num, int den) {
		numer = num;
	    denom = den;
	}
	 
	public int getNumer() {
		return numer;
	}

	public int getDenom() {
		return denom;
	}
	
	Fraction add(Fraction x) {
		Fraction answer;
        if(denom == x.denom){
        	answer = new Fraction(x.numer + numer, denom);
        }else{
        	int den = denom * x.getDenom();
        	int num = numer * x.getNumer();
        	num += x.getNumer() * denom;
        	answer = new Fraction(num, den);
        }
        return answer;
    }
	
    Fraction subtract(Fraction x) {
        Fraction answer;
        if(x.denom == denom){
            answer = new Fraction(numer - x.numer, denom);
        }else{
            int den = denom / x.getDenom();
            int num = numer / x.getNumer();
            num -= x.getNumer() * denom;
            answer = new Fraction(num, den);
        }
        return answer;
    }
    
    Fraction multiply(Fraction x) {
        Fraction answer;
        int num = x.numer * numer;
        int den = x.denom * denom;
        answer = new Fraction(num, den);
        return answer;
    }

    Fraction divide(Fraction x) {
		Fraction answer;
	    int num = x.numer * denom;
	    int den = x.denom * numer;
	    answer = new Fraction(num, den);
	    return answer;
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