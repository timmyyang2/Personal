
public class Stars {

	public static void stara() {
		 for (int row = 10; row >= 1; --row) {
	            for (int col = 1; col <= row; ++col) {
	                System.out.print("*");
	            }
	 
	            System.out.println();
	        }
	}
	
	public static void starb() {
		 int val = 10;
	        for (int i = 1; i <= val; i++) {
	            for (int j = 1; j <= val - i; j++) {
	                System.out.print(" ");
	            }
	            for (int k = 1; k <= i; k++) {
	                System.out.print("*");
	            }
	            System.out.println("");
	        }
        
	}
	
	  public static void starc() {
		 
  	}
      
      public static void stard() {
    	  int number = 5;
          int count = number - 1;
          for (int k = 1; k <= number; k++) {
              for (int i = 1; i <= count; i++)
                  System.out.print(" ");
              count--;
              for (int i = 1; i <= 2 * k - 1; i++)
                  System.out.print("*");
              System.out.println();
          }
          count = 1;
          for (int k = 1; k <= number - 1; k++) {
              for (int i = 1; i <= count; i++)
                  System.out.print(" ");
              count++;
              for (int i = 1; i <= 2 * (number - k) - 1; i++)
                  System.out.print("*");
              System.out.println();
          }
  	}

	public static void main(String[] args) {
		stara();
		starb();
		starc();
		stard();
	}
}
