
public class Recursion1 {

	public int bunnyEars(int bunnies) {
		  if(bunnies==0){
		    return 0;
		  }
		  return 2+bunnyEars(bunnies-1);
		}
	
	public int bunnyEars2(int bunnies) {
		  if(bunnies==0){
		    return 0;
		  }
		  if(bunnies%2==0){
		    return 3+bunnyEars2(bunnies-1);
		  }
		  return 2+bunnyEars2(bunnies-1);
		}
	
	public int triangle(int rows) {
		  if(rows==0){
		    return 0;
		  }
		  return rows+triangle(rows-1);
		}

	public int sumDigits(int n) {
		  if(n==0){
		    return 0;
		  }
		  return (n%10)+sumDigits(n/10);
		}

	public int count7(int n) {
		  if(n==0){
		    return 0;
		  }
		  if(n%10==7){
		    return 1+count7(n/10);
		  }
		  return count7(n/10);
		}

	public static int powerN(int base, int n) {
		  if(n==0){
		    return 1;
		  }
		  return base*powerN(base, n-1);
		}

	public static void main(String[] args){
		System.out.println(powerN(10,5));
	}

}
