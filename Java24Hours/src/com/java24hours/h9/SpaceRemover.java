package com.java24hours.h9;

public class SpaceRemover {
	
	public SpaceRemover(){
		}
	
	public void tSpace(){
		String mostFamous = "Rudolph the Red-Nosed Raindeer";
		char[] mfl = mostFamous.toCharArray();
		for (int dex = 0; dex < mfl.length; dex++){
			char current = mfl[dex];
			if (current != ' '){
				System.out.print(current);
			}else{
				System.out.print('.');
				}
			}
		System.out.println(); 
		String newRoy = mostFamous.replace(' ', '.');
		System.out.println(newRoy);
	}
	
	public static void main(String[] args){
		SpaceRemover mySpace = new SpaceRemover();
		mySpace.tSpace();
	}
}

