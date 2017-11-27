package com.java24hours.h8;

public class SwitchTest {
	
	public SwitchTest(){
		}
	
	public void tswitch(char grade){
		switch (grade) {
		case 'A':
			System.out.println("You got an A!");
			break;
		case 'B':
			System.out.println("You got an B!");
			break;
		default:
			System.out.println("You got an F!");
		}
	}
	
	
	public static void main(String[] args){
		if( args.length != 1 ){
			System.out.println("Please specify a letter in the argument.");
			System.exit(1);
		}
		SwitchTest mySwitch = new SwitchTest();
		mySwitch.tswitch(args[0].charAt(0));
	}
}
