
public class Calc {
	
	private int calc(double a, double b) {
		int num = (int) (a * b);
		b = a;
		num = (int) (a + b);
		return num;
	}
	
	public void printStuff() {
		double x = 5.1, y = 6.2;
		System.out.println(calc(x,0) + calc(0,y));
	}
	
	public static void main(String[] args) {
		Calc calc = new Calc();
		calc.printStuff();
	}

}
