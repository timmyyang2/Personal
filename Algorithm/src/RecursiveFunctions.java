
public class RecursiveFunctions {
	
	static int getRecursive(int n){
		int r = 0;
		if(n >= 4){
			r = getRecursive(n-1) + n;
		}else if(n <= 3){
			r = n * 2;
		}
		System.out.println(r);
		return r;
	}
	
	public static void main(String[] args){
		System.out.println("The recursive call for 6 is " + RecursiveFunctions.getRecursive(8));
	}

}
