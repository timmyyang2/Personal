

public class CEquals {

	public static int cValue(int c){
		int k = 0;
		int s = 1;
		
		do{
			if(s<0){
				c = c - 1;
			}else{
				c = c + 1;
			}
			k = k + 1;
			s = s - 1;
		}while(k != 8);
		
		return c;
	}
		
	public static void main(String[] args){
		System.out.println("C is " + CEquals.cValue(0));
	}
}
