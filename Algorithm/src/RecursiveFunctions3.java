
public class RecursiveFunctions3 {
	
	static int getRecursive3(int x){
		int r = 0;
		if(x % 3 == 0){
			r = getRecursive3(x-2)+x;
		}else if(x % 5 == 0){
			r = getRecursive3(x-3)-x;
		}else{
			r = x*2+5;
		}
		System.out.println(r);
		return r;
	}
	
	public static void main(String[] args){
		System.out.println("The recursive call is " + RecursiveFunctions3.getRecursive3(12));
	}

}
