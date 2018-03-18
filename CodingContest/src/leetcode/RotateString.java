package leetcode;

public class RotateString {
	public static boolean rotateString(String A, String B) {
    	if(A.length() != B.length()){
    		return false;
    	}
    	if(A.equals(B)){
    		return true;
    	}
    	int length = new Exception().getStackTrace().length-1;
    	String NewA = A.substring(1) + A.charAt(0);
    	System.out.println(length);
    	if(length > A.length()){
    		return false;
    	}
        	
        return rotateString(NewA, B);
   }
    
    public static void main(String[] args){
    	System.out.println(rotateString("gcmbf", "fgcmb"));
    }
}
