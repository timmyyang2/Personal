
public class RecursiveFunctions2 {
	
	static int getRecursive2(int x, int y){
		int r = 0;
		if(x <= 0){
			r = x-y;
		}else if(x > 0 && x % 2== 0){
			r = x-getRecursive2(x-2, y-1);
		}else if(x > 0 && x % 2 == 1){
			r = y-getRecursive2(y-2, x-1);
		}
		System.out.println(r);
		return r;
	}
	
	public static void main(String[] args){
		System.out.println("The recursive call for 7,4 is " + RecursiveFunctions2.getRecursive2(20,18));
	}

}
