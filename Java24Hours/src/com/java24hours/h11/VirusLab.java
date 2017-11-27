package com.java24hours.h11;

public class VirusLab {
	public static void main(String[] args){
		if (args.length >= 1){
			Virus roy = new Virus();
			roy.printName();
			int numViruses = Integer.parseInt(args[0]);
			if (numViruses > 0){
				Virus[] virii = new Virus[numViruses];
				for (int i = 0; i < numViruses; i++){
					virii[i] = new Virus();
				}
				System.out.println("There are " + Virus.getVirusCount() + " viruses.");
			}
		}else{
			System.out.println("Please specify the argument.");
		}
	}
}
