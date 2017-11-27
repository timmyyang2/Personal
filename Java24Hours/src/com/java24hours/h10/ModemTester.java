package com.java24hours.h10;

public class ModemTester {
	public static void main(String[] args){
		CableModem surfBoard = new CableModem();
		DslModem gateway = new DslModem();
		AcousticModem acoustic = new AcousticModem(Integer.parseInt(args[0]));
		surfBoard.speed = 500000;
		gateway.speed = 400000;
		System.out.println("Trying the cable modem:");
		surfBoard.displaySpeed();
		surfBoard.connect();
		System.out.println("Trying the DSL modem:");
		gateway.displaySpeed();
		gateway.connect();
		System.out.println("Trying the acoustic modem:");
		acoustic.displaySpeed();
		acoustic.connect();
		System.out.println("The acoustic speed is " + acoustic.getSpeed() + ".");
		System.out.println("The acoustic method is " + acoustic.getMethod() + ".");
		acoustic.disconnect();
	}
}
