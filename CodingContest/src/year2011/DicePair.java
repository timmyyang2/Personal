package year2011;

import java.util.Random;

public class DicePair {
	
	static int[] num = new int[6];
	
	public static void random() {
		System.out.print("Yahtzee 6 roll?: ");
		Random rand = new Random();
		for(int i=0; i<num.length; i++) {
		int n = rand.nextInt(6) + 1;
		System.out.print(n + " ");
		num[i] = n;
		}
		checkDup();
	}
	
	private static void checkDup() {
		int count = 0;
		 for(int i=0;i<num.length;i++){
		     for(int j=i+1;j<num.length;j++) {
		    	 if(num[i]==num[j]) {
		    		 count++;
		    		 if(count==1) {
		    			 System.out.print(" // pair(s) found program stops!");
		    			 break;
		    		 }else{
		    			 continue;
		    		 }
		    	 }
		     }
		 }
		 if(count==0) {
			 System.out.print(" // no pair");
		 }
	}

	public static void main(String[] args) {
		random();
	}
}
