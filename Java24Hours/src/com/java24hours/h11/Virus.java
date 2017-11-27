package com.java24hours.h11;

public class Virus {
	static int virusCount = 0;
	int virusCount2 = 0;
	
	public Virus() {
//		virusCount++;
	}
	
	public static void incrementCount(){
		virusCount++;
	}
	
	public void incrementCount2(){
		virusCount++;
		virusCount2++;
	}
	
	public int getCount2(){
		return virusCount2;
	}
	
	public static int getCount(){
		return virusCount;
	}
	static int getVirusCount(){
		return virusCount;
	}
	 String getName(){
		 return "roy";
	 }
	 
	 void printName(){
		 System.out.println("roy");
	 }
	 
	 public static void main(String[] args){
		if (args.length >= 1){
			double numViruses = Double.parseDouble(args[0]);
			Virus myVirus = new Virus();
			myVirus.incrementCount2();
			System.out.println("Count 2 of myVirus after one increment: " + myVirus.getCount2());
			
			Virus myVirus2 = new Virus();
			for(int i = 1; i < 4; i++){
				myVirus2.incrementCount2();
			}
			System.out.println("Count 2 of myVirus2 after one increment: " + myVirus2.getCount2());
			
			Virus myVirus3 = new Virus();
			for(int i = 0; i < 5; i++){
				myVirus3.incrementCount2();
			}
			System.out.println("Count 2 of myVirus3 after one increment: " + myVirus3.getCount2());
			
			for(int i = 0; i < 10; i++){
				Virus.incrementCount();
			}
			
			System.out.println("Class level count after one increment: " + Virus.getCount());
			
//			if (numViruses > 0){
//				Virus[] virii = new Virus[numViruses];
//				for (int i = 0; i < numViruses; i++){
//					virii[i] = new Virus();
//				}
//				System.out.println("There are " + Virus.getVirusCount() + " viruses.");
//			}
		}else{
			System.out.println("Please specify the argument.");
		}
	}
}
