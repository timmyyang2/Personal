package year2011;

import java.util.Random;

public class DicePair {
	
	//THERE ARE SOME ERRORS!!!!!!!!!!!!!!!!!!!!!
	//PLEASE HELP FIX THEM!!!!!!!!!!!!!!!!!!!!!!
	//AND TELL ME WHY IT IS NOT WORKING!!!!!!!!!
	
	static  int[] num = new int[6];
	
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
			 count = 0;
		     for(int j=0;j<num.length;j++) {
		    	 if(num[i]==num[j]) {
		    		 count++;
		    		 if(count==2) {
		    			 System.out.print(" // 1 pair program stops!");
		    			 break;
		    		 }else if(count!=2){
		    			 System.out.print(" // no pair");
		    			 break;
		    		 }
		    	 }
		     }
		 }
	}

	public static void main(String[] args) {
		random();
	}
}
