package year2008;

public class PerfectNumbers {
	
	public static void findFactors(int n) {
	        for(int i=2; i<=n; i++){
	            while(n%i==0){
	                System.out.println(n);
	                n = n/i;
	            }
	        }
	}

	  public static void main(String[] args){
	     
	    }
}
