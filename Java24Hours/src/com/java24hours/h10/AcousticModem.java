package com.java24hours.h10;

public class AcousticModem extends Modem{
	String method = "acoustic connection";
	
	public AcousticModem(int inputSpeed){
		speed = inputSpeed;
	}
	public int getSpeed(){
		return speed;
	}
	public String getMethod(){
		return method;
	}
	public void connect(){
		System.out.println("Connecting to the internet ...");
		System.out.println("Using a " + method);
	}
	public void disconnect(){
		System.out.println("Disconnected from all connections.");
	}
}
