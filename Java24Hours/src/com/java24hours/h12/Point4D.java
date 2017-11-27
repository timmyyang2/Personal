package com.java24hours.h12;

import java.awt.*;

public class Point4D extends Point3D{
	public int t;
	
	public Point4D(int x, int y, int z, int t){
		super(x,y,z);
		setTime(t);
	}
	
	public void setTime(int t) {
		// TODO Auto-generated method stub
		if (t > 0) {
            this.t = t;
		}
	}
	 public int getTime() {
	        return this.t;
	    }

	public void move(int x, int y, int z, int t){
		this.setTime(t);
		super.move(x, y, z);
	}
	
	public void translate(int x, int y, int z, int t){
		this.t += t;
		super.translate(x, y, z);
	}
	public static void main(String[] args){
		Point4D myPoint = new Point4D(1, 2, 3, 30);
		System.out.println("The time is " + myPoint.getTime() + ".");
		myPoint.setTime(50);
		System.out.println("The time is " + myPoint.getTime() + ".");
	}
}

