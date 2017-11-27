package com.java24hours.h10;

public class CableModem extends Modem{
	String method = "cable connection";
	
	public void connect(){
		System.out.println("Connecting to the internet ...");
		System.out.println("Using a " + method);
	}
}
